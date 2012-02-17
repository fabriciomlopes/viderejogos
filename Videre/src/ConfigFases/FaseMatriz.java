/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

import GUI.TelaJogo;
import java.awt.event.MouseAdapter;
import javax.swing.Icon;

/**
 * Created on : Feb 13, 2012, 8:33:47 PM
 * @author diogo
 */
public class FaseMatriz extends Fase {


	// Sequence of Form and colors for this level.
	protected int[] vFormSequence;
	protected int[] vTypeSequence;

	public FaseMatriz(String name){
		super(name);
	}

	public FaseMatriz(int[] vFormSequence, int[] vTypeSequence){
		//super(UtilidadesVidere.JoinInt(",", vTypeSequence));
		super("");
		this.vFormSequence = vFormSequence;
		this.vTypeSequence = vTypeSequence;
	}

	public int[] GetFormSequence() {
		return vFormSequence;
	}
	public int[] GetTypeSequence() {
		return vTypeSequence;
	}


	@Override
	public void InitComponents(TelaJogo tela, MouseAdapter listener) {
		//InitComponents(tela);
	}

}
