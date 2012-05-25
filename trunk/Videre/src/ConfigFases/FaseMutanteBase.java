/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ConfigFases;

import java.awt.event.MouseAdapter;

/**
 * Created on : May 21, 2012, 7:54:42 PM
 * @author diogo
 */
public abstract class FaseMutanteBase extends Fase {

	protected float[] vSublevelFactor;
	protected String sCorrectAnswer;
	protected String[] vOptionsName;
	
	public FaseMutanteBase(String sName, float[] vFactors){
		super(sName);

		this.sCorrectAnswer = sName;
		SetSublevelFactor(vFactors);
	}

	@Override
	public void InitComponents(FaseControladorBase controller, MouseAdapter listener) {
//		throw new UnsupportedOperationException("Not supported yet.");
	}


	/**
	 * gets the rescale factor at a certain index.
	 * returns -1 if not found index
	 * @return
	 */
	public float GetSublevelFactor(int iIndex) {

		if (iIndex < 0 || iIndex >= vSublevelFactor.length) {
			return -1f;
		}
		return vSublevelFactor[iIndex];

	}

	/**
	 *
	 * @return all values of refactor
	 */
	public float[] GetSublevelFactorValues() {
		return vSublevelFactor;
	}

	private void SetSublevelFactor(float... vFactors) {
		vSublevelFactor = vFactors;
	}

	public String GetCorrectAnswer() {
		return sCorrectAnswer;
	}
}
