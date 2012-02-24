/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

import classes.Recursos;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import javax.swing.Icon;

/**
 * Created on : Feb 22, 2012, 8:46:47 PM
 * @author diogo
 */
public class FaseEsconderFiguras extends Fase {

	private static final String sImagesPath = "esconder/";
	private static final String BACKGROUND_PREFIX = "background_";
	private static final String OBJECT_PREFIX = "object_";

	protected String sViewName; // the name of object to be looked for
	protected Point[] vObjectsPosition;


	/**
	 * 
	 * @param sViewName the name of scene that is displayed at UI
	 * @param sName the of image (directory based)
	 * @param vPositions where the objects will be placed
	 */
	public FaseEsconderFiguras(String sViewName, String sName, Point ... vPositions){
		super(sName);
		this.sViewName = sViewName;
		this.vObjectsPosition = vPositions;
		
	}

	@Override
	public void InitComponents(FaseControladorBase controller, MouseAdapter listener) {
		//throw new UnsupportedOperationException("Not supported yet.");

	}


	/**
	 * returns the background's image
	 * @return
	 */
	public Icon GetBackgroundIcon(){
		return Recursos.GetInsance().getImagem(sImagesPath + BACKGROUND_PREFIX + this.GetName() + ".jpg");
	}

	/**
	 * returns the image of objects that is spread over the scene
	 * @return
	 */
	public Icon GetObjectIcon(){
		return Recursos.GetInsance().getImagem(sImagesPath + OBJECT_PREFIX + this.GetName() + ".gif");
	}

	/**
	 * returns the Image when an object already have been clicked
	 * @return
	 */
	public Icon GetClickedIcon(){
		return Recursos.GetInsance().getImagem("clique.jpg");
	}
}
