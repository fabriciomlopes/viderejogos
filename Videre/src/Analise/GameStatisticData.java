/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

//package Analise;
//
//import charts.Chart;
//import classes.UtilityTime;
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.Timer;
//import java.util.TimerTask;
//import org.jfree.data.category.DefaultCategoryDataset;
//
///**
// * Created on : Mar 12, 2012, 7:11:10 PM
// * @author diogo
// */
//public class GameStatisticData implements Serializable {
//
//
//	public ArrayList<StatisticData> lDatas;
//	protected String sName;
//
//	/**
//	 * populates a DefaultCategoryDataset based on day intervals.
//	 * @param dataset
//	 * @param iKeyAmount amount of keys
//	 * @param iDayInterval day interval.
//	 */
//	public void PopulateCategoryDataSet(DefaultCategoryDataset dataset, int iKeyAmount, int iDayInterval) {
//
//		//int iPastDays = iKeyAmount * iDayInterval -iDayInterval;
//		int iPastDays = (iKeyAmount-1) * iDayInterval;
//		Date tempDate = new Date();
//
//		for (int i = 0; i < iKeyAmount; i++) {
//
//			int iTotalScore = 0;
//
//			Date firstDate = UtilityTime.addTime(tempDate, -iPastDays);
//
//			for (int iDay = 0; iDay < iDayInterval; iDay++) {
//				StatisticData data = GetDataByDate(UtilityTime.addTime(firstDate, iDay));
//
//				if (data != null) {
//					iTotalScore += data.iScore;
//				}
//
//				iPastDays--;
//			}
//
////			System.out.printf("Adding: %d, %s, %s\n",iTotalScore, sName, firstDate );
//			dataset.addValue(iTotalScore, sName, firstDate.toString());
//		}
//	}
//
//
//
//	/**
//	 * finds a StatisticData by Date
//	 * @return null if not found
//	 */
//	public StatisticData GetDataByDate(Date date){
//
//		for (StatisticData data : lDatas) {
//			if (data.playedDate.toString().equals(date.toString())) {
//				return data;
//			}
//		}
//		return null;
//	}
//
//
//
//	public static void main(String[] args) {
//		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//
//		int iKeyAmount = 7;
//		int iDayInteval = 2;
//
//		Date aaa = new Date();
//
//		GameStatisticData jogo1 = new GameStatisticData();
//		jogo1.sName = "Jogo1";
//		jogo1.lDatas = new ArrayList<StatisticData>();
//		jogo1.lDatas.add(new StatisticData( 400, UtilityTime.addTime(new Date(), 0)));
//		jogo1.lDatas.add(new StatisticData( 900, UtilityTime.addTime(new Date(), -1)));
//		jogo1.lDatas.add(new StatisticData(2000, UtilityTime.addTime(new Date(), -2)));
//		jogo1.lDatas.add(new StatisticData(3000, UtilityTime.addTime(new Date(), -3)));
//		jogo1.lDatas.add(new StatisticData(4500, UtilityTime.addTime(new Date(), -4)));
//		jogo1.lDatas.add(new StatisticData(6500, UtilityTime.addTime(new Date(), -5)));
//		jogo1.lDatas.add(new StatisticData(9000, UtilityTime.addTime(new Date(), -6)));
//
//
//		GameStatisticData jogo2 = new GameStatisticData();
//		jogo2.sName = "Jogo2";
//		jogo2.lDatas = new ArrayList<StatisticData>();
//		jogo2.lDatas.add(new StatisticData(6300, UtilityTime.addTime(new Date(), -1)));
//		jogo2.lDatas.add(new StatisticData(4200, UtilityTime.addTime(new Date(), -2)));
//		jogo2.lDatas.add(new StatisticData(2500, UtilityTime.addTime(new Date(), -5)));
//		jogo2.lDatas.add(new StatisticData(1500, UtilityTime.addTime(new Date(), -7)));
//		jogo2.lDatas.add(new StatisticData(1000, UtilityTime.addTime(new Date(), -8)));
//		jogo2.lDatas.add(new StatisticData( 750, UtilityTime.addTime(new Date(), -9)));
//		jogo2.lDatas.add(new StatisticData( 500, UtilityTime.addTime(new Date(), -11)));
//
//		jogo1.PopulateCategoryDataSet(dataset, iKeyAmount, iDayInteval);
//		jogo2.PopulateCategoryDataSet(dataset, iKeyAmount, iDayInteval);
//
//
//		Chart.LineChart(dataset, "Resultados", "X", "Y", true, 0, 0);
//
//
//		Timer timer = new Timer();
//		timer.schedule(new TimerTask() {
//
//			@Override
//			public void run() {
//				System.exit(0);
//			}
//		}, 15000);
//	}
//}
