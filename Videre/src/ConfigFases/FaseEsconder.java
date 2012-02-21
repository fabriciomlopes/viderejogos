/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

import GUI.TelaJogo;
import java.awt.event.MouseAdapter;

/**
 * Created on : Feb 21, 2012, 7:08:58 PM
 * @author diogo
 */
public class FaseEsconder extends Fase {

	// stages of the level
	protected String[] vStages;

	public FaseEsconder(String sName, String ... vStages){
		super(sName);
		this.vStages = vStages;
	}

	@Override
	public void InitComponents(TelaJogo tela, MouseAdapter listener) {
//		throw new UnsupportedOperationException("Not supported yet.");
	}

}
