/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import ConfigFases.FaseConstraste;
import ConfigFases.FaseContrasteControlador;
import ConfigFases.FaseControladorBase;
import ConfigFases.FaseModificaImagemControladorBase.FORMS;
import classes.UtilidadesVidere;

/**
 * Created on : May 21, 2012, 8:38:41 PM
 * @author diogo
 */
public class Constraste extends TelaJogo {

	private FaseContrasteControlador controlaFase = null;

	public Constraste() {

		// typeless names
		FORMS cross = FORMS.Cross;
		FORMS ellipse = FORMS.Ellipse;
//		FORMS square = FORMS.Square;
		FORMS star = FORMS.Star;
		FORMS hexagon = FORMS.Hexagon;
		FORMS triangle = FORMS.Triangle;
		FORMS triangleInverse = FORMS.TriangleInverse;

		
		controlaFase = new FaseContrasteControlador(this,

				// all imgs
				new FaseConstraste(cross, cross, triangleInverse, hexagon, triangle),
				new FaseConstraste(triangle, triangle, triangleInverse, hexagon, ellipse),
				new FaseConstraste(ellipse, ellipse, triangle, hexagon, star),
				new FaseConstraste(star, star, cross, hexagon, triangle),
				new FaseConstraste(triangleInverse, triangleInverse, star, ellipse, triangle),
				new FaseConstraste(hexagon, hexagon, ellipse, cross, star),

				// repeated...
				new FaseConstraste(triangle, triangle, star, triangleInverse, cross),
				new FaseConstraste(star, star, triangleInverse, ellipse, cross)
			);

		initComponents();
	}

	@Override
	protected String GetAudioName() {
		return "ready";
	}

	@Override
	protected FaseControladorBase GetControladorFase() {
		return controlaFase;
	}

	private void initComponents() {
		Ajuda = new javax.swing.JButton();


		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();

		setTitle("Jogo de Contraste");
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

		AbrirAjuda("-Em cada fase aparece uma figura geométrica coberta por uma sombra.\n"
				+ "\n"
				+ "-Você deverá identificar qual é a forma geométrica por trás dessa sombra.\n"
				+ "\n"
				+ "-Para isso, clique nas figurinhas do lado direito. "
				+ "\n"
				+ "Caso não consiga identificar o formato, \n"
				+ "clique com o mouse para aumentar o contraste da imagem!");

	}

}
