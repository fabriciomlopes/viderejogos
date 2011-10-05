package GUI;

import java.net.*;
import java.awt.*;

public class Inicial extends TelaPadrao {

	public Inicial() {
		initComponents();

		//inicia a m�sica tema do sistema
		try {
			URL som = new URL((getClass().getResource("/sons/circleoflife.mid")).toString());
			Musica = java.applet.Applet.newAudioClip(som);
			Musica.loop();
		} catch (MalformedURLException erro) {
			System.out.println("Caminho do �udio n�o especificado! " + erro);
		}
	}

    private void initComponents() {//GEN-BEGIN:initComponents
        ConhecaZoio = new javax.swing.JButton();
        Cores = new javax.swing.JButton();
        Esconder = new javax.swing.JButton();
        Luzes = new javax.swing.JButton();
        Matriz = new javax.swing.JButton();
        Numeros = new javax.swing.JButton();
        Sombras = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        FiguraZoio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setTitle("V\u00eddere - Jogos de Estimula\u00e7\u00e3o Visual");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        ConhecaZoio.setBackground(new java.awt.Color(244, 244, 246));
        ConhecaZoio.setFont(new java.awt.Font("Comic Sans MS", 1, 33));
        ConhecaZoio.setForeground(new java.awt.Color(255, 0, 0));
        ConhecaZoio.setText("CONHE\u00c7A O Z\u00d4IO");
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
        Cores.setBounds(50, 90, 210, 60);

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
        Esconder.setBounds(50, 150, 210, 60);

        Luzes.setBackground(new java.awt.Color(244, 244, 246));
        Luzes.setFont(new java.awt.Font("Comic Sans MS", 1, 33));
        Luzes.setForeground(new java.awt.Color(255, 0, 0));
        Luzes.setText("LUZES");
        Luzes.setToolTipText("Cuidado para n\u00e3o esquecer a seq\u00fc\u00eancia das luzes!");
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
        Luzes.setBounds(50, 210, 210, 60);

        Matriz.setBackground(new java.awt.Color(244, 244, 246));
        Matriz.setFont(new java.awt.Font("Comic Sans MS", 1, 33));
        Matriz.setForeground(new java.awt.Color(255, 0, 0));
        Matriz.setText("MATRIZ");
        Matriz.setToolTipText("Monte uma seq\u00fc\u00eancia de objetos");
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
        Matriz.setBounds(50, 270, 210, 60);

        Numeros.setBackground(new java.awt.Color(244, 244, 246));
        Numeros.setFont(new java.awt.Font("Comic Sans MS", 1, 33));
        Numeros.setForeground(new java.awt.Color(255, 0, 0));
        Numeros.setText("N\u00daMEROS");
        Numeros.setToolTipText("Brinque com o domin\u00f3 dos n\u00fameros");
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
        Numeros.setBounds(50, 330, 210, 60);

        Sombras.setBackground(new java.awt.Color(244, 244, 246));
        Sombras.setFont(new java.awt.Font("Comic Sans MS", 1, 33));
        Sombras.setForeground(new java.awt.Color(255, 0, 0));
        Sombras.setText("SOMBRAS");
        Sombras.setToolTipText("Ache o desenho correspondente a sombra");
        Sombras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SombrasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SombrasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SombrasMousePressed(evt);
            }
        });
        Sombras.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SombrasMouseMoved(evt);
            }
        });

        add(Sombras);
        Sombras.setBounds(50, 390, 210, 60);

        Sair.setBackground(new java.awt.Color(244, 244, 246));
        Sair.setFont(new java.awt.Font("Comic Sans MS", 1, 33));
        Sair.setForeground(new java.awt.Color(255, 0, 0));
        Sair.setText("SAIR");
        Sair.setToolTipText("Sair dos jogos V\u00eddere");
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
        Sair.setBounds(50, 450, 210, 60);

        FiguraZoio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoio.gif")));
        add(FiguraZoio);
        FiguraZoio.setBounds(430, 60, 209, 300);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/skate.gif")));
        add(jLabel1);
        jLabel1.setBounds(390, 310, 280, 150);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/home.jpg")));
        add(jLabel3);
        jLabel3.setBounds(0, 0, 800, 580);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800, 600);
    }//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
		System.exit(0);
    }//GEN-LAST:event_formWindowClosing

	//muda a cor do bot�o para amarelo quando o mouse passa em cima
    private void SairMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseMoved
		Sair.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_SairMouseMoved

	//muda a cor do bot�o para verde quando � pressionado
    private void SairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMousePressed
		Sair.setBackground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_SairMousePressed

	//volta a cor do bot�o ao normal quando o mouse n�o est� em cima
    private void SairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseExited
		Sair.setBackground(new java.awt.Color(244, 244, 246));
    }//GEN-LAST:event_SairMouseExited

	//sai do sistema V�dere
    private void SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseClicked
		System.exit(0);
    }//GEN-LAST:event_SairMouseClicked

	//muda a cor do bot�o para amarelo quando o mouse est� em cima
    private void SombrasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SombrasMouseMoved
		Sombras.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_SombrasMouseMoved

	//muda a cor do bot�o para verde quando � pressionado
    private void SombrasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SombrasMousePressed
		Sombras.setBackground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_SombrasMousePressed

	//volta cor do bot�o ao normal quando o mouse n�o est� em cima
    private void SombrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SombrasMouseExited
		Sombras.setBackground(new java.awt.Color(244, 244, 246));
    }//GEN-LAST:event_SombrasMouseExited

	//chama o jogo das sombras
    private void SombrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SombrasMouseClicked
		Musica.stop();

		Sombras so = new Sombras();
		so.setVisible(true);
		this.setVisible(false);
    }//GEN-LAST:event_SombrasMouseClicked

	//muda a cor do bot�o para amarelo quando o mouse passa em cima
    private void NumerosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumerosMouseMoved
		Numeros.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_NumerosMouseMoved

	//muda a cor do bot�o para verde quando � pressionado
    private void NumerosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumerosMousePressed
		Numeros.setBackground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_NumerosMousePressed

	//volta a cor do bot�o ao normal quando o mouse sai de cima
    private void NumerosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumerosMouseExited
		Numeros.setBackground(new java.awt.Color(244, 244, 246));
    }//GEN-LAST:event_NumerosMouseExited

	//chama o jogo dos numeros
    private void NumerosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumerosMouseClicked
		Musica.stop();

		Numeros nm = new Numeros();
		nm.setVisible(true);
		this.setVisible(false);
    }//GEN-LAST:event_NumerosMouseClicked

	//muda a cor do bot�o para amarelo quando o mouse passa em cima
    private void MatrizMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatrizMouseMoved
		Matriz.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_MatrizMouseMoved

	//muda a cor do bot�o para verde quando � pressionado
    private void MatrizMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatrizMousePressed
		Matriz.setBackground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_MatrizMousePressed

	//volta a cor do bot�o ao normal quando o mouse sai de cima
    private void MatrizMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatrizMouseExited
		Matriz.setBackground(new java.awt.Color(244, 244, 246));
    }//GEN-LAST:event_MatrizMouseExited

	//chama o ambiente de escolha dos jogos Matriz
    private void MatrizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatrizMouseClicked
		Musica.stop();

		MatrizAmbiente ma = new MatrizAmbiente();
		ma.setVisible(true);
    }//GEN-LAST:event_MatrizMouseClicked

	//muda a cor do bot�o para amarelo quando � pressionado
    private void LuzesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LuzesMouseMoved
		Luzes.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_LuzesMouseMoved

	//muda a cor do bot�o pra verde quando � pressionado
    private void LuzesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LuzesMousePressed
		Luzes.setBackground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_LuzesMousePressed

	//volta a cor do bot�o ao normal quando o mouse n�o est� em cima
    private void LuzesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LuzesMouseExited
		Luzes.setBackground(new java.awt.Color(244, 244, 246));
    }//GEN-LAST:event_LuzesMouseExited

	//chama o jogo das luzes
    private void LuzesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LuzesMouseClicked
		Musica.stop();

		Luzes lu = new Luzes();
		lu.setVisible(true);
		this.setVisible(false);
    }//GEN-LAST:event_LuzesMouseClicked

	//muda a cor do bot�o para amarelo quando o mouse passa em cima
    private void EsconderMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EsconderMouseMoved
		Esconder.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_EsconderMouseMoved

	//muda a cor do bot�o para verde quando � pressionado
    private void EsconderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EsconderMousePressed
		Esconder.setBackground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_EsconderMousePressed

	//volta a cor do bot�o ao normal quando o mouse sai de cima
    private void EsconderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EsconderMouseExited
		Esconder.setBackground(new java.awt.Color(244, 244, 246));
    }//GEN-LAST:event_EsconderMouseExited

	//chama a tela de escolha dos jogos esconder
    private void EsconderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EsconderMouseClicked
		Musica.stop();

		ContagemAmbiente coa = new ContagemAmbiente();
		coa.setVisible(true);
    }//GEN-LAST:event_EsconderMouseClicked

	//muda a cor do bot�o para amarelo quando o mouse passa em cima
    private void CoresMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CoresMouseMoved
		Cores.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_CoresMouseMoved

	//muda a cor do bot�o para verde quando o bot�o � pressionado
    private void CoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CoresMousePressed
		Cores.setBackground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_CoresMousePressed

	//volta a cor do bot�o para o normal quando o mouse sai de cima
    private void CoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CoresMouseExited
		Cores.setBackground(new java.awt.Color(244, 244, 246));
    }//GEN-LAST:event_CoresMouseExited

	//chama o jogo das cores
    private void CoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CoresMouseClicked
		Musica.stop();

		CorObjeto co = new CorObjeto();
		co.setVisible(true);
		this.setVisible(false);
    }//GEN-LAST:event_CoresMouseClicked

	//muda a cor do bot�o para amarelo quando o mouse passa em cima
    private void ConhecaZoioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConhecaZoioMouseMoved
		ConhecaZoio.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_ConhecaZoioMouseMoved

	//muda a cor do bot�o para verde quando � pressionado
    private void ConhecaZoioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConhecaZoioMousePressed
		ConhecaZoio.setBackground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_ConhecaZoioMousePressed

	//muda a cor do bot�o para amarelo quando o mouse passa por cima
	//muda a cor do bot�o para verde quando � pressionado
	//volta o bot�o a sua cor normal quando o mouse n�o est� em cima
    private void ConhecaZoioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConhecaZoioMouseExited
		ConhecaZoio.setBackground(new java.awt.Color(244, 244, 246));
    }//GEN-LAST:event_ConhecaZoioMouseExited

	//chama a tela Zoio1
    private void ConhecaZoioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConhecaZoioMouseClicked
		Musica.stop();

		Zoio1 z1 = new Zoio1();
		z1.setVisible(true);
		this.setVisible(false);
    }//GEN-LAST:event_ConhecaZoioMouseClicked

	//sai do sistema v�dere
	public static void main(String args[]) {
		new Inicial().show();
	}

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
    private javax.swing.JButton Sombras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
