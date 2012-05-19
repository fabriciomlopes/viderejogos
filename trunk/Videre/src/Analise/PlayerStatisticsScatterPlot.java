/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Analise;

import classes.Defs;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.axis.StandardTickUnitSource;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.Vector;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.RefineryUtilities;

/**
 * Created on : Apr 16, 2012, 7:13:58 PM
 * @author diogo
 */
public class PlayerStatisticsScatterPlot extends PlayerStatisticsBase {

//	private static final int MAX_COINCIDENCE = 180;
	private static final float ADD_NOISE_X = 0.1f;
	private static final float ADD_NOISE_Y = 50f;

//	private static final float  ANGLE_FACTOR = 360 / MAX_COINCIDENCE;

	@Override
	public void SetPlayerDatas(PlayerData... playerDatas) {
		super.SetPlayerDatas(playerDatas);
	}


	public void ShowGeneralScores() {

		XYSeriesCollection AllSeries = new XYSeriesCollection();
		int iCount = 0;
		for (Class<?> gameType : vTypes) {
			
			XYSeries series = new XYSeries(GameData.GetTypeName(gameType));
			// indices are amount of play. value is average.
			List<AtomicInteger> lAverageScores = new ArrayList<AtomicInteger>();
			int iPlayCount;
			
			for (PlayerData playerData : vPlayerDatas) {
				iPlayCount = 0;
				for (GameData gameData : playerData.lGameDatas) {
					if (gameData.type == gameType) {
						// add score to average

						// first ?
						if (lAverageScores.size() <= iPlayCount) {
							// yes, then dont calc average
							lAverageScores.add(new AtomicInteger(gameData.iScore));
						}
						else {
							// calculate average between them.
							AtomicInteger atomicInteger = new AtomicInteger(gameData.iScore/2 + lAverageScores.get(iPlayCount).get()/2);

							lAverageScores.set(iPlayCount, atomicInteger);
						}

						iPlayCount++;
					}
				}
			}

			// get all averages and put at series
			for (int i = 0; i < lAverageScores.size(); i++) {
				iCount++;
				AtomicInteger atomicInteger = lAverageScores.get(i);
				Vector ruido = GetNoise(iCount);
				series.add(i+1 + ruido.getX(), atomicInteger.get() + ruido.getY());
			}
			AllSeries.addSeries(series);

			iCount++;
		}

		OpenGraph(AllSeries, "Histograma Coletivo (Todos jogadores)", "Número de vezes jogado", "Score"); // thistextlokaki
		
	}

	public void ShowIndividualScores(){
		PlayerData playerData = vPlayerDatas[0];
		Class<?>[] vCurTypes = playerData.GetAllPlayedGameTypes();

		XYSeriesCollection AllSeries = new XYSeriesCollection();
		int iCount = 0;
		for (Class<?> gameType : vCurTypes) {
			XYSeries series = new XYSeries(GameData.GetTypeName(gameType));
			int iPlayCount = 0;
			for (GameData gameData : playerData.lGameDatas) {
				if (gameData.type == gameType) {
					iCount++;
					iPlayCount++;

					Vector ruido = GetNoise(iCount);
					series.add(iPlayCount + ruido.getX(), gameData.iScore + ruido.getY());
				}

			}

			if (iPlayCount > 0) {
				AllSeries.addSeries(series);
			}

		}

		OpenGraph(AllSeries, "ScatterPlot Individual (Jogador: " + playerData.sName + ")", "Número de vezes jogado", "Score"); // thistextlokaki
		
	}

	/**
	 * Calculates the noise for a count.
	 * This prevents 2 points being at same position.
	 * @param iCount
	 * @return
	 */
	protected Vector GetNoise(int iCount){

		double rad = Math.toRadians(iCount * 3);

		Vector v = new Vector(Math.cos(rad) * ADD_NOISE_X, Math.sin(rad) * ADD_NOISE_Y);

		return v;
	}

	protected void OpenGraph(XYSeriesCollection AllSeries, String sTitle, String sAxisNameX, String sAxisNameY) {

		JFreeChart jfreechart = ChartFactory.createScatterPlot(
				sTitle, // Title
				sAxisNameX, // X-Axis label
				sAxisNameY, // Y-Axis label
				AllSeries, // Dataset
				PlotOrientation.VERTICAL,
				true, // Show legend
				false,
				false);
		StandardTickUnitSource ee = new StandardTickUnitSource();
		NumberAxis na = (NumberAxis) jfreechart.getXYPlot().getDomainAxis();
		na.setTickUnit(new NumberTickUnit(1, new DecimalFormat("##")));

//		jfreechart.getXYPlot().getDomainAxis().setStandardTickUnits(new StandardTickUnitSource() {
//			@Override
//			public TickUnit getCeilingTickUnit(double d) {
//				return super.getCeilingTickUnit(d);
////				return super.getCeilingTickUnit(Math.round(d)+12);
//			}
//
//		});

		JFrame janela = new JFrame(sTitle);
		JPanel jpanel = new ChartPanel(jfreechart);
		jpanel.setPreferredSize(Defs.DEFAULT_GRAPH_SIZE);
		janela.setContentPane(jpanel);
		janela.pack();
		RefineryUtilities.centerFrameOnScreen(janela);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {

//		ArrayList<Dimension> dim = new ArrayList<Dimension>();
//
////		for (int i = 0; i < 360; i++) {
//		for (int i = 0; i < 38; i++) {
//			double x = Math.toRadians(i * 10);
//
//			dim.add(new Dimension((int) (Math.cos(x)* 10000000), (int) (Math.sin(x) * 10000000)));
//			System.out.println("cos,sen : " + i + " = " + Math.cos(x) + ", " + Math.sin(x));
//		}
//
//		int iTotal = 0;
//		int iCount = 0;
//		System.out.println("equal?");
//		for (Dimension dimension : dim) {
//
//			int iEqualCount = -1;
//			for (Dimension dimension2 : dim) {
//				if (dimension2.width == dimension.width
//						&& dimension2.height == dimension.height
//						) {
//					System.out.println(dimension2 + " equals : " + dimension);
//					iEqualCount++;
//				}
//			}
//iCount++;
//			if (iEqualCount > 0) {
//				System.out.println("equal.... for angle " + iCount);
//				iTotal++;
//			}
//
//		}
//
//		System.out.println("total "  +iTotal);
		PlayerStatisticsScatterPlot pssp = new PlayerStatisticsScatterPlot();

		// OK - General
		pssp.SetPlayerDatas(PlayerManager.GetInstance().GetAllPlayerDatas());
		pssp.ShowGeneralScores();

		// OK - Indivuals
		pssp.SetPlayerDatas(PlayerManager.GetInstance().GetCurrentPlayerData());
		pssp.ShowIndividualScores();
	}
	
}
