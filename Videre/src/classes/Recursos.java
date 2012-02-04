/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

/**
 * Created on : Feb 1, 2012, 9:28:06 PM
 * @author diogo
 */
public class Recursos {


	// <editor-fold defaultstate="collapsed" desc="Singleton">
	private static Recursos instance;

	public static Recursos GetInsance() {
		if (instance == null) {
			instance = new Recursos();
		}
		return instance;
	}
	// </editor-fold>


	public Recursos() {
	}

	

	public String caminhImagens;

	public javax.swing.ImageIcon getImagem(String caminho){
		javax.swing.ImageIcon icon = null;
		String path = Defs.imagesPath + caminho;
		
		try {
			icon = new javax.swing.ImageIcon (getClass().getResource(path));
			//javax.swing.ImageIcon icon = new javax.swing.ImageIcon (getClass().getResource("/imagens/sombras/scavalo.gif")); // ok

		} catch (Exception e) {
			System.err.println("fail load image: " + path);
		}
		
		return icon;
	}
}
