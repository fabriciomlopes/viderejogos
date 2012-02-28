/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

import GUI.CorObjeto;
import GUI.TelaJogo;
import classes.Recursos;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * Created on : Feb 27, 2012, 8:06:41 PM
 * @author diogo
 */
public class FaseCorObjetoControlador extends FaseControladorBase {

	// UI Object References
	protected CorObjeto tela;
	protected JLabel ObjectView;		// the object to show to player. 
	protected JLabel[] vColorOptions;	// the color options (clickable)

	
	// Game Data
	protected FaseCorObjeto[] fases;
	

	public FaseCorObjetoControlador(CorObjeto tela, FaseCorObjeto ... fases) {
		this.tela = tela;
		this.fases = fases;
		InitComponents();
	}

	private void InitComponents(){

		FaseCorObjeto.COLOR[] colors = FaseCorObjeto.COLOR.values();

		this.vColorOptions = new JLabel[colors.length];
		// creating clickable color options
		for (int i = 0; i < vColorOptions.length; i++) {
			JLabel option = new JLabel();

			// set image
			option.setIcon(Recursos.GetInsance().getImagem(colors[i].toString() + ".jpg"));
			// set tooltip
			option.setToolTipText(colors[i].GetViewName());
			// bounds
			option.setBounds(60 + i * 140, 340, 130, 130);
			// input listener
			option.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent evt) {
					OnClickIcon(evt);
				}
			});

			tela.add(option);

			// set name
			option.setName(colors[i].toString());
			
			this.vColorOptions[i] = option;
		}

		// create the object view
		JLabel view = new JLabel();
		
		view.setBounds(260, 120, 160, 160);
		view.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
		view.setHorizontalAlignment(SwingConstants.CENTER);
		view.setVerticalAlignment(SwingConstants.CENTER);

		tela.add(view);

		this.ObjectView = view;
	}

	@Override
	public void SetCenario(int iCenario) {
		super.SetCenario(iCenario);

		FaseCorObjeto currentLevel = fases[GetCurrentScene()];
		
		tela.SetNomeObjeto(currentLevel.sViewName);
		this.ObjectView.setIcon(currentLevel.GetImage());
	}




	@Override
	public int GetMaxLevel() {
		return fases.length;
	}

	@Override
	public TelaJogo GetTela() {
		return tela;
	}



	protected void OnClickIcon(MouseEvent evt) {
		if (evt.getSource() instanceof JLabel) {
			JLabel icon = (JLabel) evt.getSource();

			if (icon != null){
				CheckClick(icon);
			}
		}
	}

	/**
	 * checks whether player clicked right or wrong
	 */
	protected void CheckClick(JLabel icon) {

		// the name of clicked object is equal to current level's right answer?
		if (icon.getName().equals(fases[GetCurrentScene()].cRightColor.toString())) {
			// yes.
			OnPlayerRight();
		}
		else {
			OnPlayerMistake();
		}
	}

	
}
