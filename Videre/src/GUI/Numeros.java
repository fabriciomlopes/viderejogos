package GUI;

import javax.swing.*;
import java.net.*;

public class Numeros extends TelaJogo {

	private Icon img = null, id = null, f1, f2, f3, f4, f5, f6, f7, f8, f9, f10,
			o1, o2, o3, o4, o5, o6, o7, o8, o9, o10,
			d2, d3, tr;

	public Numeros() {
		initComponents();

		try {
			URL som = new URL((getClass().getResource("/sons/temacirco.mid")).toString());
			Musica = java.applet.Applet.newAudioClip(som);
			Musica.loop();
		} catch (MalformedURLException erro) {
			System.out.println("Caminho do �udio n�o especificado! " + erro);
		}

	}

    private void initComponents() {//GEN-BEGIN:initComponents
        figurasbasicas = new javax.swing.JLabel();
        fb2 = new javax.swing.JLabel();
        fb6 = new javax.swing.JLabel();
        fb7 = new javax.swing.JLabel();
        fb3 = new javax.swing.JLabel();
        fb10 = new javax.swing.JLabel();
        fb8 = new javax.swing.JLabel();
        fb5 = new javax.swing.JLabel();
        fb1 = new javax.swing.JLabel();
        fb9 = new javax.swing.JLabel();
        fb4 = new javax.swing.JLabel();
        objetos = new javax.swing.JLabel();
        ob10 = new javax.swing.JLabel();
        ob6 = new javax.swing.JLabel();
        ob5 = new javax.swing.JLabel();
        ob1 = new javax.swing.JLabel();
        ob2 = new javax.swing.JLabel();
        ob9 = new javax.swing.JLabel();
        ob7 = new javax.swing.JLabel();
        ob8 = new javax.swing.JLabel();
        ob4 = new javax.swing.JLabel();
        ob3 = new javax.swing.JLabel();
        CliqueNumero = new javax.swing.JLabel();
        CliqFigBasica = new javax.swing.JLabel();
        CliqueObjeto = new javax.swing.JLabel();
        Ajuda = new javax.swing.JButton();
        g2 = new javax.swing.JLabel();
        g3 = new javax.swing.JLabel();
        g4 = new javax.swing.JLabel();
        g5 = new javax.swing.JLabel();
        g6 = new javax.swing.JLabel();
        g7 = new javax.swing.JLabel();
        g8 = new javax.swing.JLabel();
        g9 = new javax.swing.JLabel();
        g10 = new javax.swing.JLabel();
        gd1 = new javax.swing.JLabel();
        gd2 = new javax.swing.JLabel();
        gd3 = new javax.swing.JLabel();
        gd4 = new javax.swing.JLabel();
        gd5 = new javax.swing.JLabel();
        gd6 = new javax.swing.JLabel();
        gd7 = new javax.swing.JLabel();
        gd8 = new javax.swing.JLabel();
        gd9 = new javax.swing.JLabel();
        gd10 = new javax.swing.JLabel();
        gf1 = new javax.swing.JLabel();
        gf2 = new javax.swing.JLabel();
        gf3 = new javax.swing.JLabel();
        gf4 = new javax.swing.JLabel();
        gf5 = new javax.swing.JLabel();
        gf6 = new javax.swing.JLabel();
        gf7 = new javax.swing.JLabel();
        gf8 = new javax.swing.JLabel();
        gf9 = new javax.swing.JLabel();
        gf10 = new javax.swing.JLabel();

        setTitle("Jogo dos N\u00fameros!");
        figurasbasicas.setBackground(new java.awt.Color(244, 244, 246));
        figurasbasicas.setFont(new java.awt.Font("Comic Sans MS", 1, 17));
        figurasbasicas.setForeground(new java.awt.Color(255, 0, 0));
        figurasbasicas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        figurasbasicas.setText("Figuras B\u00e1sicas");
        figurasbasicas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
        figurasbasicas.setOpaque(true);
        add(figurasbasicas);
        figurasbasicas.setBounds(30, 90, 130, 40);

        fb2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/2d.jpg")));
        fb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fb2MouseClicked(evt);
            }
        });

        add(fb2);
        fb2.setBounds(170, 80, 60, 60);

        fb6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fb6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/6d.jpg")));
        fb6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fb6MouseClicked(evt);
            }
        });

        add(fb6);
        fb6.setBounds(230, 80, 60, 60);

        fb7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fb7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/7d.jpg")));
        fb7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fb7MouseClicked(evt);
            }
        });

        add(fb7);
        fb7.setBounds(290, 80, 60, 60);

        fb3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/3d.jpg")));
        fb3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fb3MouseClicked(evt);
            }
        });

        add(fb3);
        fb3.setBounds(350, 80, 60, 60);

        fb10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fb10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/10d.jpg")));
        fb10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fb10MouseClicked(evt);
            }
        });

        add(fb10);
        fb10.setBounds(410, 80, 60, 60);

        fb8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fb8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/8d.jpg")));
        fb8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fb8MouseClicked(evt);
            }
        });

        add(fb8);
        fb8.setBounds(470, 80, 60, 60);

        fb5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fb5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/5d.jpg")));
        fb5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fb5MouseClicked(evt);
            }
        });

        add(fb5);
        fb5.setBounds(530, 80, 60, 60);

        fb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/1d.jpg")));
        fb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fb1MouseClicked(evt);
            }
        });

        add(fb1);
        fb1.setBounds(590, 80, 60, 60);

        fb9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fb9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/9d.jpg")));
        fb9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fb9MouseClicked(evt);
            }
        });

        add(fb9);
        fb9.setBounds(650, 80, 60, 60);

        fb4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/4d.jpg")));
        fb4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fb4MouseClicked(evt);
            }
        });

        add(fb4);
        fb4.setBounds(710, 80, 60, 60);

        objetos.setBackground(new java.awt.Color(244, 244, 246));
        objetos.setFont(new java.awt.Font("Comic Sans MS", 1, 17));
        objetos.setForeground(new java.awt.Color(255, 0, 0));
        objetos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        objetos.setText("Objetos");
        objetos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
        objetos.setOpaque(true);
        add(objetos);
        objetos.setBounds(30, 170, 130, 40);

        ob10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ob10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/10f.jpg")));
        ob10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ob10MouseClicked(evt);
            }
        });

        add(ob10);
        ob10.setBounds(170, 160, 60, 60);

        ob6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ob6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/6f.jpg")));
        ob6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ob6MouseClicked(evt);
            }
        });

        add(ob6);
        ob6.setBounds(230, 160, 60, 60);

        ob5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ob5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/5f.jpg")));
        ob5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ob5MouseClicked(evt);
            }
        });

        add(ob5);
        ob5.setBounds(290, 160, 60, 60);

        ob1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ob1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/1f.jpg")));
        ob1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ob1MouseClicked(evt);
            }
        });

        add(ob1);
        ob1.setBounds(350, 160, 60, 60);

        ob2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ob2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/2f.jpg")));
        ob2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ob2MouseClicked(evt);
            }
        });

        add(ob2);
        ob2.setBounds(410, 160, 60, 60);

        ob9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ob9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/9f.jpg")));
        ob9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ob9MouseClicked(evt);
            }
        });

        add(ob9);
        ob9.setBounds(470, 160, 60, 60);

        ob7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ob7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/7f.jpg")));
        ob7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ob7MouseClicked(evt);
            }
        });

        add(ob7);
        ob7.setBounds(530, 160, 60, 60);

        ob8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ob8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/8f.jpg")));
        ob8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ob8MouseClicked(evt);
            }
        });

        add(ob8);
        ob8.setBounds(590, 160, 60, 60);

        ob4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ob4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/4f.jpg")));
        ob4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ob4MouseClicked(evt);
            }
        });

        add(ob4);
        ob4.setBounds(650, 160, 60, 60);

        ob3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ob3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/3f.jpg")));
        ob3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ob3MouseClicked(evt);
            }
        });

        add(ob3);
        ob3.setBounds(710, 160, 60, 60);

        CliqueNumero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/1g.jpg")));
        CliqueNumero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3));
        add(CliqueNumero);
        CliqueNumero.setBounds(190, 300, 150, 150);

        CliqFigBasica.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3));
        add(CliqFigBasica);
        CliqFigBasica.setBounds(340, 300, 150, 150);

        CliqueObjeto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3));
        add(CliqueObjeto);
        CliqueObjeto.setBounds(490, 300, 150, 150);

        Ajuda.setBackground(new java.awt.Color(244, 244, 246));
        Ajuda.setFont(new java.awt.Font("Comic Sans MS", 1, 30));
        Ajuda.setForeground(new java.awt.Color(255, 0, 0));
        Ajuda.setText("AJUDA");
        Ajuda.setToolTipText("clique aqui para chamar a ajuda");
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
        Ajuda.setBounds(28, 517, 230, 50);

        g2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/2g.jpg")));
        g2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(g2);
        g2.setBounds(40, 530, 10, 10);

        g3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/3g.jpg")));
        g3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(g3);
        g3.setBounds(40, 530, 10, 10);

        g4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/4g.jpg")));
        g4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(g4);
        g4.setBounds(40, 530, 10, 10);

        g5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/5g.jpg")));
        g5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(g5);
        g5.setBounds(40, 530, 10, 10);

        g6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/6g.jpg")));
        g6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(g6);
        g6.setBounds(40, 530, 10, 10);

        g7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/7g.jpg")));
        g7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(g7);
        g7.setBounds(40, 530, 10, 10);

        g8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/8g.jpg")));
        g8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(g8);
        g8.setBounds(40, 530, 10, 10);

        g9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/9g.jpg")));
        g9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(g9);
        g9.setBounds(40, 530, 10, 10);

        g10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/10g.jpg")));
        g10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(g10);
        g10.setBounds(40, 530, 10, 10);

        gd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/1gd.jpg")));
        gd1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(gd1);
        gd1.setBounds(40, 530, 10, 10);

        gd2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/2gd.jpg")));
        gd2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(gd2);
        gd2.setBounds(40, 530, 10, 10);

        gd3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/3gd.jpg")));
        gd3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(gd3);
        gd3.setBounds(40, 530, 10, 10);

        gd4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/4gd.jpg")));
        gd4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(gd4);
        gd4.setBounds(40, 530, 10, 10);

        gd5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/5gd.jpg")));
        gd5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(gd5);
        gd5.setBounds(40, 530, 10, 10);

        gd6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/6gd.jpg")));
        gd6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(gd6);
        gd6.setBounds(40, 530, 10, 10);

        gd7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/7gd.jpg")));
        gd7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(gd7);
        gd7.setBounds(40, 530, 10, 10);

        gd8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/8gd.jpg")));
        gd8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(gd8);
        gd8.setBounds(40, 530, 10, 10);

        gd9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/9gd.jpg")));
        gd9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(gd9);
        gd9.setBounds(40, 530, 10, 10);

        gd10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/10gd.jpg")));
        gd10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(gd10);
        gd10.setBounds(40, 530, 10, 10);

        gf1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/1gf.jpg")));
        gf1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(gf1);
        gf1.setBounds(40, 530, 10, 10);

        gf2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/2gf.jpg")));
        gf2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(gf2);
        gf2.setBounds(40, 530, 10, 10);

        gf3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/3gf.jpg")));
        gf3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(gf3);
        gf3.setBounds(40, 530, 10, 10);

        gf4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/4gf.jpg")));
        gf4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(gf4);
        gf4.setBounds(40, 530, 10, 10);

        gf5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/5gf.jpg")));
        gf5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(gf5);
        gf5.setBounds(40, 530, 10, 10);

        gf6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/6gf.jpg")));
        gf6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(gf6);
        gf6.setBounds(40, 530, 10, 10);

        gf7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/7gf.jpg")));
        gf7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(gf7);
        gf7.setBounds(40, 530, 10, 10);

        gf8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/8gf.jpg")));
        gf8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(gf8);
        gf8.setBounds(40, 530, 10, 10);

        gf9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/9gf.jpg")));
        gf9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(gf9);
        gf9.setBounds(40, 530, 10, 10);

        gf10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeros/10gf.jpg")));
        gf10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(gf10);
        gf10.setBounds(40, 530, 10, 10);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800, 600);
    }//GEN-END:initComponents

    private void AjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjudaMouseClicked
		Musica.stop();
		texto = "-Voc� dever� completar a cada fase, o domin� dos n�meros.\n\n-Escolha primeiro uma pe�a que contenha uma figura b�sica e depois uma com um objeto.\n\n-O n�mero de desenhos que aparece em cada uma das pe�as, deve ser o mesmo.\n\n- As pe�as com figuras b�sicas devem sempre ficar no meio da seq��ncia.";
		Ajuda a = new Ajuda();
		a.textoajuda.setText(texto);
		a.aj = 8;
		a.setVisible(true);
		this.setVisible(false);
    }//GEN-LAST:event_AjudaMouseClicked

    private void AjudaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjudaMouseMoved
		Ajuda.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_AjudaMouseMoved

    private void AjudaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjudaMousePressed
		Ajuda.setBackground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_AjudaMousePressed

    private void AjudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjudaMouseExited
		Ajuda.setBackground(new java.awt.Color(244, 244, 246));
    }//GEN-LAST:event_AjudaMouseExited

    private void fb4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fb4MouseClicked
		img = gd4.getIcon();
		DistribuiCliques();
    }//GEN-LAST:event_fb4MouseClicked

    private void fb9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fb9MouseClicked
		img = gd9.getIcon();
		DistribuiCliques();
    }//GEN-LAST:event_fb9MouseClicked

    private void fb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fb1MouseClicked
		img = gd1.getIcon();
		DistribuiCliques();
    }//GEN-LAST:event_fb1MouseClicked

    private void fb5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fb5MouseClicked
		img = gd5.getIcon();
		DistribuiCliques();
    }//GEN-LAST:event_fb5MouseClicked

    private void fb8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fb8MouseClicked
		img = gd8.getIcon();
		DistribuiCliques();
    }//GEN-LAST:event_fb8MouseClicked

    private void fb10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fb10MouseClicked
		img = gd10.getIcon();
		DistribuiCliques();
    }//GEN-LAST:event_fb10MouseClicked

    private void fb3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fb3MouseClicked
		img = gd3.getIcon();
		DistribuiCliques();
    }//GEN-LAST:event_fb3MouseClicked

    private void fb7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fb7MouseClicked
		img = gd7.getIcon();
		DistribuiCliques();
    }//GEN-LAST:event_fb7MouseClicked

    private void fb6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fb6MouseClicked
		img = gd6.getIcon();
		DistribuiCliques();
    }//GEN-LAST:event_fb6MouseClicked

    private void fb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fb2MouseClicked
		img = gd2.getIcon();
		DistribuiCliques();
    }//GEN-LAST:event_fb2MouseClicked

    private void ob3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ob3MouseClicked
		img = gf3.getIcon();
		DistribuiCliques();
    }//GEN-LAST:event_ob3MouseClicked

    private void ob4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ob4MouseClicked
		img = gf4.getIcon();
		DistribuiCliques();
    }//GEN-LAST:event_ob4MouseClicked

    private void ob8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ob8MouseClicked
		img = gf8.getIcon();
		DistribuiCliques();
    }//GEN-LAST:event_ob8MouseClicked

    private void ob7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ob7MouseClicked
		img = gf7.getIcon();
		DistribuiCliques();
    }//GEN-LAST:event_ob7MouseClicked

    private void ob9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ob9MouseClicked
		img = gf9.getIcon();
		DistribuiCliques();
    }//GEN-LAST:event_ob9MouseClicked

    private void ob2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ob2MouseClicked
		img = gf2.getIcon();
		DistribuiCliques();
    }//GEN-LAST:event_ob2MouseClicked

    private void ob1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ob1MouseClicked
		img = gf1.getIcon();
		DistribuiCliques();
    }//GEN-LAST:event_ob1MouseClicked

    private void ob5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ob5MouseClicked
		img = gf5.getIcon();
		DistribuiCliques();
    }//GEN-LAST:event_ob5MouseClicked

    private void ob6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ob6MouseClicked
		img = gf6.getIcon();
		DistribuiCliques();
    }//GEN-LAST:event_ob6MouseClicked

    private void ob10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ob10MouseClicked
		img = gf10.getIcon();
		DistribuiCliques();
    }//GEN-LAST:event_ob10MouseClicked

	private void SetaFigura() {
		CliqFigBasica.setIcon(null);
		CliqueObjeto.setIcon(null);
	}

	private void SetaFiguraObjeto() {
		f1 = gd1.getIcon();
		f2 = gd2.getIcon();
		f3 = gd3.getIcon();
		f4 = gd4.getIcon();
		f5 = gd5.getIcon();
		f6 = gd6.getIcon();
		f7 = gd7.getIcon();
		f8 = gd8.getIcon();
		f9 = gd9.getIcon();
		f10 = gd10.getIcon();

		o1 = gf1.getIcon();
		o2 = gf2.getIcon();
		o3 = gf3.getIcon();
		o4 = gf4.getIcon();
		o5 = gf5.getIcon();
		o6 = gf6.getIcon();
		o7 = gf7.getIcon();
		o8 = gf8.getIcon();
		o9 = gf9.getIcon();
		o10 = gf10.getIcon();
	}

	private void AumentaPontos() {
		CliqueNumero.setIcon(tr);
		SetaFigura();
		ptos = ptos + 1000;
		Pontos.setText(String.valueOf(ptos));
	}

	private void ChamaErro() {
		SetaFigura();
		ptos = ptos - 500;
		if (ptos < 0) {
			ptos = 0;
		}
		Pontos.setText(String.valueOf(ptos));
		vida = vida - 1;
		NumVidas.setText(String.valueOf(vida));
		if (vida == 0) {
			Erro er = new Erro();
			er.Pontuacao.setText(String.valueOf(ptos));
			er.FlagJogo = 8;
			Musica.stop();
			er.setVisible(true);
			this.setVisible(false);
		}
	}

	private void Compara() {
		SetaFiguraObjeto();
		d2 = CliqFigBasica.getIcon();
		d3 = CliqueObjeto.getIcon();

		while (fase <= 10) {
			if (fase == 1) {
				if ((d2.toString().equals(f1.toString())) && (d3.toString().equals(o1.toString()))) {
					tr = g2.getIcon();
					AumentaPontos();
					fase = 2;
					CliqueNumero.setLocation(490, 300);
					CliqFigBasica.setLocation(340, 300);
					CliqueObjeto.setLocation(190, 300);
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 2) {
				if ((d2.toString().equals(f2.toString())) && (d3.toString().equals(o2.toString()))) {
					tr = g3.getIcon();
					AumentaPontos();
					fase = 3;
					CliqueNumero.setLocation(490, 270);
					CliqFigBasica.setLocation(340, 350);
					CliqueObjeto.setLocation(190, 270);
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 3) {
				if ((d2.toString().equals(f3.toString())) && (d3.toString().equals(o3.toString()))) {
					tr = g4.getIcon();
					AumentaPontos();
					fase = 4;
					CliqueNumero.setLocation(190, 270);
					CliqFigBasica.setLocation(340, 350);
					CliqueObjeto.setLocation(490, 270);
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 4) {
				if ((d2.toString().equals(f4.toString())) && (d3.toString().equals(o4.toString()))) {
					tr = g5.getIcon();
					AumentaPontos();
					fase = 5;
					CliqueNumero.setLocation(190, 330);
					CliqFigBasica.setLocation(340, 250);
					CliqueObjeto.setLocation(490, 330);
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 5) {
				if ((d2.toString().equals(f5.toString())) && (d3.toString().equals(o5.toString()))) {
					tr = g6.getIcon();
					AumentaPontos();
					fase = 6;
					CliqueNumero.setLocation(490, 330);
					CliqFigBasica.setLocation(340, 250);
					CliqueObjeto.setLocation(190, 330);
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 6) {
				if ((d2.toString().equals(f6.toString())) && (d3.toString().equals(o6.toString()))) {
					tr = g7.getIcon();
					AumentaPontos();
					fase = 7;
					CliqueNumero.setLocation(190, 260);
					CliqFigBasica.setLocation(340, 350);
					CliqueObjeto.setLocation(490, 350);
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 7) {
				if ((d2.toString().equals(f7.toString())) && (d3.toString().equals(o7.toString()))) {
					tr = g8.getIcon();
					AumentaPontos();
					fase = 8;
					CliqueNumero.setLocation(190, 350);
					CliqFigBasica.setLocation(340, 350);
					CliqueObjeto.setLocation(490, 260);
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 8) {
				if ((d2.toString().equals(f8.toString())) && (d3.toString().equals(o8.toString()))) {
					tr = g9.getIcon();
					AumentaPontos();
					fase = 9;
					CliqueNumero.setLocation(290, 230);
					CliqFigBasica.setLocation(440, 230);
					CliqueObjeto.setLocation(440, 380);
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 9) {
				if ((d2.toString().equals(f9.toString())) && (d3.toString().equals(o9.toString()))) {
					tr = g10.getIcon();
					AumentaPontos();
					fase = 10;
					CliqueNumero.setLocation(440, 230);
					CliqFigBasica.setLocation(290, 230);
					CliqueObjeto.setLocation(290, 380);
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 10) {
				if ((d2.toString().equals(f10.toString())) && (d3.toString().equals(o10.toString()))) {
					tr = g2.getIcon();
					AumentaPontos();
					fase = 0;
					Acerto ac = new Acerto();
					ac.Pontuacao.setText(String.valueOf(ptos));
					ac.FlagJogo = 8;
					Musica.stop();
					ac.setVisible(true);
					this.setVisible(false);
					break;
				} else {
					ChamaErro();
					break;
				}
			}
		}
	}

	private void DistribuiCliques() {
		id = CliqFigBasica.getIcon();
		if (id == null) {
			CliqFigBasica.setIcon(img);
		} else {
			id = CliqueObjeto.getIcon();
			if (id == null) {
				CliqueObjeto.setIcon(img);
			}
			Compara();
		}
	}

	public static void main(String args[]) {
		new Numeros().show();
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ajuda;
    private javax.swing.JLabel CliqFigBasica;
    private javax.swing.JLabel CliqueNumero;
    private javax.swing.JLabel CliqueObjeto;
    private javax.swing.JLabel fb1;
    private javax.swing.JLabel fb10;
    private javax.swing.JLabel fb2;
    private javax.swing.JLabel fb3;
    private javax.swing.JLabel fb4;
    private javax.swing.JLabel fb5;
    private javax.swing.JLabel fb6;
    private javax.swing.JLabel fb7;
    private javax.swing.JLabel fb8;
    private javax.swing.JLabel fb9;
    private javax.swing.JLabel figurasbasicas;
    private javax.swing.JLabel g10;
    private javax.swing.JLabel g2;
    private javax.swing.JLabel g3;
    private javax.swing.JLabel g4;
    private javax.swing.JLabel g5;
    private javax.swing.JLabel g6;
    private javax.swing.JLabel g7;
    private javax.swing.JLabel g8;
    private javax.swing.JLabel g9;
    private javax.swing.JLabel gd1;
    private javax.swing.JLabel gd10;
    private javax.swing.JLabel gd2;
    private javax.swing.JLabel gd3;
    private javax.swing.JLabel gd4;
    private javax.swing.JLabel gd5;
    private javax.swing.JLabel gd6;
    private javax.swing.JLabel gd7;
    private javax.swing.JLabel gd8;
    private javax.swing.JLabel gd9;
    private javax.swing.JLabel gf1;
    private javax.swing.JLabel gf10;
    private javax.swing.JLabel gf2;
    private javax.swing.JLabel gf3;
    private javax.swing.JLabel gf4;
    private javax.swing.JLabel gf5;
    private javax.swing.JLabel gf6;
    private javax.swing.JLabel gf7;
    private javax.swing.JLabel gf8;
    private javax.swing.JLabel gf9;
    private javax.swing.JLabel ob1;
    private javax.swing.JLabel ob10;
    private javax.swing.JLabel ob2;
    private javax.swing.JLabel ob3;
    private javax.swing.JLabel ob4;
    private javax.swing.JLabel ob5;
    private javax.swing.JLabel ob6;
    private javax.swing.JLabel ob7;
    private javax.swing.JLabel ob8;
    private javax.swing.JLabel ob9;
    private javax.swing.JLabel objetos;
    // End of variables declaration//GEN-END:variables
}
