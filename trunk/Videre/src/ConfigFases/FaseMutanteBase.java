/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

import GUI.TelaJogo;
import classes.Recursos;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * Created on : May 17, 2012, 7:53:37 PM
 * @author diogo
 *
 * Básico para criar uma fase que:
 *	tem uma imagem no centro da tela;
 *	algo muda quando clica em qualquer lugar da tela;
 *		quando clica, perde pontuação a ganhar;
 *	tem opções ao lado.
 */
public abstract class FaseMutanteBase extends FaseControladorBase {

	protected static final String caminhoImg = "formas/";
	protected static final int MAX_OPTIONS = 4;

	// UI References
	protected TelaJogo tela;
	protected JLabel objectShowing;  // the center object
	protected JLabel[] vOptions;// clickable objects 
	protected JLabel foreground;// clickable option to skip sublevel
	protected JLabel labelCurrentSublevel;// description of current sublevel of a level.

	// Game Data
	protected int iCurrentSublevel; // current sublevel.


//
	protected  void InitComponents() {
		vOptions = new JLabel[MAX_OPTIONS];

		// init Right side Buttons
		for (int iOption = 0; iOption < vOptions.length; iOption++) {

//			JLabel option= new JLabel();
//			String sName = "opcao" + iOption;
			JLabel formObj = new JLabel();

//			formObj.setIcon(GetImage(sName));
			formObj.addMouseListener(new java.awt.event.MouseAdapter() {

				@Override
				public void mouseClicked(java.awt.event.MouseEvent evt) {
					onClickIcone(evt);
				}
			});

			tela.add(formObj);
			formObj.setSize(150, 100);
			formObj.setLocation(610, 70 + iOption * 100);
			formObj.setHorizontalAlignment(SwingConstants.CENTER);
//			formObj.setName(sName);

			vOptions[iOption] = formObj;
		}

		// Inits the Object to click to skip sublevel
		foreground = new JLabel();
		foreground.setSize(700, 540);
		foreground.setLocation(0, 0);
		foreground.addMouseListener(new java.awt.event.MouseAdapter() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				onClickForeground(evt);
			}
		});
		tela.add(foreground);


		// CUrrent ZOOM Level View
		labelCurrentSublevel = new JLabel();
		labelCurrentSublevel.setFont(new java.awt.Font("Comic Sans MS", 1, 30));
		labelCurrentSublevel.setForeground(new java.awt.Color(0, 0, 255));
		labelCurrentSublevel.setText("opa tou aki");
		tela.add(labelCurrentSublevel);
		labelCurrentSublevel.setBounds(50, 445, 550, 45);

		// Main (Center) Object View
		objectShowing = new JLabel();

		objectShowing.setBounds(30, 50, 570, 450);
		objectShowing.setHorizontalAlignment(SwingConstants.CENTER);
		tela.add(objectShowing);

	}

	/**
	 * Gets an image from the local HD.
	 * @param sImageName  the file name
	 * @return an ImageIcon ready to put at JLabels
	 */
	protected ImageIcon GetImage(String sImageName) {
		ImageIcon icon = Recursos.GetInsance().getImagem(caminhoImg + sImageName + ".jpg");
		return icon;
	}

	private void onClickForeground(java.awt.event.MouseEvent evt) {
//		System.out.println("aea: " + evt.getPoint());
//		SetCurrentZoomLevel(iCurrentSublevel + 1);
		OnClickScreen();
	}

	private void onClickIcone(java.awt.event.MouseEvent evt) {
		Object obj = evt.getSource();

		if (obj instanceof JLabel) {
			JLabel icone = (JLabel) obj;

			String sClickedImage = icone.getName();

			CheckLevel(sClickedImage);

		}
	}

	/**
	 * checks the current level.
	 * will call OnPlayerRight or OnPlayerMistake
	 */
	protected void CheckLevel(String sClickedImage) {
		if (IsRightImage(sClickedImage)) {
			OnPlayerRight();
		} else {
			OnPlayerMistake();
		}

	}


	protected abstract void OnClickScreen();

	protected abstract boolean IsRightImage(String sClickedImage);

	
}
