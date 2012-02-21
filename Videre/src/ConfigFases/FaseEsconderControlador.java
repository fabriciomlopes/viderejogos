/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

import GUI.TelaJogo;
import classes.Recursos;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.JLabel;

/**
 * Created on : Feb 21, 2012, 6:31:16 PM
 * @author diogo
 */
public abstract class FaseEsconderControlador extends FaseControladorBase {

	private static final String caminhoImg = "fundos/";

	// position of of Clickable objects
	protected abstract Point GetClickableObjectPosition(int x);
	// size of of Clickable objects
	protected abstract Dimension GetClickableObjectSize();
	protected abstract String[] GetClickableOptions();

	// UI Object References
	protected TelaJogo tela;
	protected JLabel background; // the background of stage
	protected JLabel[] vClickableObjects;// clickable objects. the key is their's name
	protected String[] vFollowingSequence; // the player's input. which options player clicked at a stage.

	// Game Data
	protected FaseEsconder[] fases;
	protected int iStage; // current stage. increases everytime player clicks at an object
	

	public FaseEsconderControlador(TelaJogo tela, FaseEsconder ... fases){
		this.tela = tela;
		this.fases = fases;
		InitComponents();
	}
	
	private void InitComponents(){

		// create background
		background = new JLabel();
		tela.add(background);
		background.setBounds(30, 120, 500, 350);

		vClickableObjects = new JLabel[GetClickableOptions().length];
		// create all clickable objects
		for (int index = 0; index < GetClickableOptions().length; index++) {
			JLabel button = new JLabel();
			String sName = GetClickableOptions()[index];

			button.setBackground(new java.awt.Color(255, 255, 255));
			//button.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
			button.setFont(new java.awt.Font("Comic Sans MS", 1, 37));
			button.setForeground(new java.awt.Color(255, 0, 0));
			button.setText(sName);
			button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
			button.setOpaque(true);
			button.addMouseListener(new java.awt.event.MouseAdapter() {

				@Override
				public void mouseClicked(MouseEvent evt) {
					OnClickIcon(evt);
				}

				@Override
				public void mouseExited(MouseEvent evt) {
					OnMouseLeaveIcon(evt);
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					OnMouseOverIcon(e);
				}

			});
			
			tela.add(button);
			button.setSize(GetClickableObjectSize());
			button.setLocation(GetClickableObjectPosition(index));

			button.setName(sName);
			vClickableObjects[index] = button;
		}

	}
	
	// <editor-fold defaultstate="collapsed" desc="UI Clickable buttons Events">

	protected void OnClickIcon(MouseEvent evt) {
		JLabel icon = GetLabel(evt);
		if (icon != null) {
//			System.out.println("clicou no " + icon.getName());

			vFollowingSequence[iStage] = icon.getName();

			iStage++;
			FaseEsconder faseAtual = fases[GetCurrentScene()];
			if (iStage >= faseAtual.vStages.length) {
				CheckLevel();
			}

		}
	}

	protected void OnMouseLeaveIcon(MouseEvent evt) {
		JLabel icon = GetLabel(evt);
		if (icon != null) {
//			System.out.println("leave no " + icon.getName());
			icon.setBackground(new java.awt.Color(255, 255, 255));
		}
	}

	protected void OnMouseOverIcon(MouseEvent evt) {
		JLabel icon = GetLabel(evt);
		if (icon != null) {
//			System.out.println("Over no " + icon.getName());
			icon.setBackground(new java.awt.Color(255, 255, 133));
		}
	}

	private JLabel GetLabel(MouseEvent evt){
		Object obj = evt.getSource();
		if (obj instanceof JLabel) {
			return (JLabel) obj;
		}
		return null;
	}

	// </editor-fold>

	@Override
	public int GetMaxLevel() {
		return fases.length;
	}

	@Override
	public TelaJogo GetTela() {
		return tela;
	}

	@Override
	public void SetCenario(int iCenario) {
		super.SetCenario(iCenario);

		background.setIcon(GetSceneBackground(GetCurrentLevel()));

		ResetInput();
	}


	// the background of a scene
	private Icon GetSceneBackground(FaseEsconder fase){
		return Recursos.GetInsance().getImagem(caminhoImg + fase.GetName() + ".jpg");
	}

	protected FaseEsconder GetCurrentLevel(){
		return fases[GetCurrentScene()];
	}

	/**
	 * checks the current level.
	 * will call OnPlayerRight or OnPlayerMistake
	 */
	protected void CheckLevel() {
		if (IsRightSequence()) {
			OnPlayerRight();
		} else {
			OnPlayerMistake();
			ResetInput();
		}

	}

	/**
	 * says if the clicked sequence matches the level's required sequence
	 * @return
	 */
	protected boolean IsRightSequence() {
		FaseEsconder faseAtual = GetCurrentLevel();

		for (int index = 0; index < faseAtual.vStages.length; index++) {
			//System.out.print("Checking:::: " + vFollowingSequence[index] + " equals " +faseAtual.vStages[index] + "?" );
			// is the wrong image?
			if (!vFollowingSequence[index].equals(faseAtual.vStages[index])) {
				// yes, then return false
				return false;
			}
		}

		// if we came here, it means all images are right!
		return true;
	}

	/**
	 * Resets player inputs
	 */
	private void ResetInput() {
		
		vFollowingSequence = new String[GetCurrentLevel().vStages.length];
		for (int index = 0; index < vFollowingSequence.length; index++) {
			vFollowingSequence[index] = "";
		}
		iStage = 0;
	}

	

	
}
