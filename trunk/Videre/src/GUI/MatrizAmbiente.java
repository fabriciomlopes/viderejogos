package GUI;

public class MatrizAmbiente extends TelaAmbiente {

	public MatrizAmbiente() {
		initComponents();

		//inicia musica
//		try {
//			URL som = new URL((getClass().getResource("/sons/peterpan.mid")).toString());
//			Musica = java.applet.Applet.newAudioClip(som);
//			Musica.loop();
//		} catch (MalformedURLException erro) {
//			System.out.println("Caminho do áudio não especificado! " + erro);
//		}
	}


	@Override
	protected String GetAudioName() {
		return "peterpan";
	}
	
    private void initComponents() {//GEN-BEGIN:initComponents
        FormasGeometricas = new javax.swing.JButton();
        Figuras = new javax.swing.JButton();

        setTitle("Jogos Matriz");
        FormasGeometricas.setBackground(new java.awt.Color(244, 244, 246));
        FormasGeometricas.setFont(new java.awt.Font("Comic Sans MS", 1, 37));
        FormasGeometricas.setForeground(new java.awt.Color(255, 0, 0));
        FormasGeometricas.setText("FORMAS GEOM\u00c9TRICAS");
        FormasGeometricas.setToolTipText("clique aqui para jogar Matriz - Formas Geom\u00e9tricas");
        FormasGeometricas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FormasGeometricasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FormasGeometricasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FormasGeometricasMousePressed(evt);
            }
        });
        FormasGeometricas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FormasGeometricasMouseMoved(evt);
            }
        });

        add(FormasGeometricas);
        FormasGeometricas.setBounds(60, 170, 500, 50);

        Figuras.setBackground(new java.awt.Color(244, 244, 246));
        Figuras.setFont(new java.awt.Font("Comic Sans MS", 1, 37));
        Figuras.setForeground(new java.awt.Color(255, 0, 0));
        Figuras.setText("FIGURAS");
        Figuras.setToolTipText("clique aqui para jogar Matriz - Figuras");
        Figuras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FigurasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FigurasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FigurasMousePressed(evt);
            }
        });
        Figuras.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FigurasMouseMoved(evt);
            }
        });

        add(Figuras);
        Figuras.setBounds(60, 310, 500, 50);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800, 600);
    }//GEN-END:initComponents

	//chama o jogo Matriz - Formas Geometricas
    private void FormasGeometricasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FormasGeometricasMouseClicked
//		Musica.stop();
//
//		MatrizGeometrica mg = new MatrizGeometrica();
//		mg.setVisible(true);
//		this.setVisible(false);
		AbrirMenu(new MatrizGeometrica());
    }//GEN-LAST:event_FormasGeometricasMouseClicked

	//muda a cor do botao para verde quando o mouse e pressionado
    private void FormasGeometricasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FormasGeometricasMousePressed
		FormasGeometricas.setBackground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_FormasGeometricasMousePressed

	//muda a cor do botao para amarelo quando o mouse esta em cima
    private void FormasGeometricasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FormasGeometricasMouseMoved
		FormasGeometricas.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_FormasGeometricasMouseMoved

	//volta a cor do botao ao normal quando o mouse nao esta em cima
    private void FormasGeometricasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FormasGeometricasMouseExited
		FormasGeometricas.setBackground(new java.awt.Color(244, 244, 246));
    }//GEN-LAST:event_FormasGeometricasMouseExited

	//muda a cor do botao para amarelo quando o mouse esta em cima
    private void FigurasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FigurasMouseMoved
		Figuras.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_FigurasMouseMoved

	//muda a cor das figuras para verde quando e pressionado
    private void FigurasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FigurasMousePressed
		Figuras.setBackground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_FigurasMousePressed

	//volta a cor do botao ao normal quando o mouse nao esta em cima
    private void FigurasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FigurasMouseExited
		Figuras.setBackground(new java.awt.Color(244, 244, 246));
    }//GEN-LAST:event_FigurasMouseExited

	//chama o jogo Matriz Figuras
    private void FigurasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FigurasMouseClicked
//		Musica.stop();
//
//		MatrizFigura mf = new MatrizFigura();
//		mf.setVisible(true);
//		this.setVisible(false);
		AbrirMenu(new MatrizFigura());
    }//GEN-LAST:event_FigurasMouseClicked

	public static void main(String args[]) {
		new MatrizAmbiente().show();
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Figuras;
    private javax.swing.JButton FormasGeometricas;
    // End of variables declaration//GEN-END:variables
}
