package GUI;
import javax.swing.*;

public class MatrizFigura extends TelaJogo {
    private Icon img=null,id=null, m1,m2,m3,m4,c1,c2,c3,c4,f1,f2,f3,f4;
    
    public MatrizFigura() {
        initComponents();
        
//        try{
//            URL som= new URL((getClass().getResource("/sons/charliebrown.mid")).toString());
//            Musica = java.applet.Applet.newAudioClip(som);
//            Musica.loop();
//        }catch(MalformedURLException erro){
//            System.out.println("Caminho do áudio não especificado! "+erro);
//        }
    }

	@Override
	protected String GetAudioName() {
		return "charliebrown";
	}
	
    private void initComponents() {//GEN-BEGIN:initComponents
        Aviao2 = new javax.swing.JLabel();
        Celular4 = new javax.swing.JLabel();
        Televisao = new javax.swing.JLabel();
        SapoJpg = new javax.swing.JLabel();
        Cachorro7 = new javax.swing.JLabel();
        Livro2 = new javax.swing.JLabel();
        Carro16 = new javax.swing.JLabel();
        Peixe2 = new javax.swing.JLabel();
        Blusinha2 = new javax.swing.JLabel();
        Flor4 = new javax.swing.JLabel();
        Carro5 = new javax.swing.JLabel();
        Tambor1 = new javax.swing.JLabel();
        Televisao4 = new javax.swing.JLabel();
        Caneta2 = new javax.swing.JLabel();
        Mulher1 = new javax.swing.JLabel();
        Blusa9 = new javax.swing.JLabel();
        Aviao3 = new javax.swing.JLabel();
        Celular5 = new javax.swing.JLabel();
        Televisao2 = new javax.swing.JLabel();
        Sapo1 = new javax.swing.JLabel();
        Cachorro9 = new javax.swing.JLabel();
        Livro5 = new javax.swing.JLabel();
        Blusa1 = new javax.swing.JLabel();
        Peixe4 = new javax.swing.JLabel();
        Blusinha3 = new javax.swing.JLabel();
        Flor5 = new javax.swing.JLabel();
        Celular2 = new javax.swing.JLabel();
        Tambor2 = new javax.swing.JLabel();
        SapoGif = new javax.swing.JLabel();
        Caneta4 = new javax.swing.JLabel();
        Blusinha = new javax.swing.JLabel();
        Mulher2 = new javax.swing.JLabel();
        Aviao5 = new javax.swing.JLabel();
        Celular9 = new javax.swing.JLabel();
        Televisao3 = new javax.swing.JLabel();
        Sapo3 = new javax.swing.JLabel();
        Caneta = new javax.swing.JLabel();
        Livro7 = new javax.swing.JLabel();
        Blusa4 = new javax.swing.JLabel();
        Peixe5 = new javax.swing.JLabel();
        Cachorro1 = new javax.swing.JLabel();
        Flor6 = new javax.swing.JLabel();
        Tambor3 = new javax.swing.JLabel();
        Cachorro6 = new javax.swing.JLabel();
        Livro1 = new javax.swing.JLabel();
        Carro14 = new javax.swing.JLabel();
        Mulher4 = new javax.swing.JLabel();
        Blusinha1 = new javax.swing.JLabel();
        Aviao6 = new javax.swing.JLabel();
        Flor2 = new javax.swing.JLabel();
        Carro22 = new javax.swing.JLabel();
        Tambor = new javax.swing.JLabel();
        Caneta1 = new javax.swing.JLabel();
        Mulher = new javax.swing.JLabel();
        Blusa8 = new javax.swing.JLabel();
        Peixe7 = new javax.swing.JLabel();
        Figura1 = new javax.swing.JLabel();
        Figura2 = new javax.swing.JLabel();
        Figura3 = new javax.swing.JLabel();
        Figura4 = new javax.swing.JLabel();
        Clique1 = new javax.swing.JLabel();
        Clique2 = new javax.swing.JLabel();
        Clique3 = new javax.swing.JLabel();
        Clique4 = new javax.swing.JLabel();
        Ajuda = new javax.swing.JButton();
        Televisao3G = new javax.swing.JLabel();
        Televisao4G = new javax.swing.JLabel();
        Blusa1G = new javax.swing.JLabel();
        Blusa2G = new javax.swing.JLabel();
        Blusa3G = new javax.swing.JLabel();
        Blusa4G = new javax.swing.JLabel();
        Blusinha1G = new javax.swing.JLabel();
        Blusinha2G = new javax.swing.JLabel();
        Blusinha3G = new javax.swing.JLabel();
        Blusinha4G = new javax.swing.JLabel();
        Cachorro1G = new javax.swing.JLabel();
        Cachorro2G = new javax.swing.JLabel();
        Cachorro3G = new javax.swing.JLabel();
        Cachorro4G = new javax.swing.JLabel();
        Caneta1G = new javax.swing.JLabel();
        Caneta2G = new javax.swing.JLabel();
        Caneta3G = new javax.swing.JLabel();
        Caneta4G = new javax.swing.JLabel();
        Carro1G = new javax.swing.JLabel();
        Carro2G = new javax.swing.JLabel();
        Carro3G = new javax.swing.JLabel();
        Carro4G = new javax.swing.JLabel();
        Celular1G = new javax.swing.JLabel();
        Celular2G = new javax.swing.JLabel();
        Celular3G = new javax.swing.JLabel();
        Celular4G = new javax.swing.JLabel();
        Flor1G = new javax.swing.JLabel();
        Flor2G = new javax.swing.JLabel();
        Flor3G = new javax.swing.JLabel();
        Flor4G = new javax.swing.JLabel();
        Livro1G = new javax.swing.JLabel();
        Livro2G = new javax.swing.JLabel();
        Livro3G = new javax.swing.JLabel();
        Livro4G = new javax.swing.JLabel();
        Mulher1G = new javax.swing.JLabel();
        Mulher2G = new javax.swing.JLabel();
        Mulher3G = new javax.swing.JLabel();
        Mulher4G = new javax.swing.JLabel();
        Peixe1G = new javax.swing.JLabel();
        Peixe2G = new javax.swing.JLabel();
        Peixe3G = new javax.swing.JLabel();
        Peixe4G = new javax.swing.JLabel();
        Sapo1G = new javax.swing.JLabel();
        Sapo2G = new javax.swing.JLabel();
        Sapo3G = new javax.swing.JLabel();
        Sapo4G = new javax.swing.JLabel();
        Tambor1G = new javax.swing.JLabel();
        Tambor2G = new javax.swing.JLabel();
        Tambor3G = new javax.swing.JLabel();
        Tambor4G = new javax.swing.JLabel();
        Televisao1G = new javax.swing.JLabel();
        Televisao2G = new javax.swing.JLabel();
        Aviao1G = new javax.swing.JLabel();
        Aviao2G = new javax.swing.JLabel();
        Aviao3G = new javax.swing.JLabel();
        Aviao4G = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setTitle("Matriz de Figuras1");
        Aviao2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Aviao2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de aviao2.jpg")));
        Aviao2.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Aviao2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Aviao2MouseClicked(evt);
            }
        });

        add(Aviao2);
        Aviao2.setBounds(50, 70, 50, 50);

        Celular4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Celular4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de celular4.jpg")));
        Celular4.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Celular4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Celular4MouseClicked(evt);
            }
        });

        add(Celular4);
        Celular4.setBounds(100, 70, 50, 50);

        Televisao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Televisao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de televisao.jpg")));
        Televisao.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Televisao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TelevisaoMouseClicked(evt);
            }
        });

        add(Televisao);
        Televisao.setBounds(150, 70, 50, 50);

        SapoJpg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SapoJpg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de sapo.jpg")));
        SapoJpg.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        SapoJpg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SapoJpgMouseClicked(evt);
            }
        });

        add(SapoJpg);
        SapoJpg.setBounds(200, 70, 50, 50);

        Cachorro7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cachorro7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de cachorro7.jpg")));
        Cachorro7.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Cachorro7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cachorro7MouseClicked(evt);
            }
        });

        add(Cachorro7);
        Cachorro7.setBounds(250, 70, 50, 50);

        Livro2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Livro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de livro2.jpg")));
        Livro2.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Livro2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Livro2MouseClicked(evt);
            }
        });

        add(Livro2);
        Livro2.setBounds(300, 70, 50, 50);

        Carro16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Carro16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de carro16.jpg")));
        Carro16.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Carro16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Carro16MouseClicked(evt);
            }
        });

        add(Carro16);
        Carro16.setBounds(350, 70, 50, 50);

        Peixe2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Peixe2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de peixe2.jpg")));
        Peixe2.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Peixe2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Peixe2MouseClicked(evt);
            }
        });

        add(Peixe2);
        Peixe2.setBounds(400, 70, 50, 50);

        Blusinha2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Blusinha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de blusinha2.jpg")));
        Blusinha2.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Blusinha2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Blusinha2MouseClicked(evt);
            }
        });

        add(Blusinha2);
        Blusinha2.setBounds(450, 70, 50, 50);

        Flor4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Flor4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de flor4.jpg")));
        Flor4.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Flor4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Flor4MouseClicked(evt);
            }
        });

        add(Flor4);
        Flor4.setBounds(500, 70, 50, 50);

        Carro5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Carro5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de carro5.jpg")));
        Carro5.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Carro5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Carro5MouseClicked(evt);
            }
        });

        add(Carro5);
        Carro5.setBounds(550, 70, 50, 50);

        Tambor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tambor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de tambor1.jpg")));
        Tambor1.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Tambor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tambor1MouseClicked(evt);
            }
        });

        add(Tambor1);
        Tambor1.setBounds(600, 70, 50, 50);

        Televisao4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Televisao4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de televisao4.jpg")));
        Televisao4.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Televisao4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Televisao4MouseClicked(evt);
            }
        });

        add(Televisao4);
        Televisao4.setBounds(650, 70, 50, 50);

        Caneta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Caneta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de caneta2.jpg")));
        Caneta2.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Caneta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Caneta2MouseClicked(evt);
            }
        });

        add(Caneta2);
        Caneta2.setBounds(700, 70, 50, 50);

        Mulher1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mulher1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de mulher1.jpg")));
        Mulher1.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Mulher1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mulher1MouseClicked(evt);
            }
        });

        add(Mulher1);
        Mulher1.setBounds(50, 120, 50, 50);

        Blusa9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Blusa9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de blusa9.jpg")));
        Blusa9.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Blusa9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Blusa9MouseClicked(evt);
            }
        });

        add(Blusa9);
        Blusa9.setBounds(100, 120, 50, 50);

        Aviao3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Aviao3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de aviao3.jpg")));
        Aviao3.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Aviao3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Aviao3MouseClicked(evt);
            }
        });

        add(Aviao3);
        Aviao3.setBounds(150, 120, 50, 50);

        Celular5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Celular5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de celular5.jpg")));
        Celular5.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Celular5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Celular5MouseClicked(evt);
            }
        });

        add(Celular5);
        Celular5.setBounds(200, 120, 50, 50);

        Televisao2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Televisao2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de televisao2.jpg")));
        Televisao2.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Televisao2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Televisao2MouseClicked(evt);
            }
        });

        add(Televisao2);
        Televisao2.setBounds(250, 120, 50, 50);

        Sapo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sapo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de sapo1.jpg")));
        Sapo1.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Sapo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sapo1MouseClicked(evt);
            }
        });

        add(Sapo1);
        Sapo1.setBounds(300, 120, 50, 50);

        Cachorro9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cachorro9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de cachorro9.jpg")));
        Cachorro9.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Cachorro9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cachorro9MouseClicked(evt);
            }
        });

        add(Cachorro9);
        Cachorro9.setBounds(350, 120, 50, 50);

        Livro5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Livro5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de livro5.jpg")));
        Livro5.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Livro5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Livro5MouseClicked(evt);
            }
        });

        add(Livro5);
        Livro5.setBounds(400, 120, 50, 50);

        Blusa1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Blusa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de blusa1.jpg")));
        Blusa1.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Blusa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Blusa1MouseClicked(evt);
            }
        });

        add(Blusa1);
        Blusa1.setBounds(450, 120, 50, 50);

        Peixe4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Peixe4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de peixe4.jpg")));
        Peixe4.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Peixe4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Peixe4MouseClicked(evt);
            }
        });

        add(Peixe4);
        Peixe4.setBounds(500, 120, 50, 50);

        Blusinha3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Blusinha3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de blusinha3.jpg")));
        Blusinha3.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Blusinha3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Blusinha3MouseClicked(evt);
            }
        });

        add(Blusinha3);
        Blusinha3.setBounds(550, 120, 50, 50);

        Flor5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Flor5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de flor5.jpg")));
        Flor5.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Flor5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Flor5MouseClicked(evt);
            }
        });

        add(Flor5);
        Flor5.setBounds(600, 120, 50, 50);

        Celular2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Celular2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de celular2.jpg")));
        Celular2.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Celular2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Celular2MouseClicked(evt);
            }
        });

        add(Celular2);
        Celular2.setBounds(650, 120, 50, 50);

        Tambor2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tambor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de tambor2.jpg")));
        Tambor2.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Tambor2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tambor2MouseClicked(evt);
            }
        });

        add(Tambor2);
        Tambor2.setBounds(700, 120, 50, 50);

        SapoGif.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SapoGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de sapo.gif")));
        SapoGif.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        SapoGif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SapoGifMouseClicked(evt);
            }
        });

        add(SapoGif);
        SapoGif.setBounds(50, 170, 50, 50);

        Caneta4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Caneta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de caneta4.jpg")));
        Caneta4.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Caneta4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Caneta4MouseClicked(evt);
            }
        });

        add(Caneta4);
        Caneta4.setBounds(100, 170, 50, 50);

        Blusinha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Blusinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de blusinha.jpg")));
        Blusinha.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Blusinha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BlusinhaMouseClicked(evt);
            }
        });

        add(Blusinha);
        Blusinha.setBounds(150, 170, 50, 50);

        Mulher2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mulher2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de mulher2.jpg")));
        Mulher2.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Mulher2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mulher2MouseClicked(evt);
            }
        });

        add(Mulher2);
        Mulher2.setBounds(200, 170, 50, 50);

        Aviao5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Aviao5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de aviao5.jpg")));
        Aviao5.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Aviao5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Aviao5MouseClicked(evt);
            }
        });

        add(Aviao5);
        Aviao5.setBounds(250, 170, 50, 50);

        Celular9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Celular9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de celular9.jpg")));
        Celular9.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Celular9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Celular9MouseClicked(evt);
            }
        });

        add(Celular9);
        Celular9.setBounds(300, 170, 50, 50);

        Televisao3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Televisao3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de televisao3.jpg")));
        Televisao3.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Televisao3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Televisao3MouseClicked(evt);
            }
        });

        add(Televisao3);
        Televisao3.setBounds(350, 170, 50, 50);

        Sapo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sapo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de sapo3.jpg")));
        Sapo3.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Sapo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sapo3MouseClicked(evt);
            }
        });

        add(Sapo3);
        Sapo3.setBounds(400, 170, 50, 50);

        Caneta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Caneta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de caneta.jpg")));
        Caneta.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Caneta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CanetaMouseClicked(evt);
            }
        });

        add(Caneta);
        Caneta.setBounds(450, 170, 50, 50);

        Livro7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Livro7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de livro7.jpg")));
        Livro7.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Livro7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Livro7MouseClicked(evt);
            }
        });

        add(Livro7);
        Livro7.setBounds(500, 170, 50, 50);

        Blusa4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Blusa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de blusa4.jpg")));
        Blusa4.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Blusa4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Blusa4MouseClicked(evt);
            }
        });

        add(Blusa4);
        Blusa4.setBounds(550, 170, 50, 50);

        Peixe5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Peixe5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de peixe5.jpg")));
        Peixe5.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Peixe5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Peixe5MouseClicked(evt);
            }
        });

        add(Peixe5);
        Peixe5.setBounds(600, 170, 50, 50);

        Cachorro1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cachorro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de cachorro1.gif")));
        Cachorro1.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Cachorro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cachorro1MouseClicked(evt);
            }
        });

        add(Cachorro1);
        Cachorro1.setBounds(650, 170, 50, 50);

        Flor6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Flor6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de flor6.jpg")));
        Flor6.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Flor6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Flor6MouseClicked(evt);
            }
        });

        add(Flor6);
        Flor6.setBounds(700, 170, 50, 50);

        Tambor3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tambor3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de tambor3.jpg")));
        Tambor3.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Tambor3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tambor3MouseClicked(evt);
            }
        });

        add(Tambor3);
        Tambor3.setBounds(50, 220, 50, 50);

        Cachorro6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cachorro6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de cachorro6.jpg")));
        Cachorro6.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Cachorro6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cachorro6MouseClicked(evt);
            }
        });

        add(Cachorro6);
        Cachorro6.setBounds(100, 220, 50, 50);

        Livro1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Livro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de livro1.jpg")));
        Livro1.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Livro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Livro1MouseClicked(evt);
            }
        });

        add(Livro1);
        Livro1.setBounds(150, 220, 50, 50);

        Carro14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Carro14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de carro14.jpg")));
        Carro14.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Carro14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Carro14MouseClicked(evt);
            }
        });

        add(Carro14);
        Carro14.setBounds(200, 220, 50, 50);

        Mulher4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mulher4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de mulher4.jpg")));
        Mulher4.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Mulher4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mulher4MouseClicked(evt);
            }
        });

        add(Mulher4);
        Mulher4.setBounds(250, 220, 50, 50);

        Blusinha1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Blusinha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de blusinha1.jpg")));
        Blusinha1.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Blusinha1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Blusinha1MouseClicked(evt);
            }
        });

        add(Blusinha1);
        Blusinha1.setBounds(300, 220, 50, 50);

        Aviao6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Aviao6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de aviao6.jpg")));
        Aviao6.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Aviao6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Aviao6MouseClicked(evt);
            }
        });

        add(Aviao6);
        Aviao6.setBounds(350, 220, 50, 50);

        Flor2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Flor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de flor2.jpg")));
        Flor2.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Flor2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Flor2MouseClicked(evt);
            }
        });

        add(Flor2);
        Flor2.setBounds(400, 220, 50, 50);

        Carro22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Carro22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de carro22.jpg")));
        Carro22.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Carro22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Carro22MouseClicked(evt);
            }
        });

        add(Carro22);
        Carro22.setBounds(450, 220, 50, 50);

        Tambor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tambor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de tambor.jpg")));
        Tambor.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Tambor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TamborMouseClicked(evt);
            }
        });

        add(Tambor);
        Tambor.setBounds(500, 220, 50, 50);

        Caneta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Caneta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de caneta1.jpg")));
        Caneta1.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Caneta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Caneta1MouseClicked(evt);
            }
        });

        add(Caneta1);
        Caneta1.setBounds(550, 220, 50, 50);

        Mulher.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mulher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de mulher.jpg")));
        Mulher.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Mulher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MulherMouseClicked(evt);
            }
        });

        add(Mulher);
        Mulher.setBounds(600, 220, 50, 50);

        Blusa8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Blusa8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de blusa8.jpg")));
        Blusa8.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Blusa8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Blusa8MouseClicked(evt);
            }
        });

        add(Blusa8);
        Blusa8.setBounds(650, 220, 50, 50);

        Peixe7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Peixe7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/pequenas/Copia de peixe7.jpg")));
        Peixe7.setToolTipText("clique em cima da figura para selecion\u00e1-la");
        Peixe7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Peixe7MouseClicked(evt);
            }
        });

        add(Peixe7);
        Peixe7.setBounds(700, 220, 50, 50);

        Figura1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/aviao2.jpg")));
        add(Figura1);
        Figura1.setBounds(190, 320, 70, 70);

        Figura2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/aviao3.jpg")));
        add(Figura2);
        Figura2.setBounds(300, 320, 70, 70);

        Figura3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/aviao5.jpg")));
        add(Figura3);
        Figura3.setBounds(420, 320, 70, 70);

        Figura4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/aviao6.jpg")));
        add(Figura4);
        Figura4.setBounds(530, 320, 70, 70);

        Clique1.setBackground(new java.awt.Color(255, 255, 255));
        Clique1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        Clique1.setOpaque(true);
        add(Clique1);
        Clique1.setBounds(190, 400, 70, 70);

        Clique2.setBackground(new java.awt.Color(255, 255, 255));
        Clique2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        Clique2.setOpaque(true);
        add(Clique2);
        Clique2.setBounds(300, 400, 70, 70);

        Clique3.setBackground(new java.awt.Color(255, 255, 255));
        Clique3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        Clique3.setOpaque(true);
        add(Clique3);
        Clique3.setBounds(420, 400, 70, 70);

        Clique4.setBackground(new java.awt.Color(255, 255, 255));
        Clique4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        Clique4.setOpaque(true);
        add(Clique4);
        Clique4.setBounds(530, 400, 70, 70);

        Ajuda.setBackground(new java.awt.Color(244, 244, 246));
        Ajuda.setFont(new java.awt.Font("Comic Sans MS", 1, 30));
        Ajuda.setForeground(new java.awt.Color(255, 0, 0));
        Ajuda.setText("AJUDA");
        Ajuda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
        Ajuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AjudaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AjudaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AjudaMousePressed(evt);
            }
        });
        Ajuda.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AjudaMouseMoved(evt);
            }
        });

        add(Ajuda);
        Ajuda.setBounds(26, 518, 230, 50);

        Televisao3G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/televisao3.jpg")));
        Televisao3G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Televisao3G);
        Televisao3G.setBounds(170, 520, 10, 10);

        Televisao4G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/televisao4.jpg")));
        Televisao4G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Televisao4G);
        Televisao4G.setBounds(170, 520, 10, 10);

        Blusa1G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/blusa1.jpg")));
        Blusa1G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Blusa1G);
        Blusa1G.setBounds(170, 520, 10, 10);

        Blusa2G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/blusa4.jpg")));
        Blusa2G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Blusa2G);
        Blusa2G.setBounds(170, 520, 10, 10);

        Blusa3G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/blusa8.jpg")));
        Blusa3G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Blusa3G);
        Blusa3G.setBounds(170, 520, 10, 10);

        Blusa4G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/blusa9.jpg")));
        Blusa4G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Blusa4G);
        Blusa4G.setBounds(170, 520, 10, 10);

        Blusinha1G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/blusinha.jpg")));
        Blusinha1G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Blusinha1G);
        Blusinha1G.setBounds(170, 520, 10, 10);

        Blusinha2G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/blusinha1.jpg")));
        Blusinha2G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Blusinha2G);
        Blusinha2G.setBounds(170, 520, 10, 10);

        Blusinha3G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/blusinha2.jpg")));
        Blusinha3G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Blusinha3G);
        Blusinha3G.setBounds(170, 520, 10, 10);

        Blusinha4G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/blusinha3.jpg")));
        Blusinha4G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Blusinha4G);
        Blusinha4G.setBounds(170, 520, 10, 10);

        Cachorro1G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/cachorro1.gif")));
        Cachorro1G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Cachorro1G);
        Cachorro1G.setBounds(170, 520, 10, 10);

        Cachorro2G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/cachorro6.jpg")));
        Cachorro2G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Cachorro2G);
        Cachorro2G.setBounds(170, 520, 10, 10);

        Cachorro3G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/cachorro7.jpg")));
        Cachorro3G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Cachorro3G);
        Cachorro3G.setBounds(170, 520, 10, 10);

        Cachorro4G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/cachorro9.jpg")));
        Cachorro4G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Cachorro4G);
        Cachorro4G.setBounds(170, 520, 10, 10);

        Caneta1G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/caneta.jpg")));
        Caneta1G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Caneta1G);
        Caneta1G.setBounds(170, 520, 10, 10);

        Caneta2G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/caneta1.jpg")));
        Caneta2G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Caneta2G);
        Caneta2G.setBounds(170, 520, 10, 10);

        Caneta3G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/caneta2.jpg")));
        Caneta3G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Caneta3G);
        Caneta3G.setBounds(170, 520, 10, 10);

        Caneta4G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/caneta4.jpg")));
        Caneta4G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Caneta4G);
        Caneta4G.setBounds(170, 520, 10, 10);

        Carro1G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/carro14.jpg")));
        Carro1G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Carro1G);
        Carro1G.setBounds(170, 520, 10, 10);

        Carro2G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/carro16.jpg")));
        Carro2G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Carro2G);
        Carro2G.setBounds(170, 520, 10, 10);

        Carro3G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/carro22.jpg")));
        Carro3G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Carro3G);
        Carro3G.setBounds(170, 520, 10, 10);

        Carro4G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/carro5.jpg")));
        Carro4G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Carro4G);
        Carro4G.setBounds(170, 520, 10, 10);

        Celular1G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/celular2.jpg")));
        Celular1G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Celular1G);
        Celular1G.setBounds(170, 520, 10, 10);

        Celular2G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/celular4.jpg")));
        Celular2G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Celular2G);
        Celular2G.setBounds(170, 520, 10, 10);

        Celular3G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/celular5.jpg")));
        Celular3G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Celular3G);
        Celular3G.setBounds(170, 520, 10, 10);

        Celular4G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/celular9.jpg")));
        Celular4G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Celular4G);
        Celular4G.setBounds(170, 520, 10, 10);

        Flor1G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/flor2.jpg")));
        Flor1G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Flor1G);
        Flor1G.setBounds(170, 520, 10, 10);

        Flor2G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/flor4.jpg")));
        Flor2G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Flor2G);
        Flor2G.setBounds(170, 520, 10, 10);

        Flor3G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/flor5.jpg")));
        Flor3G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Flor3G);
        Flor3G.setBounds(170, 520, 10, 10);

        Flor4G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/flor6.jpg")));
        Flor4G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Flor4G);
        Flor4G.setBounds(170, 520, 10, 10);

        Livro1G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/livro1.jpg")));
        Livro1G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Livro1G);
        Livro1G.setBounds(170, 520, 10, 10);

        Livro2G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/livro2.jpg")));
        Livro2G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Livro2G);
        Livro2G.setBounds(170, 520, 10, 10);

        Livro3G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/livro5.jpg")));
        Livro3G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Livro3G);
        Livro3G.setBounds(170, 520, 10, 10);

        Livro4G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/livro7.jpg")));
        Livro4G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Livro4G);
        Livro4G.setBounds(170, 520, 10, 10);

        Mulher1G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/mulher.jpg")));
        Mulher1G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Mulher1G);
        Mulher1G.setBounds(170, 520, 10, 10);

        Mulher2G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/mulher1.jpg")));
        Mulher2G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Mulher2G);
        Mulher2G.setBounds(170, 520, 10, 10);

        Mulher3G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/mulher2.jpg")));
        Mulher3G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Mulher3G);
        Mulher3G.setBounds(170, 520, 10, 10);

        Mulher4G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/mulher4.jpg")));
        Mulher4G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Mulher4G);
        Mulher4G.setBounds(170, 520, 10, 10);

        Peixe1G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/peixe2.jpg")));
        Peixe1G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Peixe1G);
        Peixe1G.setBounds(170, 520, 10, 10);

        Peixe2G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/peixe4.jpg")));
        Peixe2G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Peixe2G);
        Peixe2G.setBounds(170, 520, 10, 10);

        Peixe3G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/peixe5.jpg")));
        Peixe3G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Peixe3G);
        Peixe3G.setBounds(170, 520, 10, 10);

        Peixe4G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/peixe7.jpg")));
        Peixe4G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Peixe4G);
        Peixe4G.setBounds(170, 520, 10, 10);

        Sapo1G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/sapo.gif")));
        Sapo1G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Sapo1G);
        Sapo1G.setBounds(170, 520, 10, 10);

        Sapo2G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/sapo.jpg")));
        Sapo2G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Sapo2G);
        Sapo2G.setBounds(170, 520, 10, 10);

        Sapo3G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/sapo1.jpg")));
        Sapo3G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Sapo3G);
        Sapo3G.setBounds(170, 520, 10, 10);

        Sapo4G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/sapo3.jpg")));
        Sapo4G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Sapo4G);
        Sapo4G.setBounds(170, 520, 10, 10);

        Tambor1G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/tambor.jpg")));
        Tambor1G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Tambor1G);
        Tambor1G.setBounds(170, 520, 10, 10);

        Tambor2G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/tambor1.jpg")));
        Tambor2G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Tambor2G);
        Tambor2G.setBounds(170, 520, 10, 10);

        Tambor3G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/tambor2.jpg")));
        Tambor3G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Tambor3G);
        Tambor3G.setBounds(170, 520, 10, 10);

        Tambor4G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/tambor3.jpg")));
        Tambor4G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Tambor4G);
        Tambor4G.setBounds(170, 520, 10, 10);

        Televisao1G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/televisao.jpg")));
        Televisao1G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Televisao1G);
        Televisao1G.setBounds(170, 520, 10, 10);

        Televisao2G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/televisao2.jpg")));
        Televisao2G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Televisao2G);
        Televisao2G.setBounds(170, 520, 10, 10);

        Aviao1G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/aviao2.jpg")));
        Aviao1G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Aviao1G);
        Aviao1G.setBounds(170, 520, 10, 10);

        Aviao2G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/aviao3.jpg")));
        Aviao2G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Aviao2G);
        Aviao2G.setBounds(170, 520, 10, 10);

        Aviao3G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/aviao5.jpg")));
        Aviao3G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Aviao3G);
        Aviao3G.setBounds(170, 520, 10, 10);

        Aviao4G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/matriz/normais/aviao6.jpg")));
        Aviao4G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Aviao4G);
        Aviao4G.setBounds(170, 520, 10, 10);

        jPanel1.setBackground(new java.awt.Color(244, 244, 246));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3));
        add(jPanel1);
        jPanel1.setBounds(40, 60, 720, 220);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4));
        add(jPanel2);
        jPanel2.setBounds(180, 310, 430, 170);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800, 600);
    }//GEN-END:initComponents
    
    private void Peixe7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Peixe7MouseClicked
        img=Peixe4G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Peixe7MouseClicked
    
    private void Blusa8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Blusa8MouseClicked
        img=Blusa3G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Blusa8MouseClicked
    
    private void MulherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MulherMouseClicked
        img=Mulher1G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_MulherMouseClicked
    
    private void Caneta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Caneta1MouseClicked
        img=Caneta2G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Caneta1MouseClicked
    
    private void TamborMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TamborMouseClicked
        img=Tambor1G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_TamborMouseClicked
    
    private void Carro22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Carro22MouseClicked
        img=Carro3G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Carro22MouseClicked
    
    private void Flor2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Flor2MouseClicked
        img=Flor1G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Flor2MouseClicked
    
    private void Aviao6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Aviao6MouseClicked
        img=Aviao4G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Aviao6MouseClicked
    
    private void Blusinha1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Blusinha1MouseClicked
        img=Blusinha2G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Blusinha1MouseClicked
    
    private void Mulher4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mulher4MouseClicked
        img=Mulher4G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Mulher4MouseClicked
    
    private void Carro14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Carro14MouseClicked
        img=Carro1G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Carro14MouseClicked
    
    private void Livro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Livro1MouseClicked
        img=Livro1G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Livro1MouseClicked
    
    private void Cachorro6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cachorro6MouseClicked
        img=Cachorro2G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Cachorro6MouseClicked
    
    private void Tambor3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tambor3MouseClicked
        img=Tambor4G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Tambor3MouseClicked
    
    private void Flor6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Flor6MouseClicked
        img=Flor4G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Flor6MouseClicked
    
    private void Cachorro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cachorro1MouseClicked
        img=Cachorro1G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Cachorro1MouseClicked
    
    private void Peixe5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Peixe5MouseClicked
        img=Peixe3G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Peixe5MouseClicked
    
    private void Blusa4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Blusa4MouseClicked
        img=Blusa2G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Blusa4MouseClicked
    
    private void Livro7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Livro7MouseClicked
        img=Livro4G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Livro7MouseClicked
    
    private void CanetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CanetaMouseClicked
        img=Caneta1G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_CanetaMouseClicked
    
    private void Sapo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sapo3MouseClicked
        img=Sapo4G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Sapo3MouseClicked
    
    private void Televisao3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Televisao3MouseClicked
        img=Televisao3G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Televisao3MouseClicked
    
    private void Celular9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Celular9MouseClicked
        img=Celular4G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Celular9MouseClicked
    
    private void Aviao5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Aviao5MouseClicked
        img=Aviao3G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Aviao5MouseClicked
    
    private void Mulher2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mulher2MouseClicked
        img=Mulher3G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Mulher2MouseClicked
    
    private void BlusinhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BlusinhaMouseClicked
        img=Blusinha1G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_BlusinhaMouseClicked
    
    private void Caneta4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Caneta4MouseClicked
        img=Caneta4G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Caneta4MouseClicked
    
    private void SapoGifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SapoGifMouseClicked
        img=Sapo1G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_SapoGifMouseClicked
    
    private void Tambor2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tambor2MouseClicked
        img=Tambor3G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Tambor2MouseClicked
    
    private void Celular2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Celular2MouseClicked
        img=Celular1G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Celular2MouseClicked
    
    private void Flor5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Flor5MouseClicked
        img=Flor3G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Flor5MouseClicked
    
    private void Blusinha3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Blusinha3MouseClicked
        img=Blusinha4G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Blusinha3MouseClicked
    
    private void Peixe4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Peixe4MouseClicked
        img=Peixe2G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Peixe4MouseClicked
    
    private void Blusa1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Blusa1MouseClicked
        img=Blusa1G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Blusa1MouseClicked
    
    private void Livro5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Livro5MouseClicked
        img=Livro3G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Livro5MouseClicked
    
    private void Cachorro9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cachorro9MouseClicked
        img=Cachorro4G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Cachorro9MouseClicked
    
    private void Sapo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sapo1MouseClicked
        img=Sapo3G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Sapo1MouseClicked
    
    private void Televisao2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Televisao2MouseClicked
        img=Televisao2G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Televisao2MouseClicked
    
    private void Celular5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Celular5MouseClicked
        img=Celular3G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Celular5MouseClicked
    
    private void Aviao3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Aviao3MouseClicked
        img=Aviao2G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Aviao3MouseClicked
    
    private void Blusa9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Blusa9MouseClicked
        img=Blusa4G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Blusa9MouseClicked
    
    private void Mulher1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mulher1MouseClicked
        img=Mulher2G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Mulher1MouseClicked
    
    private void Caneta2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Caneta2MouseClicked
        img=Caneta3G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Caneta2MouseClicked
    
    private void Televisao4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Televisao4MouseClicked
        img=Televisao4G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Televisao4MouseClicked
    
    private void Tambor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tambor1MouseClicked
        img=Tambor2G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Tambor1MouseClicked
    
    private void Carro5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Carro5MouseClicked
        img=Carro4G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Carro5MouseClicked
    
    private void Flor4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Flor4MouseClicked
        img=Flor2G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Flor4MouseClicked
    
    private void Blusinha2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Blusinha2MouseClicked
        img=Blusinha3G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Blusinha2MouseClicked
    
    private void Peixe2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Peixe2MouseClicked
        img=Peixe1G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Peixe2MouseClicked
    
    private void Carro16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Carro16MouseClicked
        img=Carro2G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Carro16MouseClicked
    
    private void Livro2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Livro2MouseClicked
        img=Livro2G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Livro2MouseClicked
    
    private void Cachorro7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cachorro7MouseClicked
        img=Cachorro3G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Cachorro7MouseClicked
    
    private void SapoJpgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SapoJpgMouseClicked
        img=Sapo2G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_SapoJpgMouseClicked
    
    private void TelevisaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelevisaoMouseClicked
        img=Televisao1G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_TelevisaoMouseClicked
    
    private void Celular4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Celular4MouseClicked
        img=Celular2G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Celular4MouseClicked
    
    private void Aviao2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Aviao2MouseClicked
        img=Aviao1G.getIcon();
        id=Clique1.getIcon();
        DistribuiCliques();
    }//GEN-LAST:event_Aviao2MouseClicked
    
    private void AjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjudaMouseClicked
//        Musica.stop();
//        texto="-Em cada fase aparecem quatro figuras.\n\n-você deverá repetir a mesma sequência, que está sendo mostrada.\n\n-Para isso, clique nas figurinhas logo acima.Preste atenção na ordem dos cliques. A sequência deverá ser a mesma!";
//        Ajuda a=new Ajuda();
//        a.textoajuda.setText(texto);
//        a.aj=6;
//        a.setVisible(true);
//        this.setVisible(false);
		AbrirAjuda("-Em cada fase aparecem quatro figuras.\n\n-você deverá repetir a mesma sequência, que está sendo mostrada.\n\n-Para isso, clique nas figurinhas logo acima.Preste atenção na ordem dos cliques. A sequência deverá ser a mesma!");
    }//GEN-LAST:event_AjudaMouseClicked
    
    private void AjudaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjudaMouseMoved
        Ajuda.setBackground(new java.awt.Color(255,255,102));
    }//GEN-LAST:event_AjudaMouseMoved
    
    private void AjudaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjudaMousePressed
        Ajuda.setBackground(new java.awt.Color(102,204,0));
    }//GEN-LAST:event_AjudaMousePressed
    
    private void AjudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjudaMouseExited
        Ajuda.setBackground(new java.awt.Color(244,244,246));
    }//GEN-LAST:event_AjudaMouseExited
        
    private void AnulaCliques(){
        Clique1.setIcon(null);
        Clique2.setIcon(null);
        Clique3.setIcon(null);
        Clique4.setIcon(null);
    }
    
    private void SetaFiguras(){
        Figura1.setIcon(f1);
        Figura2.setIcon(f2);
        Figura3.setIcon(f3);
        Figura4.setIcon(f4);
    }
    
    private void AumentaPontos(){
        SetaFiguras();
        AnulaCliques();
        ptos=ptos+1000;
        Pontos.setText(String.valueOf(ptos));
    }
    
    private void ChamaErro(){
        AnulaCliques();
        ptos=ptos-500;
        if (ptos<0)
            ptos=0;
        Pontos.setText(String.valueOf(ptos));
        vida=vida-1;
        NumVidas.setText(String.valueOf(vida));
        if (vida==0){
            Erro er=new Erro();
            er.Pontuacao.setText(String.valueOf(ptos));
            er.FlagJogo=6;
//            Musica.stop();
            er.setVisible(true);
            this.setVisible(false);
        }
    }
    
    private void DistribuiFiguras(){
        m1=Figura1.getIcon();
        m2=Figura2.getIcon();
        m3=Figura3.getIcon();
        m4=Figura4.getIcon();
        c1=Clique1.getIcon();
        c2=Clique2.getIcon();
        c3=Clique3.getIcon();
        c4=Clique4.getIcon();
    }
    
    private void Compara(){
        DistribuiFiguras();
        
        while (fase<=14){
            if (fase==1){
                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
                    f1=Blusa1G.getIcon();
                    f2=Blusa2G.getIcon();
                    f3=Blusa3G.getIcon();
                    f4=Blusa4G.getIcon();
                    fase=2;
                    AumentaPontos();
                    break;
                }
                else{
                    ChamaErro();
                    break;
                }
            }
            
            if (fase==2){
                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
                    f1=Blusinha1G.getIcon();
                    f2=Blusinha2G.getIcon();
                    f3=Blusinha3G.getIcon();
                    f4=Blusinha4G.getIcon();
                    fase=3;
                    AumentaPontos();
                    break;
                }
                else{
                    ChamaErro();
                    break;
                }
            }
            
            if (fase==3){
                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
                    f1=Cachorro1G.getIcon();
                    f2=Cachorro2G.getIcon();
                    f3=Cachorro3G.getIcon();
                    f4=Cachorro4G.getIcon();
                    fase=4;
                    AumentaPontos();
                    break;
                }
                else{
                    ChamaErro();
                    break;
                }
            }
            
            if (fase==4){
                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
                    f1=Caneta1G.getIcon();
                    f2=Caneta2G.getIcon();
                    f3=Caneta3G.getIcon();
                    f4=Caneta4G.getIcon();
                    fase=5;
                    AumentaPontos();
                    break;
                }
                else{
                    ChamaErro();
                    break;
                }
            }
            
            if (fase==5){
                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
                    f1=Carro1G.getIcon();
                    f2=Carro2G.getIcon();
                    f3=Carro3G.getIcon();
                    f4=Carro4G.getIcon();
                    fase=6;
                    AumentaPontos();
                    break;
                }
                else{
                    ChamaErro();
                    break;
                }
            }
            
            if (fase==6){
                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
                    f1=Celular1G.getIcon();
                    f2=Celular2G.getIcon();
                    f3=Celular3G.getIcon();
                    f4=Celular4G.getIcon();
                    fase=7;
                    AumentaPontos();
                    break;
                }
                else{
                    ChamaErro();
                    break;
                }
            }
            
            if (fase==7){
                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
                    f1=Flor1G.getIcon();
                    f2=Flor2G.getIcon();
                    f3=Flor3G.getIcon();
                    f4=Flor4G.getIcon();
                    fase=8;
                    AumentaPontos();
                    break;
                }
                else{
                    ChamaErro();
                    break;
                }
            }
            
            if (fase==8){
                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
                    f1=Livro1G.getIcon();
                    f2=Livro2G.getIcon();
                    f3=Livro3G.getIcon();
                    f4=Livro4G.getIcon();
                    fase=9;
                    AumentaPontos();
                    break;
                }
                else{
                    ChamaErro();
                    break;
                }
            }
            
            if (fase==9){
                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
                    f1=Mulher1G.getIcon();
                    f2=Mulher2G.getIcon();
                    f3=Mulher3G.getIcon();
                    f4=Mulher4G.getIcon();
                    fase=10;
                    AumentaPontos();
                    break;
                }
                else{
                    ChamaErro();
                    break;
                }
            }
            
            if (fase==10){
                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
                    f1=Peixe1G.getIcon();
                    f2=Peixe2G.getIcon();
                    f3=Peixe3G.getIcon();
                    f4=Peixe4G.getIcon();
                    fase=11;
                    AumentaPontos();
                    break;
                }
                else{
                    ChamaErro();
                    break;
                }
            }
            
            if (fase==11){
                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
                    f1=Sapo1G.getIcon();
                    f2=Sapo2G.getIcon();
                    f3=Sapo3G.getIcon();
                    f4=Sapo4G.getIcon();
                    fase=12;
                    AumentaPontos();
                    break;
                }
                else{
                    ChamaErro();
                    break;
                }
            }
            
            if (fase==12){
                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
                    f1=Tambor1G.getIcon();
                    f2=Tambor2G.getIcon();
                    f3=Tambor3G.getIcon();
                    f4=Tambor4G.getIcon();
                    fase=13;
                    AumentaPontos();
                    break;
                }
                else{
                    ChamaErro();
                    break;
                }
            }
            
            if (fase==13){
                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
                    f1=Televisao1G.getIcon();
                    f2=Televisao2G.getIcon();
                    f3=Televisao3G.getIcon();
                    f4=Televisao4G.getIcon();
                    fase=14;
                    AumentaPontos();
                    break;
                }
                else{
                    ChamaErro();
                    break;
                }
            }
            
            if (fase==14){
                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
                    Acerto ac=new Acerto();
                    ac.Pontuacao.setText(String.valueOf(ptos));
                    ac.FlagJogo=6;
//                    Musica.stop();
                    ac.setVisible(true);
                    this.setVisible(false);
                    AumentaPontos();
                    break;
                }
                else{
                    ChamaErro();
                    break;
                }
            }
        }
    }
    
    private void DistribuiCliques(){
        if (id==null)
            Clique1.setIcon(img);
        else{
            id=Clique2.getIcon();
            if (id==null)
                Clique2.setIcon(img);
            else{
                id=Clique3.getIcon();
                if (id==null)
                    Clique3.setIcon(img);
                else{
                    id=Clique4.getIcon();
                    if (id==null){
                        Clique4.setIcon(img);
                        Compara();
                    }
                }
            }
        }
    }
    
    
    
    public static void main(String args[]) {
        new MatrizFigura().show();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ajuda;
    private javax.swing.JLabel Aviao1G;
    private javax.swing.JLabel Aviao2;
    private javax.swing.JLabel Aviao2G;
    private javax.swing.JLabel Aviao3G;
    private javax.swing.JLabel Aviao4G;
    private javax.swing.JLabel Aviao3;
    private javax.swing.JLabel Aviao5;
    private javax.swing.JLabel Aviao6;
    private javax.swing.JLabel Blusa1;
    private javax.swing.JLabel Blusa1G;
    private javax.swing.JLabel Blusa2G;
    private javax.swing.JLabel Blusa3G;
    private javax.swing.JLabel Blusa4;
    private javax.swing.JLabel Blusa4G;
    private javax.swing.JLabel Blusa8;
    private javax.swing.JLabel Blusa9;
    private javax.swing.JLabel Blusinha;
    private javax.swing.JLabel Blusinha1;
    private javax.swing.JLabel Blusinha1G;
    private javax.swing.JLabel Blusinha2;
    private javax.swing.JLabel Blusinha2G;
    private javax.swing.JLabel Blusinha3;
    private javax.swing.JLabel Blusinha3G;
    private javax.swing.JLabel Blusinha4G;
    private javax.swing.JLabel Cachorro1;
    private javax.swing.JLabel Cachorro1G;
    private javax.swing.JLabel Cachorro2G;
    private javax.swing.JLabel Cachorro3G;
    private javax.swing.JLabel Cachorro4G;
    private javax.swing.JLabel Cachorro6;
    private javax.swing.JLabel Cachorro7;
    private javax.swing.JLabel Cachorro9;
    private javax.swing.JLabel Caneta;
    private javax.swing.JLabel Caneta1;
    private javax.swing.JLabel Caneta1G;
    private javax.swing.JLabel Caneta2;
    private javax.swing.JLabel Caneta2G;
    private javax.swing.JLabel Caneta3G;
    private javax.swing.JLabel Caneta4;
    private javax.swing.JLabel Caneta4G;
    private javax.swing.JLabel Carro14;
    private javax.swing.JLabel Carro16;
    private javax.swing.JLabel Carro1G;
    private javax.swing.JLabel Carro22;
    private javax.swing.JLabel Carro2G;
    private javax.swing.JLabel Carro3G;
    private javax.swing.JLabel Carro4G;
    private javax.swing.JLabel Carro5;
    private javax.swing.JLabel Celular1G;
    private javax.swing.JLabel Celular2;
    private javax.swing.JLabel Celular2G;
    private javax.swing.JLabel Celular3G;
    private javax.swing.JLabel Celular4;
    private javax.swing.JLabel Celular4G;
    private javax.swing.JLabel Celular5;
    private javax.swing.JLabel Celular9;
    private javax.swing.JLabel Clique1;
    private javax.swing.JLabel Clique2;
    private javax.swing.JLabel Clique3;
    private javax.swing.JLabel Clique4;
    private javax.swing.JLabel Figura1;
    private javax.swing.JLabel Figura2;
    private javax.swing.JLabel Figura3;
    private javax.swing.JLabel Figura4;
    private javax.swing.JLabel Flor1G;
    private javax.swing.JLabel Flor2;
    private javax.swing.JLabel Flor2G;
    private javax.swing.JLabel Flor3G;
    private javax.swing.JLabel Flor4;
    private javax.swing.JLabel Flor4G;
    private javax.swing.JLabel Flor5;
    private javax.swing.JLabel Flor6;
    private javax.swing.JLabel Livro1;
    private javax.swing.JLabel Livro1G;
    private javax.swing.JLabel Livro2;
    private javax.swing.JLabel Livro2G;
    private javax.swing.JLabel Livro3G;
    private javax.swing.JLabel Livro4G;
    private javax.swing.JLabel Livro5;
    private javax.swing.JLabel Livro7;
    private javax.swing.JLabel Mulher;
    private javax.swing.JLabel Mulher1;
    private javax.swing.JLabel Mulher1G;
    private javax.swing.JLabel Mulher2;
    private javax.swing.JLabel Mulher2G;
    private javax.swing.JLabel Mulher3G;
    private javax.swing.JLabel Mulher4;
    private javax.swing.JLabel Mulher4G;
    private javax.swing.JLabel Peixe1G;
    private javax.swing.JLabel Peixe2;
    private javax.swing.JLabel Peixe2G;
    private javax.swing.JLabel Peixe3G;
    private javax.swing.JLabel Peixe4;
    private javax.swing.JLabel Peixe4G;
    private javax.swing.JLabel Peixe5;
    private javax.swing.JLabel Peixe7;
    private javax.swing.JLabel Sapo1;
    private javax.swing.JLabel Sapo1G;
    private javax.swing.JLabel Sapo2G;
    private javax.swing.JLabel Sapo3;
    private javax.swing.JLabel Sapo3G;
    private javax.swing.JLabel Sapo4G;
    private javax.swing.JLabel SapoGif;
    private javax.swing.JLabel SapoJpg;
    private javax.swing.JLabel Tambor;
    private javax.swing.JLabel Tambor1;
    private javax.swing.JLabel Tambor1G;
    private javax.swing.JLabel Tambor2;
    private javax.swing.JLabel Tambor2G;
    private javax.swing.JLabel Tambor3;
    private javax.swing.JLabel Tambor3G;
    private javax.swing.JLabel Tambor4G;
    private javax.swing.JLabel Televisao1G;
    private javax.swing.JLabel Televisao2G;
    private javax.swing.JLabel Televisao3G;
    private javax.swing.JLabel Televisao4G;
    private javax.swing.JLabel Televisao;
    private javax.swing.JLabel Televisao2;
    private javax.swing.JLabel Televisao3;
    private javax.swing.JLabel Televisao4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
    
}
