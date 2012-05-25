/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

/**
 * Created on : May 17, 2012, 7:44:51 PM
 * @author diogo
 */
public class FaseTamanho extends FaseMutanteBase {


//	protected FaseModificaImagemControladorBase.FORMS[] vOptionsName;



	public FaseTamanho(String sName, float[] vFactors, FaseModificaImagemControladorBase.FORMS ... vOptions) {
		super(sName, vFactors);

		vOptionsName = new String[vOptions.length];
		for (int i = 0; i < vOptions.length; i++) {
			vOptionsName[i] = vOptions[i].toString();
		}
//		this.vOptionsName = vOptions;
	}

	
	public FaseTamanho(FaseModificaImagemControladorBase.FORMS correctForm, FaseModificaImagemControladorBase.FORMS ... vOptions) {
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

	

}
