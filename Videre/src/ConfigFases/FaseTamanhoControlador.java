/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

import GUI.TelaJogo;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 * Created on : May 17, 2012, 7:44:43 PM
 * @author diogo
 */
public class FaseTamanhoControlador extends FaseModificaImagemControladorBase {

	
	

	public FaseTamanhoControlador(TelaJogo tela, FaseTamanho ... fases) {
		super(tela, fases);
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

		int iMaxZoomLevel = GetCurrentFaseMutante().GetSublevelFactorValues().length;
		int iMaxScore = iMaxZoomLevel * 100;
		int iFinalScore = iMaxScore - (iCurrentSublevel * 100);
		
		return iFinalScore;
		
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
	protected ImageIcon ModifyIcon(ImageIcon icon, float fFactor){

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

	@Override
	protected String GetInfoDescription(float fFactor) {
		String sLabel = "";

		if (fFactor < 1f) {
			sLabel = String.format("%.0fx Menor que o ", Math.pow(fFactor, -1)); // thistextlokaki


		} else if (fFactor > 1f) {
			sLabel = String.format("%.0fx Maior que o ", (fFactor - 1f)); // thistextlokaki
		}
		sLabel += "Tamanho Original"; // thistextlokaki

		return sLabel;
	}

	
}
