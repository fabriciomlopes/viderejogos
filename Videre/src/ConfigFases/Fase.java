/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

import GUI.TelaJogo;

/**
 * Created on : Feb 9, 2012, 8:24:11 PM
 * @author diogo
 */
public abstract class Fase {

	private String sName;

	public Fase(String sName) {
		this.sName = sName;
	}
	
	public String GetName() {
		return sName;
	}

	public abstract void InitComponents(FaseControladorBase controller, java.awt.event.MouseAdapter listener);
}