/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

import GUI.TelaJogo;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.Icon;

/**
 * Created on : Feb 21, 2012, 8:23:59 PM
 * @author diogo
 */
public class FaseEsconderNumerosControlador extends FaseEsconderControlador {

	// UI Options
	private static final String[] vOptions = new String[]{
		"0",
		"1",
		"2",
		"3",
		"4",
		"5",
		"6",
		"7",
		"8",
		"9"
	};
	
	// UI Options positions
	private static final int START_POSX = 620;
	private static final int START_POSY = 130;
	private static final int DISTANCE_POSX = 60;
	private static final int DISTANCE_POSY = 70;

	public FaseEsconderNumerosControlador(TelaJogo tela, FaseEsconder ... fases) {
		super(tela, fases);
	}

	@Override
	protected Point GetClickableObjectPosition(int x) {
		int iPosX = x % 2; // index as matrix
		int iPosY = (int) Math.floor(x / 2); // index as matrix

		return new Point(
				START_POSX + iPosX * DISTANCE_POSX,
				START_POSY + iPosY * DISTANCE_POSY);
	}

	@Override
	protected Dimension GetClickableObjectSize() {
		return new Dimension(35, 40);
	}

	@Override
	protected String[] GetClickableOptions() {
		return vOptions;
	}

}
