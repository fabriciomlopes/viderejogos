/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

/**
 * Created on : May 21, 2012, 8:20:16 PM
 * @author diogo
 */
public class FaseConstraste extends FaseMutanteBase {


//	protected FaseModificaImagemControladorBase.FORMS[] vOptionsName;

	public FaseConstraste(String sName, float[] vFactors, FaseModificaImagemControladorBase.FORMS ... vOptions) {
		super(sName, vFactors);
		vOptionsName = new String[vOptions.length];
		for (int i= 0; i < vOptions.length; i++) {
			vOptionsName[i] = vOptions[i].toString();
		}
//		this.vOptionsName = vOptions;
	}

	public FaseConstraste(FaseModificaImagemControladorBase.FORMS correctForm, FaseModificaImagemControladorBase.FORMS ... vOptions) {
		this(correctForm.toString(), new float[]
		{
			0.99f,
			0.97f,
			0.95f,
			0.93f,
			0.91f,
			0.85f,
			0.80f,
			0.75f,
			0.70f,
			0.65f,
			0.60f,
			0.55f,
			0.50f,
			0.40f,
			0.30f,
			0.20f,
			0.05f,
			0.01f,
		},
			vOptions);
	}

	
}
