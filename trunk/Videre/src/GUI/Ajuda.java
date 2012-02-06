package GUI;

import java.net.*;
import java.awt.*;

public class Ajuda extends TelaPadrao {

	// <editor-fold defaultstate="collapsed" desc="Singleton">
	private static Ajuda instance;

	public static Ajuda GetInsance() {
		InicializarSingleton();
		return instance;
	}

	public static void InicializarSingleton(){
		if (instance == null) {
			instance = new Ajuda();
		}
	}
	// </editor-fold>


	public int aj;
	//aj recebe o numero que identificara o jogo que chamou a ajuda
	//fs recebe o numero da fase em que o jogo estava ao clicar em ajuda

	public Ajuda() {
		initComponents();

		//inicia a musica da ajuda
//		try {
//			URL som = new URL((getClass().getResource("/sons/muppet.mid")).toString());
//			Musica = java.applet.Applet.newAudioClip(som);
//			Musica.loop();
//		} catch (MalformedURLException erro) {
//			System.out.println("Caminho do áudio não especificado! " + erro);
//		}
		//classes.UtilidadesVidere.TocarMusicaMIDI("muppet");
	}

	@Override
	protected String GetAudioName() {
		return "muppet";
	}



    private void initComponents() {//GEN-BEGIN:initComponents
        ZoioAjuda = new javax.swing.JLabel();
        Voltar = new javax.swing.JButton();
        textoajuda = new javax.swing.JTextPane();

        setTitle("Ajuda V\u00eddere");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        ZoioAjuda.setBackground(new java.awt.Color(255, 255, 255));
        ZoioAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoioajuda.gif")));
        ZoioAjuda.setFocusCycleRoot(true);
        ZoioAjuda.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        add(ZoioAjuda);
        ZoioAjuda.setBounds(90, 140, 170, 250);

        Voltar.setBackground(new java.awt.Color(244, 244, 246));
        Voltar.setFont(new java.awt.Font("Comic Sans MS", 1, 30));
        Voltar.setForeground(new java.awt.Color(255, 0, 0));
        Voltar.setText("VOLTAR");
        Voltar.setToolTipText("Reiniciar jogo");
        Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoltarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VoltarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VoltarMousePressed(evt);
            }
        });
        Voltar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                VoltarMouseMoved(evt);
            }
        });

        add(Voltar);
        Voltar.setBounds(70, 370, 190, 50);

        textoajuda.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0)), new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255))));
        textoajuda.setEditable(false);
        textoajuda.setFont(new java.awt.Font("Comic Sans MS", 1, 23));
        textoajuda.setForeground(new java.awt.Color(255, 0, 0));
        textoajuda.setText("     AJUDA");
        add(textoajuda);
        textoajuda.setBounds(310, 50, 460, 450);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800, 600);
    }//GEN-END:initComponents

	//reinicia o jogo que chamou a ajuda
    private void VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseClicked
		Volta_Jogo();
    }//GEN-LAST:event_VoltarMouseClicked

	//o botao fica amarelo quando passamos o mouse em cima
    private void VoltarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseMoved
		Voltar.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_VoltarMouseMoved

	//o botao fica verde quando pressionado
    private void VoltarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMousePressed
		Voltar.setBackground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_VoltarMousePressed

	//o botao volta a cor normal quando o mouse sai de cima do botao
    private void VoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseExited
		Voltar.setBackground(new java.awt.Color(244, 244, 246));
    }//GEN-LAST:event_VoltarMouseExited

	//volta para o jogo que chamou a ajuda, reiniciando-o
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
		Volta_Jogo();
    }//GEN-LAST:event_exitForm

	//fun��o para voltar ao jogo que chamou a ajuda
	//o jogo � reiniciado
	private void Volta_Jogo() {
//		Musica.stop();
//
//		if (aj == 1) {
//			Contagem co = new Contagem();
//			co.setVisible(true);
//			this.setVisible(false);
//		}
//
//		if (aj == 2) {
//			Contagem1 co1 = new Contagem1();
//			co1.setVisible(true);
//			this.setVisible(false);
//		}
//
//		if (aj == 3) {
//			Contagem2 co2 = new Contagem2();
//			co2.setVisible(true);
//			this.setVisible(false);
//		}
//
//		if (aj == 4) {
//			CorObjeto cor = new CorObjeto();
//			cor.setVisible(true);
//			this.setVisible(false);
//		}
//
//		if (aj == 5) {
//			Luzes lu = new Luzes();
//			lu.setVisible(true);
//			this.setVisible(false);
//		}
//
//		if (aj == 6) {
//			MatrizFigura mf = new MatrizFigura();
//			mf.setVisible(true);
//			this.setVisible(false);
//		}
//
//		if (aj == 7) {
//			MatrizGeometrica mg = new MatrizGeometrica();
//			mg.setVisible(true);
//			this.setVisible(false);
//		}
//
//		if (aj == 8) {
//			Numeros num = new Numeros();
//			num.setVisible(true);
//			this.setVisible(false);
//		}
//
//		if (aj == 9) {
//			Sombras so = new Sombras();
//			so.setVisible(true);
//			this.setVisible(false);
//		}
		VoltarMenu();
	}

	public static void main(String args[]) {
		new Ajuda().show();
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
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel ZoioAjuda;
    protected javax.swing.JTextPane textoajuda;
    // End of variables declaration//GEN-END:variables



	/**
	 * @param texto
	 */
	public void SetTextoAjuda(String texto){
		textoajuda.setText(texto);
	}
}
