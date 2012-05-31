/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

import java.awt.Point;

/**
 * Created on : May 29, 2012, 6:37:02 PM
 * @author diogo
 */
public class FaseMovimento extends FaseMutanteBase {

	protected static final float[] DEFAULT_SPEED = new float[]{
		 100f,
		 200f,
		 400f,
		 600f,
		 800f,
		1000f,
		1500f,
		2000f,
		3000f,
		4000f,
		5000f,
	};

	// The way points to pass over.
	protected Point[] vWayPoints;

	/**
	 * 
	 * @param sName the name of Right answer
	 * @param vFactors speed factors
	 * @param vOptions the available options to choose. the first one is the RIGHT answer
	 * @param bPingPong true to make the WayPoints be in a ping pong way.
	 * @param vWayPoints the way points to pass by
	 */
	public FaseMovimento(float[] vFactors, FaseMovimentoControlador.DIRECTIONS[] vOptions,
			boolean bPingPong,
			Point ... vWayPoints) {
		super(vOptions[0].toString(), vFactors);

		vOptionsName = new String[vOptions.length];
		for (int i = 0; i < vOptions.length; i++) {
			vOptionsName[i] = vOptions[i].toString();
		}

		// ping pong? and has enough way points for that effect?
		if (bPingPong){// && vWayPoints.length >= 2) {
			// yes
			this.vWayPoints = new Point[vWayPoints.length * 2 -1];
			
			// copy firsts values...
			System.arraycopy(vWayPoints, 0, this.vWayPoints, 0, vWayPoints.length);
			int iIndex = vWayPoints.length;
			// copy last values to do ping pong
			for (int i = vWayPoints.length-2; i >= 0; i--) {
				this.vWayPoints[iIndex++] = vWayPoints[i];
			}
		}
		else {
			this.vWayPoints = vWayPoints;
		}


//		for (int i = 0; i < this.vWayPoints.length; i++) {
//			Point point = this.vWayPoints[i];
//			System.out.printf("%2d: point is: %3d, %3d;\n", i, point.x, point.y);
//		}
		
	}

	public FaseMovimento(FaseMovimentoControlador.DIRECTIONS[] vOptions,
			boolean bPingPong,
			Point ... vWayPoints){
			this(DEFAULT_SPEED, vOptions, bPingPong, vWayPoints);
	}
}
