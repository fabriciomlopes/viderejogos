/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Analise;

import classes.UtilidadesVidere;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;

/**
 * Created on : Apr 2, 2012, 8:26:11 PM
 * @author diogo
 */
public class PlayerStatisticsBoxplot extends PlayerStatisticsBase {

//	@Override
//	public void SetPlayerDatas(PlayerData... vPlayerDatas) {
//		super.SetPlayerDatas(vPlayerDatas);
//		vTypes = PlayerManager.GetInstance().GetAllPlayedGameTypes(vPlayerDatas);
//	}

//	protected  PlayerData[] vPlayerDatas;
//	private Class<?>[] vTypes; // cache value of all types

	

//	public PlayerStatisticsBoxplot(PlayerData[] vPlayerDatas) {
//		//super(vPlayerDatas);
//		this.vPlayerDatas = vPlayerDatas;
//	}

	// <editor-fold defaultstate="collapsed" desc="Game Statistics">

	/**
	 * Collects info, and then shows it.
	 * Collects all score made over all dates
	 * from all players
	 * in each game.<br/>
	 * for each Game, for each Player, Sum score of all game type.
	 */
	public void ShowGameStatistics() {
		
		DefaultBoxAndWhiskerCategoryDataset dataSet = new DefaultBoxAndWhiskerCategoryDataset();

		// for each game (series)
		//for (int i = 0; i < vAllGames.length; i++) {
		for (Class<?> gameType : vTypes) {
			// for each player (category)
//			System.out.println("game: " + GameData.GetTypeName(gameType));
			for (PlayerData playerData : vPlayerDatas) {
//				System.out.println("\tplayer: " + playerData.sName);
				final List list = new ArrayList();
				// for each played games
				for (GameData gameData : playerData.lGameDatas) {
//					System.out.println("\t\tscores: " + gameData.iScore);
					
					if (gameData.type.toString().equals(gameType.toString())) {
						//if (gameData.GetTypeName().equals(GameData.GetTypeName(gameType))){
						list.add(gameData.iScore);
//						System.out.println("score: " + gameData.iScore);
					}
				}

				if (list.size() > 0) {
					dataSet.add(list, "Jogo " + GameData.GetTypeName(gameType), playerData.sName); // thistextlokaki
				}
			}

		}

		OpenGraphic(dataSet, "Boxplot Jogador", "Jogadores", "Pontos"); // thistextlokaki

	}

	// </editor-fold>

	// <editor-fold defaultstate="collapsed" desc="Date Statistics">
	/**
	 * Collects info, and then shows it.
	 * Collects all score made over all game
	 * from all players
	 * in each date.<br/>
	 * for each Date, for each Player, Sum score of all date interval.
	 */
	public void ShowDateStatistics(int iDateInterval) {

		Date[] vAllDates = GetAllPlayedDates(iDateInterval);
		DefaultBoxAndWhiskerCategoryDataset dataSet = new DefaultBoxAndWhiskerCategoryDataset();

		// for each game (series)
		//for (int i = 0; i < vAllGames.length; i++) {
		for (Date date : vAllDates) {
			// for each player (category)
			for (PlayerData playerData : vPlayerDatas) {
//				System.out.println("Jogador :"+ playerData.sName);
				Date firstDate = new Date();
				Date finalDate = null;
				final List list = new ArrayList();

				// for each played games
				for (GameData gameData : playerData.lGameDatas) {


					// same day period?
					if (UtilidadesVidere.GetDateDayAmount(date, iDateInterval) == UtilidadesVidere.GetDateDayAmount(gameData.dDate, iDateInterval)) {
						
						// find the smallest first date
						if (firstDate.getTime() > gameData.dDate.getTime()) {
							// yes, then get the smaller
							firstDate = gameData.dDate;
						}

						// find the highest last date
						if (finalDate == null || gameData.dDate.getTime() > finalDate.getTime()) {
							finalDate = gameData.dDate;
						}

//						System.out.println("adcionando score pra data: " + gameData.dDate);
						// yes
						list.add(gameData.iScore);
					}
				}

				// only insert if found at least 1 value (fixes: bug graphic date order!)
				if (list.size() > 0) {
					String sRowKey = "";
					if (iDateInterval != 1) {
						sRowKey = "De " + GameData.GetDate(firstDate) + " ate " + GameData.GetDate(finalDate); // thistextlokaki
					} else {
						sRowKey = "Dia " + GameData.GetDate(firstDate); // thistextlokaki
					}
					dataSet.add(list, playerData.sName, sRowKey);
				}

			}

		}

		OpenGraphic(dataSet, "Boxplot Datas", "Datas", "Pontos"); // thistextlokaki
	}

	/**
	 * Gets the list of all dates that a game have been played. <br/>
	 * Dates differs from each other by the iDateInterval
	 * @return
	 */
	protected Date[] GetAllPlayedDates(int iDayInterval) {

		// list of Original Date value
		List<Date> lDates = new ArrayList<Date>();
		// list of Date's day to not repeat.
		List<String> lDays = new ArrayList<String>(); // gamb.. make string, but has always int value



		for (int i = 0; i < this.vPlayerDatas.length; i++) {
			// look for each played game
			for (GameData gameData : vPlayerDatas[i].lGameDatas) {
				int iDay = UtilidadesVidere.GetDateDayAmount(gameData.dDate, iDayInterval);

				if (!lDays.contains(String.valueOf(iDay))) {
					lDays.add(String.valueOf(iDay));
//					System.out.println("add date" + gameData.dDate);
					lDates.add(gameData.dDate);
				}
				else {
//					System.out.println("already contains "+ gameData.dDate + ", "+iDay);
				}

			}
		}

		Collections.sort(lDates);

		Date[] temp = new Date[lDates.size()];

		return lDates.toArray(temp);

	}

	
	// </editor-fold>

	
	// <editor-fold defaultstate="collapsed" desc="Player Statistics">

	/**
	 * Collects info, and then shows it.
	 * Collects all score made from all players
	 * in each game
	 * in all dates game.<br/>
	 * for each Player, for each Game, Sum score of all game score.
	 */
	public void ShowPlayerStatistics() {

		DefaultBoxAndWhiskerCategoryDataset dataSet = new DefaultBoxAndWhiskerCategoryDataset();

		// for each game (series)
		//for (int i = 0; i < vAllGames.length; i++) {
		for (Class<?> gameType : vTypes) {
			// for each player (category)
			for (PlayerData playerData : vPlayerDatas) {
				final List list = new ArrayList();
				// for each played games
				for (GameData gameData : playerData.lGameDatas) {

					if (gameData.type.toString().equals(gameType.toString())) {
						//if (gameData.GetTypeName().equals(GameData.GetTypeName(gameType))){
						list.add(gameData.iScore);
//						System.out.println("score: " + gameData.iScore);
					}
				}

				if (list.size() > 0) {
					dataSet.add(list, playerData.sName, "Jogo " + GameData.GetTypeName(gameType));  // thistextlokaki
				}
			}

		}

		OpenGraphic(dataSet, "Boxplot Jogos", "Jogos", "Pontos");  // thistextlokaki

	}

	// </editor-fold>


	private void OpenGraphic(DefaultBoxAndWhiskerCategoryDataset dataSet, String sTitle, String sAxisNameX, String sAxisNameY){


		final CategoryAxis xAxis = new CategoryAxis(sAxisNameX);
		final NumberAxis yAxis = new NumberAxis(sAxisNameY);
		yAxis.setAutoRangeIncludesZero(false);
		final BoxAndWhiskerRenderer renderer = new BoxAndWhiskerRenderer();
		renderer.setFillBox(false);
		renderer.setToolTipGenerator(new BoxAndWhiskerToolTipGenerator());
		final CategoryPlot plot = new CategoryPlot(dataSet, xAxis, yAxis, renderer);

		final JFreeChart chart = new JFreeChart(
				sTitle,
				new Font("SansSerif", Font.BOLD, 14),
				plot,
				true);
		final ChartPanel chartPanel = new ChartPanel(chart);
		chartPanel.setPreferredSize(new java.awt.Dimension(450, 270));

		JFrame frame = new JFrame(sTitle);
		frame.setContentPane(chartPanel);
		frame.setVisible(true);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
	}

//	public static void main(String[] args) {
//
//		//PlayerStatisticsBoxplot psb = new PlayerStatisticsBoxplot(PlayerManager.GetInstance().GetAllPlayerDatas());
//		PlayerStatisticsBoxplot psb = new PlayerStatisticsBoxplot();
//		psb.SetPlayerDatas(PlayerManager.GetInstance().GetAllPlayerDatas());
//
////		psb.ShowGameStatistics(); // OK
//
//		psb.ShowDateStatistics(1); // OK
//
////		psb.ShowPlayerStatistics(); // OK
//
//	}
}

//class StatisticsData {
//	public Class<?> type; // game type
//	public String sName;
//	public int iScore ;
//}