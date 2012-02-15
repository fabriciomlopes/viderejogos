/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

import GUI.MatrizGeometrica;
import GUI.TelaJogo;
import classes.UtilidadesVidere;
import java.awt.Point;
import javax.swing.JLabel;

/**
 * Created on : Feb 13, 2012, 8:33:21 PM
 * @author diogo
 */
public class FaseMatrizGeometricaControlador extends FaseControladorBase{

	// UI Object count
	public static final String[] vForms = new String[]{
		"ellipse",
		"star",
		"hexagon",
		"triangle"
	};
	public static final String[] vColors = new String[]{
		"red",
		"green",
		"blue",
		"yellow"
	};
	public static final String BIG_SIZE_NAME = "big";
	public static final String SMALL_SIZE_NAME = "small";

	// UI Positions
	public static final int START_POSX = 490;
	public static final int START_POSY = 140;
	public static final int DISTANCE_POSX = 60;
	public static final int DISTANCE_POSY = 70;
	// UI Sizes
	public static final int SIZE_X = 45;
	public static final int SIZE_Y = 45;


	// UI Objects reference
	protected JLabel[][] vFormObjects;
	protected JLabel[] vLevelForm; // the view of Sequence that must be done
	protected JLabel[] vLevelInput; // the input of player
	protected MatrizGeometrica tela;

	// Level Data
	protected FaseMatrizGeometrica[] fases;
	protected int iStage; // current stage. increases everytime player clicks at a form
	// private
	
	public FaseMatrizGeometricaControlador(MatrizGeometrica tela, FaseMatrizGeometrica ... fases) {
		this.tela = tela;
		this.fases = fases;

		// Create the options
		// for each Form, create each color
		vFormObjects = new JLabel[vForms.length][vColors.length];
		vLevelForm = new JLabel[vForms.length];
		vLevelInput = new JLabel[vForms.length];
		
		for (int row = 0; row  < vForms.length; row ++) {

			// creating the stage's sequence to follow
			vLevelForm[row] = new JLabel();
			vLevelForm[row].setBounds(60 + 100 * row, 170, 75, 80);
			tela.add(vLevelForm[row]);

			// creating the stage's sequence received from player input
			vLevelInput[row] = new JLabel();
			vLevelInput[row].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
			vLevelInput[row].setBounds(60 + 100 * row, 270, 75, 80);
			vLevelInput[row].addMouseListener(new java.awt.event.MouseAdapter() {
					@Override
					public void mouseClicked(java.awt.event.MouseEvent evt) {
						CancelLatestInput();
					}
				});
				
			tela.add(vLevelInput[row]);
			

			// creating input buttons for player to click
			for (int col = 0; col < vColors.length; col++) {
				String sName = SMALL_SIZE_NAME + "_" + vForms[row] + "_" + vColors[col];
				JLabel formObj = new JLabel();

				formObj.setIcon(FaseMatrizGeometrica.getImage(sName));
				formObj.addMouseListener(new java.awt.event.MouseAdapter() {
					@Override
					public void mouseClicked(java.awt.event.MouseEvent evt) {
						onClickIcone(evt);
					}
				});
				
				tela.add(formObj);
				formObj.setSize(SIZE_X, SIZE_Y);
				formObj.setName(sName);

				
				vFormObjects[row][col] = formObj;
			}

		}
		
	}


	public void onClickIcone(java.awt.event.MouseEvent evt) {
		Object obj = evt.getSource();

		if (obj instanceof JLabel) {
			JLabel icone = (JLabel) obj;

			String sClickedImage = icone.getName();
			String sNewImage = sClickedImage.replace(SMALL_SIZE_NAME, BIG_SIZE_NAME);
			vLevelInput[iStage].setIcon(FaseMatrizGeometrica.getImage(sNewImage));
			vLevelInput[iStage].setName(sNewImage); // name is used to check later
			
			iStage++;
			if (iStage >= vForms.length) {
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
	public void EmbaralhaFases() {
		super.EmbaralhaFases();
		
		// shuffles the order of color of forms
		for (int row = 0; row < vFormObjects.length; row++) {
			JLabel[] jLabels = vFormObjects[row];

			int[] vRandom = UtilidadesVidere.getShuffleIntegers(jLabels.length);
			for (int col= 0; col < jLabels.length; col++) {
				jLabels[col].setLocation(GetPosition(vRandom[col], row));
			}

		}
	}

	@Override
	public void SetCenario(int iCenario) {
		super.SetCenario(iCenario);

		FaseMatrizGeometrica faseAtual = fases[GetCurrentScene()];
		for (int index = 0; index < vForms.length; index++) {
			String sImage = BIG_SIZE_NAME + "_" + vForms[faseAtual.GetFormSequence()[index]] + "_" + vColors[faseAtual.GetColorSequence()[index]];
			vLevelForm[index].setIcon(FaseMatrizGeometrica.getImage(sImage));
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
	 * says if the clicked sequence matches form and color
	 * of the right sequence
	 * @return
	 */
	protected boolean IsRightSequence() {
		FaseMatrizGeometrica faseAtual = fases[GetCurrentScene()];
		
		for (int index = 0; index  < 4; index ++) {
			String sRightName = vForms[faseAtual.GetFormSequence()[index]] + "_" + vColors[faseAtual.GetColorSequence()[index]];
			
			// is the wrong image?
			if (!vLevelInput[index].getName().endsWith(sRightName)) {
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
	protected void CancelLatestInput() {
		if (iStage > 0) {
			iStage--;
			vLevelInput[iStage].setIcon(null);
		}
	}

	protected void ResetInput(){
		if (iStage <= 0) {
			// already reseted
			return;
		}
		for (int index = 0; index  < vLevelInput.length; index ++) {
			vLevelInput[index].setIcon(null);
		}
		iStage = 0;
	}
	
	/**
	 * gets the location of
	 * a component based on X and Y indices
	 * @param x
	 * @param y
	 * @return
	 */
	protected static Point GetPosition(int x, int y) {

		return new Point(
				START_POSX + (DISTANCE_POSX * x),
				START_POSY + (DISTANCE_POSY * y));
	}


}
