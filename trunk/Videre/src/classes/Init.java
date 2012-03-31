/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import Analise.PlayerManager;
import GUI.Acerto;
import GUI.Inicial;

/**
 * Created on : Mar 26, 2012, 8:51:36 PM
 * @author diogo
 */
public class Init {

	public static void main(String[] args) {
		
		Inicial.GetInsance().AbrirMenu();

		Acerto.InicializarSingleton();

		// init player configs
		Inicial.GetInsance().SetCurrentPlayer(PlayerManager.GetInstance().GetLatestPlayer());


	}

}
