/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

import GUI.TelaJogo;
import classes.Recursos;
import java.awt.event.MouseAdapter;
import javax.swing.Icon;

/**
 * Created on : Feb 13, 2012, 8:33:47 PM
 * @author diogo
 */
public class FaseMatrizGeometrica extends Fase {

	public static final String caminhoImg = "figuras geométricas/";


	public static Icon getImage(String sImageName){
		Icon a = Recursos.GetInsance().getImagem(caminhoImg + sImageName + ".jpg");
		return a;
	}


	// Sequence of Form and colors for this level.
	protected int[] vFormSequence;
	protected int[] vColorSequence;

	public FaseMatrizGeometrica(String name){
		super(name);
	}

	public FaseMatrizGeometrica(int[] vFormSequence, int[] vColorSequence){
		//super(UtilidadesVidere.JoinInt(",", vColorSequence));
		super("");
		this.vFormSequence = vFormSequence;
		this.vColorSequence = vColorSequence;
	}

	public int[] GetFormSequence() {
		return vFormSequence;
	}
	public int[] GetColorSequence() {
		return vColorSequence;
	}


	@Override
	public void InitComponents(TelaJogo tela, MouseAdapter listener) {
		//InitComponents(tela);
	}

}
