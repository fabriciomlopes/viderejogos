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
            System.out.println("Caminho do áudio não especificado! "+erro);
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

        maezoio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoio/maezoio.jpg")));
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

        criancas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoio/criancas.jpg")));
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
                textoestoria.setText("    Eu sou de um planeta muito distante, chamado Retinóide. É bem parecido com a Terra. Gosto muito daqui. Mas, resolvi fazer esta visitinha ao seu planeta, para que todos  conheçam um pouquinho mais sobre os métodos de Estimulação Visual que nossa alta tecnologia inventou.");
                break;
            }
            
            if (tela==1){
                des=maezoio.getIcon();
                quadro.setIcon(des);
                textoestoria.setText("\n\n    Essa é a minha mamãe. Ela é professora. \n\n    Eu a admiro muito, pois dar aulas e saber ensinar é realmente um dom de Deus!");
                break;
            }
            
            if (tela==2){
                des=paizoio.getIcon();
                quadro.setIcon(des);
                textoestoria.setText("\n\n    Esse é o meu papai. É um grande empresário.\n\n    Ele é o meu grande amigo para todas as horas, um grande companheiro!");
                break;
            }
            
            if (tela==3){
                des=zoiobebe.getIcon();
                quadro.setIcon(des);
                textoestoria.setText("\n\n    Eu nasci no ano de 10010. E, hoje já tenho 4 aninhos.\n\n    Esse aí do lado sou eu, quando ainda era bebê.\n\n    você me acha fofinho? ");
                break;
            }
            
            if (tela==4){
                des=criancas.getIcon();
                quadro.setIcon(des);
                textoestoria.setText("    Eu tenho uma deficiência visual chamada Kortrokada. Aí no planeta Terra, chamam isso de Daltonismo.\n    Na verdade, todos aqui em Retinóide nascem com esta deficiência. Por isso é que aqui temos os melhores métodos de estimulação visual, que quero mostrar a todos vocês do Planeta Terra.");
                break;
            }
            
            if (tela==5){
                des=escolazoio.getIcon();
                quadro.setIcon(des);
                textoestoria.setText("    Duas vezes por semana eu frequento uma escola especializada no tratamento de doenças visuais. Eu gosto muito de lá.\n    Nós aprendemos tudo, de uma maneira divertida e alegre. Fazemos tudo brincando!");
                break;
            }
            
            if (tela==6){
                des=pontos.getIcon();
                quadro.setIcon(des);
                textoestoria.setText("    Eu estou falando de estimulação visual desde que a estorinha começou. Mas você sabe o que é?\n    Não?!\n    Ah! Não tem problema, eu vou te ensinar!");
                break;
            }
            
            if (tela==7){
                des=coresformas.getIcon();
                quadro.setIcon(des);
                textoestoria.setText("    A estimulação visual, aproveita ao máximo o pouquinho de visão que temos. Já que não temos um desenvolvimento visual natural, é necessário que alguém nos ensine a reconhecer as diferentes formas, tamanhos e cores.");    
                break;
            }
            
            if (tela==8){
                des=computador.getIcon();
                quadro.setIcon(des);
                textoestoria.setText("    Vários métodos podem ser usados para que isso aconteça. Mas eu gosto mesmo é de brincar! Então eu trouxe para as crianças terrestres, os jogos para computador que desenvolveram aqui em Retinóide. Eles trabalham com alguns métodos de estimulação e são Super Legais! Espero que vocês aproveitem!");    
                break;
            }            
            
            if (tela==9){
                des=familiazoio.getIcon();
                quadro.setIcon(des);
                textoestoria.setText("    Esse é um pedacinho da minha vida. Para quem quiser me conhecer melhor, ou fazer uma visitinha ao meu planeta, é só dar uma perguntadinha para o pessoal do CEFET de Cornélio Procópio, que eles tem o meu endereço, telefone e e-mail. Estou esperando você para a gente brincar.\n Tchauzinho...");
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

//		Musica.stop();
//
//        Inicial ini=new Inicial();
//        ini.setVisible(true);
//        this.setVisible(false);
		VoltarMenu();
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
//        Musica.stop();
//
//        Inicial ini=new Inicial();
//        ini.setVisible(true);
//        this.setVisible(false);
		VoltarMenu();
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

