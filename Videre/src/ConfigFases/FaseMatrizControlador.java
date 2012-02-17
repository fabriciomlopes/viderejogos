/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

import GUI.TelaJogo;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.Icon;
import javax.swing.JLabel;


/**
 * Created on : Feb 15, 2012, 8:16:39 PM
 * @author diogo
 */
public abstract class FaseMatrizControlador extends FaseControladorBase {

	public static final String BIG_SIZE_NAME = "big";
	public static final String SMALL_SIZE_NAME = "small";

	
	public abstract String[] GetForms();
	public abstract String[] GetTypes();


	/**
	 * returns the position of a player click-able button.
	 * when clicked these images, it will fill a Input Space
	 * @param x
	 * @param y
	 * @return
	 */
	protected abstract Point GetClickableObjectPosition(int x, int y);
	// size of of Clickable objects
	protected abstract Dimension GetClickableObjectSize();
	// this is where will be placed each image of Sequence to Follow
	protected abstract Rectangle GetSequenceToFollowBounds(int row);
	// this is where will be placed each image of Player's sequence
	protected abstract Rectangle GetFollowingSequenceBounds(int row);
	
	// this is how to get a image by it's name, without being aware of directory nor extension.
	protected abstract Icon GetImage(String sImageName);

	// gets the image name based on row and col
	protected abstract String GetImageName(int row, int col);

	// UI References
	protected TelaJogo tela;
	protected JLabel[][] vClickableObjects;// clickable objects
	protected JLabel[] vSequenceToFollow;  // shows what player must click
	protected JLabel[] vFollowingSequence; // the player's input

	// Game Data
	protected FaseMatriz[] fases;
	protected int iStage; // current stage. increases everytime player clicks at a form

	public FaseMatrizControlador(TelaJogo tela, FaseMatriz ... fases) {
		this.tela = tela;
		this.fases = fases;

		InitComponents();
	}



	private void InitComponents(){
		// Create the options
		vClickableObjects = new JLabel[GetForms().length][GetTypes().length];
		vSequenceToFollow = new JLabel[GetTypes().length];
		vFollowingSequence = new JLabel[GetTypes().length];


		for (int row = 0; row < GetTypes().length; row++) {
			
			// creating the stage's sequence to follow
			vSequenceToFollow[row] = new JLabel();
			vSequenceToFollow[row].setBounds(GetSequenceToFollowBounds(row));
			tela.add(vSequenceToFollow[row]);

			// creating the stage's sequence received from player input
			vFollowingSequence[row] = new JLabel();
			vFollowingSequence[row].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
			vFollowingSequence[row].setBounds(GetFollowingSequenceBounds(row));
			vFollowingSequence[row].addMouseListener(new java.awt.event.MouseAdapter() {
				// adding 'cancel' option
				@Override
				public void mouseClicked(java.awt.event.MouseEvent evt) {
					CancelLatestInput();
				}
			});

			tela.add(vFollowingSequence[row]);
			
		}
		
		// creating input buttons for player to click
		for (int row = 0; row  < GetForms().length; row ++) {
			for (int col = 0; col < GetTypes().length; col++) {
				String sName = SMALL_SIZE_NAME + GetImageName(row, col);
				JLabel formObj = new JLabel();

				formObj.setIcon(GetImage(sName));
				formObj.addMouseListener(new java.awt.event.MouseAdapter() {
					@Override
					public void mouseClicked(java.awt.event.MouseEvent evt) {
						onClickIcone(evt);
					}
				});

				tela.add(formObj);
				formObj.setSize(GetClickableObjectSize());
				formObj.setName(sName);

				vClickableObjects[row][col] = formObj;
			}

		}
	}

	private void onClickIcone(java.awt.event.MouseEvent evt) {
		Object obj = evt.getSource();

		if (obj instanceof JLabel) {
			JLabel icone = (JLabel) obj;

			String sClickedImage = icone.getName();
			String sNewImage = sClickedImage.replace(SMALL_SIZE_NAME, BIG_SIZE_NAME);
			vFollowingSequence[iStage].setIcon(GetImage(sNewImage));
			vFollowingSequence[iStage].setName(sNewImage); // name is used to check later

			iStage++;
			//if (iStage >= GetForms().length) {
			if (iStage >= GetTypes().length) {
				CheckLevel();
			}

		}
	}


	@Override
	public void Init() {
		super.Init();
		ResetInput();
	}

	@Override
	public void SetCenario(int iCenario) {
		super.SetCenario(iCenario);

		FaseMatriz faseAtual = fases[GetCurrentScene()];
		for (int index = 0; index < GetTypes().length; index++) {
			String sImage = FaseMatrizControlador.BIG_SIZE_NAME + GetImageName(faseAtual.GetFormSequence()[index], faseAtual.GetTypeSequence()[index]);//+ "_" + GetForms()[] + "_" + GetTypes()[faseAtual.GetTypeSequence()[index]];
			vSequenceToFollow[index].setIcon(GetImage(sImage));
		}
		
		ResetInput();
	}


	@Override
	public int GetMaxLevel() {
		return fases.length;
	}
	
	@Override
	public TelaJogo GetTela() {
		return tela;
	}

	/**
	 * checks the current level.
	 * will call OnPlayerRight or OnPlayerMistake
	 */
	protected void CheckLevel() {
		if (IsRightSequence()) {
			OnPlayerRight();
		}
		else {
			OnPlayerMistake();
			ResetInput();
		}

	}

	/**
	 * says if the clicked sequence matches form and type
	 * of the right sequence
	 * @return
	 */
	protected boolean IsRightSequence(){
		FaseMatriz faseAtual = fases[GetCurrentScene()];

		for (int index = 0; index  < GetTypes().length; index ++) {
			String sRightName = GetImageName(faseAtual.GetFormSequence()[index], faseAtual.GetTypeSequence()[index]);

			// is the wrong image?
			if (!vFollowingSequence[index].getName().endsWith(sRightName)) {
				// yes, then return false
				return false;
			}
		}
		
		// if we came here, it means all images are right!
		return true;
	}

	/**
	 * cancels the latest input.
	 */
	private void CancelLatestInput() {
		if (iStage > 0) {
			iStage--;
			vFollowingSequence[iStage].setIcon(null);
		}
	}

	/**
	 * Resets player inputs
	 */
	private void ResetInput(){
		if (iStage <= 0) {
			// already reseted
			return;
		}
		for (int index = 0; index  < vFollowingSequence.length; index ++) {
			vFollowingSequence[index].setIcon(null);
		}
		iStage = 0;
	}


}
