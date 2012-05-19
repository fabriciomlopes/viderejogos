/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

import java.awt.event.MouseAdapter;

/**
 * Created on : May 17, 2012, 7:44:51 PM
 * @author diogo
 */
public class FaseTamanho extends Fase {


	protected FaseTamanhoControlador.FORMS[] vOptionsName;

	protected float[] vRescaleFacor;

	protected String sCorrectForm;

	@Override
	public void InitComponents(FaseControladorBase controller, MouseAdapter listener) {
//		throw new UnsupportedOperationException("Not supported yet.");
	}

	public FaseTamanho(String sName, float[] vFactors, FaseTamanhoControlador.FORMS ... vOptions) {
		super(sName);
		sCorrectForm = sName;
		this.vOptionsName = vOptions;
		SetRescaleFactor(vFactors);
	}

	
	public FaseTamanho(FaseTamanhoControlador.FORMS correctForm, FaseTamanhoControlador.FORMS ... vOptions) {
		this(correctForm.toString(), new float[]
		{
			0.0625f,
			0.125f,
			0.25f,
			0.50f,
			0.75f,
			1f,
			2f,
			3f,
			4f,
			5f,
		},
			vOptions);
	}

	/**
	 * gets the rescale factor at a certain index.
	 * returns -1 if not found index
	 * @return 
	 */
	public float GetRescaleFactor(int iIndex) {

		if (iIndex < 0 || iIndex >= vRescaleFacor.length) {
			return  -1f;
		}
		return vRescaleFacor[iIndex];

	}

	/**
	 * 
	 * @return all values of refactor
	 */
	public float[] GetRescaleFactorValues(){
		return vRescaleFacor;
	}

	private void SetRescaleFactor(float ... vFactors) {
		vRescaleFacor = vFactors;
	}


	public String GetCorrectForm() {
		return sCorrectForm;
	}
}
