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

/**
 * Created on : Feb 15, 2012, 8:09:32 PM
 * @author diogo
 */
public class FaseMatrizFiguraControlador extends FaseMatrizControlador {

	private static final String caminhoImg = "matriz/";

	// UI Object count
	private static final String[] vForms = new String[]{
		"aviao",
		"blusa",
		"blusinha",
		"cachorro",
		"caneta",
		"carro",
		"celular",
		"flor",
		"livro",
		"mulher",
		"peixe",
		"sapo",
		"tambor",
		"televisao"
	};
	private static final String[] vTypes = new String[]{
		"1",
		"2",
		"3",
		"4"
	};
	// UI Clickable objects Positions
	private static final int START_POSX = 50;
	private static final int START_POSY = 70;
	private static final int DISTANCE_POSX = 50;
	private static final int DISTANCE_POSY = 50;

	public FaseMatrizFiguraControlador(TelaJogo tela, FaseMatriz ... fases) {
		super(tela, fases);
	}

	@Override
	public void EmbaralhaFases() {
		super.EmbaralhaFases();
		
		// shuffles all objects

		int iMaxRow = vClickableObjects.length;
		int iMaxCol = vClickableObjects[0].length;

		int[] vRandom = UtilidadesVidere.getShuffleIntegers(iMaxRow * iMaxCol);
		for (int i = 0; i < iMaxRow; i++) {
			for (int j = 0; j < iMaxCol; j++) {
				int number = vRandom[iMaxCol * i + j];
				
				int iNewX = number / iMaxCol;
				int iNewY = number % iMaxCol;

				vClickableObjects[i][j].setLocation(GetClickableObjectPosition(iNewX, iNewY));
				//System.out.println(String.format("acessing %2d,%2d = %2d;; r= %2d putting at %2d,%2d", i,j, iMaxCol * i + j, number, iNewX, iNewY));
				
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
		return new Dimension(50, 50);
	}

	@Override
	protected Rectangle GetFollowingSequenceBounds(int row) {
		return new Rectangle(190 + 110 * row, 400, 70, 70);
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
		return new Rectangle(190 + 110 * row, 320, 75, 80);
	}

	@Override
	public String[] GetTypes() {
		return vTypes;
	}

	@Override
	protected String GetImageName(int row, int col) {
		return "_" + vForms[row] + "_" + vTypes[col];
	}
}
