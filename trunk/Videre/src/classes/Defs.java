/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

/**
 * Created on : Oct 4, 2011, 7:23:16 PM
 * @author diogo
 */
public abstract class Defs {

	public static String imagesPath = "/imagens/";
	public static String audioPath = "/sons/";
	public static String defaultFontFamily = "Comic Sans MS";

	
	public static final String savePath = "save/"; // generic data. we can find here which players exists, and which was the latest to play
	public static final String playerSavePath = savePath + "players/"; //

	public static final int FREQUENCY_SCORE_AMOUNT = 5; // amount of division for performance Frequency graph

}
