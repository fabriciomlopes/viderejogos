/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

import classes.Recursos;
import java.awt.event.MouseAdapter;
import javax.swing.Icon;

/**
 * Created on : Feb 27, 2012, 7:56:59 PM
 * @author diogo
 */
public class FaseCorObjeto extends Fase {

	private static final String IMAGE_PATH = "coresobjeto/";
	public static enum COLOR {
		Black	("preto"),
		Yellow	("amarelo"),
		Blue	("azul"),
		Red		("vermelho"),
		Green	("verde");

		private String sViewName;
		private COLOR(String sViewName) {
			this.sViewName = sViewName;
		}

		public String GetViewName() {
			return sViewName.toUpperCase();
		}

		@Override
		public String toString() {
			return super.toString().toLowerCase();
		}

	}
	
	

	protected String sViewName; // the name of object that will appear
	// the right answer for a image
	protected COLOR cRightColor;

	/**
	 *
	 * @param sViewName the name of scene that is displayed at UI
	 * @param sName the of image (directory based)
	 * @param cRightColor the right color of this image;
	 */
	public FaseCorObjeto(String sViewName, String sName, COLOR cRightColor) {
		super(sName);
		this.sViewName = sViewName;
		this.cRightColor = cRightColor;
	}

	/**
	 * Retrieves the icon that represents this level
	 * @return
	 */
	public Icon GetImage() {
		return Recursos.GetInsance().getImagem(IMAGE_PATH + GetName() + ".jpg");
	}

	@Override
	public void InitComponents(FaseControladorBase controller, MouseAdapter listener) {
		//throw new UnsupportedOperationException("Not supported yet.");
	}




}
