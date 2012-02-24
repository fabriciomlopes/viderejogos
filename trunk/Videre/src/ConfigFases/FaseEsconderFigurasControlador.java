/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

import GUI.Contagem2;
import GUI.TelaJogo;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * Created on : Feb 22, 2012, 8:45:41 PM
 * @author diogo
 */
public class FaseEsconderFigurasControlador extends FaseControladorBase {

	// UI Object References
	protected final ArrayList<JLabel> lObjects = new ArrayList<JLabel>();
	protected JLabel background;

	// Game Configs
	protected FaseEsconderFiguras[] fases;
	protected Contagem2 tela;

	// Game logic data
	protected int iClickedCount; // how many objects player already clicked in the scene
	protected boolean[] bClickedIndex; // which indeces habe already been clicked

	public FaseEsconderFigurasControlador (Contagem2 tela, FaseEsconderFiguras ... fases){
		this.tela = tela;
		this.fases = fases;
		InitComponents();
	}

	@Override
	public void SetCenario(int iCenario) {
		super.SetCenario(iCenario);

		FaseEsconderFiguras currentScene = fases[GetCurrentScene()];

		// set what to look for
		tela.SeObjectName(currentScene.sViewName);

		// set the background
		background.setIcon(currentScene.GetBackgroundIcon());

		
		// create more objects if needed
		for (int iCount = lObjects.size(); iCount < currentScene.vObjectsPosition.length; iCount++){
			CreateObject();
		}

		// place image at already created objects
		for (int iCount = 0; iCount < currentScene.vObjectsPosition.length; iCount++) {
			JLabel label = lObjects.get(iCount);
			label.setIcon(currentScene.GetObjectIcon());
			Point p = currentScene.vObjectsPosition[iCount];
			label.setLocation(p.x -28, p.y -5);
			label.setName(String.valueOf(iCount));

		}
		
		// reset non used images
		for (int iCount = currentScene.vObjectsPosition.length; iCount < lObjects.size(); iCount++) {
			JLabel jLabel = lObjects.get(iCount);
			jLabel.setIcon(null);
			jLabel.setLocation(-999, -999);

		}

		iClickedCount = 0;
		bClickedIndex = new boolean[currentScene.vObjectsPosition.length];
		
	}

//	@Override
//	public void EmbaralhaFases() {
//		//super.EmbaralhaFases();
//		vOrdemCenarios = new int [GetMaxLevel()];
//		for (int i= 0; i < vOrdemCenarios.length; i++) {
//			vOrdemCenarios[i] = i;
//		}
//	}




	@Override
	public int GetMaxLevel() {
		return fases.length;
	}

	@Override
	public TelaJogo GetTela() {
		return tela;
	}

	private void InitComponents(){
		background = new JLabel();

		background.setBounds(30, 110, 500, 350);
		background.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnClickBackground(evt);
            }
        });
		tela.add(background);
	}

	/**
	 * creates a Object to be clicked.
	 * @return
	 */
	private JLabel CreateObject() {
		JLabel created = new JLabel();

		// add input listener
		created.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnClickObject(evt);
            }
        });

		// set size
		created.setSize(100, 100);
		created.setHorizontalAlignment(SwingConstants.CENTER);
		created.setVerticalAlignment(SwingConstants.CENTER);

		// add to arrays
		lObjects.add(created);
		tela.add(created, 0);

		return created;
	}

	protected void OnClickBackground(MouseEvent evt) {
		OnPlayerMistake();
	}
	
	protected void OnClickObject(MouseEvent evt) {
		
		if (evt.getSource() instanceof JLabel) {
			JLabel clickedIcon = (JLabel) evt.getSource();

			try {
				int iClickedIndex = Integer.parseInt(clickedIcon.getName());

				// the clicked index havent been clicked already?
				if (!bClickedIndex[iClickedIndex]) {
					// yes, then
					bClickedIndex[iClickedIndex] = true;
					iClickedCount++;

					// change icon
					clickedIcon.setIcon(fases[GetCurrentScene()].GetClickedIcon());

					// clicked all objects?
					if (iClickedCount >= bClickedIndex.length){
						// yes, then go to next
						OnPlayerRight();
					}
				}

			} catch (Exception e) {
			}
		}

	}

}
