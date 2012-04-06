/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Analise;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 * Created on : Apr 2, 2012, 8:26:11 PM
 * @author diogo
 */
public class PlayerStatisticsBoxplot /*extends PlayerStatisticsBase*/ {

	protected  PlayerData[] playerDatas;

	public PlayerStatisticsBoxplot(PlayerData[] playerDatas) {
		//super(playerDatas);
		this.playerDatas = playerDatas;
	}

	// <editor-fold defaultstate="collapsed" desc="Game Statistics">

	/**
	 * Collects info, and then shows it.
	 * Collects all score made over all dates
	 * from all players
	 * in each game.<br/>
	 * for each Game, for each Player, Sum score of all game type.
	 */
	public void ShowGameStatistics() {
		
		Class<?>[] vAllGames = GetAllPlayedGameType();
		DefaultBoxAndWhiskerCategoryDataset dataSet = new DefaultBoxAndWhiskerCategoryDataset();

		// for each game (series)
		//for (int i = 0; i < vAllGames.length; i++) {
		for (Class<?> gameType : vAllGames) {
			// for each player (category)
//			System.out.println("game: " + GameData.GetTypeName(gameType));
			for (PlayerData playerData : playerDatas) {
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
					dataSet.add(list, "Jogo " + GameData.GetTypeName(gameType), playerData.sName);
				}
			}

		}

		OpenGraphic(dataSet, "Boxplot Jogador", "Jogadores", "Pontos");

	}

	protected Class<?>[] GetAllPlayedGameType() {
		List<Class<?>> list = new ArrayList<Class<?>>();

		for (int i = 0; i < this.playerDatas.length; i++) {
			// look for each played game
			for (GameData gameData : playerDatas[i].lGameDatas) {
				if (!list.contains(gameData.type)) {
					list.add(gameData.type);
				}
			}
		}
		
		Class<?>[] temp = new Class<?>[list.size()];

		return list.toArray(temp);

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
			for (PlayerData playerData : playerDatas) {
//				System.out.println("Jogador :"+ playerData.sName);
				Date firstDate = new Date();
				Date finalDate = null;
				final List list = new ArrayList();

				// for each played games
				for (GameData gameData : playerData.lGameDatas) {


					// same day period?
					if (GetDateDayAmount(date, iDateInterval) == GetDateDayAmount(gameData.dDate, iDateInterval)) {
						
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
						sRowKey = "De " + GameData.GetDate(firstDate) + " ate " + GameData.GetDate(finalDate);
					} else {
						sRowKey = "Dia " + GameData.GetDate(firstDate);
					}
					dataSet.add(list, playerData.sName, sRowKey);
				}

			}

		}

		OpenGraphic(dataSet, "Boxplot Datas", "Datas", "Pontos");
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



		for (int i = 0; i < this.playerDatas.length; i++) {
			// look for each played game
			for (GameData gameData : playerDatas[i].lGameDatas) {
				int iDay = GetDateDayAmount(gameData.dDate, iDayInterval);

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

	protected int GetDateDayAmount(Date date, int iDayInterval) {
//		return (int) (date.getTime() / (1000 * 60 * 60 * 24 * iDayInterval));
		Calendar cal = Calendar.getInstance();

		cal.setTime(date);

		int iTotalDays =
				(cal.get(Calendar.YEAR) * 365) +
				(cal.get(Calendar.MONTH) * 30) +
				(cal.get(Calendar.DAY_OF_MONTH))
				;
		
		return iTotalDays/iDayInterval;

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

		Class<?>[] vAllGames = GetAllPlayedGameType();
		DefaultBoxAndWhiskerCategoryDataset dataSet = new DefaultBoxAndWhiskerCategoryDataset();

		// for each game (series)
		//for (int i = 0; i < vAllGames.length; i++) {
		for (Class<?> gameType : vAllGames) {
			// for each player (category)
			for (PlayerData playerData : playerDatas) {
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
					dataSet.add(list, playerData.sName, "Jogo " + GameData.GetTypeName(gameType));
				}
			}

		}

		OpenGraphic(dataSet, "Boxplot Jogos", "Jogos", "Pontos");

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

		ApplicationFrame frame = new ApplicationFrame(sTitle);
		frame.setContentPane(chartPanel);
		frame.setVisible(true);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		
	}

	public static void main(String[] args) {

		PlayerStatisticsBoxplot psb = new PlayerStatisticsBoxplot(PlayerManager.GetInstance().GetAllPlayerDatas());

//		psb.ShowGameStatistics(); // OK

		psb.ShowDateStatistics(1); // OK

//		psb.ShowPlayerStatistics(); // OK

	}
}

//class StatisticsData {
//	public Class<?> type; // game type
//	public String sName;
//	public int iScore ;
//}