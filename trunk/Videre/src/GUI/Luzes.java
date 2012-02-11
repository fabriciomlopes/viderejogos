package GUI;

import ConfigFases.FaseControladorBase;
import javax.swing.*;
import java.awt.event.*;

public class Luzes extends TelaJogo {

	private Icon a1 = null, a2 = null, a3 = null, a4 = null, a5 = null, a6 = null, a7 = null, a8 = null, a9 = null, a10 = null, a11 = null, a12 = null, a13 = null,
			b1 = null, b2 = null, b3 = null, b4 = null, b5 = null,
			cor = null, cliq = null, rec = null;
	private Timer t1;
	private int flag = 0;

	public Luzes() {
		initComponents();

//		try {
//			URL som = new URL((getClass().getResource("/sons/spyderman.mid")).toString());
//			Musica = java.applet.Applet.newAudioClip(som);
//			Musica.loop();
//		} catch (MalformedURLException erro) {
//			System.out.println("Caminho do áudio não especificado! " + erro);
//		}
	}

	@Override
	protected String GetAudioName() {
		return "spyderman";
	}

    private void initComponents() {//GEN-BEGIN:initComponents
        Comecar = new javax.swing.JButton();
        LAmarelo = new javax.swing.JLabel();
        LAzul = new javax.swing.JLabel();
        LBranco = new javax.swing.JLabel();
        LVerde = new javax.swing.JLabel();
        LVermelho = new javax.swing.JLabel();
        LPreto = new javax.swing.JLabel();
        Luzes = new javax.swing.JLabel();
        Clique1 = new javax.swing.JLabel();
        Clique2 = new javax.swing.JLabel();
        Clique3 = new javax.swing.JLabel();
        Clique4 = new javax.swing.JLabel();
        Clique5 = new javax.swing.JLabel();
        Clique6 = new javax.swing.JLabel();
        Clique7 = new javax.swing.JLabel();
        Clique8 = new javax.swing.JLabel();
        Clique9 = new javax.swing.JLabel();
        Clique10 = new javax.swing.JLabel();
        Clique11 = new javax.swing.JLabel();
        Clique12 = new javax.swing.JLabel();
        Clique13 = new javax.swing.JLabel();
        Vermelho = new javax.swing.JLabel();
        Branco = new javax.swing.JLabel();
        Azul = new javax.swing.JLabel();
        Amarelo = new javax.swing.JLabel();
        Verde = new javax.swing.JLabel();
        Ajuda = new javax.swing.JButton();
        TelaLuzes = new javax.swing.JLabel();

        setTitle("Siga as Luzes!");
        Comecar.setBackground(new java.awt.Color(255, 255, 255));
        Comecar.setFont(new java.awt.Font("Comic Sans MS", 1, 23));
        Comecar.setForeground(new java.awt.Color(255, 0, 0));
        Comecar.setText("COME\u00c7AR");
        Comecar.setToolTipText("clique aqui para come\u00e7ar a jogar");
        Comecar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
        Comecar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComecarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ComecarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ComecarMousePressed(evt);
            }
        });
        Comecar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ComecarMouseMoved(evt);
            }
        });

        add(Comecar);
        Comecar.setBounds(50, 80, 150, 50);

        LAmarelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/lamarela.jpg")));
        LAmarelo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(LAmarelo);
        LAmarelo.setBounds(60, 80, 20, 20);

        LAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/lazul.jpg")));
        LAzul.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(LAzul);
        LAzul.setBounds(80, 80, 20, 20);

        LBranco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/lbranca.jpg")));
        LBranco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(LBranco);
        LBranco.setBounds(100, 80, 20, 20);

        LVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/lverde.jpg")));
        LVerde.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(LVerde);
        LVerde.setBounds(60, 100, 20, 20);

        LVermelho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/lvermelha.jpg")));
        LVermelho.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(LVermelho);
        LVermelho.setBounds(80, 100, 20, 20);

        LPreto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/preto.jpg")));
        LPreto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(LPreto);
        LPreto.setBounds(100, 100, 20, 20);

        Luzes.setBackground(new java.awt.Color(0, 0, 0));
        Luzes.setOpaque(true);
        add(Luzes);
        Luzes.setBounds(310, 80, 200, 200);

        Clique1.setBackground(new java.awt.Color(214, 214, 226));
        Clique1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.blue, java.awt.Color.gray));
        Clique1.setOpaque(true);
        add(Clique1);
        Clique1.setBounds(620, 100, 25, 25);

        Clique2.setBackground(new java.awt.Color(214, 214, 226));
        Clique2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.blue, java.awt.Color.gray));
        Clique2.setOpaque(true);
        add(Clique2);
        Clique2.setBounds(650, 100, 25, 25);

        Clique3.setBackground(new java.awt.Color(214, 214, 226));
        Clique3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.blue, java.awt.Color.gray));
        Clique3.setOpaque(true);
        add(Clique3);
        Clique3.setBounds(680, 100, 25, 25);

        Clique4.setBackground(new java.awt.Color(214, 214, 226));
        Clique4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.blue, java.awt.Color.gray));
        Clique4.setOpaque(true);
        add(Clique4);
        Clique4.setBounds(710, 100, 25, 25);

        Clique5.setBackground(new java.awt.Color(214, 214, 226));
        Clique5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.blue, java.awt.Color.gray));
        Clique5.setOpaque(true);
        add(Clique5);
        Clique5.setBounds(740, 100, 25, 25);

        Clique6.setBackground(new java.awt.Color(214, 214, 226));
        Clique6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.blue, java.awt.Color.gray));
        Clique6.setOpaque(true);
        add(Clique6);
        Clique6.setBounds(635, 140, 25, 25);

        Clique7.setBackground(new java.awt.Color(214, 214, 226));
        Clique7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.blue, java.awt.Color.gray));
        Clique7.setOpaque(true);
        add(Clique7);
        Clique7.setBounds(665, 140, 25, 25);

        Clique8.setBackground(new java.awt.Color(214, 214, 226));
        Clique8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.blue, java.awt.Color.gray));
        Clique8.setOpaque(true);
        add(Clique8);
        Clique8.setBounds(695, 140, 25, 25);

        Clique9.setBackground(new java.awt.Color(214, 214, 226));
        Clique9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.blue, java.awt.Color.gray));
        Clique9.setOpaque(true);
        add(Clique9);
        Clique9.setBounds(725, 140, 25, 25);

        Clique10.setBackground(new java.awt.Color(214, 214, 226));
        Clique10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.blue, java.awt.Color.gray));
        Clique10.setOpaque(true);
        add(Clique10);
        Clique10.setBounds(635, 180, 25, 25);

        Clique11.setBackground(new java.awt.Color(214, 214, 226));
        Clique11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.blue, java.awt.Color.gray));
        Clique11.setOpaque(true);
        add(Clique11);
        Clique11.setBounds(665, 180, 25, 25);

        Clique12.setBackground(new java.awt.Color(214, 214, 226));
        Clique12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.blue, java.awt.Color.gray));
        Clique12.setOpaque(true);
        add(Clique12);
        Clique12.setBounds(695, 180, 25, 25);

        Clique13.setBackground(new java.awt.Color(214, 214, 226));
        Clique13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.blue, java.awt.Color.gray));
        Clique13.setOpaque(true);
        add(Clique13);
        Clique13.setBounds(725, 180, 25, 25);

        Vermelho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/lvermelha.jpg")));
        Vermelho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VermelhoMouseClicked(evt);
            }
        });

        add(Vermelho);
        Vermelho.setBounds(130, 370, 100, 100);

        Branco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/lbranca.jpg")));
        Branco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BrancoMouseClicked(evt);
            }
        });

        add(Branco);
        Branco.setBounds(230, 370, 100, 100);

        Azul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/lazul.jpg")));
        Azul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AzulMouseClicked(evt);
            }
        });

        add(Azul);
        Azul.setBounds(330, 370, 100, 100);

        Amarelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/lamarela.jpg")));
        Amarelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AmareloMouseClicked(evt);
            }
        });

        add(Amarelo);
        Amarelo.setBounds(430, 370, 100, 100);

        Verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/lverde.jpg")));
        Verde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerdeMouseClicked(evt);
            }
        });

        add(Verde);
        Verde.setBounds(530, 370, 100, 100);

        Ajuda.setBackground(new java.awt.Color(244, 244, 246));
        Ajuda.setFont(new java.awt.Font("Comic Sans MS", 1, 30));
        Ajuda.setForeground(new java.awt.Color(255, 0, 0));
        Ajuda.setText("AJUDA");
        Ajuda.setToolTipText("clique aqui para chamar a juda");
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
        Ajuda.setBounds(37, 519, 230, 50);

        TelaLuzes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/telaluzes.jpg")));
        add(TelaLuzes);
        TelaLuzes.setBounds(0, 0, 800, 580);

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
//		Musica.stop();
//		texto = "-Quando estiver pronto para iniciar o jogo clique no botao Comecar.\n-Uma sequência de cores aparecerá. Repita a mesma sequência usando os botões coloridos.\n-Caso você tenha errado alguma cor, a mesma sequência irá se repetir.\n-Conforme você constrói a sua sequência, os quadradinhos do canto direito vão sendo preenchidos.Assim, você pode conferir se está clicando direitinho em cima dos botões.";
//		Ajuda a = new Ajuda();
//		a.textoajuda.setText(texto);
//		a.aj = 5;
//		a.setVisible(true);
//		this.setVisible(false);

		AbrirAjuda("-Quando estiver pronto para iniciar o jogo clique no botao Comecar.\n-Uma sequência de cores aparecerá. Repita a mesma sequência usando os botões coloridos.\n-Caso você tenha errado alguma cor, a mesma sequência irá se repetir.\n-Conforme você constrói a sua sequência, os quadradinhos do canto direito vão sendo preenchidos.Assim, você pode conferir se está clicando direitinho em cima dos botões.");
    }//GEN-LAST:event_AjudaMouseClicked

    private void ComecarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComecarMouseMoved
		Comecar.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_ComecarMouseMoved

    private void ComecarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComecarMousePressed
		Comecar.setBackground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_ComecarMousePressed

    private void ComecarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComecarMouseExited
		Comecar.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_ComecarMouseExited

    private void ComecarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComecarMouseClicked
		Aciona();
    }//GEN-LAST:event_ComecarMouseClicked

    private void VerdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerdeMouseClicked
		cliq = Verde.getIcon();
		DistribuiCliques();
    }//GEN-LAST:event_VerdeMouseClicked

    private void AmareloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AmareloMouseClicked
		cliq = Amarelo.getIcon();
		DistribuiCliques();
    }//GEN-LAST:event_AmareloMouseClicked

    private void AzulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AzulMouseClicked
		cliq = Azul.getIcon();
		DistribuiCliques();
    }//GEN-LAST:event_AzulMouseClicked

    private void BrancoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BrancoMouseClicked
		cliq = Branco.getIcon();
		DistribuiCliques();
    }//GEN-LAST:event_BrancoMouseClicked

    private void VermelhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VermelhoMouseClicked
		cliq = Vermelho.getIcon();
		DistribuiCliques();
    }//GEN-LAST:event_VermelhoMouseClicked

	private void DistribuiCliques() {
		rec = Clique1.getIcon();
		if (rec == null) {
			Clique1.setIcon(cliq);
		} else {
			rec = Clique2.getIcon();
			if (rec == null) {
				Clique2.setIcon(cliq);
			} else {
				rec = Clique3.getIcon();
				if (rec == null) {
					Clique3.setIcon(cliq);
				} else {
					rec = Clique4.getIcon();
					if (rec == null) {
						Clique4.setIcon(cliq);
					} else {
						rec = Clique5.getIcon();
						if (rec == null) {
							Clique5.setIcon(cliq);
						} else {
							rec = Clique6.getIcon();
							if (rec == null) {
								Clique6.setIcon(cliq);
							} else {
								rec = Clique7.getIcon();
								if (rec == null) {
									Clique7.setIcon(cliq);
								} else {
									rec = Clique8.getIcon();
									if (rec == null) {
										Clique8.setIcon(cliq);
									} else {
										rec = Clique9.getIcon();
										if (rec == null) {
											Clique9.setIcon(cliq);
										} else {
											rec = Clique10.getIcon();
											if (rec == null) {
												Clique10.setIcon(cliq);
											} else {
												rec = Clique11.getIcon();
												if (rec == null) {
													Clique11.setIcon(cliq);
												} else {
													rec = Clique12.getIcon();
													if (rec == null) {
														Clique12.setIcon(cliq);
													} else {
														rec = Clique13.getIcon();
														if (rec == null) {
															Clique13.setIcon(cliq);
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}

				}
			}

		}
		Compara();
	}

	private void RecebeClique() {
		a1 = Clique1.getIcon();
		a2 = Clique2.getIcon();
		a3 = Clique3.getIcon();
		a4 = Clique4.getIcon();
		a5 = Clique5.getIcon();
		a6 = Clique6.getIcon();
		a7 = Clique7.getIcon();
		a8 = Clique8.getIcon();
		a9 = Clique9.getIcon();
		a10 = Clique10.getIcon();
		a11 = Clique11.getIcon();
		a12 = Clique12.getIcon();
		a13 = Clique13.getIcon();

		b1 = LAmarelo.getIcon();
		b2 = LAzul.getIcon();
		b3 = LBranco.getIcon();
		b4 = LVerde.getIcon();
		b5 = LVermelho.getIcon();
	}

	private void AnulaCliques() {
		Clique1.setIcon(null);
		Clique2.setIcon(null);
		Clique3.setIcon(null);
		Clique4.setIcon(null);
		Clique5.setIcon(null);
		Clique6.setIcon(null);
		Clique7.setIcon(null);
		Clique8.setIcon(null);
		Clique9.setIcon(null);
		Clique10.setIcon(null);
		Clique11.setIcon(null);
		Clique12.setIcon(null);
		Clique13.setIcon(null);
	}

	private void AumentaPontos() {
		AnulaCliques();
		ptos = ptos + 1000;
		Pontos.setText(String.valueOf(ptos));
		Aciona();
	}

	private void ChamaErro() {
		AnulaCliques();
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
			er.FlagJogo = 5;
//			Musica.stop();
			er.setVisible(true);
			this.setVisible(false);
		}
		Aciona();
	}

	private void Compara() {

		while (fase <= 13) {
			RecebeClique();
			if (fase == 1) {
				if ((a1.toString().equals(b5.toString())) && (a2 == null) && (a3 == null) && (a4 == null) && (a5 == null)
						&& (a6 == null) && (a7 == null) && (a8 == null) && (a9 == null) && (a10 == null) && (a11 == null) && (a12 == null)
						&& (a13 == null)) {
					fase = 2;
					AumentaPontos();
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 2) {
				if ((a1.toString().equals(b5.toString())) && (a2.toString().equals(b4.toString()))
						&& (a3 == null) && (a4 == null) && (a5 == null) && (a6 == null) && (a7 == null) && (a8 == null) && (a9 == null)
						&& (a10 == null) && (a11 == null) && (a12 == null) && (a13 == null)) {
					fase = 3;
					AumentaPontos();
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 3) {
				if ((a1.toString().equals(b5.toString())) && (a2.toString().equals(b4.toString()))
						&& (a3.toString().equals(b3.toString())) && (a4 == null) && (a5 == null) && (a6 == null)
						&& (a7 == null) && (a8 == null) && (a9 == null) && (a10 == null) && (a11 == null) && (a12 == null)
						&& (a13 == null)) {
					fase = 4;
					AumentaPontos();
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 4) {
				if ((a1.toString().equals(b5.toString())) && (a2.toString().equals(b4.toString()))
						&& (a3.toString().equals(b3.toString())) && (a4.toString().equals(b1.toString()))
						&& (a5 == null) && (a6 == null) && (a7 == null) && (a8 == null) && (a9 == null) && (a10 == null)
						&& (a11 == null) && (a12 == null) && (a13 == null)) {
					fase = 5;
					AumentaPontos();
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 5) {
				if ((a1.toString().equals(b5.toString())) && (a2.toString().equals(b4.toString()))
						&& (a3.toString().equals(b3.toString())) && (a4.toString().equals(b1.toString()))
						&& (a5.toString().equals(b2.toString())) && (a6 == null) && (a7 == null) && (a8 == null)
						&& (a9 == null) && (a10 == null) && (a11 == null) && (a12 == null) && (a13 == null)) {
					fase = 6;
					AumentaPontos();
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 6) {
				if ((a1.toString().equals(b5.toString())) && (a2.toString().equals(b4.toString()))
						&& (a3.toString().equals(b3.toString())) && (a4.toString().equals(b1.toString()))
						&& (a5.toString().equals(b2.toString())) && (a6.toString().equals(b4.toString()))
						&& (a7 == null) && (a8 == null) && (a9 == null) && (a10 == null) && (a11 == null) && (a12 == null)
						&& (a13 == null)) {
					fase = 7;
					AumentaPontos();
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 7) {
				if ((a1.toString().equals(b5.toString())) && (a2.toString().equals(b4.toString()))
						&& (a3.toString().equals(b3.toString())) && (a4.toString().equals(b1.toString()))
						&& (a5.toString().equals(b2.toString())) && (a6.toString().equals(b4.toString()))
						&& (a7.toString().equals(b3.toString())) && (a8 == null) && (a9 == null) && (a10 == null)
						&& (a11 == null) && (a12 == null) && (a13 == null)) {
					fase = 8;
					AumentaPontos();
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 8) {
				if ((a1.toString().equals(b5.toString())) && (a2.toString().equals(b4.toString()))
						&& (a3.toString().equals(b3.toString())) && (a4.toString().equals(b1.toString()))
						&& (a5.toString().equals(b2.toString())) && (a6.toString().equals(b4.toString()))
						&& (a7.toString().equals(b3.toString())) && (a8.toString().equals(b1.toString()))
						&& (a9 == null) && (a10 == null) && (a11 == null) && (a12 == null) && (a13 == null)) {
					fase = 9;
					AumentaPontos();
					break;
				} else {
					fase = 8;
					ChamaErro();
					break;
				}
			}

			if (fase == 9) {
				if ((a1.toString().equals(b5.toString())) && (a2.toString().equals(b4.toString()))
						&& (a3.toString().equals(b3.toString())) && (a4.toString().equals(b1.toString()))
						&& (a5.toString().equals(b2.toString())) && (a6.toString().equals(b4.toString()))
						&& (a7.toString().equals(b3.toString())) && (a8.toString().equals(b1.toString()))
						&& (a9.toString().equals(b2.toString())) && (a10 == null) && (a11 == null) && (a12 == null)
						&& (a13 == null)) {
					fase = 10;
					AumentaPontos();
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 10) {
				if ((a1.toString().equals(b5.toString())) && (a2.toString().equals(b4.toString()))
						&& (a3.toString().equals(b3.toString())) && (a4.toString().equals(b1.toString()))
						&& (a5.toString().equals(b2.toString())) && (a6.toString().equals(b4.toString()))
						&& (a7.toString().equals(b3.toString())) && (a8.toString().equals(b1.toString()))
						&& (a9.toString().equals(b2.toString())) && (a10.toString().equals(b5.toString()))
						&& (a11 == null) && (a12 == null) && (a13 == null)) {
					fase = 11;
					AumentaPontos();
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 11) {
				if ((a1.toString().equals(b5.toString())) && (a2.toString().equals(b4.toString()))
						&& (a3.toString().equals(b3.toString())) && (a4.toString().equals(b1.toString()))
						&& (a5.toString().equals(b2.toString())) && (a6.toString().equals(b4.toString()))
						&& (a7.toString().equals(b3.toString())) && (a8.toString().equals(b1.toString()))
						&& (a9.toString().equals(b2.toString())) && (a10.toString().equals(b5.toString()))
						&& (a11.toString().equals(b1.toString())) && (a12 == null) && (a13 == null)) {
					fase = 12;
					AumentaPontos();
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 12) {
				if ((a1.toString().equals(b5.toString())) && (a2.toString().equals(b4.toString()))
						&& (a3.toString().equals(b3.toString())) && (a4.toString().equals(b1.toString()))
						&& (a5.toString().equals(b2.toString())) && (a6.toString().equals(b4.toString()))
						&& (a7.toString().equals(b3.toString())) && (a8.toString().equals(b1.toString()))
						&& (a9.toString().equals(b2.toString())) && (a10.toString().equals(b5.toString()))
						&& (a11.toString().equals(b1.toString())) && (a12.toString().equals(b4.toString()))
						&& (a13 == null)) {
					fase = 13;
					AumentaPontos();
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 13) {
				if ((a1.toString().equals(b5.toString())) && (a2.toString().equals(b4.toString()))
						&& (a3.toString().equals(b3.toString())) && (a4.toString().equals(b1.toString()))
						&& (a5.toString().equals(b2.toString())) && (a6.toString().equals(b4.toString()))
						&& (a7.toString().equals(b3.toString())) && (a8.toString().equals(b1.toString()))
						&& (a9.toString().equals(b2.toString())) && (a10.toString().equals(b5.toString()))
						&& (a11.toString().equals(b1.toString())) && (a12.toString().equals(b4.toString()))
						&& (a13.toString().equals(b3.toString()))) {
					fase = 1;
					AumentaPontos();
					Acerto ac = new Acerto();
					ac.Pontuacao.setText(String.valueOf(ptos));
					ac.FlagJogo = 5;
//					Musica.stop();
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

	private void Aciona() {
		flag = 0;
		if (fase == 1) {
			t1 = new Timer(1000, new Sequencia());
		}
		if (fase == 2) {
			t1 = new Timer(1000, new Sequencia1());
		}
		if (fase == 3) {
			t1 = new Timer(1000, new Sequencia2());
		}
		if (fase == 4) {
			t1 = new Timer(1000, new Sequencia3());
		}
		if (fase == 5) {
			t1 = new Timer(1000, new Sequencia4());
		}
		if (fase == 6) {
			t1 = new Timer(1000, new Sequencia5());
		}
		if (fase == 7) {
			t1 = new Timer(1000, new Sequencia6());
		}
		if (fase == 8) {
			t1 = new Timer(1000, new Sequencia7());
		}
		if (fase == 9) {
			t1 = new Timer(1000, new Sequencia8());
		}
		if (fase == 10) {
			t1 = new Timer(1000, new Sequencia9());
		}
		if (fase == 11) {
			t1 = new Timer(1000, new Sequencia10());
		}
		if (fase == 12) {
			t1 = new Timer(1000, new Sequencia11());
		}
		if (fase == 13) {
			t1 = new Timer(1000, new Sequencia12());
		}
		t1.start();
	}

	private class Sequencia implements ActionListener {

		public void actionPerformed(ActionEvent actionEvent) {
			if (flag == 0) {
				Vermelha();
				flag++;
			} else if (flag == 1) {
				Preta();
				t1.stop();
			}
		}
	}

	private class Sequencia1 implements ActionListener {

		public void actionPerformed(ActionEvent actionEvent) {
			if (flag == 0) {
				Preta();
				flag++;
			} else if (flag == 1) {
				Vermelha();
				flag++;
			} else if (flag == 2) {
				Verde();
				flag++;
			} else if (flag == 3) {
				Preta();
				t1.stop();
			}
		}
	}

	private class Sequencia2 implements ActionListener {

		public void actionPerformed(ActionEvent actionEvent) {
			if (flag == 0) {
				Preta();
				flag++;
			} else if (flag == 1) {
				Vermelha();
				flag++;
			} else if (flag == 2) {
				Verde();
				flag++;
			} else if (flag == 3) {
				Branca();
				flag++;
			} else if (flag == 4) {
				Preta();
				t1.stop();
			}
		}
	}

	private class Sequencia3 implements ActionListener {

		public void actionPerformed(ActionEvent actionEvent) {
			if (flag == 0) {
				Preta();
				flag++;
			} else if (flag == 1) {
				Vermelha();
				flag++;
			} else if (flag == 2) {
				Verde();
				flag++;
			} else if (flag == 3) {
				Branca();
				flag++;
			} else if (flag == 4) {
				Amarela();
				flag++;
			} else if (flag == 5) {
				Preta();
				t1.stop();
			}
		}
	}

	private class Sequencia4 implements ActionListener {

		public void actionPerformed(ActionEvent actionEvent) {
			if (flag == 0) {
				Preta();
				flag++;
			} else if (flag == 1) {
				Vermelha();
				flag++;
			} else if (flag == 2) {
				Verde();
				flag++;
			} else if (flag == 3) {
				Branca();
				flag++;
			} else if (flag == 4) {
				Amarela();
				flag++;
			} else if (flag == 5) {
				Azul();
				flag++;
			} else if (flag == 6) {
				Preta();
				t1.stop();
			}
		}
	}

	private class Sequencia5 implements ActionListener {

		public void actionPerformed(ActionEvent actionEvent) {
			if (flag == 0) {
				Preta();
				flag++;
			} else if (flag == 1) {
				Vermelha();
				flag++;
			} else if (flag == 2) {
				Verde();
				flag++;
			} else if (flag == 3) {
				Branca();
				flag++;
			} else if (flag == 4) {
				Amarela();
				flag++;
			} else if (flag == 5) {
				Azul();
				flag++;
			} else if (flag == 6) {
				Verde();
				flag++;
			} else if (flag == 7) {
				Preta();
				t1.stop();
			}
		}
	}

	private class Sequencia6 implements ActionListener {

		public void actionPerformed(ActionEvent actionEvent) {
			if (flag == 0) {
				Preta();
				flag++;
			} else if (flag == 1) {
				Vermelha();
				flag++;
			} else if (flag == 2) {
				Verde();
				flag++;
			} else if (flag == 3) {
				Branca();
				flag++;
			} else if (flag == 4) {
				Amarela();
				flag++;
			} else if (flag == 5) {
				Azul();
				flag++;
			} else if (flag == 6) {
				Verde();
				flag++;
			} else if (flag == 7) {
				Branca();
				flag++;
			} else if (flag == 8) {
				Preta();
				t1.stop();
			}
		}
	}

	private class Sequencia7 implements ActionListener {

		public void actionPerformed(ActionEvent actionEvent) {
			if (flag == 0) {
				Preta();
				flag++;
			} else if (flag == 1) {
				Vermelha();
				flag++;
			} else if (flag == 2) {
				Verde();
				flag++;
			} else if (flag == 3) {
				Branca();
				flag++;
			} else if (flag == 4) {
				Amarela();
				flag++;
			} else if (flag == 5) {
				Azul();
				flag++;
			} else if (flag == 6) {
				Verde();
				flag++;
			} else if (flag == 7) {
				Branca();
				flag++;
			} else if (flag == 8) {
				Amarela();
				flag++;
			} else if (flag == 9) {
				Preta();
				t1.stop();
			}
		}
	}

	private class Sequencia8 implements ActionListener {

		public void actionPerformed(ActionEvent actionEvent) {
			if (flag == 0) {
				Preta();
				flag++;
			} else if (flag == 1) {
				Vermelha();
				flag++;
			} else if (flag == 2) {
				Verde();
				flag++;
			} else if (flag == 3) {
				Branca();
				flag++;
			} else if (flag == 4) {
				Amarela();
				flag++;
			} else if (flag == 5) {
				Azul();
				flag++;
			} else if (flag == 6) {
				Verde();
				flag++;
			} else if (flag == 7) {
				Branca();
				flag++;
			} else if (flag == 8) {
				Amarela();
				flag++;
			} else if (flag == 9) {
				Azul();
				flag++;
			} else if (flag == 10) {
				Preta();
				t1.stop();
			}
		}
	}

	private class Sequencia9 implements ActionListener {

		public void actionPerformed(ActionEvent actionEvent) {
			if (flag == 0) {
				Preta();
				flag++;
			} else if (flag == 1) {
				Vermelha();
				flag++;
			} else if (flag == 2) {
				Verde();
				flag++;
			} else if (flag == 3) {
				Branca();
				flag++;
			} else if (flag == 4) {
				Amarela();
				flag++;
			} else if (flag == 5) {
				Azul();
				flag++;
			} else if (flag == 6) {
				Verde();
				flag++;
			} else if (flag == 7) {
				Branca();
				flag++;
			} else if (flag == 8) {
				Amarela();
				flag++;
			} else if (flag == 9) {
				Azul();
				flag++;
			} else if (flag == 10) {
				Vermelha();
				flag++;
			} else if (flag == 11) {
				Preta();
				t1.stop();
			}
		}
	}

	private class Sequencia10 implements ActionListener {

		public void actionPerformed(ActionEvent actionEvent) {
			if (flag == 0) {
				Preta();
				flag++;
			} else if (flag == 1) {
				Vermelha();
				flag++;
			} else if (flag == 2) {
				Verde();
				flag++;
			} else if (flag == 3) {
				Branca();
				flag++;
			} else if (flag == 4) {
				Amarela();
				flag++;
			} else if (flag == 5) {
				Azul();
				flag++;
			} else if (flag == 6) {
				Verde();
				flag++;
			} else if (flag == 7) {
				Branca();
				flag++;
			} else if (flag == 8) {
				Amarela();
				flag++;
			} else if (flag == 9) {
				Azul();
				flag++;
			} else if (flag == 10) {
				Vermelha();
				flag++;
			} else if (flag == 11) {
				Amarela();
				flag++;
			} else if (flag == 12) {
				Preta();
				t1.stop();
			}
		}
	}

	private class Sequencia11 implements ActionListener {

		public void actionPerformed(ActionEvent actionEvent) {
			if (flag == 0) {
				Preta();
				flag++;
			} else if (flag == 1) {
				Vermelha();
				flag++;
			} else if (flag == 2) {
				Verde();
				flag++;
			} else if (flag == 3) {
				Branca();
				flag++;
			} else if (flag == 4) {
				Amarela();
				flag++;
			} else if (flag == 5) {
				Azul();
				flag++;
			} else if (flag == 6) {
				Verde();
				flag++;
			} else if (flag == 7) {
				Branca();
				flag++;
			} else if (flag == 8) {
				Amarela();
				flag++;
			} else if (flag == 9) {
				Azul();
				flag++;
			} else if (flag == 10) {
				Vermelha();
				flag++;
			} else if (flag == 11) {
				Amarela();
				flag++;
			} else if (flag == 12) {
				Verde();
				flag++;
			} else if (flag == 13) {
				Preta();
				t1.stop();
			}
		}
	}

	private class Sequencia12 implements ActionListener {

		public void actionPerformed(ActionEvent actionEvent) {
			if (flag == 0) {
				Preta();
				flag++;
			} else if (flag == 1) {
				Vermelha();
				flag++;
			} else if (flag == 2) {
				Verde();
				flag++;
			} else if (flag == 3) {
				Branca();
				flag++;
			} else if (flag == 4) {
				Amarela();
				flag++;
			} else if (flag == 5) {
				Azul();
				flag++;
			} else if (flag == 6) {
				Verde();
				flag++;
			} else if (flag == 7) {
				Branca();
				flag++;
			} else if (flag == 8) {
				Amarela();
				flag++;
			} else if (flag == 9) {
				Azul();
				flag++;
			} else if (flag == 10) {
				Vermelha();
				flag++;
			} else if (flag == 11) {
				Amarela();
				flag++;
			} else if (flag == 12) {
				Verde();
				flag++;
			} else if (flag == 13) {
				Branca();
				flag++;
			} else if (flag == 14) {
				Preta();
				t1.stop();
			}
		}
	}

	private void Amarela() {
		cor = LAmarelo.getIcon();
		Luzes.setIcon(cor);
	}

	private void Azul() {
		cor = LAzul.getIcon();
		Luzes.setIcon(cor);
	}

	private void Branca() {
		cor = LBranco.getIcon();
		Luzes.setIcon(cor);
	}

	private void Verde() {
		cor = LVerde.getIcon();
		Luzes.setIcon(cor);
	}

	private void Vermelha() {
		cor = LVermelho.getIcon();
		Luzes.setIcon(cor);
	}

	private void Preta() {
		cor = LPreto.getIcon();
		Luzes.setIcon(cor);
	}

	public static void main(String args[]) {
		new Luzes().show();
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ajuda;
    private javax.swing.JLabel Amarelo;
    private javax.swing.JLabel Azul;
    private javax.swing.JLabel Branco;
    private javax.swing.JLabel Clique1;
    private javax.swing.JLabel Clique10;
    private javax.swing.JLabel Clique11;
    private javax.swing.JLabel Clique12;
    private javax.swing.JLabel Clique13;
    private javax.swing.JLabel Clique2;
    private javax.swing.JLabel Clique3;
    private javax.swing.JLabel Clique4;
    private javax.swing.JLabel Clique5;
    private javax.swing.JLabel Clique6;
    private javax.swing.JLabel Clique7;
    private javax.swing.JLabel Clique8;
    private javax.swing.JLabel Clique9;
    private javax.swing.JButton Comecar;
    private javax.swing.JLabel LAmarelo;
    private javax.swing.JLabel LAzul;
    private javax.swing.JLabel LBranco;
    private javax.swing.JLabel LPreto;
    private javax.swing.JLabel LVerde;
    private javax.swing.JLabel LVermelho;
    private javax.swing.JLabel Luzes;
    private javax.swing.JLabel TelaLuzes;
    private javax.swing.JLabel Verde;
    private javax.swing.JLabel Vermelho;
    // End of variables declaration//GEN-END:variables

	@Override
	protected FaseControladorBase GetControladorFase() {
		return null;
	}
}
