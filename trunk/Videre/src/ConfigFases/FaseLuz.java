/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

import classes.Recursos;
import java.awt.event.MouseAdapter;
import javax.swing.Icon;

/**
 * Created on : Feb 28, 2012, 8:14:34 PM
 * @author diogo
 */
public class FaseLuz extends Fase {

	/**
	 * The Colors available for the level.
	 * They are: Red, White, Blue, Yellow, Green.
	 */
	public static enum COLOR {
		Red,
		White,
		Blue,
		Yellow,
		Green;

		public Icon GetIcon(){
			return Recursos.GetInsance().getImagem("figuras geométricas/square_" + toString().toLowerCase() + ".jpg");
		}
//
//		public static Icon GetBlackIcon(){
//			return Recursos.GetInsance().getImagem("black.jpg");
//		}
		
	}

	protected COLOR[] vColorSequence;
	
	/**
	 * Creates the level based on a certain
	 * color sequence.
	 * This color sequence must be followed by
	 * the player to finish current level.
	 * @param vColorSequence array of colors
	 * @see FaseLuz.COLOR
	 */
	public FaseLuz(COLOR[] vColorSequence) {
		super("");
		this.vColorSequence = vColorSequence;
	}

	@Override
	public void InitComponents(FaseControladorBase controller, MouseAdapter listener) {
		//
	}

	
	
}
