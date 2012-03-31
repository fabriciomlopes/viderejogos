package GUI;

import Analise.PlayerManager;
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConhecaZoioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConhecaZoioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ConhecaZoioMousePressed(evt);
            }
        });
        ConhecaZoio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ConhecaZoioMouseMoved(evt);
            }
        });
        add(ConhecaZoio);
        ConhecaZoio.setBounds(370, 470, 350, 60);

		// WElcome label..
		labelWelcome.setFont(new java.awt.Font("Comic Sans MS", 1, 28));
        labelWelcome.setForeground(new java.awt.Color(255, 0, 0));
		labelWelcome.setText("");
		add(labelWelcome);
		labelWelcome.setBounds(270, -3, 380, 50);

		// change user button
		buttonChangeUser.setFont(new java.awt.Font("Comic Sans MS", 1, 28));
        buttonChangeUser.setBackground(new java.awt.Color(244, 244, 246));
        buttonChangeUser.setForeground(new java.awt.Color(255, 0, 0));
        buttonChangeUser.setText("Trocar");
        buttonChangeUser.setToolTipText("Identifique as cores dos objetos");
        buttonChangeUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonChangeUserMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonChangeUserMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonChangeUserMousePressed(evt);
            }
        });
        buttonChangeUser.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                buttonChangeUserMouseMoved(evt);
            }
        });
        add(buttonChangeUser);
		buttonChangeUser.setBounds(640, 4, 140, 34);
		
		// menu button config
		int iCountY = 0;
		int iStartY = 50;
		int iDistY = 62;
		int iSizeY = 60;
		
        Cores.setBackground(new java.awt.Color(244, 244, 246));
        Cores.setFont(new java.awt.Font("Comic Sans MS", 1, 33));
        Cores.setForeground(new java.awt.Color(255, 0, 0));
        Cores.setText("CORES");
        Cores.setToolTipText("Identifique as cores dos objetos");
        Cores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CoresMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CoresMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CoresMousePressed(evt);
            }
        });
        Cores.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CoresMouseMoved(evt);
            }
        });
        add(Cores);
        //Cores.setBounds(50, 90, 210, 60);
        Cores.setBounds(50, iStartY + iCountY++ * iDistY, 210, iSizeY);
        
        
        Esconder.setBackground(new java.awt.Color(244, 244, 246));
        Esconder.setFont(new java.awt.Font("Comic Sans MS", 1, 31));
        Esconder.setForeground(new java.awt.Color(255, 0, 0));
        Esconder.setText("ESCONDER");
        Esconder.setToolTipText("Ache os desenhos escondidos");
        Esconder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EsconderMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EsconderMousePressed(evt);
            }
        });
        Esconder.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                EsconderMouseMoved(evt);
            }
        });
        add(Esconder);
//        Esconder.setBounds(50, 150, 210, 60);
        Esconder.setBounds(50, iStartY + iCountY++ * iDistY, 210, iSizeY);

        Luzes.setBackground(new java.awt.Color(244, 244, 246));
        Luzes.setFont(new java.awt.Font("Comic Sans MS", 1, 33));
        Luzes.setForeground(new java.awt.Color(255, 0, 0));
        Luzes.setText("LUZES");
        Luzes.setToolTipText("Cuidado para não esquecer a seqüência das luzes!");
        Luzes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LuzesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LuzesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LuzesMousePressed(evt);
            }
        });
        Luzes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LuzesMouseMoved(evt);
            }
        });
        add(Luzes);
//        Luzes.setBounds(50, 210, 210, 60);
        Luzes.setBounds(50, iStartY + iCountY++ * iDistY, 210, iSizeY);

        Matriz.setBackground(new java.awt.Color(244, 244, 246));
        Matriz.setFont(new java.awt.Font("Comic Sans MS", 1, 33));
        Matriz.setForeground(new java.awt.Color(255, 0, 0));
        Matriz.setText("MATRIZ");
        Matriz.setToolTipText("Monte uma seqüência de objetos");
        Matriz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MatrizMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MatrizMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MatrizMousePressed(evt);
            }
        });
        Matriz.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MatrizMouseMoved(evt);
            }
        });
        add(Matriz);
//        Matriz.setBounds(50, 270, 210, 60);
        Matriz.setBounds(50, iStartY + iCountY++ * iDistY, 210, iSizeY);

        Numeros.setBackground(new java.awt.Color(244, 244, 246));
        Numeros.setFont(new java.awt.Font("Comic Sans MS", 1, 33));
        Numeros.setForeground(new java.awt.Color(255, 0, 0));
        Numeros.setText("NÚMEROS");
        Numeros.setToolTipText("Brinque com o dominó dos números");
        Numeros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NumerosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NumerosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NumerosMousePressed(evt);
            }
        });
        Numeros.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                NumerosMouseMoved(evt);
            }
        });
        add(Numeros);
//        Numeros.setBounds(50, 330, 210, 60);
        Numeros.setBounds(50, iStartY + iCountY++ * iDistY, 210, iSizeY);

        jlSombras.setBackground(new java.awt.Color(244, 244, 246));
        jlSombras.setFont(new java.awt.Font("Comic Sans MS", 1, 33));
        jlSombras.setForeground(new java.awt.Color(255, 0, 0));
        jlSombras.setText("SOMBRAS");
        jlSombras.setToolTipText("Ache o desenho correspondente a sombra");
        jlSombras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlSombrasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlSombrasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlSombrasMousePressed(evt);
            }
        });
        jlSombras.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlSombrasMouseMoved(evt);
            }
        });
        add(jlSombras);
        //jlSombras.setBounds(50, 390, 210, 60);
        jlSombras.setBounds(50, iStartY + iCountY++ * iDistY, 210, iSizeY);

		/// Configurations Button

        buttonConfigs.setBackground(new java.awt.Color(244, 244, 246));
        buttonConfigs.setFont(new java.awt.Font("Comic Sans MS", 1, 33));
        buttonConfigs.setForeground(new java.awt.Color(255, 0, 0));
        buttonConfigs.setText("SISTEMA");
        buttonConfigs.setToolTipText("Opções do Sistema");
        buttonConfigs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonConfigsMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonConfigsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonConfigsMousePressed(evt);
            }
        });
        buttonConfigs.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                buttonConfigsMouseMoved(evt);
            }
        });
        add(buttonConfigs);
        //buttonConfigs.setBounds(50, 390, 210, 60);
        buttonConfigs.setBounds(50,10 + iStartY + iCountY++ * iDistY, 210, iSizeY);





        Sair.setBackground(new java.awt.Color(244, 244, 246));
        Sair.setFont(new java.awt.Font("Comic Sans MS", 1, 33));
        Sair.setForeground(new java.awt.Color(255, 0, 0));
        Sair.setText("SAIR");
        Sair.setToolTipText("Sair dos jogos Vídere");
        Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SairMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SairMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SairMousePressed(evt);
            }
        });
        Sair.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SairMouseMoved(evt);
            }
        });
        add(Sair);
        Sair.setBounds(50, 10+ iStartY + iCountY++ * iDistY, 210, iSizeY);

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
        setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800, 600);
    }// </editor-fold>//noGEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
		System.exit(0);
    }//GEN-LAST:event_formWindowClosing

	//muda a cor do botao para amarelo quando o mouse passa em cima
    private void SairMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseMoved
		Sair.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_SairMouseMoved

	//muda a cor do botao para verde quando é pressionado
    private void SairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMousePressed
		Sair.setBackground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_SairMousePressed

	//volta a cor do botao ao normal quando o mouse não está em cima
    private void SairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseExited
		Sair.setBackground(new java.awt.Color(244, 244, 246));
    }//GEN-LAST:event_SairMouseExited

	//sai do sistema V�dere
    private void SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseClicked
		System.exit(0);
    }//GEN-LAST:event_SairMouseClicked

	//muda a cor do botao para amarelo quando o mouse est� em cima
    private void jlSombrasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSombrasMouseMoved
		jlSombras.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_jlSombrasMouseMoved

	//muda a cor do botao para verde quando é pressionado
    private void jlSombrasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSombrasMousePressed
		jlSombras.setBackground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_jlSombrasMousePressed

	//volta cor do botao ao normal quando o mouse não está em cima
    private void jlSombrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSombrasMouseExited
		jlSombras.setBackground(new java.awt.Color(244, 244, 246));
    }//GEN-LAST:event_jlSombrasMouseExited

	//chama o jogo das sombras
    private void jlSombrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSombrasMouseClicked
		
		AbrirMenu(Sombras.GetInsance());
		
    }//GEN-LAST:event_jlSombrasMouseClicked

	//muda a cor do botao para amarelo quando o mouse passa em cima
    private void NumerosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumerosMouseMoved
		Numeros.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_NumerosMouseMoved

	//muda a cor do botao para verde quando é pressionado
    private void NumerosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumerosMousePressed
		Numeros.setBackground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_NumerosMousePressed

	//volta a cor do botao ao normal quando o mouse sai de cima
    private void NumerosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumerosMouseExited
		Numeros.setBackground(new java.awt.Color(244, 244, 246));
    }//GEN-LAST:event_NumerosMouseExited

	//chama o jogo dos numeros
    private void NumerosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumerosMouseClicked
		//PlayerManagement.GetInsance().OpenMenu();
		AbrirMenu(GUI.Numeros.GetInsance());
    }//GEN-LAST:event_NumerosMouseClicked

	//muda a cor do botao para amarelo quando o mouse passa em cima
    private void MatrizMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatrizMouseMoved
		Matriz.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_MatrizMouseMoved

	//muda a cor do botao para verde quando é pressionado
    private void MatrizMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatrizMousePressed
		Matriz.setBackground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_MatrizMousePressed

	//volta a cor do botao ao normal quando o mouse sai de cima
    private void MatrizMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatrizMouseExited
		Matriz.setBackground(new java.awt.Color(244, 244, 246));
    }//GEN-LAST:event_MatrizMouseExited

	//chama o ambiente de escolha dos jogos Matriz
    private void MatrizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatrizMouseClicked
		
		AbrirMenu(new MatrizAmbiente());
    }//GEN-LAST:event_MatrizMouseClicked

	//muda a cor do botao para amarelo quando é pressionado
    private void LuzesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LuzesMouseMoved
		Luzes.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_LuzesMouseMoved

	//muda a cor do botao pra verde quando é pressionado
    private void LuzesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LuzesMousePressed
		Luzes.setBackground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_LuzesMousePressed

	//volta a cor do botao ao normal quando o mouse não está em cima
    private void LuzesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LuzesMouseExited
		Luzes.setBackground(new java.awt.Color(244, 244, 246));
    }//GEN-LAST:event_LuzesMouseExited

	//chama o jogo das luzes
    private void LuzesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LuzesMouseClicked
		
		AbrirMenu(new Luzes());
    }//GEN-LAST:event_LuzesMouseClicked

	//muda a cor do botao para amarelo quando o mouse passa em cima
    private void EsconderMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EsconderMouseMoved
		Esconder.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_EsconderMouseMoved

	//muda a cor do botao para verde quando é pressionado
    private void EsconderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EsconderMousePressed
		Esconder.setBackground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_EsconderMousePressed

	//volta a cor do botao ao normal quando o mouse sai de cima
    private void EsconderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EsconderMouseExited
		Esconder.setBackground(new java.awt.Color(244, 244, 246));
    }//GEN-LAST:event_EsconderMouseExited

	//chama a tela de escolha dos jogos esconder
    private void EsconderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EsconderMouseClicked
		
		AbrirMenu(new ContagemAmbiente());
    }//GEN-LAST:event_EsconderMouseClicked

	//muda a cor do botao para amarelo quando o mouse passa em cima
    private void CoresMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CoresMouseMoved
		Cores.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_CoresMouseMoved

	//muda a cor do botao para verde quando o botao é pressionado
    private void CoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CoresMousePressed
		Cores.setBackground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_CoresMousePressed

	//volta a cor do botao para o normal quando o mouse sai de cima
    private void CoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CoresMouseExited
		Cores.setBackground(new java.awt.Color(244, 244, 246));
    }//GEN-LAST:event_CoresMouseExited

	//chama o jogo das cores
    private void CoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CoresMouseClicked

		AbrirMenu(new CorObjeto());
		
    }//GEN-LAST:event_CoresMouseClicked

	//muda a cor do botao para amarelo quando o mouse passa em cima
    private void ConhecaZoioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConhecaZoioMouseMoved
		ConhecaZoio.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_ConhecaZoioMouseMoved

	//muda a cor do botao para verde quando é pressionado
    private void ConhecaZoioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConhecaZoioMousePressed
		ConhecaZoio.setBackground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_ConhecaZoioMousePressed

	//muda a cor do botao para amarelo quando o mouse passa por cima
	//muda a cor do botao para verde quando é pressionado
	//volta o botao a sua cor normal quando o mouse não está em cima
    private void ConhecaZoioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConhecaZoioMouseExited
		ConhecaZoio.setBackground(new java.awt.Color(244, 244, 246));
    }//GEN-LAST:event_ConhecaZoioMouseExited

	//chama a tela Zoio1
    private void ConhecaZoioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConhecaZoioMouseClicked

		AbrirMenu(new Zoio1());
    }//GEN-LAST:event_ConhecaZoioMouseClicked


	//muda a cor do botao para amarelo quando o mouse passa em cima
    private void buttonChangeUserMouseMoved(java.awt.event.MouseEvent evt) {
		buttonChangeUser.setBackground(new java.awt.Color(255, 255, 102));
    }

	//muda a cor do botao para verde quando o botao é pressionado
    private void buttonChangeUserMousePressed(java.awt.event.MouseEvent evt) {
		buttonChangeUser.setBackground(new java.awt.Color(102, 204, 0));
    }

	//volta a cor do botao para o normal quando o mouse sai de cima
    private void buttonChangeUserMouseExited(java.awt.event.MouseEvent evt) {
		buttonChangeUser.setBackground(new java.awt.Color(244, 244, 246));
    }
    private void buttonChangeUserMouseClicked(java.awt.event.MouseEvent evt) {

		//PlayerManagement.GetInsance().OpenMenu();
		PlayerChange.GetInsance().OpenMenu(this);
		
    }
	//muda a cor do botao para amarelo quando o mouse est� em cima
    private void buttonConfigsMouseMoved(java.awt.event.MouseEvent evt) {
		buttonConfigs.setBackground(new java.awt.Color(255, 255, 102));
    }

	//muda a cor do botao para verde quando é pressionado
    private void buttonConfigsMousePressed(java.awt.event.MouseEvent evt) {
		buttonConfigs.setBackground(new java.awt.Color(102, 204, 0));
    }

	//volta cor do botao ao normal quando o mouse não está em cima
    private void buttonConfigsMouseExited(java.awt.event.MouseEvent evt) {
		buttonConfigs.setBackground(new java.awt.Color(244, 244, 246));
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
	private javax.swing.JButton buttonConfigs;
	
	public void SetWelcomeText(String sText) {
		labelWelcome.setText(sText);
	}

	public void SetCurrentPlayer(String sName){
// the last player name really exists?
		if (PlayerManager.GetInstance().ContainsNameInSave(sName)) {
			Inicial.GetInsance().SetWelcomeText("Bem vindo " + sName + "!");
		}
		else {
			Inicial.GetInsance().SetWelcomeText("Nenhum usuario!");
		}
	}
}
