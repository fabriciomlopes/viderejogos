/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

import GUI.TelaJogo;
import classes.Recursos;
import java.awt.Component;
import java.awt.Point;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;

/**
 * Created on : May 29, 2012, 6:20:00 PM
 * @author diogo
 */
public class FaseMovimentoControlador extends FaseMutanteControladorBase {

	// frames executed per second recommended is 60.
	public static final int FPS = 15;

	public enum DIRECTIONS {
		Horizontal,			// aka: |
		Vertical,			// aka: -
		DiagonalTopLeft,	// aka: \
		DiagonalTopRight,	// aka: /
		Square,				// aka: 口
		MiscTRBMTL,			// aka: \/, Top Right Bottom Mid Top Left
		MiscBRTMBL,			// aka: /\, Bottom Right Top Mid Bottom Left
		Delta,				// aka: Δ
	}


	// Game Data:
	protected Timer timer;
	private Animator animator;


	public FaseMovimentoControlador(TelaJogo tela, FaseMutanteBase ... fases) {

		this.tela = tela;
		this.fases = fases;

		InitComponents();

	}

	@Override
	protected void InitComponents() {
		super.InitComponents();

		objectShowing.setBounds(0, 0, 70, 70);
		objectShowing.setIcon(GetImage("Ellipse", true));
	}

	
	

	@Override
	protected boolean SetCurrentSublevel(int iLevel) {

		FaseMovimento faseAtual = GetCurrentFaseMutante();

		float fFactor = faseAtual.GetSublevelFactor(iLevel);
		if (fFactor > 0f) {
			animator.fSpeed = fFactor;
			
			iCurrentSublevel = iLevel;

			labelCurrentSublevel.setText(String.format("Velocidade: %.0f", (1f/fFactor * 100000f)));

			return true;
		} else {
			return false;
		}

	}

	@Override
	public void SetCenario(int iCenario) {
		super.SetCenario(iCenario);

		
		FaseMovimento faseAtual = GetCurrentFaseMutante();
		// set available options..
		SetOptions(faseAtual);

		StartShowingSequences(faseAtual);

		SetCurrentSublevel(0);

//		int max = GetCurrentFaseMutante().GetSublevelFactorValues().length;
//		for (int i = 0; i < max; i++) {
//			System.out.println(i + " - pontos: " + GetRightScore(i));
//		}
	}

	@Override
	protected int GetRightScore() {
		return GetRightScore(iCurrentSublevel);

	}

	protected int GetRightScore(int iSublevel) {
/*
0 - pontos: 1100
1 - pontos: 1000
2 - pontos: 900
3 - pontos: 800
4 - pontos: 700
5 - pontos: 600
6 - pontos: 500
7 - pontos: 400
8 - pontos: 300
9 - pontos: 200
10 - pontos: 100
 */
		int iMaxSpeed = GetCurrentFaseMutante().GetSublevelFactorValues().length;
		int iMaxScore = iMaxSpeed * 100;
		int iFinalScore = iMaxScore - (iSublevel * 100);

		return iFinalScore;
	}
	
	protected ImageIcon GetImage(String sImageName, boolean bForm) {
		if (bForm) {
			return super.GetImage(sImageName);
		}
		else {
			ImageIcon icon = Recursos.GetInsance().getImagem(caminhoDirecao + sImageName + ".jpg");
			return icon;
		}
	}

	@Override
	protected ImageIcon GetImage(String sImageName) {
		return GetImage(sImageName, false);
	}


	

// <editor-fold defaultstate="collapsed" desc="Animation">
	/**
	 * Starts showing current level's sequences.
	 */
	public void StartShowingSequences(FaseMovimento faseMovimento) {
		// cancel current if has.
		if (timer != null) {
			timer.cancel();
		}
		// replace current timer
		timer = new Timer();
		
		animator = new Animator(objectShowing, faseMovimento.vWayPoints);

		timer.schedule(animator, 0, 1000/FPS);
	}

	// </editor-fold>
	
	
}

class Animator extends TimerTask {

	
	public float fSpeed; // in milliseconds to reach target

	private Component pObjectToAnim;
	private Point[] vWayPoints;
	private int iCurrentTarget;

	private long startedTime;

	
	public Animator(Component pObjectToAnim, Point[] vWayPoints) {
		this.pObjectToAnim = pObjectToAnim;
		this.vWayPoints = vWayPoints;
		startedTime = new Date().getTime();
		iCurrentTarget = 1;
		Reset();
	}

	public void SetWayPoints(Point[] vWayPoints, float fSpeed) {
		this.vWayPoints = vWayPoints;
		this.fSpeed = fSpeed;
		Reset();
	}

	
	public final void Reset(){
		pObjectToAnim.setLocation(vWayPoints[0]);
		iCurrentTarget = 1;
		startedTime = new Date().getTime();
	}

	
	@Override
	public void run() {

		long deltaTime = new Date().getTime() - startedTime;

		Point origin, dest, newPos;
		dest = vWayPoints[iCurrentTarget];
		if (iCurrentTarget+1 > vWayPoints.length) {
			origin = vWayPoints[0];
		}
		else {
			origin = vWayPoints[iCurrentTarget -1];
		}

		newPos = new Point();

		int deltaX = dest.x - origin.x;
		int deltaY = dest.y - origin.y;

		float fFactor = deltaTime / fSpeed;

		// past final position?
		if (fFactor >= 1f) {
			// yes, then set new destination
			startedTime = new Date().getTime();
			iCurrentTarget = Math.max( ((iCurrentTarget +1) % vWayPoints.length ), 1 ) ;

			newPos = dest;
		}
		else {
			// no, then calc new X and Y
			newPos.x = (int) Math.round(fFactor * (deltaX));
			newPos.x += origin.x;
			newPos.y = (int) Math.round(fFactor * (deltaY));
			newPos.y += origin.y;
		}
		// set frame's position
		pObjectToAnim.setLocation(newPos);
		
	}


}