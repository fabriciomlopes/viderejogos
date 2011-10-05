package GUI;

import javax.swing.*;
import java.awt.*;
import java.net.*;

public class Zoio1 extends TelaPadrao {
    public int tela=0;
    Icon des=null;
    public String texto=null;
          
    public Zoio1() {
        initComponents();
                
        try{
            URL som= new URL((getClass().getResource("/sons/belafera.mid")).toString());
            Musica= java.applet.Applet.newAudioClip(som);
            Musica.loop();
        }catch(MalformedURLException erro){
            System.out.println("Caminho do �udio n�o especificado! "+erro);
        }
    }
    
   
    private void initComponents() {                          
        quadro = new javax.swing.JLabel();
        voltatela = new javax.swing.JLabel();
        telainicial = new javax.swing.JLabel();
        avancatela = new javax.swing.JLabel();
        textoestoria = new javax.swing.JTextPane();
        maezoio = new javax.swing.JLabel();
        paizoio = new javax.swing.JLabel();
        zoiobebe = new javax.swing.JLabel();
        familiazoio = new javax.swing.JLabel();
        escolazoio = new javax.swing.JLabel();
        criancas = new javax.swing.JLabel();
        pontos = new javax.swing.JLabel();
        coresformas = new javax.swing.JLabel();
        computador = new javax.swing.JLabel();
        planeta = new javax.swing.JLabel();

        setLayout(null);

        setIconImage(icone);
        setResizable(false);
        setTitle("Conhe\u00e7a o Z\u00f4io");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        quadro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoio/planeta.jpg")));
        quadro.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 3, true), new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true)));
        add(quadro);
        quadro.setBounds(20, 50, 410, 440);

        voltatela.setBackground(new java.awt.Color(244, 244, 246));
        voltatela.setFont(new java.awt.Font("Comic Sans MS", 1, 30));
        voltatela.setForeground(new java.awt.Color(255, 0, 0));
        voltatela.setText("    VOLTAR");
        voltatela.setToolTipText("Volta para a tela anterior");
        voltatela.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.gray));
        voltatela.setOpaque(true);
        voltatela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltatelaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                voltatelaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                voltatelaMousePressed(evt);
            }
        });
        voltatela.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                voltatelaMouseMoved(evt);
            }
        });

        add(voltatela);
        voltatela.setBounds(40, 518, 230, 50);

        telainicial.setBackground(new java.awt.Color(244, 244, 246));
        telainicial.setFont(new java.awt.Font("Comic Sans MS", 1, 30));
        telainicial.setForeground(new java.awt.Color(255, 0, 0));
        telainicial.setText("TELA INICIAL");
        telainicial.setToolTipText("Volta para a tela inicial");
        telainicial.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.gray));
        telainicial.setOpaque(true);
        telainicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telainicialMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                telainicialMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                telainicialMousePressed(evt);
            }
        });
        telainicial.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                telainicialMouseMoved(evt);
            }
        });

        add(telainicial);
        telainicial.setBounds(290, 518, 230, 50);

        avancatela.setBackground(new java.awt.Color(244, 244, 246));
        avancatela.setFont(new java.awt.Font("Comic Sans MS", 1, 30));
        avancatela.setForeground(new java.awt.Color(255, 0, 0));
        avancatela.setText("   AVAN\u00c7AR");
        avancatela.setToolTipText("Passa para a pr\u00f3xima tela");
        avancatela.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.gray));
        avancatela.setOpaque(true);
        avancatela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avancatelaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                avancatelaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                avancatelaMousePressed(evt);
            }
        });
        avancatela.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                avancatelaMouseMoved(evt);
            }
        });

        add(avancatela);
        avancatela.setBounds(540, 518, 230, 50);

        textoestoria.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 3, true), new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true)));
        textoestoria.setEditable(false);
        textoestoria.setFont(new java.awt.Font("Comic Sans MS", 1, 23));
        textoestoria.setForeground(new java.awt.Color(255, 0, 0));
        textoestoria.setText("   Eu sou de um planeta muito distante, chamado Retin\u00f3ide. \u00c9 bem parecido com a Terra. Gosto muito daqui. Mas, resolvi fazer esta visitinha ao seu planeta, para que todos  conhe\u00e7am um pouquinho mais sobre os m\u00e9todos de Estimula\u00e7\u00e3o Visual que nossa alta tecnologia inventou.  ");
        add(textoestoria);
        textoestoria.setBounds(440, 50, 340, 440);

        maezoio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoio/m�ezoio.jpg")));
        maezoio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(maezoio);
        maezoio.setBounds(750, 110, 15, 15);

        paizoio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoio/paizoio.jpg")));
        paizoio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(paizoio);
        paizoio.setBounds(750, 130, 15, 15);

        zoiobebe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoio/zoiobebe.jpg")));
        zoiobebe.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(zoiobebe);
        zoiobebe.setBounds(750, 150, 15, 15);

        familiazoio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoio/familiazoio.jpg")));
        familiazoio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(familiazoio);
        familiazoio.setBounds(750, 170, 15, 15);

        escolazoio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoio/escolazoio.jpg")));
        escolazoio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(escolazoio);
        escolazoio.setBounds(750, 190, 15, 15);

        criancas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoio/crian�as.jpg")));
        criancas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(criancas);
        criancas.setBounds(750, 210, 15, 15);

        pontos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoio/pontos.jpg")));
        pontos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(pontos);
        pontos.setBounds(750, 230, 15, 15);

        coresformas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoio/coresformas.jpg")));
        coresformas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(coresformas);
        coresformas.setBounds(750, 250, 15, 15);

        computador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoio/computador.jpg")));
        computador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(computador);
        computador.setBounds(750, 270, 15, 15);

        planeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoio/planeta.jpg")));
        planeta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(planeta);
        planeta.setBounds(750, 90, 15, 15);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800, 600);
    }                        

    private void avancatelaMouseExited(java.awt.event.MouseEvent evt) {                                       
        avancatela.setBackground(new java.awt.Color(204,204,204));
    }                                      

    private void telainicialMouseExited(java.awt.event.MouseEvent evt) {                                        
        telainicial.setBackground(new java.awt.Color(204,204,204));
    }                                       

    private void voltatelaMouseExited(java.awt.event.MouseEvent evt) {                                      
        voltatela.setBackground(new java.awt.Color(204,204,204));
    }                                     

    public void mudatela(){
        while (tela<=9){
            
            if (tela==0){
                des=planeta.getIcon();
                quadro.setIcon(des);
                textoestoria.setText("    Eu sou de um planeta muito distante, chamado Retin�ide. � bem parecido com a Terra. Gosto muito daqui. Mas, resolvi fazer esta visitinha ao seu planeta, para que todos  conhe�am um pouquinho mais sobre os m�todos de Estimula��o Visual que nossa alta tecnologia inventou.");
                break;
            }
            
            if (tela==1){
                des=maezoio.getIcon();
                quadro.setIcon(des);
                textoestoria.setText("\n\n    Essa � a minha mam�e. Ela � professora. \n\n    Eu a admiro muito, pois dar aulas e saber ensinar � realmente um dom de Deus!");
                break;
            }
            
            if (tela==2){
                des=paizoio.getIcon();
                quadro.setIcon(des);
                textoestoria.setText("\n\n    Esse � o meu papai. � um grande empres�rio.\n\n    Ele � o meu grande amigo para todas as horas, um grande companheiro!");
                break;
            }
            
            if (tela==3){
                des=zoiobebe.getIcon();
                quadro.setIcon(des);
                textoestoria.setText("\n\n    Eu nasci no ano de 10010. E, hoje j� tenho 4 aninhos.\n\n    Esse a� do lado sou eu, quando ainda era beb�.\n\n    Voc� me acha fofinho? ");
                break;
            }
            
            if (tela==4){
                des=criancas.getIcon();
                quadro.setIcon(des);
                textoestoria.setText("    Eu tenho uma defici�ncia visual chamada Kortrokada. A� no planeta Terra, chamam isso de Daltonismo.\n    Na verdade, todos aqui em Retin�ide nascem com esta defici�ncia. Por isso � que aqui temos os melhores m�todos de estimula��o visual, que quero mostrar a todos voc�s do Planeta Terra.");
                break;
            }
            
            if (tela==5){
                des=escolazoio.getIcon();
                quadro.setIcon(des);
                textoestoria.setText("    Duas vezes por semana eu freq��nto uma escola especializada no tratamento de doen�as visuais. Eu gosto muito de l�.\n    N�s aprendemos tudo, de uma maneira divertida e alegre. Fazemos tudo brincando!");
                break;
            }
            
            if (tela==6){
                des=pontos.getIcon();
                quadro.setIcon(des);
                textoestoria.setText("    Eu estou falando de estimula��o visual desde que a est�rinha come�ou. Mas voc� sabe o que �?\n    N�o?!\n    Ah! N�o tem problema, eu vou te ensinar!");
                break;
            }
            
            if (tela==7){
                des=coresformas.getIcon();
                quadro.setIcon(des);
                textoestoria.setText("    A estimula��o visual, aproveita ao m�ximo o pouquinho de vis�o que temos. J� que n�o temos um desenvolvimento visual natural, � necess�rio que algu�m nos ensine a reconhecer as diferentes formas, tamanhos e cores.");    
                break;
            }
            
            if (tela==8){
                des=computador.getIcon();
                quadro.setIcon(des);
                textoestoria.setText("    V�rios m�todos podem ser usados para que isso aconte�a. Mas eu gosto mesmo � de brincar! Ent�o eu trouxe para as crian�as terrestres, os jogos para computador que desenvolveram aqui em Retin�ide. Eles trabalham com alguns m�todos de estimula��o e s�o Super Legais! Espero que voc�s aproveitem!");    
                break;
            }            
            
            if (tela==9){
                des=familiazoio.getIcon();
                quadro.setIcon(des);
                textoestoria.setText("    Esse � um pedacinho da minha vida. Para quem quiser me conhecer melhor, ou fazer uma visitinha ao meu planeta, � s� dar uma perguntadinha para o pessoal do CEFET de Corn�lio Proc�pio, que eles tem o meu endere�o, telefone e e-mail. Estou esperando voc� para a gente brincar.\n Tchauzinho...");
                break;
            }
        }
    }
    
    private void voltatelaMouseClicked(java.awt.event.MouseEvent evt) {                                       
        tela=tela-1;
        if (tela<=0)
            tela=0;
        mudatela();
    }                                      

    private void telainicialMouseClicked(java.awt.event.MouseEvent evt) {                                         
        Musica.stop();
        
        Inicial ini=new Inicial();
        ini.setVisible(true);
        this.setVisible(false);
    }                                        

    private void avancatelaMousePressed(java.awt.event.MouseEvent evt) {                                        
        avancatela.setBackground(new java.awt.Color(102,204,0));
    }                                       

    private void telainicialMousePressed(java.awt.event.MouseEvent evt) {                                         
        telainicial.setBackground(new java.awt.Color(102,204,0));
    }                                        

    private void voltatelaMousePressed(java.awt.event.MouseEvent evt) {                                       
        voltatela.setBackground(new java.awt.Color(102,204,0));
    }                                      

    private void avancatelaMouseMoved(java.awt.event.MouseEvent evt) {                                      
        avancatela.setBackground(new java.awt.Color(255,255,102));
    }                                     

    private void avancatelaMouseClicked(java.awt.event.MouseEvent evt) {                                        
        tela=tela+1;
        if (tela>=10)
            tela=9;
        mudatela();
    }                                       

    private void telainicialMouseMoved(java.awt.event.MouseEvent evt) {                                       
        telainicial.setBackground(new java.awt.Color(255,255,102));
    }                                      

    private void voltatelaMouseMoved(java.awt.event.MouseEvent evt) {                                     
        voltatela.setBackground(new java.awt.Color(255,255,102));
    }                                    
    
 
    private void exitForm(java.awt.event.WindowEvent evt) {                          
        Musica.stop();
        
        Inicial ini=new Inicial();
        ini.setVisible(true);
        this.setVisible(false);
    }                         
    
  
    public static void main(String args[]) {
        new Zoio1().show();
    }
    
    public Component add(Component comp) {
        Component retValue;
        if (comp.getName() == null){
            retValue = super.Fundo.add(comp);
        }else{
            retValue = super.add(comp);
            
        }
        return retValue;
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JLabel avancatela;
    private javax.swing.JLabel computador;
    private javax.swing.JLabel coresformas;
    private javax.swing.JLabel criancas;
    private javax.swing.JLabel escolazoio;
    private javax.swing.JLabel familiazoio;
    private javax.swing.JLabel maezoio;
    private javax.swing.JLabel paizoio;
    private javax.swing.JLabel planeta;
    private javax.swing.JLabel pontos;
    private javax.swing.JLabel quadro;
    private javax.swing.JLabel telainicial;
    public javax.swing.JTextPane textoestoria;
    private javax.swing.JLabel voltatela;
    private javax.swing.JLabel zoiobebe;
    // End of variables declaration                   
    
}

