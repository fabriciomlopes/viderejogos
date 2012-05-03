/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Analise;

import classes.Defs;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Created on : Apr 13, 2012, 8:12:55 PM
 * @author diogo
 */
public class PlayerStatisticsFrequencyPerformance extends PlayerStatisticsFrequency {




	public void ShowPlayerPerformance(Class<?> type) {

		if (!ContainsType(type)) {
			System.err.println("error, no games found of type: " + type);
			return;
		}

		int[] vRanges = GetScoreRange(type);

		if (vRanges == null) {
			System.err.println("error, the highest score is not enough to make an array! game: " + type.toString());
			return;
		}

		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		String sGameName = GameData.GetTypeName(type);
		int[] vRangesAmount = new int[vRanges.length];

		for (PlayerData playerData : vPlayerDatas) {
			for (GameData gameData : playerData.lGameDatas) {
				if (gameData.type == type) {

					// find it's range
					int iRange = GetRangeIndex(vRanges, gameData.iScore);
					vRangesAmount[iRange]++;

				}
			}
		}


		// build ranges.
		for (int i = 0; i < vRanges.length; i++) {
			dataset.addValue(vRangesAmount[i], sGameName, GetRangeName(vRanges, i));
		}

		OpenGraphic(dataset, "Desempenho: " + sGameName, "Intervalo de Pontuação", "Frequência"); // thistextlokaki
	}

	/**
	 * Creates an array containing all range values for
	 * a game type. The number of indices is based on
	 * Defs.FREQUENCY_SCORE_AMOUNT.
	 * @param type
	 * @return null if the highest score is not high enough to create an array
	 */
	protected int[] GetScoreRange(Class<?> type) {
		int iHighest = GetSumPlayerScores(type);

		if (iHighest < Defs.FREQUENCY_SCORE_AMOUNT) {
			return null;
		}

		int vRanges[] = new int[Defs.FREQUENCY_SCORE_AMOUNT];
		int iMax = Defs.FREQUENCY_SCORE_AMOUNT - 1;
		int iInterval = iHighest / (iMax);

		// apply values for ones i already know the value.
		vRanges[0] = 0;
		vRanges[iMax] = iHighest;

		for (int i = 1; i < iMax; i++) {
			vRanges[i] = iInterval * i;
		}

		return vRanges;
	}

	/**
	 * loops over all player datas and
	 * calculates the highest of all scores made in a
	 * specific <b>game type</b>
	 * @param type the type of game.
	 * @return the sum of all scores.
	 */
	protected int GetSumPlayerScores(Class<?> type) {
		int iHighest = Integer.MIN_VALUE;

		for (PlayerData playerData : vPlayerDatas) {
			for (GameData gameData : playerData.lGameDatas) {
				if (gameData.type == type) {
					if (gameData.iScore > iHighest) {
						iHighest = gameData.iScore;
					}
				}
			}
		}

		return iHighest;
	}

	/**
	 * gets the range index based on a number.
	 * @param vRanges
	 * @param iNumber
	 * @return
	 */
	protected int GetRangeIndex(int[] vRanges, int iNumber) {

		for (int i = 0; i < vRanges.length; i++) {
			if (iNumber < vRanges[i]) {
				return i;
			}

		}
		return vRanges.length - 1;

	}

	/**
	 * Gets the name of a range.
	 * @param vRanges
	 * @param iIndex
	 * @return
	 */
	protected String GetRangeName(int[] vRanges, int iIndex) {
		if (vRanges == null) {
			return "null";
		}

		if (iIndex == 0) {
			// first index
			return "até " + (vRanges[iIndex + 1] - 1); // thistextlokaki
		} else if (iIndex == vRanges.length - 1) {
			// last index
			return "mais que " + vRanges[iIndex];  // thistextlokaki
		} else {
			// mid index
			return "de " + vRanges[iIndex] + " a " + (vRanges[iIndex + 1] - 1); // thistextlokaki
		}


	}





	
	public static void main(String[] args) {
		PlayerStatisticsFrequencyPerformance psf = new PlayerStatisticsFrequencyPerformance();
		psf.SetPlayerDatas(PlayerManager.GetInstance().GetAllPlayerDatas());


		// OK
		for (Class<?> type : psf.vTypes) {
			psf.ShowPlayerPerformance(type);
		}




	}
}
