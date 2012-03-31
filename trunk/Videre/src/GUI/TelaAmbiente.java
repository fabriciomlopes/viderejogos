package GUI;

import java.awt.*;
public class TelaAmbiente extends TelaPadrao {
    
    public TelaAmbiente() {
        initComponents();        
    }

    private void initComponents() {//GEN-BEGIN:initComponents
        Voltar = new javax.swing.JButton();
        ZoioAmbiente = new javax.swing.JLabel();
        SkateAmbiente = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        Voltar.setBackground(new java.awt.Color(244, 244, 246));
        Voltar.setFont(new java.awt.Font("Comic Sans MS", 1, 33));
        Voltar.setForeground(new java.awt.Color(255, 0, 0));
        Voltar.setText("VOLTAR");
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
        Voltar.setBounds(210, 518, 400, 50);

        ZoioAmbiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoiojogo.gif")));
        add(ZoioAmbiente);
        ZoioAmbiente.setBounds(620, 190, 80, 150);

        SkateAmbiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/skatep.gif")));
        add(SkateAmbiente);
        SkateAmbiente.setBounds(610, 300, 80, 40);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800, 600);
    }//GEN-END:initComponents

    private void VoltarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseMoved
        Voltar.setBackground(new java.awt.Color(255,255,102));
    }//GEN-LAST:event_VoltarMouseMoved

    private void VoltarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMousePressed
        Voltar.setBackground(new java.awt.Color(102,204,0));
    }//GEN-LAST:event_VoltarMousePressed

    //muda a cor do botao para amarelo quando o mouse fica em cima
    //muda a cor do botao para verde quando pressionado
    //volta a cor do botao ao normal quando o mouse nao esta em cima
    private void VoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseExited
        Voltar.setBackground(new java.awt.Color(244,244,246));
    }//GEN-LAST:event_VoltarMouseExited

    //chama a tela inicial
    private void VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseClicked
//        Musica.stop();
//
//        Inicial ini=new Inicial();
//        ini.setVisible(true);
//        this.setVisible(false);
		AbrirMenu(Inicial.GetInsance());
    }//GEN-LAST:event_VoltarMouseClicked
    
    //chama a tela inicial    
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
//        Musica.stop();
//
//        Inicial ini=new Inicial();
//        ini.setVisible(true);
//        this.setVisible(false);
		AbrirMenu(Inicial.GetInsance());
    }//GEN-LAST:event_exitForm
       
    //sobrescreve a fun��o add para que as figuras fiquem na ordem correta
    public Component add(Component comp) {
        Component retValue;
        if (comp.getName() == null){
            retValue = super.Fundo.add(comp);
        }else{
            retValue = super.add(comp);
            
        }
        return retValue;
    } 
    
//    public static void main(String args[]) {
//        new TelaAmbiente().show();
//    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SkateAmbiente;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel ZoioAmbiente;
    // End of variables declaration//GEN-END:variables
    
}
