/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

import GUI.TelaJogo;
import classes.UtilidadesVidere;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 * Created on : May 17, 2012, 7:44:43 PM
 * @author diogo
 */
public class FaseTamanhoControlador extends FaseMutanteBase {

	
	private ImageIcon originalIcon;

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

	
	// Game Data
	protected FaseTamanho[] fases;

	public FaseTamanhoControlador(TelaJogo tela, FaseTamanho ... fases) {
		this.tela = tela;
		this.fases = fases;

		InitComponents();
	}
	
	@Override
	public int GetMaxLevel() {
		return fases.length;
	}

	@Override
	public TelaJogo GetTela() {
		return tela;
	}

//	@Override
//	protected int GetMistakeScore() {
//		return super.GetMistakeScore();
//	}

	/**
	 * the less the iCurrentSublevel, the higher the score
	 * @return
	 */
	
	@Override
	protected int GetRightScore() {
//		return super.GetRightScore();

		int iMaxZoomLevel = GetCurrentFaseTamanho().GetRescaleFactorValues().length;
		int iMaxScore = iMaxZoomLevel * 100;
		int iFinalScore = iMaxScore - (iCurrentSublevel * 100);
		
		return iFinalScore;
		
	}

	

	/**
	 * says if the clicked sequence matches form and type
	 * of the right sequence
	 * @return
	 */
	@Override
	protected boolean IsRightImage(String sClickedImage) {
		FaseTamanho faseAtual = GetCurrentFaseTamanho();


		// clicked image is the same name as the stage?
		if (faseAtual.GetCorrectForm().equals(sClickedImage)) {
			return true;
		}
		else {
			return false;
		}
		
	}

	@Override
	public void SetCenario(int iCenario) {
		super.SetCenario(iCenario);
		FaseTamanho faseAtual = GetCurrentFaseTamanho();
		// set available options..
		SetOptions(faseAtual);

		// set the center image
		originalIcon = GetImage(faseAtual.GetName());
		objectShowing.setIcon(originalIcon);
		// start at zoom level 0.
		SetCurrentSublevel(0);
	}

	@Override
	protected void OnClickScreen() {
		SetCurrentSublevel(iCurrentSublevel + 1);
	}

	

	/**
	 * sets the current image zoom level.
	 * @param iLevel a level starting from 0.
	 * @return true if set successfully. false if reached max or level is not available
	 */
	protected boolean SetCurrentSublevel(int iLevel){

		FaseTamanho faseAtual = GetCurrentFaseTamanho();

		float fResizeFactor = faseAtual.GetRescaleFactor(iLevel);
		if (fResizeFactor > 0f) {

			ImageIcon newIcon = ResizeIcon(originalIcon, fResizeFactor);

			objectShowing.setIcon(newIcon);
			iCurrentSublevel = iLevel;

			// update label
			String sLabel = "";
			
			if (fResizeFactor < 1f) {
				sLabel = String.format( "%.0fx Menor que o ",  Math.pow(fResizeFactor, -1)); // thistextlokaki

				
			}
			else if (fResizeFactor > 1f) {
				sLabel = String.format( "%.0fx Maior que o ",  (fResizeFactor -1f)); // thistextlokaki
			}
			sLabel += "Tamanho Original"; // thistextlokaki
			labelCurrentSublevel.setText(sLabel);

			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Sets the visible options by ID.
	 */
	protected void SetOptions(FaseTamanho faseTamanho){

		// randomize options:
		int[] vRandomIndices = UtilidadesVidere.getShuffleIntegers(vOptions.length);

		for (int i= 0; i < vOptions.length; i++) {
			
			String sName = faseTamanho.vOptionsName[vRandomIndices[i]].toString();
			vOptions[i].setIcon(GetImage(sName));
			vOptions[i].setName(sName);
		}

	}

	/**
	 * 
	 * @return
	 */
	protected FaseTamanho GetCurrentFaseTamanho() {
		return fases[GetCurrentScene()];
	}

	/**
	 * Resizes a icon.
	 *
	 * source adapted from: Daniel Searson
	 * http://www.coderanch.com/t/331731/GUI/java/Resize-ImageIcon
	 * @param icon
	 * @param fFactor the scale factor for new X and Y.
	 * @return
	 */
	protected ImageIcon ResizeIcon(ImageIcon icon, float fFactor){

		int iSizeX = Math.round( icon.getIconWidth() * fFactor);
		int iSizeY = Math.round( icon.getIconHeight() * fFactor);

		//Make sure the reference you create is an ImageIcon reference. Then use getImage() to grab the image from the ImageIcon:
		Image img = icon.getImage();
		//Now create a buffered image the same size as the image:
//		BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
		BufferedImage bi = new BufferedImage(iSizeX, iSizeY, BufferedImage.TYPE_INT_ARGB);
		//Then blit the icon image to the buffered image, and resize it as you do so:
		Graphics g = bi.createGraphics();
		g.drawImage(img, 0, 0, iSizeX, iSizeY, null);
		//Now recreate the IconImage with the new buffered image:
		ImageIcon newIcon = new ImageIcon(bi);


		return newIcon;
	}
}
