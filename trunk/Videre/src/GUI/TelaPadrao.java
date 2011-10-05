package GUI;

import java.awt.*;

public class TelaPadrao extends java.awt.Frame {
    //coloca o icone na tela
    protected Image icone=new javax.swing.ImageIcon(getClass().getResource("/imagens/icone.gif")).getImage();
    //cria a variavel musica
    protected java.applet.AudioClip Musica = null;
    
    public TelaPadrao() {
        initComponents();
        
        //muda o desenho do cursor
        Image mouse=new javax.swing.ImageIcon(getClass().getResource("/imagens/cursor.gif")).getImage();
        Point p=new Point(1,1);
        Cursor c1= Toolkit.getDefaultToolkit().createCustomCursor(mouse,p, "personalizado");
        setCursor(c1);        
    }
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fundo = new javax.swing.JLabel();

        setIconImage(icone);
        setResizable(false);
        setLayout(null);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tela.jpg"))); // NOI18N
        Fundo.setName("Fundo"); // NOI18N
        add(Fundo);
        Fundo.setBounds(0, 20, 800, 580);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800, 600);
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main(String args[]) {
        new TelaPadrao().show();
    }
    
   //sai do sistema       
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JLabel Fundo;
    // End of variables declaration//GEN-END:variables
    
}
