/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import ConfigFases.FaseConstraste;
import ConfigFases.FaseContrasteControlador;
import ConfigFases.FaseControladorBase;
import ConfigFases.FaseModificaImagemControladorBase.FORMS;

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
//		// typeless names
//		FaseTamanhoControlador.FORMS cross = FaseTamanhoControlador.FORMS.Cross;
//		FaseTamanhoControlador.FORMS ellipse = FaseTamanhoControlador.FORMS.Ellipse;
//		FaseTamanhoControlador.FORMS square = FaseTamanhoControlador.FORMS.Square;
//		FaseTamanhoControlador.FORMS star = FaseTamanhoControlador.FORMS.Star;
//		FaseTamanhoControlador.FORMS hexagon = FaseTamanhoControlador.FORMS.Hexagon;
//		FaseTamanhoControlador.FORMS triangle = FaseTamanhoControlador.FORMS.Triangle;
//		FaseTamanhoControlador.FORMS triangleInverse = FaseTamanhoControlador.FORMS.TriangleInverse;
//
//
//		controlaFase = new FaseTamanhoControlador(this,
//				// basicos:
//				new FaseTamanho(ellipse, ellipse, triangle, square, star),
//				new FaseTamanho(triangle, ellipse, triangle, square, star),
//				new FaseTamanho(square, ellipse, triangle, square, star),
//				new FaseTamanho(star, ellipse, triangle, square, star),
//				// medios
//				new FaseTamanho(triangle, triangle, square, hexagon, ellipse),
//				new FaseTamanho(square, hexagon, square, cross, ellipse),
//				new FaseTamanho(hexagon, hexagon, square, triangleInverse, ellipse),
//				new FaseTamanho(hexagon, cross, square, hexagon, ellipse),
//				// dificeis
//				new FaseTamanho(triangleInverse, triangleInverse, triangle, star, cross),
//				new FaseTamanho(triangle, triangleInverse, triangle, star, cross),
//				new FaseTamanho(star, triangleInverse, triangle, star, cross),
//				new FaseTamanho(cross, triangleInverse, triangle, star, cross));

		initComponents();
	}

	@Override
	protected String GetAudioName() {
		return "spdriver";
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

			public void mouseClicked(java.awt.event.MouseEvent evt) {
				AjudaMouseClicked(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				AjudaMouseExited(evt);
			}

			public void mousePressed(java.awt.event.MouseEvent evt) {
				AjudaMousePressed(evt);
			}
		});
		Ajuda.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {

			public void mouseMoved(java.awt.event.MouseEvent evt) {
				AjudaMouseMoved(evt);
			}
		});
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

//
	private void AjudaMouseMoved(java.awt.event.MouseEvent evt) {
		Ajuda.setBackground(new java.awt.Color(255, 255, 102));
	}

	private void AjudaMouseClicked(java.awt.event.MouseEvent evt) {

		AbrirAjuda("-Em cada fase aparece uma figura geométrica.\n"
				+ "\n"
				+ "-Você deverá identificar qual é a forma geométrica .\n"
				+ "\n"
				+ "-Para isso, clique nas figurinhas do lado direito. "
				+ "\n"
				+ "Caso não consiga identificar o formato, \n"
				+ "clique com o mouse para aumentar o tamanho da imagem!");

	}

	private void AjudaMousePressed(java.awt.event.MouseEvent evt) {
		Ajuda.setBackground(new java.awt.Color(102, 204, 0));
	}

	private void AjudaMouseExited(java.awt.event.MouseEvent evt) {
		Ajuda.setBackground(new java.awt.Color(244, 244, 246));
	}
}
