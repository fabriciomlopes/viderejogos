/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Analise;

import java.io.Serializable;
import java.util.Date;

/**
 * Created on : Mar 26, 2012, 7:07:05 PM
 * @author diogo
 */
public final class GameData implements Serializable {

	public enum GAME_STATE {
		Playing,	// player still playing the game.
		Completed,	// game ended with player clearing all levels.
		GameOver,	// game ended because lost all lifes.
	}

	// datas we will save for each play.
	protected Class<?> type;
	protected int iScore;		// total final score
	protected int iRight;		// how many right moves made
	protected int iMistakes;	// how many mistakes made
	protected GAME_STATE eGameState;	// the final game state.
	protected Date dDate;		// the saved date

	
	public GameData(Class<?> type) {
		//type  = T;
		this.type = type;
		this.iScore = 0;
		this.iRight = 0;
		this.iMistakes = 0;
		this.eGameState = GAME_STATE.Playing;
		this.dDate = new Date();
	}

	
	public void AddScore(int iAmount){
		iScore += iAmount;
	}

	/**
	 * Increases right count by 1
	 */
	public void IncreaseRightCount(){
		iRight++;
	}

	/**
	 * Increases mistake count by 1
	 */
	public void IncreaseMistakeCount() {
		iMistakes++;
	}

	/**
	 * sets the game state.
	 * @param state
	 */
	public void SetGameState(GAME_STATE state){
		this.eGameState = state;
	}


	/**
	 * Dump all values.
	 * Used only for debugging.
	 * @return
	 */
	public String Dump(String firstAppend) {
		StringBuilder msg = new StringBuilder("");

		msg.append(firstAppend).append("Game Type:").append(this.type.toString());
		msg.append(firstAppend).append("Game Score:").append(this.iScore);
		msg.append(firstAppend).append("Rights and Mistakes:").append(this.iRight).append('/').append(this.iMistakes);
		msg.append(firstAppend).append("Game Final State:").append(this.eGameState.toString());
		msg.append(firstAppend).append("Date:").append(this.dDate.toString());

		return msg.toString();
	}
}
