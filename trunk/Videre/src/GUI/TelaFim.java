package GUI;

import java.awt.*;
public class TelaFim extends TelaPadrao {
    protected int FlagJogo;
    //FlagJogo recebe o numero que identificara o jogo 
    //para o qual retornara quando o jogador clicar em jogar novamente
    
    public TelaFim() {
        initComponents();
    }
    
    private void initComponents() {//GEN-BEGIN:initComponents
        JogarNovamente = new javax.swing.JButton();
        TelaInicial = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        Pontuacao = new javax.swing.JLabel();
        Placar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        JogarNovamente.setBackground(new java.awt.Color(244, 244, 246));
        JogarNovamente.setFont(new java.awt.Font("Comic Sans MS", 1, 21));
        JogarNovamente.setForeground(new java.awt.Color(255, 0, 0));
        JogarNovamente.setText("JOGAR NOVAMENTE");
        JogarNovamente.setToolTipText("Volta para o jogo");
        JogarNovamente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.gray));
        JogarNovamente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JogarNovamenteMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JogarNovamenteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JogarNovamenteMousePressed(evt);
            }
        });
        JogarNovamente.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JogarNovamenteMouseMoved(evt);
            }
        });

        add(JogarNovamente);
        JogarNovamente.setBounds(35, 518, 230, 50);

        TelaInicial.setBackground(new java.awt.Color(244, 244, 246));
        TelaInicial.setFont(new java.awt.Font("Comic Sans MS", 1, 21));
        TelaInicial.setForeground(new java.awt.Color(255, 0, 0));
        TelaInicial.setText("TELA INICIAL");
        TelaInicial.setToolTipText("Volta a Tela Inicial");
        TelaInicial.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.gray));
        TelaInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TelaInicialMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TelaInicialMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TelaInicialMousePressed(evt);
            }
        });
        TelaInicial.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                TelaInicialMouseMoved(evt);
            }
        });

        add(TelaInicial);
        TelaInicial.setBounds(290, 518, 230, 50);

        Sair.setBackground(new java.awt.Color(244, 244, 246));
        Sair.setFont(new java.awt.Font("Comic Sans MS", 1, 21));
        Sair.setForeground(new java.awt.Color(255, 0, 0));
        Sair.setText("SAIR");
        Sair.setToolTipText("Sai do sistema V\u00eddere");
        Sair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.gray));
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
        Sair.setBounds(545, 518, 230, 50);

        Pontuacao.setFont(new java.awt.Font("Comic Sans MS", 1, 33));
        Pontuacao.setForeground(new java.awt.Color(255, 0, 0));
        Pontuacao.setText("00000");
        add(Pontuacao);
        Pontuacao.setBounds(500, 220, 100, 40);

        Placar.setLayout(null);

        Placar.setBackground(new java.awt.Color(244, 244, 246));
        Placar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, null, java.awt.Color.blue, java.awt.Color.gray));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 33));
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Pontos!");
        Placar.add(jLabel1);
        jLabel1.setBounds(15, 40, 110, 40);

        add(Placar);
        Placar.setBounds(480, 220, 140, 80);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800, 600);
    }//GEN-END:initComponents
    
    //quando o mouse passa em cima do botao elel fica amarelo
    private void TelaInicialMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelaInicialMouseMoved
        TelaInicial.setBackground(new java.awt.Color(255,255,102));
    }//GEN-LAST:event_TelaInicialMouseMoved
    
    //quando o botao é pressionado muda para a cor verde
    private void TelaInicialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelaInicialMousePressed
        TelaInicial.setBackground(new java.awt.Color(102,204,0));
    }//GEN-LAST:event_TelaInicialMousePressed
    
    //volta o botao para a cor normal quando o mouse sai de cima
    private void TelaInicialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelaInicialMouseExited
        TelaInicial.setBackground(new java.awt.Color(244,244,246));
    }//GEN-LAST:event_TelaInicialMouseExited
    
    //retorna a Tela Inicial do sistema Videre
    private void TelaInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelaInicialMouseClicked
//        Musica.stop();
//
//        Inicial ini=new Inicial();
//        ini.setVisible(true);
//        this.setVisible(false);
		AbrirMenu(Inicial.GetInsance());
    }//GEN-LAST:event_TelaInicialMouseClicked
    
    //sai do sistema
    private void SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SairMouseClicked
    
    //muda a cor do botao para amarela quando o mouse passa em cima
    private void SairMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseMoved
        Sair.setBackground(new java.awt.Color(255,255,102));
    }//GEN-LAST:event_SairMouseMoved
    
    //muda a cor do botao para verde quando é pressionado
    private void SairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMousePressed
        Sair.setBackground(new java.awt.Color(102,204,0));
    }//GEN-LAST:event_SairMousePressed
    
    //volta a cor do botao ao normal quando o mouse não está em cima
    private void SairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseExited
        Sair.setBackground(new java.awt.Color(244,244,246));
    }//GEN-LAST:event_SairMouseExited
    
    //volta para o jogo que chamou tela fim
    protected void Jogar_Novamente(){

//        Musica.stop();
//
//        if (FlagJogo==1){
//            Contagem co=new Contagem();
//            co.setVisible(true);
//            this.setVisible(false);
//        }
//
//        if (FlagJogo==2){
//            Contagem1 co1=new Contagem1();
//            co1.setVisible(true);
//            this.setVisible(false);
//        }
//
//        if (FlagJogo==3){
//            Contagem2 co2=new Contagem2();
//            co2.setVisible(true);
//            this.setVisible(false);
//        }
//
//        if (FlagJogo==4){
//            CorObjeto cor=new CorObjeto();
//            cor.setVisible(true);
//            this.setVisible(false);
//        }
//
//        if (FlagJogo==5){
//            Luzes lu=new Luzes();
//            lu.setVisible(true);
//            this.setVisible(false);
//        }
//
//        if (FlagJogo==6){
//            MatrizFigura mf=new MatrizFigura();
//            mf.setVisible(true);
//            this.setVisible(false);
//        }
//
//        if (FlagJogo==7){
//            MatrizGeometrica mg=new MatrizGeometrica();
//            mg.setVisible(true);
//            this.setVisible(false);
//        }
//
//        if (FlagJogo==8){
//            Numeros num=new Numeros();
//            num.setVisible(true);
//            this.setVisible(false);
//        }
//
//        if (FlagJogo==9){
//            Sombras so=new Sombras();
//            so.setVisible(true);
//            this.setVisible(false);
//        }

		VoltarMenu();
		
//		if (menuAnterior instanceof TelaJogo) {
//			// reinicia a fase.
//			((TelaJogo) menuAnterior).IniciarFase();
//		}
		
    }
    
    //chama a funcao jogar novamente
    //que retorna ao jogo que chamou a tela fim
    private void JogarNovamenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JogarNovamenteMouseClicked
    Jogar_Novamente();
    }//GEN-LAST:event_JogarNovamenteMouseClicked
    
    //muda a cor do mouse para amarelo quando o mouse passa em cima
    private void JogarNovamenteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JogarNovamenteMouseExited
        JogarNovamente.setBackground(new java.awt.Color(244,244,246));
    }//GEN-LAST:event_JogarNovamenteMouseExited
    
    //muda a cor do botao para verde quando pressionado
    private void JogarNovamenteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JogarNovamenteMousePressed
        JogarNovamente.setBackground(new java.awt.Color(102,204,0));
    }//GEN-LAST:event_JogarNovamenteMousePressed
    
    //volta o botao a cor nornal quando o mouse sai de cima
    private void JogarNovamenteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JogarNovamenteMouseMoved
        JogarNovamente.setBackground(new java.awt.Color(255,255,102));
    }//GEN-LAST:event_JogarNovamenteMouseMoved
    
    //volta para a Tela Inicial do sistema Videre    
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
//        Musica.stop();
//
//        Inicial ini=new Inicial();
//        ini.setVisible(true);
//        this.setVisible(false);
		AbrirMenu(Inicial.GetInsance());
    }//GEN-LAST:event_exitForm
    
    
    //sobrescreve a funcao add para que as figuras fiquem na ordem correta
    public Component add(Component comp) {
        Component retValue;
        if (comp.getName() == null){
            retValue = super.Fundo.add(comp);
        }else{
            retValue = super.add(comp);
            
        }
        return retValue;
    }
    
    public static void main(String args[]) {
        new TelaFim().show();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JogarNovamente;
    private javax.swing.JPanel Placar;
    protected javax.swing.JLabel Pontuacao;
    private javax.swing.JButton Sair;
    private javax.swing.JButton TelaInicial;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables


	/**
	 * Apenas seta o texto da pontuacao
	 * @param iPontos
	 */
	public void SetPontos(int iPontos) {
		//Pontos.setText(String.valueOf(iPontos));
		Pontuacao.setText(String.valueOf(iPontos));
	}
}
