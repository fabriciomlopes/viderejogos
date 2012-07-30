/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import ConfigFases.FaseControladorBase;
//import ConfigFases.FaseModificaImagemControladorBase.FORMS;
import ConfigFases.FaseMovimento;
import ConfigFases.FaseMovimentoControlador;
import ConfigFases.FaseMovimentoControlador.DIRECTIONS;
import classes.UtilidadesVidere;
import java.awt.Point;

/**
 * Created on : May 29, 2012, 6:24:59 PM
 * @author diogo
 */
public class Movimento extends TelaJogo {

	private FaseMovimentoControlador controlaFase = null;

	public Movimento() {
		/*
		Vertical,			// aka: |
		Horizontal,			// aka: -
		DiagonalTopLeft,	// aka: \
		DiagonalTopRight,	// aka: /
		Square,				// aka: 口
		MiscTRBMTL,			// aka: \/, Top Right Bottom Mid Top Left
		MiscBRTMBL,			// aka: /\, Bottom Right Top Mid Bottom Left
		Delta,				// aka: Δ
		 */
		
		// main points
		int iTop = 55;
		int iBottom = 360;
		int iLeft = 35;
		int iRight = 525;
		int iMidX = (iRight - iLeft) / 2;
		int iMidY = (iBottom - iTop) / 2;

		
		controlaFase = new FaseMovimentoControlador(this,
				// Fase 1 Vertical |
				new FaseMovimento(
					new DIRECTIONS[]{DIRECTIONS.Vertical, DIRECTIONS.MiscTRBMTL, DIRECTIONS.DiagonalTopRight, DIRECTIONS.DiagonalTopLeft},
					true, new Point(iMidX, iTop), new Point(iMidX, iBottom)
				),

				// Fase 2 Horizontal -
				new FaseMovimento(
					new DIRECTIONS[]{DIRECTIONS.Horizontal, DIRECTIONS.Square, DIRECTIONS.DiagonalTopRight, DIRECTIONS.DiagonalTopLeft},
					true, new Point(iLeft, iMidY), new Point(iRight, iMidY)
				),

				// Fase 3 DiagonalTopLeft \
				new FaseMovimento(
					new DIRECTIONS[]{DIRECTIONS.DiagonalTopLeft, DIRECTIONS.DiagonalTopRight, DIRECTIONS.Vertical, DIRECTIONS.Horizontal},
					true, new Point(iLeft, iTop), new Point(iRight, iBottom)
				),

				// Fase 4 DiagonalTopRight /
				new FaseMovimento(
					new DIRECTIONS[]{DIRECTIONS.DiagonalTopRight, DIRECTIONS.DiagonalTopLeft, DIRECTIONS.Vertical, DIRECTIONS.Horizontal},
					true, new Point(iRight, iTop), new Point(iLeft, iBottom)
				),

				// Fase 5 Square 口
				new FaseMovimento(
					new DIRECTIONS[]{DIRECTIONS.Square, DIRECTIONS.Delta, DIRECTIONS.MiscTRBMTL, DIRECTIONS.MiscBRTMBL},
					false, new Point(iLeft, iTop), new Point(iRight, iTop), new Point(iRight, iBottom), new Point(iLeft, iBottom), new Point(iLeft, iTop)
				),

				// Fase 6 MiscTRBMTL \/
				new FaseMovimento(
					new DIRECTIONS[]{DIRECTIONS.MiscTRBMTL, DIRECTIONS.Square, DIRECTIONS.DiagonalTopRight, DIRECTIONS.DiagonalTopLeft},
					true, new Point(iLeft, iTop), new Point(iMidX, iBottom), new Point(iRight, iTop)
				),

				// Fase 7 MiscBRTMBL /\
				new FaseMovimento(
					new DIRECTIONS[]{DIRECTIONS.MiscBRTMBL, DIRECTIONS.Delta, DIRECTIONS.Square, DIRECTIONS.DiagonalTopRight},
					true, new Point(iLeft, iBottom), new Point(iMidX, iTop), new Point(iRight, iBottom)
				),

				// Fase 8 Delta Δ
				new FaseMovimento(
					new DIRECTIONS[]{DIRECTIONS.Delta, DIRECTIONS.MiscBRTMBL, DIRECTIONS.Square, DIRECTIONS.DiagonalTopRight},
					false, new Point(iLeft, iBottom), new Point(iMidX, iTop), new Point(iRight, iBottom), new Point(iLeft, iBottom)
				)
				
			);

		initComponents();
	}

	@Override
	protected String GetAudioName() {
		return "joint";
	}

	@Override
	protected FaseControladorBase GetControladorFase() {
		return controlaFase;
	}

	private void initComponents() {
		Ajuda = new javax.swing.JButton();


		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();

		setTitle("Identifique as Formas!");
		setLayout(null);



		Ajuda.setBackground(new java.awt.Color(244, 244, 246));
		Ajuda.setFont(new java.awt.Font("Comic Sans MS", 1, 30));
		Ajuda.setForeground(new java.awt.Color(255, 0, 0));
		Ajuda.setText("AJUDA");
		Ajuda.setToolTipText("clique aqui para chamar a ajuda");
		Ajuda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
		Ajuda.addMouseListener(new java.awt.event.MouseAdapter() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				AjudaMouseClicked(evt);
			}
		});

		Ajuda.addMouseListener(UtilidadesVidere.GetCommonMouseEvent());
		add(Ajuda);
		Ajuda.setBounds(28, 519, 230, 50);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));
		jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
		add(jPanel1);
		jPanel1.setBounds(30, 50, 570, 450);

		jPanel2.setBackground(new java.awt.Color(255, 255, 255));
		jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
		add(jPanel2);
		jPanel2.setBounds(610, 50, 150, 450);

		java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((screenSize.width - 800) / 2, (screenSize.height - 600) / 2, 800, 600);
	}
	private javax.swing.JButton Ajuda;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;

	
	private void AjudaMouseClicked(java.awt.event.MouseEvent evt) {

		AbrirAjuda("-Em cada fase aparece uma figura em movimento.\n"
				+ "\n"
				+ "-Você deverá identificar qual é o movimento que a bola está fazendo.\n"
				+ "\n"
				+ "-Para isso, clique nas figurinhas do lado direito. "
				+ "\n"
				+ "Caso não consiga identificar o movimento, \n"
				+ "clique com o mouse para diminuir a velocidade da bola!");

	}
}
