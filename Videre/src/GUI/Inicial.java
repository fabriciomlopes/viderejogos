package GUI;

import Analise.PlayerManager;
import classes.UtilidadesVidere;
import java.awt.*;

public class Inicial extends TelaPadrao {

	// <editor-fold defaultstate="collapsed" desc="Singleton">
	private static Inicial instance;

	public static Inicial GetInsance() {
		if (instance == null) {
			instance = new Inicial();
		}
		return instance;
	}
	// </editor-fold>

	public Inicial() {
		initComponents();


		//inicia a m�sica tema do sistema
//		try {
//			URL som = new URL((getClass().getResource("/sons/circleoflife.mid")).toString());
//			Musica = java.applet.Applet.newAudioClip(som);
//			Musica.loop();
//		} catch (MalformedURLException erro) {
//			System.out.println("Caminho do áudio não especificado! " + erro);
//		}
//		classes.UtilidadesVidere.TocarMusicaMIDI("circleoflife");

	}

	@Override
	protected String GetAudioName() {
		return "circleoflife";
	}

	// <editor-fold defaultstate="collapsed" desc="Generated Code">//noGEN-BEGIN:initComponents
	private void initComponents() {

		ConhecaZoio = new javax.swing.JButton();
		Cores = new javax.swing.JButton();
		Esconder = new javax.swing.JButton();
		Luzes = new javax.swing.JButton();
		Matriz = new javax.swing.JButton();
		Numeros = new javax.swing.JButton();
		jlSombras = new javax.swing.JButton();
		btnFormas = new javax.swing.JButton();
		btnContraste = new javax.swing.JButton();
		btnMovimento = new javax.swing.JButton();
		Sair = new javax.swing.JButton();
		FiguraZoio = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		labelWelcome = new javax.swing.JLabel();

		buttonChangeUser = new javax.swing.JButton();
		buttonConfigs = new javax.swing.JButton();

		setTitle("Vídere - Jogos de Estimulação Visual");
		addWindowListener(new java.awt.event.WindowAdapter() {

			public void windowClosing(java.awt.event.WindowEvent evt) {
				formWindowClosing(evt);
			}
		});

		ConhecaZoio.setBackground(new java.awt.Color(244, 244, 246));
		ConhecaZoio.setFont(new java.awt.Font("Comic Sans MS", 1, 33));
		ConhecaZoio.setForeground(new java.awt.Color(255, 0, 0));
		ConhecaZoio.setText("CONHEÇA O ZÔIO");
		ConhecaZoio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
		ConhecaZoio.addMouseListener(new java.awt.event.MouseAdapter() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				ConhecaZoioMouseClicked(evt);
			}
		});
		ConhecaZoio.addMouseListener(UtilidadesVidere.GetCommonMouseEvent());
		add(ConhecaZoio);
		ConhecaZoio.setBounds(370, 470, 350, 60);

		// WElcome label..
		labelWelcome.setFont(new java.awt.Font("Comic Sans MS", 1, 28));
		labelWelcome.setForeground(new java.awt.Color(255, 0, 0));
		labelWelcome.setText("");
		add(labelWelcome);
		labelWelcome.setBounds(270, -3, 510, 50);

		// change user button
		buttonChangeUser.setBackground(new java.awt.Color(244, 244, 246));
		buttonChangeUser.setFont(new java.awt.Font("Comic Sans MS", 1, 28));
		buttonChangeUser.setForeground(new java.awt.Color(255, 0, 0));
		buttonChangeUser.setText("Trocar");
		buttonChangeUser.setToolTipText("Identifique as cores dos objetos");
		buttonChangeUser.addMouseListener(new java.awt.event.MouseAdapter() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				buttonChangeUserMouseClicked(evt);
			}
		});
//        buttonChangeUser.addMouseMotionListener(UtilidadesVidere.GetCommonMouseEvent());
		buttonChangeUser.addMouseListener(UtilidadesVidere.GetCommonMouseEvent());
		add(buttonChangeUser);
		//buttonChangeUser.setBounds(640, 4, 140, 34);
//		buttonChangeUser.setBounds(240, 54, 150, 104); // ok
		buttonChangeUser.setBounds(290, 44, 140, 34);



		// menu button config
		int iCountY = 0;
		int iStartY = 45; //50
		int iDistY = 47;//62
		int iSizeY = 45;//60

		Cores.setBackground(new java.awt.Color(244, 244, 246));
		Cores.setFont(new java.awt.Font("Comic Sans MS", 1, 33));
		Cores.setForeground(new java.awt.Color(255, 0, 0));
		Cores.setText("CORES");
		Cores.setToolTipText("Identifique as cores dos objetos");
		Cores.addMouseListener(new java.awt.event.MouseAdapter() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				CoresMouseClicked(evt);
			}
		});
		Cores.addMouseListener(UtilidadesVidere.GetCommonMouseEvent());
		add(Cores);
		//Cores.setBounds(50, 90, 210, 60);
		Cores.setBounds(50, iStartY + iCountY++ * iDistY, 210, iSizeY);


		Esconder.setBackground(new java.awt.Color(244, 244, 246));
		Esconder.setFont(new java.awt.Font("Comic Sans MS", 1, 31));
		Esconder.setForeground(new java.awt.Color(255, 0, 0));
		Esconder.setText("ESCONDER");
		Esconder.setToolTipText("Ache os desenhos escondidos");
		Esconder.addMouseListener(new java.awt.event.MouseAdapter() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				EsconderMouseClicked(evt);
			}
		});
		Esconder.addMouseListener(UtilidadesVidere.GetCommonMouseEvent());
		add(Esconder);
//        Esconder.setBounds(50, 150, 210, 60);
		Esconder.setBounds(50, iStartY + iCountY++ * iDistY, 210, iSizeY);

		Luzes.setBackground(new java.awt.Color(244, 244, 246));
		Luzes.setFont(new java.awt.Font("Comic Sans MS", 1, 33));
		Luzes.setForeground(new java.awt.Color(255, 0, 0));
		Luzes.setText("LUZES");
		Luzes.setToolTipText("Cuidado para não esquecer a seqüência das luzes!");
		Luzes.addMouseListener(new java.awt.event.MouseAdapter() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				LuzesMouseClicked(evt);
			}
		});
		Luzes.addMouseListener(UtilidadesVidere.GetCommonMouseEvent());
		add(Luzes);
//        Luzes.setBounds(50, 210, 210, 60);
		Luzes.setBounds(50, iStartY + iCountY++ * iDistY, 210, iSizeY);

		Matriz.setBackground(new java.awt.Color(244, 244, 246));
		Matriz.setFont(new java.awt.Font("Comic Sans MS", 1, 33));
		Matriz.setForeground(new java.awt.Color(255, 0, 0));
		Matriz.setText("MATRIZ");
		Matriz.setToolTipText("Monte uma seqüência de objetos");
		Matriz.addMouseListener(new java.awt.event.MouseAdapter() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				MatrizMouseClicked(evt);
			}
		});
		Matriz.addMouseListener(UtilidadesVidere.GetCommonMouseEvent());
		add(Matriz);
//        Matriz.setBounds(50, 270, 210, 60);
		Matriz.setBounds(50, iStartY + iCountY++ * iDistY, 210, iSizeY);

		Numeros.setBackground(new java.awt.Color(244, 244, 246));
		Numeros.setFont(new java.awt.Font("Comic Sans MS", 1, 33));
		Numeros.setForeground(new java.awt.Color(255, 0, 0));
		Numeros.setText("NÚMEROS");
		Numeros.setToolTipText("Brinque com o dominó dos números");
		Numeros.addMouseListener(new java.awt.event.MouseAdapter() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				NumerosMouseClicked(evt);
			}
		});
		Numeros.addMouseListener(UtilidadesVidere.GetCommonMouseEvent());
		add(Numeros);
//        Numeros.setBounds(50, 330, 210, 60);
		Numeros.setBounds(50, iStartY + iCountY++ * iDistY, 210, iSizeY);

		jlSombras.setBackground(new java.awt.Color(244, 244, 246));
		jlSombras.setFont(new java.awt.Font("Comic Sans MS", 1, 33));
		jlSombras.setForeground(new java.awt.Color(255, 0, 0));
		jlSombras.setText("SOMBRAS");
		jlSombras.setToolTipText("Ache o desenho correspondente a sombra");
		jlSombras.addMouseListener(new java.awt.event.MouseAdapter() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jlSombrasMouseClicked(evt);
			}
		});
		jlSombras.addMouseListener(UtilidadesVidere.GetCommonMouseEvent());
		add(jlSombras);
		//jlSombras.setBounds(50, 390, 210, 60);
		jlSombras.setBounds(50, iStartY + iCountY++ * iDistY, 210, iSizeY);


		btnFormas.setBackground(new java.awt.Color(244, 244, 246));
		btnFormas.setFont(new java.awt.Font("Comic Sans MS", 1, 33));
		btnFormas.setForeground(new java.awt.Color(255, 0, 0));
		btnFormas.setText("FORMAS");
		btnFormas.setToolTipText("Identifique a forma de um objeto");
		btnFormas.addMouseListener(new java.awt.event.MouseAdapter() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btnFormasMouseClicked(evt);
			}
		});
		btnFormas.addMouseListener(UtilidadesVidere.GetCommonMouseEvent());
		add(btnFormas);
		//btnFormas.setBounds(50, 390, 210, 60);
		btnFormas.setBounds(50, iStartY + iCountY++ * iDistY, 210, iSizeY);




		btnContraste.setBackground(new java.awt.Color(244, 244, 246));
		btnContraste.setFont(new java.awt.Font("Comic Sans MS", 1, 28));
		btnContraste.setForeground(new java.awt.Color(255, 0, 0));
		btnContraste.setText("CONSTRASTE");
		btnContraste.setToolTipText("Identifique a forma de um objeto");
		btnContraste.addMouseListener(new java.awt.event.MouseAdapter() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btnContrasteMouseClicked(evt);
			}
		});
		btnContraste.addMouseListener(UtilidadesVidere.GetCommonMouseEvent());
		add(btnContraste);
		//btnContraste.setBounds(50, 390, 210, 60);
		btnContraste.setBounds(50, iStartY + iCountY++ * iDistY, 210, iSizeY);

		

		btnMovimento.setBackground(new java.awt.Color(244, 244, 246));
		btnMovimento.setFont(new java.awt.Font("Comic Sans MS", 1, 28));
		btnMovimento.setForeground(new java.awt.Color(255, 0, 0));
		btnMovimento.setText("MOVIMENTO");
		btnMovimento.setToolTipText("Identifique a forma de um objeto");
		btnMovimento.addMouseListener(new java.awt.event.MouseAdapter() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btnMovimentoMouseClicked(evt);
			}
		});
		btnMovimento.addMouseListener(UtilidadesVidere.GetCommonMouseEvent());
		add(btnMovimento);
		//btnMovimento.setBounds(50, 390, 210, 60);
		btnMovimento.setBounds(50, iStartY + iCountY++ * iDistY, 210, iSizeY);























		/// Configurations Button

		buttonConfigs.setBackground(new java.awt.Color(244, 244, 246));
		buttonConfigs.setFont(new java.awt.Font("Comic Sans MS", 1, 33));
		buttonConfigs.setForeground(new java.awt.Color(255, 0, 0));
		buttonConfigs.setText("SISTEMA");
		buttonConfigs.setToolTipText("Opções do Sistema");
		buttonConfigs.addMouseListener(new java.awt.event.MouseAdapter() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				buttonConfigsMouseClicked(evt);
			}
		});
		buttonConfigs.addMouseListener(UtilidadesVidere.GetCommonMouseEvent());
		add(buttonConfigs);
		//buttonConfigs.setBounds(50, 390, 210, 60);
		buttonConfigs.setBounds(50, 10 + iStartY + iCountY++ * iDistY, 210, iSizeY);





		Sair.setBackground(new java.awt.Color(244, 244, 246));
		Sair.setFont(new java.awt.Font("Comic Sans MS", 1, 33));
		Sair.setForeground(new java.awt.Color(255, 0, 0));
		Sair.setText("SAIR");
		Sair.setToolTipText("Sair dos jogos Vídere");
		Sair.addMouseListener(new java.awt.event.MouseAdapter() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				SairMouseClicked(evt);
			}
		});
		Sair.addMouseListener(UtilidadesVidere.GetCommonMouseEvent());
		add(Sair);
		Sair.setBounds(50, 10 + iStartY + iCountY++ * iDistY, 210, iSizeY);

		FiguraZoio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoio.gif"))); // NOI18N
		add(FiguraZoio);
		FiguraZoio.setBounds(430, 60, 209, 300);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/skate.gif"))); // NOI18N
		add(jLabel1);
		jLabel1.setBounds(390, 310, 280, 150);

		jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/home.jpg"))); // NOI18N
		add(jLabel3);
		jLabel3.setBounds(0, 0, 800, 580);

		java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((screenSize.width - 800) / 2, (screenSize.height - 600) / 2, 800, 600);
	}// </editor-fold>//noGEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
		System.exit(0);
    }//GEN-LAST:event_formWindowClosing

	//sai do sistema V�dere
    private void SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseClicked
		System.exit(0);
    }//GEN-LAST:event_SairMouseClicked

	//chama o jogo das sombras
    private void jlSombrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSombrasMouseClicked

		AbrirMenu(Sombras.GetInsance());

    }//GEN-LAST:event_jlSombrasMouseClicked

	//chama o jogo de Tamanho
	private void btnFormasMouseClicked(java.awt.event.MouseEvent evt) {

		AbrirMenu(new Tamanho());
	}

	//chama o jogo dos Contraste
	private void btnContrasteMouseClicked(java.awt.event.MouseEvent evt) {

		AbrirMenu(new Constraste());

	}
	//chama o jogo dos Contraste
	private void btnMovimentoMouseClicked(java.awt.event.MouseEvent evt) {

		AbrirMenu(new Movimento());

	}

	//chama o jogo dos numeros
    private void NumerosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumerosMouseClicked
		//PlayerManagement.GetInsance().OpenMenu();
		AbrirMenu(GUI.Numeros.GetInsance());
    }//GEN-LAST:event_NumerosMouseClicked

	//chama o ambiente de escolha dos jogos Matriz
    private void MatrizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatrizMouseClicked

		AbrirMenu(new MatrizAmbiente());
    }//GEN-LAST:event_MatrizMouseClicked

	//chama o jogo das luzes
    private void LuzesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LuzesMouseClicked

		AbrirMenu(new Luzes());
    }//GEN-LAST:event_LuzesMouseClicked

	//chama a tela de escolha dos jogos esconder
    private void EsconderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EsconderMouseClicked

		AbrirMenu(new ContagemAmbiente());
    }//GEN-LAST:event_EsconderMouseClicked

	//chama o jogo das cores
    private void CoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CoresMouseClicked

		AbrirMenu(new CorObjeto());

    }//GEN-LAST:event_CoresMouseClicked

	//chama a tela Zoio1
    private void ConhecaZoioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConhecaZoioMouseClicked

		AbrirMenu(new Zoio1());
    }//GEN-LAST:event_ConhecaZoioMouseClicked

	private void buttonChangeUserMouseClicked(java.awt.event.MouseEvent evt) {

		//PlayerManagement.GetInsance().OpenMenu();
		PlayerChange.GetInsance().OpenMenu(this);

	}

	//chama o jogo das sombras
	private void buttonConfigsMouseClicked(java.awt.event.MouseEvent evt) {
		PlayerManagement.GetInsance().OpenMenu();
	}

	//sai do sistema v�dere
//	public static void main(String args[]) {
//		Inicial i = new Inicial();
//		i.show();
//
//
//		// inicializando instancia do singleton
//		Inicial.instance = i;
//
//		// tocar primeira musica
//		classes.UtilidadesVidere.TocarMusicaMIDI(i.GetAudioName());
//
//
//		Acerto.InicializarSingleton();
//	}
	public Component add(Component comp) {
		Component retValue;
		if (comp.getName() == null) {
			retValue = super.Fundo.add(comp);
		} else {
			retValue = super.add(comp);

		}
		return retValue;
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConhecaZoio;
    private javax.swing.JButton Cores;
    private javax.swing.JButton Esconder;
    private javax.swing.JLabel FiguraZoio;
    private javax.swing.JButton Luzes;
    private javax.swing.JButton Matriz;
    private javax.swing.JButton Numeros;
    private javax.swing.JButton Sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jlSombras;
    
    private javax.swing.JLabel labelWelcome;
    private javax.swing.JButton buttonChangeUser;
    
    // End of variables declaration//GEN-END:variables
	private javax.swing.JButton btnFormas;
	private javax.swing.JButton btnContraste;
	private javax.swing.JButton btnMovimento;
	private javax.swing.JButton buttonConfigs;

	public void SetWelcomeText(String sText) {
		labelWelcome.setText(sText);
	}

	public void SetCurrentPlayer(String sName) {
// the last player name really exists?
		if (PlayerManager.GetInstance().ContainsNameInSave(sName)) {
			Inicial.GetInsance().SetWelcomeText("Bem vindo " + sName + "!");
		} else {
			Inicial.GetInsance().SetWelcomeText("Nenhum usuario!");
		}
	}
}
