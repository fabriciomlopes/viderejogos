/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

import GUI.TelaJogo;
import classes.UtilidadesVidere;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.JLabel;

/**
 * Created on : Feb 28, 2012, 8:04:42 PM
 * @author diogo
 */
public class FaseLuzesControlador extends FaseControladorBase {

	// UI Object References
	protected TelaJogo tela;
	protected JLabel ObjectView;		// the object to show to player.
	protected JLabel[] vColorOptions;	// the color options (clickable)
	protected JLabel[] vColorSequence;	// the color sequences that player is following (already clicked)


	// Game Data
	protected FaseLuz[] fases;
	protected String[] vFollowingSequence; // the sequences the player clicked (eg: {"blue", "red", ... , "white"}
	protected int iCurrentStage;			// the current stage. starts at 0, and every time a right color is selected, increases by 1
	protected Timer timer;					// helps us doing 'something' every few time

	/**
	 * creates the Level controller based on a maximum amount
	 * of color sequences (iMaxLevel).
	 * The color sequence to follow will be generated randomly.
	 * @param tela
	 * @param iMaxLevel
	 */
	public FaseLuzesControlador(TelaJogo tela, int iMaxLevel) {
		this.tela = tela;
		this.fases = new FaseLuz[iMaxLevel];

		InitComponents();
	}

	
	private void InitComponents(){
		
		// creating the following sequences view
		this.vColorSequence = new JLabel[fases.length];
		for (int index = 0; index < fases.length; index++) {
			JLabel view = new JLabel();

			view.setBackground(new java.awt.Color(214, 214, 226));
			view.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.blue, java.awt.Color.gray));
			view.setOpaque(true);
			
			tela.add(view);

			Point p = GetFollowingSequencePosition(index);
			
			view.setBounds(p.x, p.y, 25, 25);

			this.vColorSequence[index] = view;
		}

		
		// creating the color options
		FaseLuz.COLOR[] colors = FaseLuz.COLOR.values();
		this.vColorOptions = new JLabel[colors.length];
		
		for (int index = 0; index < colors.length; index++) {
			JLabel option = new JLabel();

			//option.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/lbranca.jpg")));
			option.setIcon(colors[index].GetIcon());

			option.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent evt) {
					OnClickOption(evt);
				}
			});

			tela.add(option);

			option.setBounds(
					130+ 100 * index, 370, // position
					100, 100); // size

			// set the name. we'll use it later when clicked him
			option.setName(colors[index].toString());

			this.vColorOptions[index] = option;
		}

		// Create the Object View. This guy changes over time.
		JLabel view = new JLabel();
		view.setBackground(new java.awt.Color(0, 0, 0));
		view.setOpaque(true);
		tela.add(view);
		view.setBounds(310, 80, 200, 200);
		
		this.ObjectView = view;
	}


	/**
	 * Generates random level sequence.
	 * Generates a easy sequence, that never repeats the previous.
	 * It will always contain the possible numbers without
	 * repeating the latest.
	 * e.g.: if we have colors 0,1 and 2, a possible sequence is:<br/>
	 * 1,2,0,   1,2,0; <br/>
	 * this sequence will never occur: 1,2,0,  0, 2, 1;<br/>
	 * since there is two zeros together;<br/>
	 * this sequence will also never occur: 1,2,1,  0, 2, 1;<br/>
	 * because a color can not appear twice when all others
	 * have not appeared once yet.
	 */
	@Override
	public void EmbaralhaFases() {
		// dont shuffle! always static
		vOrdemCenarios = new int[GetMaxLevel()];
		for (int index = 0; index < GetMaxLevel(); index++) {
			vOrdemCenarios[index] = index;
		}


		FaseLuz.COLOR[] colors = FaseLuz.COLOR.values();
		int iCount = 0; // how many indices of vector received a random stage
		int[] vTempRandom = null;
		int[] vLevelColors = new int[GetMaxLevel()];

		int iAntiLoop = 99999; // prevents any possible infinite loop

		while (iCount < GetMaxLevel()) {
			if (iAntiLoop-- <= 0) {
				System.err.println("error: we probably was in a infinite loop");
				tela.menuAnterior.setVisible(true);
				tela.setVisible(false);
				return;
			}
			vTempRandom = UtilidadesVidere.getShuffleIntegers(colors.length);

			// is the new first random color different from previous color?
			if (iCount == 0
					|| vTempRandom[0] != vLevelColors[iCount - 1]) {
				// yes, then set the level colors
				int iLimit = Math.min(colors.length, GetMaxLevel() - iCount); // max amount we can put into the array
				System.arraycopy(vTempRandom, 0, vLevelColors, iCount, iLimit);
				iCount += iLimit;
			}

		}

		// convert integer array to color array
		ArrayList<FaseLuz.COLOR> levelColors = new ArrayList<FaseLuz.COLOR>();
		for (int index = 0; index < GetMaxLevel(); index++) {
			levelColors.add(colors[vLevelColors[index]]);
		}


		// okay, random integers created, so create the levels;
		for (int i = 0; i < vLevelColors.length; i++) {
			FaseLuz.COLOR[] temp = new FaseLuz.COLOR[i];
			FaseLuz fase = new FaseLuz(levelColors.subList(0, i+1).toArray(temp));
			
			for (int j= 0; j < fase.vColorSequence.length; j++) {
				System.out.print(", " + fase.vColorSequence[j].toString());
			}
			this.fases[i] = fase;
		}
	}

	@Override
	public void SetCenario(int iCenario) {
		super.SetCenario(iCenario);

		FaseLuz curLevel = fases[GetCurrentScene()];
		
		vFollowingSequence = new String[curLevel.vColorSequence.length];

		
		StartShowingSequences();

		ResetInput();
	}




	@Override
	public int GetMaxLevel() {
		return fases.length;
	}

	@Override
	public TelaJogo GetTela() {
		return tela;
	}


	/**
	 * resets player's input.
	 * resets View and Data.
	 */
	protected void ResetInput() {
		iCurrentStage = 0;
		for (int index = 0; index < this.vColorSequence.length; index++) {
			this.vColorSequence[index].setIcon(null);
		}
		for (int index = 0; index < this.vFollowingSequence.length; index++) {
			this.vFollowingSequence[index] = null;
		}
	}

	/**
	 * Gets the position of a following sequence based
	 * on an index.<br/>
	 * 0 1 2 3 <br/>
	 * 4 5 6 7 <br/>
	 * . . . . <br/>
	 * . . . . <br/>
	 * @param x
	 */
	private Point GetFollowingSequencePosition(int index) {
		
		int x = index % 5;
		int y = (int) Math.floor(index/5);


		return new Point(
	// start + distance * var
				620 + 30 * x,
				100 + 40 * y
				);

	}


	protected void OnClickOption(MouseEvent evt){
		JLabel icon = (JLabel) evt.getSource();
		if (icon != null) {

			// update data
			this.vFollowingSequence[iCurrentStage] = icon.getName();
			
			if (IsClickedOptionRight()) {

				// set view
				FaseLuz.COLOR color = FaseLuz.COLOR.valueOf(icon.getName());
				this.vColorSequence[iCurrentStage].setIcon(color.GetIcon());

				// next stage...
				iCurrentStage++;
				if (iCurrentStage >= this.vFollowingSequence.length) {
					OnPlayerRight();
				}
			}
			else {
				OnPlayerMistake();
				// reset everythin when wrong
				ResetInput();
			}

		}
	}

	/**
	 * returns true if the clicked color is equal
	 * to level's color of current stage
	 * @return
	 */
	protected boolean IsClickedOptionRight() {

		String sClickedColor = this.vFollowingSequence[iCurrentStage];
		String sRightColor = fases[GetCurrentScene()].vColorSequence[iCurrentStage].toString();

		return sClickedColor.equals(sRightColor);
	}

	/**
	 * Starts showing current level's sequences.
	 */
	public void StartShowingSequences(){
		// cancel current if has.
		if (timer != null) {
			timer.cancel();
		}
		// replace current timer
		timer = new Timer();

		// Invokes the OnTimeReach method every 1 second.
		timer.schedule(new TimerTask(){
			private int iCount=-1;
			@Override
			public void run() {
				OnTimeReach(iCount++);
			}
		}, 0, 1000);
	}

	/**
	 * Called every time the time has past a certain amount.
	 * We change the showing Sequence's color here.
	 * @param iCount first time will be -1, and then increases by 1 every time it is called.
	 */
	protected void OnTimeReach(int iCount){
		Icon iconToSet;
		FaseLuz.COLOR[] vColorsToShow = fases[GetCurrentScene()].vColorSequence;

		// started?
		if (iCount == -1) {
			// first time. set as Black Color.
			iconToSet = null;
		}
		// not ended?
		else if (iCount < vColorsToShow.length) {
			// yes, then change to a normal color
			iconToSet = vColorsToShow[iCount].GetIcon();
		}
		// ended
		else {
			// set as Black Color. cancel the timer
			iconToSet = null;
			timer.cancel();
		}

		this.ObjectView.setIcon(iconToSet);
		if (iconToSet == null) {
			// set fully black
			this.ObjectView.setBackground(new java.awt.Color(0, 0, 0));
		}
	}
}
