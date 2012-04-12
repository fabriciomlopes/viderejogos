/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Analise;

import java.lang.Class;

/**
 * Created on : Apr 2, 2012, 8:14:42 PM
 * @author diogo
 */
public abstract class PlayerStatisticsBase {


	protected  PlayerData[] vPlayerDatas;
	protected Class<?>[] vTypes; // cache value of all types.

	public void SetPlayerDatas(PlayerData ... vPlayerDatas) {
		this.vPlayerDatas = vPlayerDatas;
	}

	/**
	 * checks if contains the type in the array
	 * @param type
	 * @return
	 */
	protected boolean ContainsType(Class<?> type) {

		for (int i = 0; i < vTypes.length; i++) {
			if (type == vTypes[i]) {
				return true;
			}
		}
		return false;
	}

	public Class<?>[] GetTypes(){
		return vTypes;
	}

}
