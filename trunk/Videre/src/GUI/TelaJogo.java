package GUI;
import javax.swing.*;
import java.awt.*;
public class TelaJogo extends TelaPadrao {
protected int fase=1, vida=4, ptos=0;
//fase - contador para indicar a fase em que o jogador esta
//vida - numero inicial de vidas
//ptos - n�mero inicial de pontos

protected Icon figfase;
//fig fase - recebe a figura da fase atual


protected String texto;
    public TelaJogo() {
        initComponents();
    }
    

    private void initComponents() {//GEN-BEGIN:initComponents
        TelaInicial = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        NumVidas = new javax.swing.JLabel();
        ZoioVidas = new javax.swing.JLabel();
        Pontos = new javax.swing.JLabel();
        PontosTexto = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        TelaInicial.setBackground(new java.awt.Color(244, 244, 246));
        TelaInicial.setFont(new java.awt.Font("Comic Sans MS", 1, 30));
        TelaInicial.setForeground(new java.awt.Color(255, 0, 0));
        TelaInicial.setText("TELA INICIAL");
        TelaInicial.setToolTipText("clique aqui para voltar \u00e0 Tela Inicial");
        TelaInicial.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
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
        TelaInicial.setBounds(292, 519, 230, 50);

        Sair.setBackground(new java.awt.Color(244, 244, 246));
        Sair.setFont(new java.awt.Font("Comic Sans MS", 1, 30));
        Sair.setForeground(new java.awt.Color(255, 0, 0));
        Sair.setText("SAIR");
        Sair.setToolTipText("clique aqui para sair dos jogos V\u00eddere");
        Sair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
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
        Sair.setBounds(547, 519, 230, 50);

        NumVidas.setFont(new java.awt.Font("Comic Sans MS", 1, 23));
        NumVidas.setForeground(new java.awt.Color(0, 0, 255));
        NumVidas.setText("4");
        add(NumVidas);
        NumVidas.setBounds(180, 10, 20, 30);

        ZoioVidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoiojogop.gif")));
        add(ZoioVidas);
        ZoioVidas.setBounds(210, 5, 30, 35);

        Pontos.setFont(new java.awt.Font("Comic Sans MS", 1, 25));
        Pontos.setForeground(new java.awt.Color(0, 0, 255));
        Pontos.setText("000000");
        add(Pontos);
        Pontos.setBounds(550, 7, 110, 36);

        PontosTexto.setFont(new java.awt.Font("Comic Sans MS", 1, 25));
        PontosTexto.setForeground(new java.awt.Color(0, 0, 255));
        PontosTexto.setText("Pontos");
        add(PontosTexto);
        PontosTexto.setBounds(660, 10, 80, 30);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800, 600);
    }//GEN-END:initComponents

    //muda a cor do botao para amarelo quando o mouse esta em cima
    private void SairMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseMoved
        Sair.setBackground(new java.awt.Color(255,255,102));
    }//GEN-LAST:event_SairMouseMoved

    //muda a cor do botao para verde quando e pressionado
    private void SairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMousePressed
        Sair.setBackground(new java.awt.Color(102,204,0));
    }//GEN-LAST:event_SairMousePressed

    //volta a cor do botao ao normal quando o mouse nao esta em cima
    private void SairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseExited
        Sair.setBackground(new java.awt.Color(244,244,246));
    }//GEN-LAST:event_SairMouseExited
    
    //sai do sistema videre
    private void SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SairMouseClicked

    //muda a cor do botao para amarelo quando o mouse esta em cima
    private void TelaInicialMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelaInicialMouseMoved
        TelaInicial.setBackground(new java.awt.Color(255,255,102));
    }//GEN-LAST:event_TelaInicialMouseMoved

    //muda a cor do botao para verde quando pressionado
    private void TelaInicialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelaInicialMousePressed
        TelaInicial.setBackground(new java.awt.Color(102,204,0));
    }//GEN-LAST:event_TelaInicialMousePressed

    //volta a cor do botao ao normal quando o mouse passa em cima
    private void TelaInicialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelaInicialMouseExited
        TelaInicial.setBackground(new java.awt.Color(244,244,246));
    }//GEN-LAST:event_TelaInicialMouseExited

    //volta para tela inicial
    private void TelaInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelaInicialMouseClicked
        Musica.stop();
        
        Inicial ini=new Inicial();
        ini.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_TelaInicialMouseClicked
    

    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        Musica.stop();
        
        Inicial ini=new Inicial();
        ini.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_exitForm
  
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
        new TelaJogo().show();
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JLabel NumVidas;
    protected javax.swing.JLabel Pontos;
    private javax.swing.JLabel PontosTexto;
    private javax.swing.JButton Sair;
    private javax.swing.JButton TelaInicial;
    private javax.swing.JLabel ZoioVidas;
    // End of variables declaration//GEN-END:variables
    
}
