package GUI;

import java.net.*;

public class ContagemAmbiente extends TelaAmbiente {

	public ContagemAmbiente() {
		initComponents();

		//inicia musica
		try {
			URL som = new URL((getClass().getResource("/sons/peterpan.mid")).toString());
			Musica = java.applet.Applet.newAudioClip(som);
			Musica.loop();
		} catch (MalformedURLException erro) {
			System.out.println("Caminho do áudio não especificado! " + erro);
		}
	}

    private void initComponents() {//GEN-BEGIN:initComponents
        AcheLetras = new javax.swing.JButton();
        AcheNumeros = new javax.swing.JButton();
        AcheFiguras = new javax.swing.JButton();

        setTitle("Esconde-Esconde");
        AcheLetras.setBackground(new java.awt.Color(244, 244, 246));
        AcheLetras.setFont(new java.awt.Font("Comic Sans MS", 1, 40));
        AcheLetras.setForeground(new java.awt.Color(255, 0, 0));
        AcheLetras.setText("ACHE AS LETRAS!");
        AcheLetras.setToolTipText("clique aqui para chamar o jogo Ache as Letras!");
        AcheLetras.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
        AcheLetras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AcheLetrasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AcheLetrasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AcheLetrasMousePressed(evt);
            }
        });
        AcheLetras.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AcheLetrasMouseMoved(evt);
            }
        });

        add(AcheLetras);
        AcheLetras.setBounds(60, 120, 500, 50);

        AcheNumeros.setBackground(new java.awt.Color(244, 244, 246));
        AcheNumeros.setFont(new java.awt.Font("Comic Sans MS", 1, 40));
        AcheNumeros.setForeground(new java.awt.Color(255, 0, 0));
        AcheNumeros.setText("ACHE OS N\u00daMEROS!");
        AcheNumeros.setToolTipText("clique aqui para chamar o jogo Ache os N\u00fameros");
        AcheNumeros.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
        AcheNumeros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AcheNumerosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AcheNumerosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AcheNumerosMousePressed(evt);
            }
        });
        AcheNumeros.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AcheNumerosMouseMoved(evt);
            }
        });

        add(AcheNumeros);
        AcheNumeros.setBounds(60, 240, 500, 50);

        AcheFiguras.setBackground(new java.awt.Color(244, 244, 246));
        AcheFiguras.setFont(new java.awt.Font("Comic Sans MS", 1, 40));
        AcheFiguras.setForeground(new java.awt.Color(255, 0, 0));
        AcheFiguras.setText("ACHE AS FIGURAS!");
        AcheFiguras.setToolTipText("clique aqui para chamar o jogo Ache as Figuras!");
        AcheFiguras.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
        AcheFiguras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AcheFigurasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AcheFigurasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AcheFigurasMousePressed(evt);
            }
        });
        AcheFiguras.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AcheFigurasMouseMoved(evt);
            }
        });

        add(AcheFiguras);
        AcheFiguras.setBounds(60, 360, 500, 50);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800, 600);
    }//GEN-END:initComponents

    private void AcheLetrasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcheLetrasMouseMoved
		AcheLetras.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_AcheLetrasMouseMoved

	//chama o jogo Ache as Letras
    private void AcheLetrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcheLetrasMouseClicked
		Musica.stop();

		Contagem c = new Contagem();
		c.setVisible(true);
		this.setVisible(false);
    }//GEN-LAST:event_AcheLetrasMouseClicked

	//muda a cor do botao para verde quando e pressionado
    private void AcheLetrasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcheLetrasMousePressed
		AcheLetras.setBackground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_AcheLetrasMousePressed

	//volta a cor do botao ao normal quando o mouse nao esta em cima
    private void AcheLetrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcheLetrasMouseExited
		AcheLetras.setBackground(new java.awt.Color(244, 244, 246));
    }//GEN-LAST:event_AcheLetrasMouseExited

	//muda a cor do botao para amarelo quando o mouse passa em cima
    private void AcheNumerosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcheNumerosMouseMoved
		AcheNumeros.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_AcheNumerosMouseMoved

	//muda a cor do botao para verde quando o mouse
    private void AcheNumerosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcheNumerosMousePressed
		AcheNumeros.setBackground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_AcheNumerosMousePressed

	//volta a cor do botao ao normal quando o mouse nao esta em cima
    private void AcheNumerosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcheNumerosMouseExited
		AcheNumeros.setBackground(new java.awt.Color(244, 244, 246));
    }//GEN-LAST:event_AcheNumerosMouseExited

	//chama o jogo Ache os Numeros
    private void AcheNumerosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcheNumerosMouseClicked
		Musica.stop();

		Contagem1 co1 = new Contagem1();
		co1.setVisible(true);
		this.setVisible(false);
    }//GEN-LAST:event_AcheNumerosMouseClicked

	//muda a cor do botao para amarelo quando o mouse passa em cima
    private void AcheFigurasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcheFigurasMouseMoved
		AcheFiguras.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_AcheFigurasMouseMoved

	//muda a cor do botao para verde quando e pressionado
    private void AcheFigurasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcheFigurasMousePressed
		AcheFiguras.setBackground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_AcheFigurasMousePressed

	//volta a cor do botao ao normal quando o mouse nao esta em cima
    private void AcheFigurasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcheFigurasMouseExited
		AcheFiguras.setBackground(new java.awt.Color(244, 244, 246));
    }//GEN-LAST:event_AcheFigurasMouseExited

	//chama o jogo Ache as Figuras
    private void AcheFigurasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcheFigurasMouseClicked
		Musica.stop();

		Contagem2 c2 = new Contagem2();
		c2.setVisible(true);
		this.setVisible(false);
    }//GEN-LAST:event_AcheFigurasMouseClicked

	public static void main(String args[]) {
		new ContagemAmbiente().show();
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcheFiguras;
    private javax.swing.JButton AcheLetras;
    private javax.swing.JButton AcheNumeros;
    // End of variables declaration//GEN-END:variables
}
