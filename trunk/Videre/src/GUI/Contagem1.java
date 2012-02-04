package GUI;

import java.net.*;

public class Contagem1 extends TelaJogo {

	private String st, st2, c1 = null;

	public Contagem1() {
		initComponents();

		//inicia musica
		try {
			URL som = new URL((getClass().getResource("/sons/cavaleirosdozodiaco.mid")).toString());
			Musica = java.applet.Applet.newAudioClip(som);
			Musica.loop();
		} catch (MalformedURLException erro) {
			System.out.println("Caminho do áudio não especificado! " + erro);
		}
	}

    private void initComponents() {//GEN-BEGIN:initComponents
        Zero = new javax.swing.JLabel();
        Um = new javax.swing.JLabel();
        Dois = new javax.swing.JLabel();
        Tres = new javax.swing.JLabel();
        Quatro = new javax.swing.JLabel();
        Cinco = new javax.swing.JLabel();
        Seis = new javax.swing.JLabel();
        Sete = new javax.swing.JLabel();
        Oito = new javax.swing.JLabel();
        Nove = new javax.swing.JLabel();
        FundoCamuflado = new javax.swing.JLabel();
        Fase2 = new javax.swing.JLabel();
        Fase3 = new javax.swing.JLabel();
        Fase4 = new javax.swing.JLabel();
        Fase5 = new javax.swing.JLabel();
        Fase6 = new javax.swing.JLabel();
        Fase7 = new javax.swing.JLabel();
        Fase8 = new javax.swing.JLabel();
        Fase9 = new javax.swing.JLabel();
        Fase10 = new javax.swing.JLabel();
        Clique1 = new javax.swing.JLabel();
        Ajuda = new javax.swing.JButton();
        PainelFundo = new javax.swing.JPanel();
        PainelNumeros = new javax.swing.JPanel();

        setTitle("Ache os N\u00fameros!");
        Zero.setBackground(new java.awt.Color(255, 255, 255));
        Zero.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        Zero.setForeground(new java.awt.Color(255, 0, 0));
        Zero.setText("0");
        Zero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        Zero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ZeroMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ZeroMouseExited(evt);
            }
        });
        Zero.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ZeroMouseMoved(evt);
            }
        });

        add(Zero);
        Zero.setBounds(620, 130, 35, 40);

        Um.setBackground(new java.awt.Color(255, 255, 255));
        Um.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        Um.setForeground(new java.awt.Color(255, 0, 0));
        Um.setText("1");
        Um.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        Um.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UmMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UmMouseExited(evt);
            }
        });
        Um.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                UmMouseMoved(evt);
            }
        });

        add(Um);
        Um.setBounds(680, 130, 35, 40);

        Dois.setBackground(new java.awt.Color(255, 255, 255));
        Dois.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        Dois.setForeground(new java.awt.Color(255, 0, 0));
        Dois.setText("2");
        Dois.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        Dois.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoisMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DoisMouseExited(evt);
            }
        });
        Dois.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                DoisMouseMoved(evt);
            }
        });

        add(Dois);
        Dois.setBounds(620, 200, 35, 40);

        Tres.setBackground(new java.awt.Color(255, 255, 255));
        Tres.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        Tres.setForeground(new java.awt.Color(255, 0, 0));
        Tres.setText("3");
        Tres.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        Tres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TresMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TresMouseExited(evt);
            }
        });
        Tres.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                TresMouseMoved(evt);
            }
        });

        add(Tres);
        Tres.setBounds(680, 200, 35, 40);

        Quatro.setBackground(new java.awt.Color(255, 255, 255));
        Quatro.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        Quatro.setForeground(new java.awt.Color(255, 0, 0));
        Quatro.setText("4");
        Quatro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        Quatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuatroMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                QuatroMouseExited(evt);
            }
        });
        Quatro.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                QuatroMouseMoved(evt);
            }
        });

        add(Quatro);
        Quatro.setBounds(620, 270, 35, 40);

        Cinco.setBackground(new java.awt.Color(255, 255, 255));
        Cinco.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        Cinco.setForeground(new java.awt.Color(255, 0, 0));
        Cinco.setText("5");
        Cinco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        Cinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CincoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CincoMouseExited(evt);
            }
        });
        Cinco.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CincoMouseMoved(evt);
            }
        });

        add(Cinco);
        Cinco.setBounds(680, 270, 35, 40);

        Seis.setBackground(new java.awt.Color(255, 255, 255));
        Seis.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        Seis.setForeground(new java.awt.Color(255, 0, 0));
        Seis.setText("6");
        Seis.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        Seis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SeisMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SeisMouseExited(evt);
            }
        });
        Seis.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SeisMouseMoved(evt);
            }
        });

        add(Seis);
        Seis.setBounds(620, 340, 35, 40);

        Sete.setBackground(new java.awt.Color(255, 255, 255));
        Sete.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        Sete.setForeground(new java.awt.Color(255, 0, 0));
        Sete.setText("7");
        Sete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        Sete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SeteMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SeteMouseExited(evt);
            }
        });
        Sete.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SeteMouseMoved(evt);
            }
        });

        add(Sete);
        Sete.setBounds(680, 340, 35, 40);

        Oito.setBackground(new java.awt.Color(255, 255, 255));
        Oito.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        Oito.setForeground(new java.awt.Color(255, 0, 0));
        Oito.setText("8");
        Oito.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        Oito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OitoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OitoMouseExited(evt);
            }
        });
        Oito.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                OitoMouseMoved(evt);
            }
        });

        add(Oito);
        Oito.setBounds(620, 410, 35, 40);

        Nove.setBackground(new java.awt.Color(255, 255, 255));
        Nove.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        Nove.setForeground(new java.awt.Color(255, 0, 0));
        Nove.setText("9");
        Nove.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        Nove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NoveMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NoveMouseExited(evt);
            }
        });
        Nove.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                NoveMouseMoved(evt);
            }
        });

        add(Nove);
        Nove.setBounds(680, 410, 35, 40);

        FundoCamuflado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/nfase1.jpg")));
        add(FundoCamuflado);
        FundoCamuflado.setBounds(30, 120, 500, 350);

        Fase2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/nfase2.jpg")));
        Fase2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Fase2);
        Fase2.setBounds(40, 130, 15, 15);

        Fase3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/nfase3.jpg")));
        Fase3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Fase3);
        Fase3.setBounds(60, 130, 15, 15);

        Fase4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/nfase4.jpg")));
        Fase4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Fase4);
        Fase4.setBounds(80, 130, 15, 15);

        Fase5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/nfase5.jpg")));
        Fase5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Fase5);
        Fase5.setBounds(100, 130, 15, 15);

        Fase6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/nfase6.jpg")));
        Fase6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Fase6);
        Fase6.setBounds(120, 130, 15, 15);

        Fase7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/nfase7.jpg")));
        Fase7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Fase7);
        Fase7.setBounds(140, 130, 15, 15);

        Fase8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/nfase8.jpg")));
        Fase8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Fase8);
        Fase8.setBounds(160, 130, 15, 15);

        Fase9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/nfase9.jpg")));
        Fase9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Fase9);
        Fase9.setBounds(180, 130, 15, 15);

        Fase10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/nfase10.jpg")));
        Fase10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Fase10);
        Fase10.setBounds(200, 130, 15, 15);

        Clique1.setText("-");
        Clique1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Clique1);
        Clique1.setBounds(240, 130, 15, 15);

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
        Ajuda.setBounds(35, 518, 230, 50);

        PainelFundo.setLayout(null);

        PainelFundo.setBackground(new java.awt.Color(255, 255, 255));
        PainelFundo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.blue, java.awt.Color.blue));
        add(PainelFundo);
        PainelFundo.setBounds(20, 90, 520, 410);

        PainelNumeros.setLayout(null);

        PainelNumeros.setBackground(new java.awt.Color(255, 255, 255));
        PainelNumeros.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.red, java.awt.Color.red));
        add(PainelNumeros);
        PainelNumeros.setBounds(560, 110, 200, 370);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800, 600);
    }//GEN-END:initComponents

    private void AjudaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjudaMouseMoved
		Ajuda.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_AjudaMouseMoved

    private void AjudaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjudaMousePressed
		Ajuda.setBackground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_AjudaMousePressed

    private void AjudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjudaMouseExited
		Ajuda.setBackground(new java.awt.Color(244, 244, 246));
    }//GEN-LAST:event_AjudaMouseExited

    private void AjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjudaMouseClicked
		Musica.stop();
		texto = "-Em cada fase aparecerá uma imagem com 1 número.\n\n-Identifique o número que aparece na imagem e clique em cima dele no grupo de números do lado direito";
		Ajuda aj = new Ajuda();
		aj.textoajuda.setText(texto);
		aj.aj = 2;
		aj.setVisible(true);
		this.setVisible(false);
    }//GEN-LAST:event_AjudaMouseClicked

    private void NoveMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoveMouseMoved
		Nove.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_NoveMouseMoved

    private void OitoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OitoMouseMoved
		Oito.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_OitoMouseMoved

    private void SeteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeteMouseMoved
		Sete.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_SeteMouseMoved

    private void SeisMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeisMouseMoved
		Seis.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_SeisMouseMoved

    private void CincoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CincoMouseMoved
		Cinco.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_CincoMouseMoved

    private void QuatroMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuatroMouseMoved
		Quatro.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_QuatroMouseMoved

    private void TresMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TresMouseMoved
		Tres.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_TresMouseMoved

    private void DoisMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoisMouseMoved
		Dois.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_DoisMouseMoved

    private void UmMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UmMouseMoved
		Um.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_UmMouseMoved

    private void ZeroMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZeroMouseMoved
		Zero.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_ZeroMouseMoved

    private void NoveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoveMouseExited
		Nove.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_NoveMouseExited

    private void OitoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OitoMouseExited
		Oito.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_OitoMouseExited

    private void SeteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeteMouseExited
		Sete.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_SeteMouseExited

    private void SeisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeisMouseExited
		Seis.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_SeisMouseExited

    private void CincoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CincoMouseExited
		Cinco.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_CincoMouseExited

    private void QuatroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuatroMouseExited
		Quatro.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_QuatroMouseExited

    private void TresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TresMouseExited
		Tres.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_TresMouseExited

    private void DoisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoisMouseExited
		Dois.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_DoisMouseExited

    private void UmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UmMouseExited
		Um.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_UmMouseExited

    private void ZeroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZeroMouseExited
		Zero.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_ZeroMouseExited

    private void NoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoveMouseClicked
		st = Clique1.getText();
		st2 = Nove.getText();
		DistribuiClique();
    }//GEN-LAST:event_NoveMouseClicked

    private void OitoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OitoMouseClicked
		st = Clique1.getText();
		st2 = Oito.getText();
		DistribuiClique();
    }//GEN-LAST:event_OitoMouseClicked

    private void SeteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeteMouseClicked
		st = Clique1.getText();
		st2 = Sete.getText();
		DistribuiClique();
    }//GEN-LAST:event_SeteMouseClicked

    private void SeisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeisMouseClicked
		st = Clique1.getText();
		st2 = Seis.getText();
		DistribuiClique();
    }//GEN-LAST:event_SeisMouseClicked

    private void CincoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CincoMouseClicked
		st = Clique1.getText();
		st2 = Cinco.getText();
		DistribuiClique();
    }//GEN-LAST:event_CincoMouseClicked

    private void QuatroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuatroMouseClicked
		st = Clique1.getText();
		st2 = Quatro.getText();
		DistribuiClique();
    }//GEN-LAST:event_QuatroMouseClicked

    private void TresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TresMouseClicked
		st = Clique1.getText();
		st2 = Tres.getText();
		DistribuiClique();
    }//GEN-LAST:event_TresMouseClicked

    private void DoisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoisMouseClicked
		st = Clique1.getText();
		st2 = Dois.getText();
		DistribuiClique();
    }//GEN-LAST:event_DoisMouseClicked

    private void UmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UmMouseClicked
		st = Clique1.getText();
		st2 = Um.getText();
		DistribuiClique();
    }//GEN-LAST:event_UmMouseClicked

    private void ZeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZeroMouseClicked
		st = Clique1.getText();
		st2 = Zero.getText();
		DistribuiClique();
    }//GEN-LAST:event_ZeroMouseClicked

	public void DistribuiClique() {
		if (st == "-") {
			Clique1.setText(st2);
			compara();
		} else {
			compara();
		}
	}

	//reinicia os valores das variaveis q recebem os cliques
	private void Setast() {
		st = "-";
		st2 = "-";
		Clique1.setText(st);
	}

	private void AumentaPontos() {
		ptos = ptos + 1000;
		Pontos.setText(String.valueOf(ptos));
		Setast();
	}

	private void ChamaErro() {
		ptos = ptos - 500;
		if (ptos < 0) {
			ptos = 0;
		}
		Pontos.setText(String.valueOf(ptos));
		vida = vida - 1;
		NumVidas.setText(String.valueOf(vida));
		Setast();
		if (vida == 0) {
			Erro er = new Erro();
			er.Pontuacao.setText(String.valueOf(ptos));
			er.FlagJogo = 2;
			Musica.stop();
			er.setVisible(true);
			this.setVisible(false);
		}
	}

	private void compara() {
		while (fase <= 10) {
			c1 = Clique1.getText();
			if (fase == 1) {
				if (c1 == "5") {
					AumentaPontos();
					fase = 2;
					figfase = Fase2.getIcon();
					FundoCamuflado.setIcon(figfase);
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 2) {
				c1 = Clique1.getText();
				if (c1 == "8") {
					AumentaPontos();
					fase = 3;
					figfase = Fase3.getIcon();
					FundoCamuflado.setIcon(figfase);
					break;
				} else {
					ChamaErro();
					break;
				}

			}

			if (fase == 3) {
				c1 = Clique1.getText();
				if (c1 == "1") {
					AumentaPontos();
					fase = 4;
					figfase = Fase4.getIcon();
					FundoCamuflado.setIcon(figfase);
					break;
				} else {
					ChamaErro();
					break;
				}

			}

			if (fase == 4) {
				c1 = Clique1.getText();
				if (c1 == "4") {
					AumentaPontos();
					fase = 5;
					figfase = Fase5.getIcon();
					FundoCamuflado.setIcon(figfase);
					break;
				} else {
					ChamaErro();
					break;
				}

			}

			if (fase == 5) {
				c1 = Clique1.getText();
				if (c1 == "9") {
					AumentaPontos();
					fase = 6;
					figfase = Fase6.getIcon();
					FundoCamuflado.setIcon(figfase);
					break;
				} else {
					ChamaErro();
					break;
				}

			}

			if (fase == 6) {
				c1 = Clique1.getText();
				if (c1 == "2") {
					AumentaPontos();
					fase = 7;
					figfase = Fase7.getIcon();
					FundoCamuflado.setIcon(figfase);
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 7) {
				c1 = Clique1.getText();
				if (c1 == "6") {
					AumentaPontos();
					fase = 8;
					figfase = Fase8.getIcon();
					FundoCamuflado.setIcon(figfase);
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 8) {
				c1 = Clique1.getText();
				if (c1 == "3") {
					AumentaPontos();
					fase = 9;
					figfase = Fase9.getIcon();
					FundoCamuflado.setIcon(figfase);
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 9) {
				c1 = Clique1.getText();
				if (c1 == "0") {
					AumentaPontos();
					fase = 10;
					figfase = Fase10.getIcon();
					FundoCamuflado.setIcon(figfase);
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 10) {
				c1 = Clique1.getText();
				if (c1 == "7") {
					AumentaPontos();
					fase = 1;
					Acerto ac = new Acerto();
					ac.Pontuacao.setText(String.valueOf(ptos));
					ac.FlagJogo = 2;
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

	public static void main(String args[]) {
		new Contagem1().show();
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ajuda;
    private javax.swing.JLabel Cinco;
    private javax.swing.JLabel Clique1;
    private javax.swing.JLabel Dois;
    private javax.swing.JLabel Fase10;
    private javax.swing.JLabel Fase2;
    private javax.swing.JLabel Fase3;
    private javax.swing.JLabel Fase4;
    private javax.swing.JLabel Fase5;
    private javax.swing.JLabel Fase6;
    private javax.swing.JLabel Fase7;
    private javax.swing.JLabel Fase8;
    private javax.swing.JLabel Fase9;
    private javax.swing.JLabel FundoCamuflado;
    private javax.swing.JLabel Nove;
    private javax.swing.JLabel Oito;
    private javax.swing.JPanel PainelFundo;
    private javax.swing.JPanel PainelNumeros;
    private javax.swing.JLabel Quatro;
    private javax.swing.JLabel Seis;
    private javax.swing.JLabel Sete;
    private javax.swing.JLabel Tres;
    private javax.swing.JLabel Um;
    private javax.swing.JLabel Zero;
    // End of variables declaration//GEN-END:variables
}
