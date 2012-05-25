/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

import GUI.TelaJogo;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 * Created on : May 21, 2012, 8:19:03 PM
 * @author diogo
 */
public final class FaseContrasteControlador extends FaseModificaImagemControladorBase {

	// icon settings
	private static final int ICON_SCALE = 3;
	private static final float ICON_SHADOW_SIZEX = 3f; // relative size of shadow
	private static final float ICON_SHADOW_SIZEY = 1.85f; // relative size of shadow

	// score settings:
	private static final float SCORE_CURVE = 1.25f;
	private static final int SCORE_MULT = 75;
	
	// UI References

	public FaseContrasteControlador(TelaJogo tela, FaseConstraste ... fases) {
		super(tela, fases);
		Point p = objectShowing.getLocation();
		p.translate(0, -28);
		objectShowing.setLocation(p);
	}

	/**
	 * the less the iCurrentSublevel, the higher the score
	 * @return
	 */

	@Override
	protected int GetRightScore() {
//		return super.GetRightScore();

		return GetRightScore(iCurrentSublevel);

	}

	protected int GetRightScore(int iSublevel) {
/* formula::
f(x) = raiz quadrada de ( (18² - x²) * 75² )

/// 18 eh o total de subniveis, 
/// grad eh a curva de perda de pontos.
/// 75 eh o fator de pontos q influencia no maior ponto possivel.

local grad = 1.25;
for x=1, 18 do 
	print(x, 
		( (18^grad - (x^grad)) * 75^grad ) ^ (1/grad)
	)
end

tabela:
Cliques - pontos
0 - pontos: 1275
1 - pontos: 1245
2 - pontos: 1205
3 - pontos: 1158
4 - pontos: 1107
5 - pontos: 1052
6 - pontos: 993
7 - pontos: 931
8 - pontos: 866
9 - pontos: 797
10 - pontos: 725
11 - pontos: 649
12 - pontos: 570
13 - pontos: 486
14 - pontos: 398
15 - pontos: 303
16 - pontos: 200
17 - pontos: 83

*/

		int iMaxZoomLevel = GetCurrentFaseMutante().GetSublevelFactorValues().length;
		int iFinalScore =
		(int) Math.pow( (Math.pow(iMaxZoomLevel, SCORE_CURVE) - (Math.pow(iSublevel, SCORE_CURVE))) * Math.pow(SCORE_MULT, SCORE_CURVE) , (1/SCORE_CURVE) )
				;
		iFinalScore -= SCORE_MULT;
		return iFinalScore;
		
	}

	/**
	 * puts a Shadow over the Icon with a certain Alpha scale (0-1).
	 * @param icon
	 * @param fAlpha
	 * @return
	 */
	protected ImageIcon ModifyIcon(ImageIcon icon, float fAlpha) {

		int iSizeX = icon.getIconWidth() * ICON_SCALE;
		int iSizeY = icon.getIconHeight() * ICON_SCALE;

		int iExtententsX = (int) (iSizeX * ICON_SHADOW_SIZEX);
		int iExtententsY = (int) (iSizeY * ICON_SHADOW_SIZEY);

		//Make sure the reference you create is an ImageIcon reference. Then use getImage() to grab the image from the ImageIcon:
		Image img = icon.getImage();
		//Now create a buffered image the same size as the image:
		BufferedImage bi = new BufferedImage(iExtententsX, iExtententsY, BufferedImage.TYPE_INT_ARGB);
		//Then blit the icon image to the buffered image, and resize it as you do so:
		Graphics2D g = bi.createGraphics();
		g.drawImage(img,
				(iExtententsX/2) - (iSizeX/2), // centralize X
				(iExtententsY/2) - (iSizeY/2), // centralize Y
				iSizeX, iSizeY, null);
		g.setRenderingHint(
				RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g.setComposite(AlphaComposite.getInstance(
				AlphaComposite.SRC_OVER, fAlpha));
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, iExtententsX, iExtententsY);
		//Now recreate the IconImage with the new buffered image:
		ImageIcon newIcon = new ImageIcon(bi);


		return newIcon;
	}

	@Override
	protected String GetInfoDescription(float fFactor) {

//		int max = GetCurrentFaseMutante().GetSublevelFactorValues().length;
//		for (int i= 0; i < max; i++) {
//			System.out.println(i + " - pontos: " + GetRightScore(i));
//		}

		return String.format("Nível de contraste: %.0f%%", (fFactor * 100)); // thistextlokaki

	}



}
