/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

import GUI.TelaJogo;
import classes.Recursos;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.Icon;

/**
 * Created on : Feb 21, 2012, 7:21:29 PM
 * @author diogo
 */
public class FaseEsconderLetrasControlador extends FaseEsconderControlador {

	
	
	// UI Options
	private static final String[] vOptions = new String[]{
		"A",
		"B",
		"C",
		"D",
		"E",
		"F",
		"G",
		"H",
		"I",
		"J",
		"K",
		"L",
		"M",
		"N",
		"O",
		"P",
		"Q",
		"R",
		"S",
		"T",
		"U",
		"V",
		"W",
		"X",
		"Y",
		"Z"
	};
	
	// UI Options positions
	private static final int START_POSX = 570;
	private static final int START_POSY = 90;
	private static final int DISTANCE_POSX = 60;
	private static final int DISTANCE_POSY = 45;


	public FaseEsconderLetrasControlador(TelaJogo tela, FaseEsconder ... fases){
		super(tela, fases);
	}
	

	@Override
	protected Point GetClickableObjectPosition(int x) {
		int iPosX = x % 3; // index as matrix
		int iPosY = (int) Math.floor( x / 3 ); // index as matrix

		return new Point(
				START_POSX + iPosX * DISTANCE_POSX,
				START_POSY + iPosY * DISTANCE_POSY);
	}

	@Override
	protected Dimension GetClickableObjectSize() {
		return new Dimension(40, 40);
	}

	@Override
	protected String[] GetClickableOptions() {
		return vOptions;
	}


	

}
