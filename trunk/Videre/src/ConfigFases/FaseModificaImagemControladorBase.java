/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

import GUI.TelaJogo;
import javax.swing.ImageIcon;

/**
 * Created on : May 22, 2012, 7:17:59 PM
 * @author diogo
 */
public abstract class FaseModificaImagemControladorBase extends FaseMutanteControladorBase {


	// options
	public enum FORMS {
		Cross,
		Ellipse,
		Square,
		Star,
		Hexagon,
		Triangle,
		TriangleInverse,
	};

	protected  ImageIcon originalIcon;

	public FaseModificaImagemControladorBase(TelaJogo tela, FaseMutanteBase ... fases) {
		this.tela = tela;
		this.fases = fases;

		InitComponents();
	}


	@Override
	public void SetCenario(int iCenario) {
		super.SetCenario(iCenario);
		FaseMutanteBase faseAtual = GetCurrentFaseMutante();
		// set available options..
		SetOptions(faseAtual);

		// set the center image
		originalIcon = GetImage(faseAtual.GetName());
		objectShowing.setIcon(originalIcon);
		// start at zoom level 0.
		SetCurrentSublevel(0);
	}


	/**
	 * sets the current image zoom level.
	 * @param iLevel a level starting from 0.
	 * @return true if set successfully. false if reached max or level is not available
	 */
	protected boolean SetCurrentSublevel(int iLevel) {

		FaseMutanteBase faseAtual = GetCurrentFaseMutante();

		float fFactor = faseAtual.GetSublevelFactor(iLevel);
		if (fFactor > 0f) {

			ImageIcon newIcon = ModifyIcon(originalIcon, fFactor);

			objectShowing.setIcon(newIcon);
			iCurrentSublevel = iLevel;

			labelCurrentSublevel.setText(GetInfoDescription(fFactor));

			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Changes the Appearence of the main icon
	 * @param icon
	 * @param fFactor
	 * @return
	 */
	protected abstract ImageIcon ModifyIcon(ImageIcon icon, float fFactor);

	/**
	 * Gets the string to print at screen.
	 * prints the state of current image.
	 * @param fFactor
	 * @return
	 */
	protected abstract String GetInfoDescription(float fFactor);
}
