/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Analise;

import classes.UtilidadesVidere;
import java.util.Date;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Created on : Apr 13, 2012, 8:23:09 PM
 * @author diogo
 */
public class PlayerStatisticsFrequencyGameUsage extends PlayerStatisticsFrequency {



	/**
	 * Shows the Game Usage Count Frequency Graphic
	 * based on a day filter.<br/>
	 * e.g.: if iDayInterval is 7, then only values from today and 6more days will be considered to build the graphic.<br/>
	 * When iDayInterval is 0 or negative, ALL dates will be considered (no filter).
	 * @param iDayInterval - Amount of days to filter.
	 */
	public void ShowGraphic(int iDayInterval) {

		
		int iMinDay = -1;
		boolean bCheckForDay = false; // when false, counts ALL scores
		if (iDayInterval > 0) {
			bCheckForDay = true; // checks for days. Limits days
			iMinDay = iMinDay = UtilidadesVidere.GetDateDayAmount(new Date(), 1) - iDayInterval;
		}

		DefaultCategoryDataset dataset = new DefaultCategoryDataset();


		String sBarName = "Jogo"; // thistextlokaki

		
		for (Class<?> gameType : vTypes) {
			// usage count for each game
			int iUsageCount = 0;
			
			for (PlayerData playerData : vPlayerDatas) {
				for (GameData gameData : playerData.lGameDatas) {
					if (gameData.type == gameType) {

						if (bCheckForDay) {
							int iDay = UtilidadesVidere.GetDateDayAmount(gameData.dDate, 1);
							if (iDay <= iMinDay) {
								
								continue;
							}
						}
						
						iUsageCount++;
						//iUsageCount += gameData.iScore;
					}
				}
			}

			if (iUsageCount > 0) {
				dataset.addValue(iUsageCount, sBarName, GameData.GetTypeName(gameType));
			}
		}

		String sTitle = "Usagem de Todos os Jogos"; // thistextlokaki

		if (bCheckForDay) {
			sTitle += " - " + iDayInterval + " Dias Atrás"; // thistextlokaki
		}


		OpenGraphic(dataset, sTitle, "Jogo", "Frequência"); // thistextlokaki
	}

	

}
