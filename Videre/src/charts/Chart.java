/***************************************************************************/
/*** Interactive Graphic Environment for Dimensionality Reduction        ***/
/***                                                                     ***/
/*** Copyright (C) 2006  David Corrêa Martins Junior                     ***/
/***                     Fabrício Martins Lopes                          ***/
/***                     Roberto Marcondes Cesar Junior                  ***/
/***                                                                     ***/
/*** This library is free software; you can redistribute it and/or       ***/
/*** modify it under the terms of the GNU Lesser General Public          ***/
/*** License as published by the Free Software Foundation; either        ***/
/*** version 2.1 of the License, or (at your option) any later version.  ***/
/***                                                                     ***/
/*** This library is distributed in the hope that it will be useful,     ***/
/*** but WITHOUT ANY WARRANTY; without even the implied warranty of      ***/
/*** MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU   ***/
/*** Lesser General Public License for more details.                     ***/
/***                                                                     ***/
/*** You should have received a copy of the GNU Lesser General Public    ***/
/*** License along with this library; if not, write to the Free Software ***/
/*** Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA       ***/
/*** 02110-1301  USA                                                     ***/
/***                                                                     ***/
/*** Contact: David Corrêa Martins Junior - davidjr@vision.ime.usp.br    ***/
/***          Fabrício Martins Lopes - fabriciolopes@vision.ime.usp.br   ***/
/***          Roberto Marcondes Cesar Junior - cesar@vision.ime.usp.br   ***/
/***************************************************************************/
/***************************************************************************/
/*** This class implements the graphical charts to final user interactive.**/
/***************************************************************************/
package charts;

//import agn.AGN;
//import agn.AGNRoutines;
//import agn.CNMeasurements;
//import agn.Gene;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Paint;
import java.awt.Shape;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.StandardXYToolTipGenerator;
import org.jfree.chart.labels.XYToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.DatasetRenderingOrder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.SeriesRenderingOrder;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.chart.renderer.xy.XYStepRenderer;
import org.jfree.chart.urls.StandardXYURLGenerator;
import org.jfree.chart.urls.XYURLGenerator;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.RefineryUtilities;

public class Chart extends javax.swing.JFrame {

    public static int n_points = 1000;
    public static int defaultwidth = 800;
    public static int defaultheight = 600;
    public static double[] y_of_x, x;//we will plot y(x) versus x

    /** Creates new form TesteGrafico */
    public Chart() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        getContentPane().setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jButton1.setText("Gr\u00e1fico de S\u00e9ries");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        getContentPane().add(jButton1);
        jButton1.setBounds(10, 10, 150, 23);

        jButton2.setText("Gr\u00e1fico Linha");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        getContentPane().add(jButton2);
        jButton2.setBounds(170, 10, 150, 23);

        jButton3.setText("Gr\u00e1fico Torta");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        getContentPane().add(jButton3);
        jButton3.setBounds(330, 10, 150, 23);

        jButton4.setText("Gr\u00e1fico Barras");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        getContentPane().add(jButton4);
        jButton4.setBounds(10, 50, 150, 23);

        jButton5.setText("Pontos XY");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        getContentPane().add(jButton5);
        jButton5.setBounds(170, 50, 150, 23);

        jButton6.setText("linha");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        getContentPane().add(jButton6);
        jButton6.setBounds(330, 50, 150, 23);

        jButton7.setText("linha teta");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        getContentPane().add(jButton7);
        jButton7.setBounds(330, 80, 150, 23);

        jButton8.setText("M\u00faltiplas Linhas");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        getContentPane().add(jButton8);
        jButton8.setBounds(170, 80, 150, 23);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-503)/2, (screenSize.height-157)/2, 503, 157);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
                    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        double x = 2;
        double y = 2;
        double teta = 5;
        double p = 5;
        for (teta = 1; teta < 5; teta++) {
            p = x * Math.cos(teta) + y * Math.sin(teta);
            dataset.addValue(p, "teta=5", String.valueOf(teta));
        }
        LineChart(dataset, "Line", "axis x", "axis y", true, 0, 0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        double x = 0;
        double y = 0;
        double b = 5;
        for (x = -10; x < 10; x++) {
            y = (1 * x + b);
            dataset.addValue(y, "a=1", String.valueOf(x));
            y = (30 * x + b);
            dataset.addValue(y, "a=30", String.valueOf(x));
            y = (-30 * x + b);
            dataset.addValue(y, "a=-30", String.valueOf(x));
            y = (45 * x + b);
            dataset.addValue(y, "a=45", String.valueOf(x));
            y = (-45 * x + b);
            dataset.addValue(y, "a=-45", String.valueOf(x));
            y = (90 * x + b);
            dataset.addValue(y, "a=90", String.valueOf(x));

        }
        LineChart(dataset, "line", "axis x", "axis y", true, 0, 0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        PontosXY();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        GraficoBarras();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        GraficoTorta();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
//		String data = "2012/04/05";
//		dataset.addValue(5000, "Luzes", data);
//		dataset.addValue(5500, "Matrize Figura", data);
//		dataset.addValue(1000, "Contagem Figura", data);
//		dataset.addValue(9900, "Matrizes Geometrica", data);
//
//		data = "2012/04/07";
//		dataset.addValue(7500, "Luzes De Vida", data);
//		dataset.addValue(3000, "英会話", data);
//		dataset.addValue(2000, "Contagem Figura", data);
//		dataset.addValue(5000, "Matrizes Geometrica", data);
//
//		data = "2012/04/08";
//		dataset.addValue(3000, "Luzes", data);
//		dataset.addValue(5500, "Matrize Figura", data);
//		dataset.addValue(2300, "Luzes De Vida", data);
//		dataset.addValue(2000, "英会話", data);
//		dataset.addValue(1500, "Contagem Figura", data);
//		dataset.addValue(6000, "Matrizes Geometrica", data);


		
		
		dataset.addValue(5000, "Luzes", "2012/04/05");
		dataset.addValue(3000, "Luzes", "2012/04/08");

		dataset.addValue(7500, "Luzes De Vida", "2012/04/07");
		dataset.addValue(2300, "Luzes De Vida", "2012/04/08");

		dataset.addValue(1000, "Contagem Figura", "2012/04/05");
		dataset.addValue(2000, "Contagem Figura", "2012/04/07");
		dataset.addValue(1500, "Contagem Figura", "2012/04/08");

		dataset.addValue(3000, "英会話", "2012/04/07");
		dataset.addValue(2000, "英会話", "2012/04/08");

		dataset.addValue(9900, "Matrizes Geometrica", "2012/04/05");
		dataset.addValue(5000, "Matrizes Geometrica", "2012/04/07");
		dataset.addValue(6000, "Matrizes Geometrica", "2012/04/08");

		dataset.addValue(5500, "Matrize Figura", "2012/04/05");
		dataset.addValue(5500, "Matrize Figura", "2012/04/08");


		LineChart(dataset, "Resultados de Algumac oisa", "Eita, outra coisa aki", "mais outra", true, 0, 0);
//        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//        dataset.addValue(9.2504D, "Result SFS", "2");
//        dataset.addValue(4.9676D, "Standard Deviation", "2");
//
//        dataset.addValue(7.5798D, "Result SFS", "2-3");
//        dataset.addValue(4.7523D, "Standard Deviation", "2-3");
//
//        dataset.addValue(7.4286D, "Result SFS", "2-3-1");
//        dataset.addValue(4.2580D, "Standard Deviation", "2-3-1");
//
//        dataset.addValue(6.9524D, "Result SFS", "2-3-1-4");
//        dataset.addValue(4.0474D, "Standard Deviation", "2-3-1-4");
//
//        dataset.addValue(8.1776D, "Result SFS", "2-3-1-4-6");
//        dataset.addValue(5.5684D, "Standard Deviation", "2-3-1-4-6");
//
//        dataset.addValue(7.9938D, "Result SFS", "2-3-1-4-6-7");
//        dataset.addValue(4.4603D, "Standard Deviation", "2-3-1-4-6-7");
//
//        dataset.addValue(8.3188D, "Result SFS", "2-3-1-4-6-7-5");
//        dataset.addValue(4.9141D, "Standard Deviation", "2-3-1-4-6-7-5");
//
//        LineChart(dataset, "Results of the SFS Algorithm", "Selected Features",
//                "Average Errors", false, 0, 0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GraficoSeries();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void ScatterPlot(XYSeriesCollection dataset, String title,
            String xAxisLabel, String yAxisLabel) {
        NumberAxis xAxis = new NumberAxis(xAxisLabel);
        xAxis.setAutoRangeIncludesZero(false);
        NumberAxis yAxis = new NumberAxis(yAxisLabel);
        yAxis.setAutoRangeIncludesZero(false);
        XYToolTipGenerator toolTipGenerator = new StandardXYToolTipGenerator();
        XYURLGenerator urlGenerator = new StandardXYURLGenerator();
        XYItemRenderer renderer = new XYLineAndShapeRenderer(false, true);//(boolean lines, boolean shapes)
        renderer.setBaseToolTipGenerator(toolTipGenerator);
        renderer.setURLGenerator(urlGenerator);
        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);
        //plot.setDataset(dataset);
        //plot.setDomainAxis(xAxis);
        //plot.setRangeAxis(yAxis);
        //plot.setRenderer(renderer);
        plot.setOrientation(PlotOrientation.VERTICAL);
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        plot.setSeriesRenderingOrder(SeriesRenderingOrder.FORWARD);
        JFreeChart chart = new JFreeChart(title, JFreeChart.DEFAULT_TITLE_FONT,
                plot, true);//true==legend
        //INVERTER AS CORES DOS PONTOS E LEGENDA.
        if (dataset.getSeriesCount() > 1) {
            Shape s0 = plot.getLegendItems().get(0).getShape();
            Shape s1 = plot.getLegendItems().get(1).getShape();
            renderer.setSeriesShape(0, s1);
            renderer.setSeriesShape(1, s0);
            Paint p0 = plot.getLegendItems().get(0).getLinePaint();
            Paint p1 = plot.getLegendItems().get(1).getLinePaint();
            renderer.setSeriesPaint(0, p1);
            renderer.setSeriesPaint(1, p0);
        }
        //FIM DA INVERSAO.

        JFrame chartwindow = new JFrame(title);
        JPanel jpanel = new ChartPanel(chart);
        jpanel.setPreferredSize(new Dimension(defaultwidth, defaultheight));
        chartwindow.setContentPane(jpanel);
        chartwindow.pack();
        RefineryUtilities.centerFrameOnScreen(chartwindow);
        chartwindow.setVisible(true);
    }

    public static void PontosXY() {

        XYSeries series2 = new XYSeries("Max Value");
        series2.add(30.0, 15.0);
        series2.add(20.0, 30.0);
        series2.add(10.0, 75.0);
        series2.add(40.0, 23.0);
        series2.add(5.0, 50.0);
        series2.add(25.0, 45.0);

        XYSeries series3 = new XYSeries("Min Value");
        series3.add(10.0, 15.0);

        XYSeriesCollection series = new XYSeriesCollection();
        series.addSeries(series2);
        series.addSeries(series3);

        JFreeChart jfreechart = ChartFactory.createScatterPlot(
                "Sample XY Chart", // Title
                "Height", // X-Axis label
                "Weight", // Y-Axis label
                series, // Dataset
                PlotOrientation.VERTICAL,
                true, // Show legend
                false,
                false);
        JFrame janela = new JFrame("Example of the XY series graphic");
        JPanel jpanel = new ChartPanel(jfreechart);
        jpanel.setPreferredSize(new Dimension(defaultwidth, defaultheight));
        janela.setContentPane(jpanel);
        janela.pack();
        RefineryUtilities.centerFrameOnScreen(janela);
        janela.setVisible(true);
    }

    public static void GraficoSeries() {
        //System.out.println("After initComponents");

        JFrame janela = new JFrame("Example of the series graphic");
        janela.getContentPane().setLayout(null);

        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        jLabel1.setText("");
        janela.getContentPane().add(jLabel1);

        y_of_x = new double[n_points];
        x = new double[n_points];

        XYSeries series1 = new XYSeries("Cos(x) versus x");
        XYSeries series2 = new XYSeries("Cos^2(x) versus x");

        for (int i = 0; i < n_points; i++) {//calculate the data to be plotted

            y_of_x[i] = Math.cos(i * Math.PI / 180);
            series1.add((double) i, y_of_x[i]);//add values to the series

            series2.add((double) i, Math.pow(y_of_x[i], 2));
        }

        XYDataset dataset1 = new XYSeriesCollection(series1);
        XYDataset dataset2 = new XYSeriesCollection(series2);

        CombinedDomainXYPlot parent = new CombinedDomainXYPlot(
                new NumberAxis("x-angle argument"));

        XYItemRenderer renderer1 = new StandardXYItemRenderer();
        XYPlot subplot1 = new XYPlot(dataset1, null, new NumberAxis("Cos(x)"),
                renderer1);
        NumberAxis axis1 = (NumberAxis) subplot1.getRangeAxis();
        axis1.setTickLabelFont(new Font("Monospaced", Font.PLAIN, 10));
        axis1.setLabelFont(new Font("SansSerif", Font.PLAIN, 10));
        axis1.setAutoRangeIncludesZero(false);
        parent.add(subplot1, 1);

        XYItemRenderer renderer2 = new StandardXYItemRenderer();
        XYPlot subplot2 = new XYPlot(dataset2, null, new NumberAxis("Cos^2(x)"),
                renderer2);
        NumberAxis axis2 = (NumberAxis) subplot2.getRangeAxis();
        axis2.setTickLabelFont(new Font("Monospaced", Font.PLAIN, 10));
        axis2.setLabelFont(new Font("SansSerif", Font.PLAIN, 10));
        axis2.setAutoRangeIncludesZero(false);
        parent.add(subplot2, 1);

        JFreeChart chart = new JFreeChart("Cos(x) versus x", parent);

        ChartPanel myChart = new ChartPanel(chart);
        janela.setSize(500, 600);
        janela.setContentPane(myChart);

        janela.setVisible(true);
    }

    public static void LineChart(double[][] data, String title_validation,
            String title, String x_axis_label, String y_axis_label) {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < data.length; i++) {
            dataset.addValue(data[i][1], title_validation,
                    String.valueOf(data[i][2]));
        }
        JFrame chartwindow = new JFrame(title);
        JFreeChart jfreechart = ChartFactory.createLineChart(
                title,
                x_axis_label,
                y_axis_label,
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false);

        CategoryPlot categoryplot = (CategoryPlot) jfreechart.getPlot();
        categoryplot.setBackgroundPaint(Color.white);
        categoryplot.setRangeGridlinePaint(Color.black);
        NumberAxis numberaxis = (NumberAxis) categoryplot.getRangeAxis();
        numberaxis.setStandardTickUnits(NumberAxis.createStandardTickUnits());

        LineAndShapeRenderer lineandshaperenderer =
                (LineAndShapeRenderer) categoryplot.getRenderer();
        lineandshaperenderer.setShapesVisible(true);
        lineandshaperenderer.setDrawOutlines(true);
        lineandshaperenderer.setUseFillPaint(true);
        lineandshaperenderer.setFillPaint(Color.white);

        JPanel jpanel = new ChartPanel(jfreechart);
        jpanel.setPreferredSize(new Dimension(defaultwidth, defaultheight));
        chartwindow.setContentPane(jpanel);
        chartwindow.pack();
        RefineryUtilities.centerFrameOnScreen(chartwindow);
        chartwindow.setVisible(true);
    }

    public static void StepChart(CategoryDataset dataset, String title,
            String x_axis_label, String y_axis_label, boolean showlegend,
            float maxvalue, float minvalue) {
        JFrame chartwindow = new JFrame(title);
        CategoryItemRenderer renderer = new CategoryStepRenderer(true);
        CategoryAxis domainAxis = new CategoryAxis(x_axis_label);
        ValueAxis rangeAxis = new NumberAxis(y_axis_label);
        CategoryPlot categoryplot = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);
        JFreeChart jfreechart = new JFreeChart(title, categoryplot);

        categoryplot.setBackgroundPaint(Color.white);
        categoryplot.setRangeGridlinePaint(Color.black);
        //NumberAxis numberaxis = (NumberAxis)categoryplot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        if (minvalue == 0 && maxvalue == 0) {
            rangeAxis.setAutoRange(true);
        } else {
            rangeAxis.setRange(minvalue, maxvalue);
        }
        JPanel jpanel = new ChartPanel(jfreechart);
        jpanel.setPreferredSize(new Dimension(defaultwidth, defaultheight));
        chartwindow.setContentPane(jpanel);
        chartwindow.pack();
        RefineryUtilities.centerFrameOnScreen(chartwindow);
        chartwindow.setVisible(true);
    }

    public static Vector MultipleStepChartOverlayed(CategoryDataset[] datasets1,
            CategoryDataset[] datasets2, String title,
            String x_axis_label, String y_axis_label, boolean showlegend,
            float maxvalue, float minvalue, boolean showchart) {

        CategoryAxis domainAxis = new CategoryAxis(x_axis_label);
        ValueAxis rangeAxis = new NumberAxis(y_axis_label);
        rangeAxis.setStandardTickUnits(NumberAxis.createStandardTickUnits());
        //if (minvalue == 0 && maxvalue == 0) {
        //    rangeAxis.setAutoRange(true);
        //} else {
        //    rangeAxis.setRange(minvalue, maxvalue);
        //}
        rangeAxis.setAutoRange(true);

        CombinedDomainCategoryPlot parent = new CombinedDomainCategoryPlot(new CategoryAxis(x_axis_label));

        for (int i = 0; i < datasets1.length; i++) {
            CategoryItemRenderer renderer1 = new CategoryStepRenderer(true);
            renderer1.setBaseStroke(new BasicStroke(2.0f));
            renderer1.setBaseSeriesVisibleInLegend(showlegend);

            CategoryPlot subplot = new CategoryPlot(datasets1[i], domainAxis, rangeAxis, renderer1);
            subplot.setBackgroundPaint(Color.white);
            subplot.setRangeGridlinePaint(Color.black);
            subplot.setDomainGridlinesVisible(true);

            DefaultCategoryItemRenderer renderer2 = new DefaultCategoryItemRenderer();
            renderer2.setSeriesPaint(0, Color.LIGHT_GRAY);
            renderer2.setBaseStroke(new BasicStroke(2.0f));
            renderer2.setShapesVisible(true);
            renderer2.setBaseSeriesVisibleInLegend(false);

            subplot.setDataset(1, datasets2[i]);
            subplot.setRenderer(1, renderer2);
            //subplot.setDrawSharedDomainAxis(true);
            parent.add(subplot, 1);
        }

        JFreeChart jfreechart = new JFreeChart(title, parent);
        JPanel jpanel = new ChartPanel(jfreechart);
        jpanel.setPreferredSize(new Dimension(defaultwidth, defaultheight));

        //if (showchart) {
        JFrame chartwindow = new JFrame(title);
        chartwindow.setContentPane(jpanel);
        chartwindow.pack();
        RefineryUtilities.centerFrameOnScreen(chartwindow);
        chartwindow.setVisible(true);
        //}
        Vector res = new Vector();
        res.add(0, jfreechart);
        res.add(1, chartwindow);
        return res;
    }

    public static Vector MultipleStepChartOverlayedMA(
            CategoryDataset[] datasets, String title,
            String x_axis_label, String y_axis_label, boolean showlegend,
            float maxvalue, float minvalue, boolean showchart) {

        CategoryAxis domainAxis = new CategoryAxis(x_axis_label);
        ValueAxis rangeAxis = new NumberAxis(y_axis_label);
        rangeAxis.setStandardTickUnits(NumberAxis.createStandardTickUnits());
        rangeAxis.setAutoRange(true);
        CombinedDomainCategoryPlot parent = new CombinedDomainCategoryPlot(new CategoryAxis(x_axis_label));
        DefaultCategoryItemRenderer renderer0 = new DefaultCategoryItemRenderer();
        renderer0.setBaseStroke(new BasicStroke(2.0f));
        renderer0.setBaseSeriesVisibleInLegend(showlegend);
        renderer0.setSeriesPaint(0, Color.RED);//sinal original
        renderer0.setShapesVisible(false);
        CategoryPlot subplot = new CategoryPlot(datasets[0], domainAxis, rangeAxis, renderer0);
        subplot.setBackgroundPaint(Color.white);
        subplot.setRangeGridlinePaint(Color.black);
        subplot.setDomainGridlinesVisible(true);
        parent.add(subplot);

        CategoryAxis domainAxis1 = new CategoryAxis(x_axis_label);
        ValueAxis rangeAxis1 = new NumberAxis(y_axis_label);
        rangeAxis1.setStandardTickUnits(NumberAxis.createStandardTickUnits());
        rangeAxis1.setAutoRange(true);

        CategoryItemRenderer renderer1 = new CategoryStepRenderer(true);
        renderer1.setBaseStroke(new BasicStroke(2.0f));
        renderer1.setBaseSeriesVisibleInLegend(showlegend);
        renderer1.setSeriesPaint(0, Color.BLUE);//sinal quantizado
        CategoryPlot subplot1 = new CategoryPlot(datasets[1], domainAxis1, rangeAxis1, renderer1);
        //subplot.setDataset(1, datasets[1]);
        //subplot.setRenderer(1, renderer1);
        parent.add(subplot1);

        DefaultCategoryItemRenderer renderer2 = new DefaultCategoryItemRenderer();
        renderer2.setBaseStroke(new BasicStroke(2.0f));
        renderer2.setBaseSeriesVisibleInLegend(showlegend);
        renderer2.setShapesVisible(false);
        renderer2.setSeriesPaint(0, Color.BLACK);//sinal normalizado
        subplot1.setDataset(1, datasets[2]);
        subplot1.setRenderer(1, renderer2);

        for (int i = 3; i < datasets.length; i++) {
            DefaultCategoryItemRenderer renderer3 = new DefaultCategoryItemRenderer();
            renderer3.setBaseStroke(new BasicStroke(2.0f));
            renderer3.setBaseSeriesVisibleInLegend(showlegend);
            renderer3.setShapesVisible(false);
            renderer3.setSeriesPaint(0, Color.LIGHT_GRAY);//limiares utilizados para quantizacao.
            subplot1.setDataset(i - 1, datasets[i]);
            subplot1.setRenderer(i - 1, renderer3);
        }

        JFreeChart jfreechart = new JFreeChart(title, parent);
        JPanel jpanel = new ChartPanel(jfreechart);
        JPanel retorno = new ChartPanel(jfreechart);
        retorno.setPreferredSize(new Dimension(defaultwidth, defaultheight));
        jpanel.setPreferredSize(new Dimension(defaultwidth, defaultheight));
        JFrame chartwindow = new JFrame(title);
        chartwindow.setContentPane(jpanel);
        chartwindow.pack();
        RefineryUtilities.centerFrameOnScreen(chartwindow);
        chartwindow.setVisible(showchart);
        Vector res = new Vector();
        res.add(0, jfreechart);
        res.add(1, chartwindow);
        res.add(2, retorno);
        return res;
    }

    public static JFreeChart MultipleSplineLineChart(XYDataset[] datasets,
            String title, String x_axis_label, String y_axis_label,
            boolean showlegend, float maxvalue, float minvalue,
            boolean showchart) {

        ValueAxis domainAxis = new NumberAxis(x_axis_label);
        domainAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        ValueAxis rangeAxis = new NumberAxis(y_axis_label);
        rangeAxis.setStandardTickUnits(NumberAxis.createStandardTickUnits());

        if (minvalue == 0 && maxvalue == 0) {
            rangeAxis.setAutoRange(true);
        } else {
            rangeAxis.setRange(minvalue, maxvalue);
        }

        //define o grafo combinado, determinando o label do eixo x.
        CombinedDomainXYPlot parent = new CombinedDomainXYPlot(domainAxis);

        for (int i = 0; i < datasets.length; i++) {
            XYSplineRenderer renderer = new XYSplineRenderer();
            renderer.setBaseStroke(new BasicStroke(2.0f));
            renderer.setBaseSeriesVisibleInLegend(showlegend);
            renderer.setShapesVisible(true);
            XYPlot subplot = new XYPlot(datasets[i], domainAxis, rangeAxis, renderer);
            subplot.setBackgroundPaint(Color.white);
            subplot.setRangeGridlinePaint(Color.black);
            subplot.setDomainGridlinesVisible(true);
            parent.add(subplot, 1);
        }
        JFreeChart jfreechart = new JFreeChart(title, parent);
        JPanel jpanel = new ChartPanel(jfreechart);
        jpanel.setPreferredSize(new Dimension(defaultwidth, defaultheight));

        if (showchart) {
            JFrame chartwindow = new JFrame(title);
            chartwindow.setContentPane(jpanel);
            chartwindow.pack();
            RefineryUtilities.centerFrameOnScreen(chartwindow);
            chartwindow.setVisible(true);
        }
        return jfreechart;
    }

    public static JFreeChart MultipleStepChartOverlayed(XYDataset[] datasets1,
            XYDataset[] datasets2, String title,
            String x_axis_label, String y_axis_label, boolean showlegend,
            float maxvalue, float minvalue, boolean showchart) {

        ValueAxis domainAxis = new NumberAxis(x_axis_label);
        domainAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        ValueAxis rangeAxis = new NumberAxis(y_axis_label);
        rangeAxis.setStandardTickUnits(NumberAxis.createStandardTickUnits());

        if (minvalue == 0 && maxvalue == 0) {
            rangeAxis.setAutoRange(true);
        } else {
            rangeAxis.setRange(minvalue, maxvalue);
        }

        //define o grafo combinado, determinando o label do eixo x.
        CombinedDomainXYPlot parent = new CombinedDomainXYPlot(domainAxis);

        for (int i = 0; i < datasets1.length; i++) {
            XYItemRenderer renderer1 = new XYStepRenderer();
            renderer1.setBaseStroke(new BasicStroke(2.0f));
            renderer1.setBaseSeriesVisibleInLegend(showlegend);
            XYPlot subplot = new XYPlot(datasets1[i], domainAxis, rangeAxis, renderer1);
            subplot.setBackgroundPaint(Color.white);
            subplot.setRangeGridlinePaint(Color.black);
            subplot.setDomainGridlinesVisible(true);

            XYSplineRenderer renderer2 = new XYSplineRenderer();
            renderer2.setSeriesPaint(0, Color.LIGHT_GRAY);
            renderer2.setBaseStroke(new BasicStroke(2.0f));
            renderer2.setShapesVisible(true);
            renderer2.setBaseSeriesVisibleInLegend(false);
            subplot.setDataset(1, datasets2[i]);
            subplot.setRenderer(1, renderer2);
            parent.add(subplot, 1);
        }
        JFreeChart jfreechart = new JFreeChart(title, parent);
        JPanel jpanel = new ChartPanel(jfreechart);
        jpanel.setPreferredSize(new Dimension(defaultwidth, defaultheight));

        if (showchart) {
            JFrame chartwindow = new JFrame(title);
            chartwindow.setContentPane(jpanel);
            chartwindow.pack();
            RefineryUtilities.centerFrameOnScreen(chartwindow);
            chartwindow.setVisible(true);
        }
        return jfreechart;
    }

    public static Vector MultipleLineChart(CategoryDataset[] datasets, String title,
            String x_axis_label, String y_axis_label, boolean showlegend,
            float maxvalue, float minvalue, boolean showchart) {

        CategoryAxis domainAxis = new CategoryAxis(x_axis_label);
        ValueAxis rangeAxis = new NumberAxis(y_axis_label);
        rangeAxis.setStandardTickUnits(NumberAxis.createStandardTickUnits());
        if (minvalue == 0 && maxvalue == 0) {
            rangeAxis.setAutoRange(true);
        } else {
            rangeAxis.setRange(minvalue, maxvalue);
        }
        CombinedDomainCategoryPlot parent = new CombinedDomainCategoryPlot(new CategoryAxis(x_axis_label));

        for (int i = 0; i < datasets.length; i++) {
            CategoryItemRenderer renderer = new DefaultCategoryItemRenderer();//new CategoryStepRenderer(true);
            renderer.setBaseStroke(new BasicStroke(2.0f));
            renderer.setBaseSeriesVisibleInLegend(showlegend);
            CategoryPlot subplot = new CategoryPlot(datasets[i], domainAxis, rangeAxis, renderer);
            subplot.setBackgroundPaint(Color.white);
            subplot.setRangeGridlinePaint(Color.black);
            subplot.setDomainGridlinesVisible(true);
            //subplot.setDrawSharedDomainAxis(true);
            parent.add(subplot, 1);
        }

        JFreeChart jfreechart = new JFreeChart(title, parent);
        JPanel jpanel = new ChartPanel(jfreechart);
        jpanel.setPreferredSize(new Dimension(defaultwidth, defaultheight));

        //if (showchart) {
        JFrame chartwindow = new JFrame(title);
        chartwindow.setContentPane(jpanel);
        chartwindow.pack();
        RefineryUtilities.centerFrameOnScreen(chartwindow);
        chartwindow.setVisible(true);
        //}
        Vector res = new Vector();
        res.add(0, jfreechart);
        res.add(1, chartwindow);
        return res;
    }

    public static JFreeChart MultipleStepChart(CategoryDataset[] datasets, String title,
            String x_axis_label, String y_axis_label, boolean showlegend,
            float maxvalue, float minvalue, boolean showchart) {

        CategoryAxis domainAxis = new CategoryAxis(x_axis_label);
        ValueAxis rangeAxis = new NumberAxis(y_axis_label);
        rangeAxis.setStandardTickUnits(NumberAxis.createStandardTickUnits());
        if (minvalue == 0 && maxvalue == 0) {
            rangeAxis.setAutoRange(true);
        } else {
            rangeAxis.setRange(minvalue, maxvalue);
        }
        CombinedDomainCategoryPlot parent = new CombinedDomainCategoryPlot(new CategoryAxis(x_axis_label));

        for (int i = 0; i < datasets.length; i++) {
            CategoryItemRenderer renderer = new CategoryStepRenderer(true);
            renderer.setBaseStroke(new BasicStroke(2.0f));
            CategoryPlot subplot = new CategoryPlot(datasets[i], domainAxis, rangeAxis, renderer);
            subplot.setBackgroundPaint(Color.white);
            subplot.setRangeGridlinePaint(Color.black);
            subplot.setDomainGridlinesVisible(true);
            //subplot.setDrawSharedDomainAxis(true);
            parent.add(subplot, 1);
        }

        JFreeChart jfreechart = new JFreeChart(title, parent);
        JPanel jpanel = new ChartPanel(jfreechart);
        jpanel.setPreferredSize(new Dimension(defaultwidth, defaultheight));

        if (showchart) {
            JFrame chartwindow = new JFrame(title);
            chartwindow.setContentPane(jpanel);
            chartwindow.pack();
            RefineryUtilities.centerFrameOnScreen(chartwindow);
            chartwindow.setVisible(true);
        }
        return jfreechart;
    }

    /*codigo para gerar os dados para o grafico MultipleLineChart
    XYDataset [] datasets = new XYDataset[lineindex.length];
    for (int i = 0; i < lineindex.length; i++){
    XYSeries serie = new XYSeries("sample "+lineindex[i]);
    for (int c=0; c < columns; c++)
    serie.add(c, Md[ lineindex[i] ][c]);
    //datasets[i].addValue(Md[ lineindex[i] ][c], String.valueOf(c));
    datasets[i] = new XYSeriesCollection(serie);
    }
     */
    public static void MultipleLineChart(XYDataset[] datasets, String title,
            String x_axis_label, String y_axis_label, boolean showlegend,
            float maxvalue, float minvalue) {
        JFrame chartwindow = new JFrame(title);
        CombinedDomainXYPlot parent = new CombinedDomainXYPlot(new NumberAxis(x_axis_label));
        for (int i = 0; i < datasets.length; i++) {
            XYItemRenderer renderer = new StandardXYItemRenderer();
            renderer.setBaseSeriesVisibleInLegend(showlegend);

            XYPlot subplot = new XYPlot(datasets[i], null, new NumberAxis(y_axis_label), renderer);
            NumberAxis axis = (NumberAxis) subplot.getRangeAxis();
            //axis.setTickLabelFont(new Font("SansSerif", Font.BOLD,12));
            //axis.setLabelFont(new Font("SansSerif", Font.PLAIN,10));
            axis.setAutoRangeIncludesZero(true);
            axis.setLabelFont(new Font("SansSerif", Font.BOLD, 12));

            NumberAxis daxis = (NumberAxis) parent.getDomainAxis();
            daxis.setLabelFont(new Font("SansSerif", Font.BOLD, 12));

            parent.add(subplot, 1);
        }
        JFreeChart jfreechart = new JFreeChart(title, parent);
        JPanel jpanel = new ChartPanel(jfreechart);
        jpanel.setPreferredSize(new Dimension(defaultwidth, defaultheight));
        chartwindow.setContentPane(jpanel);
        chartwindow.pack();
        RefineryUtilities.centerFrameOnScreen(chartwindow);
        chartwindow.setVisible(true);
    }

    public static void LineChart(DefaultCategoryDataset dataset, String title,
            String x_axis_label, String y_axis_label, boolean showlegend,
            float maxvalue, float minvalue) {

        JFrame chartwindow = new JFrame(title);

        JFreeChart jfreechart = ChartFactory.createLineChart(
                title,
                x_axis_label,
                y_axis_label,
                dataset,
                PlotOrientation.VERTICAL,
                showlegend, // include legend
                true, // tooltips
                true // urls
                );

        CategoryPlot categoryplot = (CategoryPlot) jfreechart.getPlot();
        categoryplot.setBackgroundPaint(Color.white);
        categoryplot.setRangeGridlinePaint(Color.black);
        NumberAxis numberaxis = (NumberAxis) categoryplot.getRangeAxis();
        numberaxis.setStandardTickUnits(NumberAxis.createStandardTickUnits());

        CategoryPlot plot = (CategoryPlot) jfreechart.getPlot();
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();

        if (minvalue == 0 && maxvalue == 0) {
            rangeAxis.setAutoRangeIncludesZero(true);
        } else {
            rangeAxis.setRange(minvalue, maxvalue);
        }
        LineAndShapeRenderer lineandshaperenderer =
                (LineAndShapeRenderer) categoryplot.getRenderer();
        lineandshaperenderer.setBaseStroke(new BasicStroke(2.0f));
        lineandshaperenderer.setShapesVisible(true);
        lineandshaperenderer.setDrawOutlines(true);
        lineandshaperenderer.setUseFillPaint(true);
        lineandshaperenderer.setFillPaint(Color.white);

        //GradientPaint gp1 = new GradientPaint(0.0f, 0.0f, Color.MAGENTA, 0.0f, 0.0f, Color.MAGENTA);
        //lineandshaperenderer.setSeriesPaint(0, gp1);
        //ou
        lineandshaperenderer.setSeriesPaint(0, Color.RED);

        JPanel jpanel = new ChartPanel(jfreechart);
        jpanel.setPreferredSize(new Dimension(defaultwidth, defaultheight));
        chartwindow.setContentPane(jpanel);
        chartwindow.pack();
        RefineryUtilities.centerFrameOnScreen(chartwindow);
        chartwindow.setVisible(true);
    }

    public static void PlotParallelCoordinates(String title,
            String x_axis_label, String y_axis_label, float[][] Md,
            int classes, int[] features, Vector featurestitles, Vector datatitles) {
        JFrame chartwindow = new JFrame(title);
        JFreeChart jfreechart = ChartFactory.createLineChart(
                title,
                x_axis_label,
                y_axis_label,
                null,
                PlotOrientation.VERTICAL,
                true,
                true,
                false);

        CategoryPlot categoryplot = (CategoryPlot) jfreechart.getPlot();
        categoryplot.setBackgroundPaint(Color.white);
        categoryplot.setRangeGridlinePaint(Color.black);
        NumberAxis numberaxis = (NumberAxis) categoryplot.getRangeAxis();
        numberaxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        int lines = Md.length;
        int columns = Md[0].length;

        LineAndShapeRenderer[] lineandshaperenderer =
                new LineAndShapeRenderer[classes];

        for (int i = 0; i < lineandshaperenderer.length; i++) {
            lineandshaperenderer[i] = new LineAndShapeRenderer();
            lineandshaperenderer[i].setShapesVisible(true);
            lineandshaperenderer[i].setDrawOutlines(true);
            lineandshaperenderer[i].setUseFillPaint(true);
            lineandshaperenderer[i].setFillPaint(Color.white);
            lineandshaperenderer[i].setBaseStroke(new BasicStroke(2.0f));
        }
        int count = 0;
        for (int i = 0; i < lines; i++) {
            int classe = ((int) Md[i][columns - 1]);
            DefaultKeyedValues2DDataset dataset =
                    new DefaultKeyedValues2DDataset();
            int j = 0;
            double value = 0;
            while (j < features.length) {
                /*value recebe o valor da linha i e da coluna especificada
                pelo usuario, por meio do parametro de chegada features[]*/
                value = Md[i][features[j]];

                String strclasse = String.valueOf(classe);
                //especifico Marie-Anne
                /*
                if (classe == 0) {
                    strclasse = "thi1";
                    lineandshaperenderer[classe].setSeriesPaint(0, Color.RED);
                    Shape s0 = new Rectangle2D.Float(-3f, -3f, 6f, 6f);
                    lineandshaperenderer[classe].setSeriesShape(0, s0);
                } else if (classe == 1) {
                    strclasse = "controle";
                    lineandshaperenderer[classe].setSeriesPaint(0, Color.PINK);
                    Shape s1 = new Ellipse2D.Float(-3f, -3f, 6f, 6f);
                    lineandshaperenderer[classe].setSeriesShape(0, s1);
                } else if (classe == 2) {
                    strclasse = "fotossíntese";
                    lineandshaperenderer[classe].setSeriesPaint(0, Color.GREEN);
                    int[] x = {-3, 0, 3};
                    int[] y = {-3, 3, -3};
                    int n = 3;
                    Shape s2 = new Polygon(x, y, n);
                    lineandshaperenderer[classe].setSeriesShape(0, s2);
                } else if (classe == 3) {
                    strclasse = "respiração";
                    int[] x = {-3, 0, 3};
                    int[] y = {3, -3, 3};
                    int n = 3;
                    Shape s3 = new Polygon(x, y, n);
                    lineandshaperenderer[classe].setSeriesShape(0, s3);
                    lineandshaperenderer[classe].setSeriesPaint(0, Color.BLUE);
                } else if (classe == 4) {
                    strclasse = "síntese de tiamina";
                    lineandshaperenderer[classe].setSeriesPaint(0, Color.BLACK);
                    Shape s4 = new Rectangle2D.Float(-1f, -3f, 1f, 6f);
                    lineandshaperenderer[classe].setSeriesShape(0, s4);
                } else if (classe == 5) {
                    strclasse = "glicólise";
                    int[] x = {-3, 0, 3, 0};
                    int[] y = {0, -3, 0, 3};
                    int n = 4;
                    Shape s5 = new Polygon(x, y, n);
                    lineandshaperenderer[classe].setSeriesPaint(0, Color.ORANGE);
                    lineandshaperenderer[classe].setSeriesShape(0, s5);
                } else if (classe == 6) {
                    strclasse = "AT4G34200";
                    int[] x = {-3, 0, 3, 0};
                    int[] y = {0, -3, 0, 3};
                    int n = 4;
                    Shape s5 = new Polygon(x, y, n);
                    lineandshaperenderer[classe].setSeriesPaint(0, Color.MAGENTA);
                    lineandshaperenderer[classe].setSeriesShape(0, s5);
                } else if (classe == 7) {
                    strclasse = "AT2G36530";
                    int[] x = {-3, 0, 3, 0};
                    int[] y = {0, -3, 0, 3};
                    int n = 4;
                    Shape s5 = new Polygon(x, y, n);
                    lineandshaperenderer[classe].setSeriesPaint(0, Color.CYAN);
                    lineandshaperenderer[classe].setSeriesShape(0, s5);
                }
                 */

                if (featurestitles != null) {
                    if (datatitles != null) {
                        dataset.addValue(value, strclasse, (String) featurestitles.get(features[j] + 1));
                        //datasets[i].addValue(Mo[lineindex[i]][c], label, (String) featurestitles.get(c + 1));
                    } else {
                        dataset.addValue(value, strclasse, (String) featurestitles.get(features[j]));
                        //datasets[i].addValue(Mo[lineindex[i]][c], label, (String) featurestitles.get(c));
                    }
                } else {
                    dataset.addValue(value, strclasse, String.valueOf(features[j]));
                    //datasets[i].addValue(Mo[lineindex[i]][c], label, String.valueOf(c));
                }
                //dataset.addValue(value, String.valueOf(classe), String.valueOf(features[j]));
                j++;
            }
            categoryplot.setDataset(count, dataset);
            categoryplot.setRenderer(count, lineandshaperenderer[classe]);
            count++;
        }
        LegendItemCollection legends = categoryplot.getLegendItems();
        LegendItemCollection newlegends = new LegendItemCollection();
        for (int i = 0; i < classes; i++) {
            int l = 0;
            //especifico Marie-Anne
            String label1 = null;
            if (i == 0) {
                label1 = "thi1";
            } else if (i == 1) {
                label1 = "controle";
            } else if (i == 2) {
                label1 = "fotossíntese";
            } else if (i == 3) {
                label1 = "respiração";
            } else if (i == 4) {
                label1 = "síntese de tiamina";
            } else if (i == 5) {
                label1 = "glicólise";
            } else if (i == 6) {
                label1 = "AT4G34200";
            } else if (i == 7) {
                label1 = "AT2G36530";
            }

            //String label1 = String.valueOf(i);
            String label2 = null;
            boolean found = false;
            do {
                label2 = legends.get(l).getLabel();
                if (label1.equalsIgnoreCase(label2)) {
                    found = true;
                } else {
                    l++;
                }
            } while (!found && (l < lines));
            if (found) {
                //newlegends.add(legends.get(l));
                LegendItem li = new LegendItem(
                        legends.get(l).getLabel(),
                        legends.get(l).getDescription(),
                        legends.get(l).getToolTipText(),
                        legends.get(l).getURLText(),
                        legends.get(l).isShapeVisible(),
                        legends.get(l).getShape(),
                        legends.get(l).isShapeFilled(),
                        legends.get(l).getFillPaint(),
                        legends.get(l).isShapeOutlineVisible(),
                        legends.get(l).getOutlinePaint(),
                        legends.get(l).getOutlineStroke(),
                        legends.get(l).isLineVisible(),
                        legends.get(l).getLine(),
                        legends.get(l).getLineStroke(),
                        legends.get(l).getLinePaint());
                newlegends.add(li);
            }
        }
        categoryplot.setFixedLegendItems(newlegends);
        JPanel jpanel = new ChartPanel(jfreechart);
        jpanel.setPreferredSize(new Dimension(defaultwidth, defaultheight));
        chartwindow.setContentPane(jpanel);
        chartwindow.pack();
        RefineryUtilities.centerFrameOnScreen(chartwindow);
        chartwindow.setVisible(true);
    }

    public static void PlotMeanParallelCoordinates(String title,
            String x_axis_label, String y_axis_label, float[][] Md,
            int classes, int[] features, Vector featurestitles, Vector datatitles) {
        JFrame chartwindow = new JFrame(title);

        JFreeChart jfreechart = ChartFactory.createLineChart(
                title,
                x_axis_label,
                y_axis_label,
                null,
                PlotOrientation.VERTICAL,
                true,
                true,
                false);

        CategoryPlot categoryplot = (CategoryPlot) jfreechart.getPlot();
        categoryplot.setBackgroundPaint(Color.white);
        categoryplot.setRangeGridlinePaint(Color.black);

        NumberAxis numberaxis = (NumberAxis) categoryplot.getRangeAxis();
        numberaxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        int lines = Md.length;
        int columns = Md[0].length;

        LineAndShapeRenderer[] lineandshaperenderer =
                new LineAndShapeRenderer[classes];
        //lineandshaperenderer[0] = new LineAndShapeRenderer();//(LineAndShapeRenderer) categoryplot.getRenderer();
        //lineandshaperenderer[0].setShapesVisible(true);
        //lineandshaperenderer[0].setDrawOutlines(true);
        //lineandshaperenderer[0].setUseFillPaint(true);
        //lineandshaperenderer[0].setFillPaint(Color.white);

        for (int i = 0; i < lineandshaperenderer.length; i++) {
            lineandshaperenderer[i] = new LineAndShapeRenderer();
            lineandshaperenderer[i].setShapesVisible(true);
            lineandshaperenderer[i].setDrawOutlines(true);
            lineandshaperenderer[i].setUseFillPaint(true);
            lineandshaperenderer[i].setFillPaint(Color.white);
            lineandshaperenderer[i].setBaseStroke(new BasicStroke(2.0f));
        }

        double[][][] valuesperclasse = new double[columns][classes][2];
        /* a primeira coluna acumula a soma dos valores, e a segunda coluna
        conta o numero de vezes que recebeu um valor,
        para gerar a media aritmetica dos valores de cada atributo para
        cada uma das classes.*/
        for (int i = 0; i < lines; i++) {
            int classe = ((int) Md[i][columns - 1]);
            int j = 0;
            while (j < features.length) {
                valuesperclasse[features[j]][classe][0] += Md[i][features[j]];
                valuesperclasse[features[j]][classe][1]++;
                j++;
            }
        }

        for (int i = 0; i < classes; i++) {
            DefaultKeyedValues2DDataset dataset =
                    new DefaultKeyedValues2DDataset();
            double meanvaluej = 0;
            for (int j = 0; j < features.length; j++) {
                meanvaluej = valuesperclasse[features[j]][i][0]
                        / valuesperclasse[features[j]][i][1];

                String strclasse = String.valueOf(i);

                //especifico Marie-Anne
                /*
                if (i == 0) {
                    strclasse = "thi1";
                    lineandshaperenderer[i].setSeriesPaint(0, Color.RED);
                    Shape s0 = new Rectangle2D.Float(-3f, -3f, 6f, 6f);
                    lineandshaperenderer[i].setSeriesShape(0, s0);
                } else if (i == 1) {
                    strclasse = "controle";
                    lineandshaperenderer[i].setSeriesPaint(0, Color.PINK);
                    Shape s1 = new Ellipse2D.Float(-3f, -3f, 6f, 6f);
                    lineandshaperenderer[i].setSeriesShape(0, s1);
                } else if (i == 2) {
                    strclasse = "fotossíntese";
                    lineandshaperenderer[i].setSeriesPaint(0, Color.GREEN);
                    int[] x = {-3, 0, 3};
                    int[] y = {-3, 3, -3};
                    int n = 3;
                    Shape s2 = new Polygon(x, y, n);
                    lineandshaperenderer[i].setSeriesShape(0, s2);
                } else if (i == 3) {
                    strclasse = "respiração";
                    int[] x = {-3, 0, 3};
                    int[] y = {3, -3, 3};
                    int n = 3;
                    Shape s3 = new Polygon(x, y, n);
                    lineandshaperenderer[i].setSeriesShape(0, s3);
                    lineandshaperenderer[i].setSeriesPaint(0, Color.BLUE);
                } else if (i == 4) {
                    strclasse = "síntese de tiamina";
                    lineandshaperenderer[i].setSeriesPaint(0, Color.BLACK);
                    Shape s4 = new Rectangle2D.Float(-1f, -3f, 1f, 6f);
                    lineandshaperenderer[i].setSeriesShape(0, s4);
                } else if (i == 5) {
                    strclasse = "glicólise";
                    int[] x = {-3, 0, 3, 0};
                    int[] y = {0, -3, 0, 3};
                    int n = 4;
                    Shape s5 = new Polygon(x, y, n);
                    lineandshaperenderer[i].setSeriesPaint(0, Color.ORANGE);
                    lineandshaperenderer[i].setSeriesShape(0, s5);
                } else if (i == 6) {
                    strclasse = "AT4G34200";
                    int[] x = {-3, 0, 3, 0};
                    int[] y = {0, -3, 0, 3};
                    int n = 4;
                    Shape s5 = new Polygon(x, y, n);
                    lineandshaperenderer[i].setSeriesPaint(0, Color.MAGENTA);
                    lineandshaperenderer[i].setSeriesShape(0, s5);
                } else if (i == 7) {
                    strclasse = "AT2G36530";
                    int[] x = {-3, 0, 3, 0};
                    int[] y = {0, -3, 0, 3};
                    int n = 4;
                    Shape s5 = new Polygon(x, y, n);
                    lineandshaperenderer[i].setSeriesPaint(0, Color.CYAN);
                    lineandshaperenderer[i].setSeriesShape(0, s5);
                }
                 */

                if (featurestitles != null) {
                    if (datatitles != null) {
                        dataset.addValue(meanvaluej, strclasse, (String) featurestitles.get(features[j] + 1));
                        //datasets[i].addValue(Mo[lineindex[i]][c], label, (String) featurestitles.get(c + 1));
                    } else {
                        dataset.addValue(meanvaluej, strclasse, (String) featurestitles.get(features[j]));
                        //datasets[i].addValue(Mo[lineindex[i]][c], label, (String) featurestitles.get(c));
                    }
                } else {
                    dataset.addValue(meanvaluej, strclasse, String.valueOf(features[j]));
                    //dataset.addValue(meanvaluej, String.valueOf(i), String.valueOf(features[j]));
                }
                //dataset.addValue(meanvaluej, String.valueOf(i), String.valueOf(features[j]));
            }
            categoryplot.setDataset(i, dataset);
            categoryplot.setRenderer(i, lineandshaperenderer[i]);
        }
        JPanel jpanel = new ChartPanel(jfreechart);
        jpanel.setPreferredSize(new Dimension(defaultwidth, defaultheight));
        chartwindow.setContentPane(jpanel);
        chartwindow.pack();
        RefineryUtilities.centerFrameOnScreen(chartwindow);
        chartwindow.setVisible(true);
    }

    public static void MultipleLineChart(XYSeriesCollection datasets,
            String title, String x_axis_label, String y_axis_label) {
        JFrame chartwindow = new JFrame(title);
        JFreeChart jfreechart = ChartFactory.createXYLineChart(
                title,
                x_axis_label,
                y_axis_label,
                datasets,
                PlotOrientation.VERTICAL,
                true,
                true,
                true);

        XYPlot xyplot = (XYPlot) jfreechart.getPlot();
        xyplot.setBackgroundPaint(Color.white);
        xyplot.setRangeGridlinePaint(Color.black);

        NumberAxis rangeAxis = (NumberAxis) xyplot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        rangeAxis.setAutoRangeIncludesZero(true);

        XYLineAndShapeRenderer lineandshaperenderer =
                (XYLineAndShapeRenderer) xyplot.getRenderer();
        lineandshaperenderer.setShapesVisible(true);
        lineandshaperenderer.setDrawOutlines(true);
        lineandshaperenderer.setUseFillPaint(true);
        lineandshaperenderer.setFillPaint(Color.white);

        JPanel jpanel = new ChartPanel(jfreechart);
        jpanel.setPreferredSize(new Dimension(defaultwidth, defaultheight));
        chartwindow.setContentPane(jpanel);
        chartwindow.pack();
        RefineryUtilities.centerFrameOnScreen(chartwindow);
        chartwindow.setVisible(true);
    }

    public static void GraficoTorta() {
        JFrame janela = new JFrame("Exemplo de Gráfico de Torta");

        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("JavaWorld", new Integer(75));
        pieDataset.setValue("Other", new Integer(25));

        JFreeChart jfreechart = ChartFactory.createPieChart(
                "Sample Pie Chart", // Title
                pieDataset, // Dataset
                true, // Show legend
                false, // Tooltips
                false // url
                );

        JPanel jpanel = new ChartPanel(jfreechart);
        jpanel.setPreferredSize(new Dimension(defaultwidth, defaultheight));
        janela.setContentPane(jpanel);
        janela.pack();
        RefineryUtilities.centerFrameOnScreen(janela);
        janela.setVisible(true);

    }

    public static int Maximum(int[] vet) {
        int max = vet[0];
        for (int i = 1; i < vet.length; i++) {
            if (vet[i] > max) {
                max = vet[i];
            }
        }
        return (max);
    }

    public static void Histogram(Vector data, int maxvalue, String net) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int i = 0;
        int[] degree = new int[maxvalue];//guarda o grau de cada no
        int value = 0;

        for (i = 0; i < data.size(); i++) {
            value = (Integer) data.get(i);
            degree[value]++;//determina o grau de cada no == quantas vezes ele apareceu na lista.
        }

        int max = Maximum(degree);//pega o grau maximo para gerar o histograma
        int[] vethistogram = new int[max + 1];
        for (i = 0; i < degree.length; i++) {
            vethistogram[degree[i]]++;//para cada ocorrencia do grau, soma um na sua posicao do histograma.
        }

        //codigo para gerar os dados para o grafico MultipleLineChart
        XYDataset[] xydatasets = new XYDataset[1];
        XYSeries serie = new XYSeries("sample");

        XYSeries series2 = new XYSeries("Max Value");

        float maxvaluef = maxvalue;
        for (i = 0; i < max + 1; i++) {
            float nnos = vethistogram[i];
            if (i != 0 && nnos != 0 && net.equalsIgnoreCase("BA")) {
                serie.add(Math.log(i), Math.log(nnos / maxvaluef));
                series2.add(Math.log(i), Math.log(nnos / maxvaluef));
            } else if (net.equalsIgnoreCase("ER")) {
                serie.add(i, nnos / maxvaluef);
                series2.add(i, nnos / maxvaluef);
            }
            //serie.add(i, (nnos/maxvaluef));
            dataset.addValue((Number) vethistogram[i], 0, i);
            //datasets[i].addValue(Md[ lineindex[i] ][c], String.valueOf(c));
        }
        XYSeriesCollection series = new XYSeriesCollection();
        series.addSeries(series2);
        ScatterPlot(series, "Validation Graph - Node Degree Distribution", "log(k)", "log(P(k))");

        xydatasets[0] = new XYSeriesCollection(serie);
        Chart.MultipleLineChart(xydatasets, "Line Chart", "degree",
                "number of nodes", true, 0, 0);

        Chart.BarChart(dataset, "Histogram of node degree", "samples", "values", true);
    }

//    public static void Distribution(AGN network) {
//        int maxdegree = Math.round(CNMeasurements.getMaxDegree(network.getGenes()) / 2);
//        int[] degreedistribution = new int[maxdegree + 1];//guarda o grau de cada no
//        for (int i = 0; i < network.getGenes().length; i++) {
//            int degree = Math.round((network.getGenes()[i].getPredictors().size() + network.getGenes()[i].getTargets().size()) / 2);
//            degreedistribution[degree]++;//determina o grau de cada no == quantas vezes ele apareceu na lista.
//        }
//
//        //codigo para gerar os dados para o grafico MultipleLineChart
//        XYDataset[] xydatasets = new XYDataset[1];
//        XYSeries serie = new XYSeries("degree distribution");
//        double totalvertices = network.getGenes().length;
//        for (int degree = 0; degree < maxdegree + 1; degree++) {
//            double removevertices = degreedistribution[degree];
//            totalvertices -= removevertices;
//            double cpd = totalvertices / (float) network.getGenes().length;
//            if (cpd > 0 && degree > 0) {
//                //dividido por log10(2) para transformar da base 10 para a base 2.
//                serie.add(Math.log10(degree) / Math.log10(2), Math.log10(cpd) / Math.log10(2));
//                //serie.add(degree, cpd);
//            } else {
//                serie.add(0, 1);
//            }
//        }
//        xydatasets[0] = new XYSeriesCollection(serie);
//        String title = "Cumulative distribution of the vertices degrees - network model " + network.getTopology();
//        String xaxis = "<k> = " + network.getAvgedges();
//        String yaxis = "P(k)";
//        Chart.MultipleLineChart(xydatasets, title, xaxis, yaxis, false, 0, 0);
//    }
//
//    public static void Histogram(AGN network) {
//        DefaultCategoryDataset inhistogram = new DefaultCategoryDataset();
//        DefaultCategoryDataset outhistogram = new DefaultCategoryDataset();
//        int i = 0;
//        int maxindegree = CNMeasurements.getMaxInDegree(network.getGenes());
//        int maxoutdegree = CNMeasurements.getMaxOutDegree(network.getGenes());
//        int[] indegreedistribution = new int[maxindegree + 1];//guarda o grau de cada no
//        int[] outdegreedistribution = new int[maxoutdegree + 1];//guarda o grau de cada no
//        for (i = 0; i < network.getGenes().length; i++) {
//            //int degree = Math.round((network.getGenes()[i].getPredictors().size() + network.getGenes()[i].getTargets().size()) / 2);
//            int indegree = network.getGenes()[i].getPredictors().size();
//            int outdegree= network.getGenes()[i].getTargets().size();
//            indegreedistribution[indegree]++;//determina o grau de cada no == quantas vezes ele apareceu na lista.
//            outdegreedistribution[outdegree]++;//determina o grau de cada no == quantas vezes ele apareceu na lista.
//        }
//        for (i = 0; i < maxindegree + 1; i++) {
//            inhistogram.addValue((Number) (indegreedistribution[i] / (float) network.getGenes().length), 0, i);
//        }
//        for (i = 0; i < maxoutdegree + 1; i++) {
//            outhistogram.addValue((Number) (outdegreedistribution[i] / (float) network.getGenes().length), 0, i);
//        }
//        //String title = "Histograma dos graus dos vértices da rede - modelo " + network.getTopology();
//        String xaxis = "<k> = " + network.getAvgedges();
//        String yaxis = "P(k)";
//        Chart.BarChart(
//                inhistogram,
//                "In-degree Histogram of the network vertices",//title
//                xaxis,
//                yaxis,
//                false//show legend
//                );
//        Chart.BarChart(
//                outhistogram,
//                "Out-degree Histogram of the network vertices",//title
//                xaxis,
//                yaxis,
//                false//show legend
//                );
//    }

    public static int FindPathwayPosition(Vector pathways, String pathway){
        if (!pathways.contains(pathway)){
            return(-1);//nao contem
        }
        for (int p = 0; p < pathways.size(); p++){
            if (((String)pathways.get(p)).equalsIgnoreCase(pathway)){
                return(p);
            }
        }
        return (-1);
    }

//    public static void HistogramofPredictorsPathway(AGN network, int classe) {
//        DefaultCategoryDataset histogram = new DefaultCategoryDataset();
//        Vector pathways = AGNRoutines.PathwayDescrptions(network);
//        int maxd = pathways.size();
//        int[] distribution = new int[maxd];
//        for (int i = 0; i < network.getGenes().length; i++) {
//            Gene gene = network.getGenes()[i];
//            if (gene.getClassnumber() == classe) {
//                //encontrou um gene do grupo de interesse (classe recebida por parametro).
//                if (gene.getPredictors()!=null){//existem preditores
//                    if (gene.getPredictorsties() != null){//existem preditores empatados
//                        for (int t = 0; t < gene.getPredictorsties().length; t++){
//                            for (int p = 0; p < gene.getPredictorsties()[t].size(); p++){
//                                int predictorindex = (Integer) gene.getPredictorsties()[t].get(p);
//                                Gene predictor = network.getGenes()[predictorindex];
//                                if (predictor.getPathway()!=null){
//                                    for (int pw = 0; pw < predictor.getPathwaydescription().size(); pw++){
//                                        int pos = FindPathwayPosition(pathways, (String) predictor.getPathwaydescription().get(pw));
//                                        if (pos != -1){
//                                            distribution[pos]++;//determina o grau de cada no == quantas vezes ele apareceu na lista.
//                                        }
//                                    }
//                                }
//                            }
//                        }
//                    }else{
//
//                    }
//                }
//            }
//        }
//        int bincount = 0;
//        //Table dataTable = new Table();
//        Vector valores = new Vector();
//        Vector rotulos = new Vector();
//        for (int i = 0; i < maxd; i++) {
//            if (distribution[i] > 2){
//                histogram.addValue((Number) distribution[i], 0, (String) pathways.get(i));
//                rotulos.add(bincount, (String) pathways.get(i));
//                valores.add(bincount, (int) distribution[i]);
//                //dataTable.addColumn((String) pathways.get(i), Integer.class, (Number) distribution[i]);
//                bincount++;
//            }
//        }
//        //HistogramTable histoTable = new HistogramTable(dataTable, bincount);
//        //new HistogramFrame(histoTable, dataTable, bincount);
//
//        //String path = IOFile.SaveFile();
//        //if (path != null){
//        //    IOFile.WriteTwoColumnsFile(path, rotulos, valores, false);
//        //}
//        String title = "Histograma das Vias Metabólicas";
//        String xaxis = "vias metabolicas";
//        String yaxis = "frequencia";
//        Chart.BarChart(histogram, title, xaxis, yaxis, false);
//    }

    public static void BarChart(DefaultCategoryDataset dataset, String title,
            String x_axis_label, String y_axis_label, boolean showlegend) {
        JFrame chartwindow = new JFrame(title);
        JFreeChart jfreechart = ChartFactory.createStackedBarChart(
                title,
                x_axis_label,
                y_axis_label,
                dataset,
                PlotOrientation.HORIZONTAL,
                showlegend,
                true,
                false);

        CategoryPlot categoryplot = (CategoryPlot) jfreechart.getPlot();
        categoryplot.setBackgroundPaint(Color.white);
        categoryplot.setRangeGridlinePaint(Color.black);
        NumberAxis numberaxis = (NumberAxis) categoryplot.getRangeAxis();
        numberaxis.setLabelFont(new Font("SansSerif", Font.BOLD, 12));

        CategoryAxis domainaxis = categoryplot.getDomainAxis();
        domainaxis.setLabelFont(new Font("SansSerif", Font.BOLD, 12));

        JPanel jpanel = new ChartPanel(jfreechart);
        jpanel.setPreferredSize(new Dimension(defaultwidth, defaultheight));
        chartwindow.setContentPane(jpanel);
        chartwindow.pack();
        RefineryUtilities.centerFrameOnScreen(chartwindow);
        chartwindow.setVisible(true);
    }

    public static void Histogram(IntervalXYDataset dataset,
            String title, String x_axis_label, String y_axis_label) {
        JFrame chartwindow = new JFrame(title);
        JFreeChart jfreechart = ChartFactory.createHistogram(
                title,
                x_axis_label,
                y_axis_label,
                dataset,
                PlotOrientation.VERTICAL,
                true,
                false,
                false);

        JPanel jpanel = new ChartPanel(jfreechart);
        jpanel.setPreferredSize(new Dimension(defaultwidth, defaultheight));
        chartwindow.setContentPane(jpanel);
        chartwindow.pack();
        RefineryUtilities.centerFrameOnScreen(chartwindow);
        chartwindow.setVisible(true);
    }

    public static void GraficoBarras() {
        JFrame janela = new JFrame("Exemplo de Gráfico de Barras");

        DefaultCategoryDataset defaultcategorydataset =
                new DefaultCategoryDataset();
        defaultcategorydataset.addValue(212D, "Classes", "JDK 1.0");
        defaultcategorydataset.addValue(504D, "Classes", "JDK 1.1");
        defaultcategorydataset.addValue(1520D, "Classes", "SDK 1.2");
        defaultcategorydataset.addValue(1842D, "Classes", "SDK 1.3");
        defaultcategorydataset.addValue(2991D, "Classes", "SDK 1.4");

        JFreeChart jfreechart = ChartFactory.createStackedBarChart(
                "Java Standard Class Library",
                "Release",
                "Class Count",
                defaultcategorydataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false);

        JPanel jpanel = new ChartPanel(jfreechart);
        jpanel.setPreferredSize(new Dimension(defaultwidth, defaultheight));
        janela.setContentPane(jpanel);
        janela.pack();
        RefineryUtilities.centerFrameOnScreen(janela);
        janela.setVisible(true);

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Chart().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    // End of variables declaration//GEN-END:variables
}
