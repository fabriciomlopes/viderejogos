/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import Analise.PlayerManager;
import GUI.Acerto;
import GUI.Inicial;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 * Created on : Mar 26, 2012, 8:51:36 PM
 * @author diogo
 */
public class Init {

	public static void main(String[] args) {
		try {
			String os = System.getProperty("os.name").toLowerCase();
			System.out.println(os);
			if (os.contains("win") || os.contains("ruindows")) {
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			} else if (os.contains("nux") || os.contains("nix")) {
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		new JFrame().getContentPane().setLayout(null);
		
		Inicial.GetInsance().AbrirMenu();

		Acerto.InicializarSingleton();

		// init player configs
		Inicial.GetInsance().SetCurrentPlayer(PlayerManager.GetInstance().GetLatestPlayer());



	}

}
