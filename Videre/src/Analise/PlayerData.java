/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Analise;

import classes.Defs;
import classes.UtilitySerial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on : Mar 26, 2012, 7:06:16 PM
 * @author diogo
 */
public class PlayerData implements Serializable{

	public String sName;
	public ArrayList<GameData> lGameDatas;
	public transient boolean bTemprorary; // true when playing a game withouth player. will not save when true.
	/**
	 * Gets the directory witch contains the serialized file
	 * based on player's name
	 * @return
	 */
	public static String GetPlayerSavePath(String sPlayerName){
		return Defs.playerSavePath + sPlayerName;
	}

	public static PlayerData Load(String sPlayerName){
		PlayerData output = null;
		try {
			Object obj = UtilitySerial.Read(GetPlayerSavePath(sPlayerName));
			if (obj instanceof PlayerData) {
				System.out.println("Loading Player!" + sPlayerName);
				output = (PlayerData) obj;
			}
			else if (obj == null) {
				System.out.println("Create new Player!" + sPlayerName);
				output = new PlayerData(sPlayerName);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		return output;
	}

	public PlayerData(String sName) {
		this.sName = sName;
		this.lGameDatas = new ArrayList<GameData>();
	}

	

	/**
	 * Gets the directory witch contains the serialized file
	 * @return
	 */
	public String GetPlayerSavePath(){
		return GetPlayerSavePath(sName);
	}

	
	/**
	 * Saves the current Data.
	 */
	public void Save(){
		if (bTemprorary){
			return;
		}
		UtilitySerial.saveObject(this, GetPlayerSavePath() );
	}

	/**
	 * loops through all games and get it's type.
	 * adds it into an array without repeating value.
	 * @return returns null if no games found.
	 */
	public Class<?>[] GetAllPlayedGameTypes() {
		List<Class<?>> list = new ArrayList<Class<?>>();


		// look for each played game
		for (GameData gameData : lGameDatas) {
			if (!list.contains(gameData.type)) {
				list.add(gameData.type);
			}
		}

		if (list.size() > 0) {
			Class<?>[] temp = new Class<?>[list.size()];

			return list.toArray(temp);
		}
		else {
			
			return null;
		}

	}



	/**
	 * Dump all values.
	 * Used only for debugging.
	 * @return
	 */
	public String Dump() {
		
		StringBuilder msg = new StringBuilder("");


		msg.append("Player Name: ").append(this.sName).append('\n');
		msg.append("--- Game Datas --- ");
		int iCount = 0;
		for (GameData gameData : this.lGameDatas) {
			msg.append("\n\tGame Data :").append(iCount++);
			msg.append(gameData.Dump("\n\t"));
			msg.append("\n\t---");
		}

		msg.append("\n--- End Game Datas --- ");

		return msg.toString();
	}
}
