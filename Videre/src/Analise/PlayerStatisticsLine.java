/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Analise;

import charts.Chart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Created on : Apr 5, 2012, 8:58:42 PM
 * @author diogo
 */
public class PlayerStatisticsLine extends PlayerStatisticsBase {

//	protected playerData playerData;
//	protected Class<?>[] vTypes; // cache value of all types.
	DefaultCategoryDataset dataset;
	protected PlayerData playerData;

	@Override
	public void SetPlayerDatas(PlayerData... playerDatas) {
		super.SetPlayerDatas(playerDatas);
		playerData = playerDatas[0];
		vTypes = playerData.GetAllPlayedGameTypes();
	}
	
//	public PlayerStatisticsLine(playerData playerData) {
//		this.playerData = playerData;
//	}

	

	public void ShowAllStatistics(){

		dataset = new DefaultCategoryDataset();
		
		for (Class<?> type : vTypes) {
			Populate(type);
		}

		Chart.LineChart(dataset, "Linha de Aprendizagem de Todos os jogos ", "Quantidade de Jogadas", "Pontos", true, 0, 0);  // thistextlokaki
	}

	public void ShowStatisticsFor(Class<?> type) {
		// has that type?
		if (!ContainsType(type)) {
			// no, then return;
			return;
		}

		dataset = new DefaultCategoryDataset();

		String sGameName = GameData.GetTypeName(type);
		
		Populate(type);

		Chart.LineChart(dataset, "Linha de Aprendizagem do jogo " + sGameName, "Quantidade de Jogadas", "Pontos", true, 0, 0);  // thistextlokaki
	}


	protected void Populate(Class<?> type) {

		int iCount = 0;
		String sGameName = GameData.GetTypeName(type);
		for (GameData gameData : playerData.lGameDatas) {
			if (gameData.type == type) {
				dataset.addValue(gameData.iScore, sGameName, "" + iCount);
				iCount++;
			}
		}

	}

	public static void main(String[] args) {
//		PlayerStatisticsLine psl = new PlayerStatisticsLine(PlayerManager.GetInstance().GetCurrentPlayerData());
		PlayerStatisticsLine psl = new PlayerStatisticsLine();
		psl.SetPlayerDatas(PlayerManager.GetInstance().GetCurrentPlayerData());
		
		psl.ShowAllStatistics();

		// OK
//		for (Class<?> type : psl.vTypes) {
//			psl.ShowStatisticsFor(type);
//		}

	}
}
