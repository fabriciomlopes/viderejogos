/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

import GUI.TelaJogo;
import classes.Recursos;
import classes.UtilidadesVidere;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.Icon;
import javax.swing.JLabel;

/**
 * Created on : Feb 13, 2012, 8:33:21 PM
 * @author diogo
 */
public class FaseMatrizGeometricaControlador extends FaseMatrizControlador{

	private  static final String caminhoImg = "figuras geométricas/";
	
	// UI Object count
	private static final String[] vForms = new String[]{
		"ellipse",
		"star",
		"hexagon",
		"triangle"
	};
	private static final String[] vColors = new String[]{
		"red",
		"green",
		"blue",
		"yellow"
	};

	// UI Clickable objects Positions
	private static final int START_POSX = 490;
	private static final int START_POSY = 140;
	private static final int DISTANCE_POSX = 60;
	private static final int DISTANCE_POSY = 70;

	
	public FaseMatrizGeometricaControlador(TelaJogo tela, FaseMatriz ... fases) {
		super(tela, fases);
	}

	@Override
	public void EmbaralhaFases() {
		super.EmbaralhaFases();

		// shuffles the order of color of forms
		for (int row = 0; row < vClickableObjects.length; row++) {
			JLabel[] jLabels = vClickableObjects[row];

			int[] vRandom = UtilidadesVidere.getShuffleIntegers(jLabels.length);
			for (int col = 0; col < jLabels.length; col++) {
				jLabels[col].setLocation(GetClickableObjectPosition(vRandom[col], row));
			}
		}

	}

	@Override
	protected Point GetClickableObjectPosition(int x, int y) {
		return new Point(
				START_POSX + (DISTANCE_POSX * x),
				START_POSY + (DISTANCE_POSY * y)
				);
	}

	@Override
	protected Dimension GetClickableObjectSize() {
		return new Dimension(45, 45);
	}

	@Override
	protected Rectangle GetFollowingSequenceBounds(int row) {
		return new Rectangle(60 + 100 * row, 270, 75, 80);
	}

	@Override
	public String[] GetForms() {
		return vForms;
	}

	@Override
	protected Icon GetImage(String sImageName) {
		Icon icon = Recursos.GetInsance().getImagem(caminhoImg + sImageName + ".jpg");
		return icon;
	}
	
	@Override
	protected Rectangle GetSequenceToFollowBounds(int row) {
		return new Rectangle(60 + 100 * row, 170, 75, 80);
	}

	@Override
	public String[] GetTypes() {
		return vColors;
	}

	@Override
	protected String GetImageName(int row, int col) {
		return "_" + vForms[row] + "_" + vColors[col];
	}




}
