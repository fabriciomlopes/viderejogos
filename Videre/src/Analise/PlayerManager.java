/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Analise;

import classes.Defs;
import classes.UtilitySerial;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on : Mar 26, 2012, 7:37:13 PM
 * @author diogo
 */
public class PlayerManager {

	public static final String INVALID_CHARS = "[\\/\\\\\\]\\[0-9!\"#$%&'()*+,./:;<=>?@\\^_`{|}~-]";
	public static final String INVALID_MATCH = ".*"+INVALID_CHARS+".*";

	private static PlayerManager instance;
	public static PlayerManager GetInstance() {
		
		if (instance == null){
			instance = new PlayerManager();
			instance.Init();
		}

		return instance;
	}


	/**
	 * typeless method.
	 * helps us save current player.
	 */
	public static void Save(){
		if (GetInstance().GetCurrentPlayerData() != null) {
			GetInstance().GetCurrentPlayerData().Save();

			//// DEBUG
			//Dump();
		}
	}

	/**
	 * displays all players at console.
	 * Only used for debug.
	 */
	public static void Dump() {
		StringBuilder msg = new StringBuilder("");

		msg.append("Current Player:").append(GetInstance().GetCurrentPlayerData().Dump());

		System.out.println(msg.toString());
	}

	private PlayerData currentPlayer;
	private boolean  bPlayerChanged; // true when SetLatestPlayer is called

	public void Init() {
		// init directories
		new File(Defs.savePath).mkdir();
		new File(Defs.playerSavePath).mkdir();

		this.bPlayerChanged = true;
		this.currentPlayer = null;
	}


// <editor-fold defaultstate="collapsed" desc="Get/Set Latest Player Name">
	protected String GetLatestPlayerPath() {
		return Defs.savePath + "latest.txt";
	}

	public String GetLatestPlayer() {
		String sName = null;
		try {
			
			sName = ValidateName(UtilitySerial.ReadString(GetLatestPlayerPath()));
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return sName;
	}

	public void SetLatestPlayer(String sName) {

		sName = ValidateName(sName);
		if (sName == null) {
			return;
		}

		try {
			
			UtilitySerial.saveFile(sName, GetLatestPlayerPath());
			// current player instance is null or new player is different?
			if (currentPlayer == null || !currentPlayer.sName.equals(sName)) {
				// yes, then
				bPlayerChanged = true;
			}
			else {
				bPlayerChanged = false;
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public PlayerData GetCurrentPlayerData() {
		if (bPlayerChanged) {
			System.out.println("GetCurrentPlayerData(); player CHanged, creating new instance!");
			String sName = GetLatestPlayer();
			
			if (sName == null) {
				currentPlayer = new PlayerData("User" + ((int) Math.random()*10000));
				currentPlayer.bTemprorary = true;
			}
			else {
				currentPlayer = PlayerData.Load(sName);
				bPlayerChanged = false;
			}
		}


		return currentPlayer;
	}
	// </editor-fold>


	protected String GetAllPlayersPath(){
		return Defs.savePath + "players.txt";
	}

	public String[] GetAllPlayersNames() {
		String[] vNames = null;
		try {
			String sContent = UtilitySerial.ReadString(GetAllPlayersPath());
			// not empty file?
			if (!sContent.trim().equals("")) {
				// yes, so split them
				vNames = sContent.split("\n");// sdad
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return vNames;
	}

	/**
	 * checks at the file if the given name exists
	 * @return
	 */
	public boolean ContainsNameInSave(String sName) {
		sName = ValidateName(sName);
		// is a name?
		if (sName == null) {
			// no,
			return false;
		}
		else {
			String[] vAllNames = GetAllPlayersNames();

			if (vAllNames == null) {
				// no player exist, so return false
				return false;
			}
			else {
				// check if one of them is the name
				for (int i= 0; i < vAllNames.length; i++) {
					if (vAllNames[i].equals(sName)){
						return true;
					}
				}
			}
		}
		
		return false;
	}

	/**
	 * Adds a player by it's name.
	 * returns true if player created, false if not.
	 * @param sName
	 */
	public boolean AddPlayerName(String sName){
		sName = ValidateName(sName);
		if (sName == null) {
			return false;
		}

		String[] vAllPlayers = GetAllPlayersNames();

		// the string we will save
		StringBuilder str = new StringBuilder();

		if (vAllPlayers != null) {
			// dont repeat;
			for (int i= 0; i < vAllPlayers.length; i++) {
				str.append(vAllPlayers[i]).append('\n');
				if (sName.equals(vAllPlayers[i])) {
					return false;
				}
			}
		}

		str.append(sName);

		try {
			UtilitySerial.saveFile(str.toString(), GetAllPlayersPath());
			return true;
		} catch (Exception e) {
		}
		
		return false;
	}

	/**
	 * Validates the name.
	 * return null if not valid player.
	 * @param sName
	 * @return
	 */
	protected String ValidateName(String sName){

		if (sName == null) {
			return null;
		}

		if (sName.matches(INVALID_MATCH)){
			sName = sName.replaceAll(INVALID_CHARS, "");
		}

		sName = sName.trim();
		// empty string?
		if (sName.trim().equals("")) {
			// yes, then not valid. return null
			return null;
		}


		return sName;
	}

	/**
	 * Reads all names in the player names file in HD
	 * and load them as player Data.
	 * @return All player data based on saved Player List. Returns null if no players is loaded
	 */
	public PlayerData[] GetAllPlayerDatas() {
		String[] vAllNames = GetAllPlayersNames();

		if (vAllNames == null) {
			return null;
		}

		PlayerData[] playerDatas = new PlayerData[vAllNames.length];

		for (int i = 0; i < vAllNames.length; i++) {
			playerDatas[i] = PlayerData.Load(vAllNames[i]);
			System.out.println("lodando "+ vAllNames[i]);
		}

		return playerDatas;
	}

	
	public Class<?>[] GetAllPlayedGameTypes(PlayerData[] playerDatas) {
		List<Class<?>> list = new ArrayList<Class<?>>();

		/// PlayerData[] playerDatas = GetAllPlayerDatas();

		for (int i = 0; i < playerDatas.length; i++) {
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


}
