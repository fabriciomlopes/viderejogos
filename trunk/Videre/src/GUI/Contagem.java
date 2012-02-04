package GUI;

import java.net.*;

public class Contagem extends TelaJogo {

	private String st, st2;
	String c1 = null, c2 = null;

	public Contagem() {
		initComponents();

		//inicia a musica
		try {
			URL som = new URL((getClass().getResource("/sons/animaniacs.mid")).toString());
			Musica = java.applet.Applet.newAudioClip(som);
			Musica.loop();
		} catch (MalformedURLException erro) {
			System.out.println("Caminho do áudio não especificado! " + erro);
		}
	}

    private void initComponents() {//GEN-BEGIN:initComponents
        A = new javax.swing.JLabel();
        B = new javax.swing.JLabel();
        C = new javax.swing.JLabel();
        D = new javax.swing.JLabel();
        E = new javax.swing.JLabel();
        F = new javax.swing.JLabel();
        G = new javax.swing.JLabel();
        H = new javax.swing.JLabel();
        I = new javax.swing.JLabel();
        J = new javax.swing.JLabel();
        K = new javax.swing.JLabel();
        L = new javax.swing.JLabel();
        M = new javax.swing.JLabel();
        N = new javax.swing.JLabel();
        O = new javax.swing.JLabel();
        P = new javax.swing.JLabel();
        Q = new javax.swing.JLabel();
        R = new javax.swing.JLabel();
        S = new javax.swing.JLabel();
        T = new javax.swing.JLabel();
        U = new javax.swing.JLabel();
        V = new javax.swing.JLabel();
        W = new javax.swing.JLabel();
        X = new javax.swing.JLabel();
        Y = new javax.swing.JLabel();
        Z = new javax.swing.JLabel();
        PainelLetras = new javax.swing.JPanel();
        FundoCamuflado = new javax.swing.JLabel();
        PainelFundo = new javax.swing.JPanel();
        Ajuda = new javax.swing.JButton();
        Clique2 = new javax.swing.JLabel();
        Clique1 = new javax.swing.JLabel();
        Fase2 = new javax.swing.JLabel();
        Fase3 = new javax.swing.JLabel();
        Fase4 = new javax.swing.JLabel();
        Fase5 = new javax.swing.JLabel();
        Fase6 = new javax.swing.JLabel();
        Fase7 = new javax.swing.JLabel();
        Fase8 = new javax.swing.JLabel();
        Fase9 = new javax.swing.JLabel();
        Fase10 = new javax.swing.JLabel();
        Fase11 = new javax.swing.JLabel();
        Fase12 = new javax.swing.JLabel();
        Fase13 = new javax.swing.JLabel();

        setTitle("Ache as Letras!");
        A.setBackground(new java.awt.Color(255, 255, 255));
        A.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        A.setForeground(new java.awt.Color(255, 0, 0));
        A.setText("A");
        A.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        A.setOpaque(true);
        A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AMouseExited(evt);
            }
        });
        A.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AMouseMoved(evt);
            }
        });

        add(A);
        A.setBounds(570, 90, 40, 40);

        B.setBackground(new java.awt.Color(255, 255, 255));
        B.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        B.setForeground(new java.awt.Color(255, 0, 0));
        B.setText("B");
        B.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        B.setOpaque(true);
        B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BMouseExited(evt);
            }
        });
        B.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BMouseMoved(evt);
            }
        });

        add(B);
        B.setBounds(630, 90, 40, 40);

        C.setBackground(new java.awt.Color(255, 255, 255));
        C.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        C.setForeground(new java.awt.Color(255, 0, 0));
        C.setText("C");
        C.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        C.setOpaque(true);
        C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CMouseExited(evt);
            }
        });
        C.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CMouseMoved(evt);
            }
        });

        add(C);
        C.setBounds(690, 90, 40, 40);

        D.setBackground(new java.awt.Color(255, 255, 255));
        D.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        D.setForeground(new java.awt.Color(255, 0, 0));
        D.setText("D");
        D.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        D.setOpaque(true);
        D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DMouseExited(evt);
            }
        });
        D.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                DMouseMoved(evt);
            }
        });

        add(D);
        D.setBounds(570, 135, 40, 40);

        E.setBackground(new java.awt.Color(255, 255, 255));
        E.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        E.setForeground(new java.awt.Color(255, 0, 0));
        E.setText("E");
        E.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        E.setOpaque(true);
        E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EMouseExited(evt);
            }
        });
        E.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                EMouseMoved(evt);
            }
        });

        add(E);
        E.setBounds(630, 135, 40, 40);

        F.setBackground(new java.awt.Color(255, 255, 255));
        F.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        F.setForeground(new java.awt.Color(255, 0, 0));
        F.setText("F");
        F.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        F.setOpaque(true);
        F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FMouseExited(evt);
            }
        });
        F.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FMouseMoved(evt);
            }
        });

        add(F);
        F.setBounds(690, 135, 40, 40);

        G.setBackground(new java.awt.Color(255, 255, 255));
        G.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        G.setForeground(new java.awt.Color(255, 0, 0));
        G.setText("G");
        G.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        G.setOpaque(true);
        G.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GMouseExited(evt);
            }
        });
        G.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                GMouseMoved(evt);
            }
        });

        add(G);
        G.setBounds(570, 180, 40, 40);

        H.setBackground(new java.awt.Color(255, 255, 255));
        H.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        H.setForeground(new java.awt.Color(255, 0, 0));
        H.setText("H");
        H.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        H.setOpaque(true);
        H.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HMouseExited(evt);
            }
        });
        H.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                HMouseMoved(evt);
            }
        });

        add(H);
        H.setBounds(630, 180, 40, 40);

        I.setBackground(new java.awt.Color(255, 255, 255));
        I.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        I.setForeground(new java.awt.Color(255, 0, 0));
        I.setText("I");
        I.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        I.setOpaque(true);
        I.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IMouseExited(evt);
            }
        });
        I.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                IMouseMoved(evt);
            }
        });

        add(I);
        I.setBounds(690, 180, 40, 40);

        J.setBackground(new java.awt.Color(255, 255, 255));
        J.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        J.setForeground(new java.awt.Color(255, 0, 0));
        J.setText("J");
        J.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        J.setOpaque(true);
        J.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JMouseExited(evt);
            }
        });
        J.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JMouseMoved(evt);
            }
        });

        add(J);
        J.setBounds(570, 225, 40, 40);

        K.setBackground(new java.awt.Color(255, 255, 255));
        K.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        K.setForeground(new java.awt.Color(255, 0, 0));
        K.setText("K");
        K.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        K.setOpaque(true);
        K.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                KMouseExited(evt);
            }
        });
        K.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                KMouseMoved(evt);
            }
        });

        add(K);
        K.setBounds(630, 225, 40, 40);

        L.setBackground(new java.awt.Color(255, 255, 255));
        L.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        L.setForeground(new java.awt.Color(255, 0, 0));
        L.setText("L");
        L.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        L.setOpaque(true);
        L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LMouseExited(evt);
            }
        });
        L.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LMouseMoved(evt);
            }
        });

        add(L);
        L.setBounds(690, 225, 40, 40);

        M.setBackground(new java.awt.Color(255, 255, 255));
        M.setFont(new java.awt.Font("Comic Sans MS", 1, 43));
        M.setForeground(new java.awt.Color(255, 0, 0));
        M.setText("M");
        M.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        M.setOpaque(true);
        M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MMouseExited(evt);
            }
        });
        M.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MMouseMoved(evt);
            }
        });

        add(M);
        M.setBounds(570, 270, 40, 40);

        N.setBackground(new java.awt.Color(255, 255, 255));
        N.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        N.setForeground(new java.awt.Color(255, 0, 0));
        N.setText("N");
        N.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        N.setOpaque(true);
        N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NMouseExited(evt);
            }
        });
        N.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                NMouseMoved(evt);
            }
        });

        add(N);
        N.setBounds(630, 270, 40, 40);

        O.setBackground(new java.awt.Color(255, 255, 255));
        O.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        O.setForeground(new java.awt.Color(255, 0, 0));
        O.setText("O");
        O.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        O.setOpaque(true);
        O.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OMouseExited(evt);
            }
        });
        O.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                OMouseMoved(evt);
            }
        });

        add(O);
        O.setBounds(690, 270, 40, 40);

        P.setBackground(new java.awt.Color(255, 255, 255));
        P.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        P.setForeground(new java.awt.Color(255, 0, 0));
        P.setText("P");
        P.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        P.setOpaque(true);
        P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PMouseExited(evt);
            }
        });
        P.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                PMouseMoved(evt);
            }
        });

        add(P);
        P.setBounds(570, 315, 40, 40);

        Q.setBackground(new java.awt.Color(255, 255, 255));
        Q.setFont(new java.awt.Font("Comic Sans MS", 1, 43));
        Q.setForeground(new java.awt.Color(255, 0, 0));
        Q.setText("Q");
        Q.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        Q.setOpaque(true);
        Q.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                QMouseExited(evt);
            }
        });
        Q.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                QMouseMoved(evt);
            }
        });

        add(Q);
        Q.setBounds(630, 315, 40, 40);

        R.setBackground(new java.awt.Color(255, 255, 255));
        R.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        R.setForeground(new java.awt.Color(255, 0, 0));
        R.setText("R");
        R.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        R.setOpaque(true);
        R.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RMouseExited(evt);
            }
        });
        R.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                RMouseMoved(evt);
            }
        });

        add(R);
        R.setBounds(690, 315, 40, 40);

        S.setBackground(new java.awt.Color(255, 255, 255));
        S.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        S.setForeground(new java.awt.Color(255, 0, 0));
        S.setText("S");
        S.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        S.setOpaque(true);
        S.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SMouseExited(evt);
            }
        });
        S.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SMouseMoved(evt);
            }
        });

        add(S);
        S.setBounds(570, 360, 40, 40);

        T.setBackground(new java.awt.Color(255, 255, 255));
        T.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        T.setForeground(new java.awt.Color(255, 0, 0));
        T.setText("T");
        T.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        T.setOpaque(true);
        T.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TMouseExited(evt);
            }
        });
        T.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                TMouseMoved(evt);
            }
        });

        add(T);
        T.setBounds(630, 360, 40, 40);

        U.setBackground(new java.awt.Color(255, 255, 255));
        U.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        U.setForeground(new java.awt.Color(255, 0, 0));
        U.setText("U");
        U.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        U.setOpaque(true);
        U.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UMouseExited(evt);
            }
        });
        U.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                UMouseMoved(evt);
            }
        });

        add(U);
        U.setBounds(690, 360, 40, 40);

        V.setBackground(new java.awt.Color(255, 255, 255));
        V.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        V.setForeground(new java.awt.Color(255, 0, 0));
        V.setText("V");
        V.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        V.setOpaque(true);
        V.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VMouseExited(evt);
            }
        });
        V.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                VMouseMoved(evt);
            }
        });

        add(V);
        V.setBounds(570, 405, 40, 40);

        W.setBackground(new java.awt.Color(255, 255, 255));
        W.setFont(new java.awt.Font("Comic Sans MS", 1, 37));
        W.setForeground(new java.awt.Color(255, 0, 0));
        W.setText("W");
        W.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        W.setOpaque(true);
        W.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                WMouseExited(evt);
            }
        });
        W.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                WMouseMoved(evt);
            }
        });

        add(W);
        W.setBounds(630, 405, 40, 40);

        X.setBackground(new java.awt.Color(255, 255, 255));
        X.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        X.setForeground(new java.awt.Color(255, 0, 0));
        X.setText("X");
        X.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        X.setOpaque(true);
        X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                XMouseExited(evt);
            }
        });
        X.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                XMouseMoved(evt);
            }
        });

        add(X);
        X.setBounds(690, 405, 40, 40);

        Y.setBackground(new java.awt.Color(255, 255, 255));
        Y.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        Y.setForeground(new java.awt.Color(255, 0, 0));
        Y.setText("Y");
        Y.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        Y.setOpaque(true);
        Y.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                YMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                YMouseExited(evt);
            }
        });
        Y.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                YMouseMoved(evt);
            }
        });

        add(Y);
        Y.setBounds(570, 450, 40, 40);

        Z.setBackground(new java.awt.Color(255, 255, 255));
        Z.setFont(new java.awt.Font("Comic Sans MS", 1, 44));
        Z.setForeground(new java.awt.Color(255, 0, 0));
        Z.setText("Z");
        Z.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255)));
        Z.setOpaque(true);
        Z.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ZMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ZMouseExited(evt);
            }
        });
        Z.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ZMouseMoved(evt);
            }
        });

        add(Z);
        Z.setBounds(630, 450, 40, 40);

        PainelLetras.setLayout(null);

        PainelLetras.setBackground(new java.awt.Color(255, 255, 255));
        PainelLetras.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.red, java.awt.Color.red));
        add(PainelLetras);
        PainelLetras.setBounds(540, 80, 220, 420);

        FundoCamuflado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fase1.jpg")));
        add(FundoCamuflado);
        FundoCamuflado.setBounds(30, 120, 500, 350);

        PainelFundo.setLayout(null);

        PainelFundo.setBackground(new java.awt.Color(255, 255, 255));
        PainelFundo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.blue, java.awt.Color.blue));
        add(PainelFundo);
        PainelFundo.setBounds(20, 110, 520, 370);

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
        Ajuda.setBounds(37, 519, 230, 50);

        Clique2.setText("-");
        Clique2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Clique2);
        Clique2.setBounds(70, 530, 15, 15);
        Clique2.getAccessibleContext().setAccessibleName(null);

        Clique1.setText("-");
        Clique1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Clique1);
        Clique1.setBounds(50, 530, 15, 15);
        Clique1.getAccessibleContext().setAccessibleName(null);

        Fase2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fase2.jpg")));
        Fase2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Fase2);
        Fase2.setBounds(20, 330, 15, 15);

        Fase3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fase3.jpg")));
        Fase3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Fase3);
        Fase3.setBounds(40, 330, 15, 15);

        Fase4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fase4.jpg")));
        Fase4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Fase4);
        Fase4.setBounds(60, 330, 15, 15);

        Fase5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fase5.jpg")));
        Fase5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Fase5);
        Fase5.setBounds(80, 330, 15, 15);

        Fase6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fase6.jpg")));
        Fase6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Fase6);
        Fase6.setBounds(100, 330, 15, 15);

        Fase7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fase7.jpg")));
        Fase7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Fase7);
        Fase7.setBounds(120, 330, 15, 15);

        Fase8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fase8.jpg")));
        Fase8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Fase8);
        Fase8.setBounds(140, 330, 15, 15);

        Fase9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fase9.jpg")));
        Fase9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Fase9);
        Fase9.setBounds(160, 330, 15, 15);

        Fase10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fase10.jpg")));
        Fase10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Fase10);
        Fase10.setBounds(180, 330, 15, 15);

        Fase11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fase11.jpg")));
        Fase11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Fase11);
        Fase11.setBounds(200, 330, 15, 15);

        Fase12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fase12.jpg")));
        Fase12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Fase12);
        Fase12.setBounds(220, 330, 15, 15);

        Fase13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fase13.jpg")));
        Fase13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        add(Fase13);
        Fase13.setBounds(240, 330, 15, 15);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800, 600);
    }//GEN-END:initComponents

	//muda a cor do botao para verde quando pressionado
    private void AjudaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjudaMousePressed
		Ajuda.setBackground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_AjudaMousePressed

	//muda a cor do botao para amarelo quando o mouse passa em cima
    private void AjudaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjudaMouseMoved
		Ajuda.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_AjudaMouseMoved

	//volta a cor do botao ao normal quando o mouse não está em cima
    private void AjudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjudaMouseExited
		Ajuda.setBackground(new java.awt.Color(244, 244, 246));
    }//GEN-LAST:event_AjudaMouseExited

	//chama a ajuda para o jogo Ache as Letras
    private void AjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjudaMouseClicked
		Musica.stop();
		texto = "-Em cada fase aparecer� uma imagem com duas letras.\n\n-Identifique as letras que aparecem na imagem e clique em cima delas no grupo de letras do lado direito";
		Ajuda a = new Ajuda();
		a.textoajuda.setText(texto);
		a.aj = 1;
		a.setVisible(true);
		this.setVisible(false);
    }//GEN-LAST:event_AjudaMouseClicked

	//muda a cor das label�s para amarelo quando o mouse passa em cima delas
    private void ZMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZMouseMoved
		Z.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_ZMouseMoved

    private void YMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YMouseMoved
		Y.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_YMouseMoved

    private void XMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseMoved
		X.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_XMouseMoved

    private void WMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WMouseMoved
		W.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_WMouseMoved

    private void VMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VMouseMoved
		V.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_VMouseMoved

    private void UMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UMouseMoved
		U.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_UMouseMoved

    private void TMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TMouseMoved
		T.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_TMouseMoved

    private void SMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SMouseMoved
		S.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_SMouseMoved

    private void RMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMouseMoved
		R.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_RMouseMoved

    private void QMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QMouseMoved
		Q.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_QMouseMoved

    private void PMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMouseMoved
		P.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_PMouseMoved

    private void OMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OMouseMoved
		O.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_OMouseMoved

    private void NMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NMouseMoved
		N.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_NMouseMoved

    private void MMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MMouseMoved
		M.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_MMouseMoved

    private void LMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LMouseMoved
		L.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_LMouseMoved

    private void KMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KMouseMoved
		K.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_KMouseMoved

    private void JMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMouseMoved
		J.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_JMouseMoved

    private void IMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IMouseMoved
		I.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_IMouseMoved

    private void HMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HMouseMoved
		H.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_HMouseMoved

    private void GMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GMouseMoved
		G.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_GMouseMoved

    private void FMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FMouseMoved
		F.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_FMouseMoved

    private void EMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMouseMoved
		E.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_EMouseMoved

    private void DMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DMouseMoved
		D.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_DMouseMoved

    private void CMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMouseMoved
		C.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_CMouseMoved

    private void BMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMouseMoved
		B.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_BMouseMoved

	//volta a cor das label�s ao normal quando o mouse nao esta em cima delas
    private void ZMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZMouseExited
		Z.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_ZMouseExited

    private void YMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YMouseExited
		Y.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_YMouseExited

    private void XMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseExited
		X.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_XMouseExited

    private void WMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WMouseExited
		W.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_WMouseExited

    private void VMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VMouseExited
		V.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_VMouseExited

    private void UMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UMouseExited
		U.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_UMouseExited

    private void TMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TMouseExited
		T.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_TMouseExited

    private void SMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SMouseExited
		S.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_SMouseExited

    private void RMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMouseExited
		R.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_RMouseExited

    private void QMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QMouseExited
		Q.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_QMouseExited

    private void PMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMouseExited
		P.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_PMouseExited

    private void OMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OMouseExited
		O.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_OMouseExited

    private void NMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NMouseExited
		N.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_NMouseExited

    private void MMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MMouseExited
		M.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_MMouseExited

    private void LMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LMouseExited
		L.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_LMouseExited

    private void KMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KMouseExited
		K.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_KMouseExited

    private void JMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMouseExited
		J.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_JMouseExited

    private void IMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IMouseExited
		I.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_IMouseExited

    private void HMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HMouseExited
		H.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_HMouseExited

    private void GMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GMouseExited
		G.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_GMouseExited

    private void FMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FMouseExited
		F.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_FMouseExited

    private void EMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMouseExited
		E.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_EMouseExited

    private void DMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DMouseExited
		D.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_DMouseExited

    private void CMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMouseExited
		C.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_CMouseExited

    private void BMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMouseExited
		B.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_BMouseExited

	//recebe o clique de cada uma das letras
    private void ZMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZMouseClicked
		st = Clique1.getText();
		st2 = Z.getText();
		DistribuiClique();
    }//GEN-LAST:event_ZMouseClicked

    private void YMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YMouseClicked
		st = Clique1.getText();
		st2 = Y.getText();
		DistribuiClique();
    }//GEN-LAST:event_YMouseClicked

    private void XMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseClicked
		st = Clique1.getText();
		st2 = X.getText();
		DistribuiClique();
    }//GEN-LAST:event_XMouseClicked

    private void WMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WMouseClicked
		st = Clique1.getText();
		st2 = W.getText();
		DistribuiClique();
    }//GEN-LAST:event_WMouseClicked

    private void VMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VMouseClicked
		st = Clique1.getText();
		st2 = V.getText();
		DistribuiClique();
    }//GEN-LAST:event_VMouseClicked

    private void UMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UMouseClicked
		st = Clique1.getText();
		st2 = U.getText();
		DistribuiClique();
    }//GEN-LAST:event_UMouseClicked

    private void TMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TMouseClicked
		st = Clique1.getText();
		st2 = T.getText();
		DistribuiClique();
    }//GEN-LAST:event_TMouseClicked

    private void SMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SMouseClicked
		st = Clique1.getText();
		st2 = S.getText();
		DistribuiClique();
    }//GEN-LAST:event_SMouseClicked

    private void RMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMouseClicked
		st = Clique1.getText();
		st2 = R.getText();
		DistribuiClique();
    }//GEN-LAST:event_RMouseClicked

    private void QMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QMouseClicked
		st = Clique1.getText();
		st2 = Q.getText();
		DistribuiClique();
    }//GEN-LAST:event_QMouseClicked

    private void PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMouseClicked
		st = Clique1.getText();
		st2 = P.getText();
		DistribuiClique();
    }//GEN-LAST:event_PMouseClicked

    private void OMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OMouseClicked
		st = Clique1.getText();
		st2 = O.getText();
		DistribuiClique();
    }//GEN-LAST:event_OMouseClicked

    private void NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NMouseClicked
		st = Clique1.getText();
		st2 = N.getText();
		DistribuiClique();
    }//GEN-LAST:event_NMouseClicked

    private void MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MMouseClicked
		st = Clique1.getText();
		st2 = M.getText();
		DistribuiClique();
    }//GEN-LAST:event_MMouseClicked

    private void LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LMouseClicked
		st = Clique1.getText();
		st2 = L.getText();
		DistribuiClique();
    }//GEN-LAST:event_LMouseClicked

    private void KMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KMouseClicked
		st = Clique1.getText();
		st2 = K.getText();
		DistribuiClique();
    }//GEN-LAST:event_KMouseClicked

    private void JMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMouseClicked
		st = Clique1.getText();
		st2 = J.getText();
		DistribuiClique();
    }//GEN-LAST:event_JMouseClicked

    private void IMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IMouseClicked
		st = Clique1.getText();
		st2 = I.getText();
		DistribuiClique();
    }//GEN-LAST:event_IMouseClicked

    private void HMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HMouseClicked
		st = Clique1.getText();
		st2 = H.getText();
		DistribuiClique();
    }//GEN-LAST:event_HMouseClicked

    private void GMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GMouseClicked
		st = Clique1.getText();
		st2 = G.getText();
		DistribuiClique();
    }//GEN-LAST:event_GMouseClicked

    private void FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FMouseClicked
		st = Clique1.getText();
		st2 = F.getText();
		DistribuiClique();
    }//GEN-LAST:event_FMouseClicked

    private void EMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMouseClicked
		st = Clique1.getText();
		st2 = E.getText();
		DistribuiClique();
    }//GEN-LAST:event_EMouseClicked

    private void DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DMouseClicked
		st = Clique1.getText();
		st2 = D.getText();
		DistribuiClique();
    }//GEN-LAST:event_DMouseClicked

    private void CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMouseClicked
		st = Clique1.getText();
		st2 = C.getText();
		DistribuiClique();
    }//GEN-LAST:event_CMouseClicked

    private void BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMouseClicked
		st = Clique1.getText();
		st2 = B.getText();
		DistribuiClique();
    }//GEN-LAST:event_BMouseClicked

    private void AMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseExited
		A.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_AMouseExited

    private void AMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseMoved
		A.setBackground(new java.awt.Color(255, 255, 133));
    }//GEN-LAST:event_AMouseMoved

    private void AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseClicked
		st = Clique1.getText();
		st2 = A.getText();
		DistribuiClique();
    }//GEN-LAST:event_AMouseClicked

	//recebe os dois cliques do jogador
	//e guarda-os para comparacao
	private void DistribuiClique() {
		if (st == "-") //st variavel de comparacao
		{
			Clique1.setText(st2); //st2 contem o caracter do cliq do jogador
		} else {
			st = Clique2.getText();
			if (st == "-") {
				Clique2.setText(st2);
				Compara();
			}
		}
	}

	//volta as vari�veis static e st2 para o vlrs iniciais
	private void Setast() {
		st = "-";
		st2 = "-";
		Clique1.setText(st);
		Clique2.setText(st);
	}

	// diminui a pontuacao
	//diminui uma vida
	//se vida = 0 cham tela de Erro
	//e seta a pontuacao
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
			er.FlagJogo = 1;
			Musica.stop();
			er.setVisible(true);
			this.setVisible(false);
		}
	}

	//recebe clique 1 e clique 2 para Comparar
	private void Clique() {
		c1 = Clique1.getText();
		c2 = Clique2.getText();
	}

	//aumenta o numero de pontos
	//seta a pontuacao
	private void AumentaPontos() {
		ptos = ptos + 1000;
		Pontos.setText(String.valueOf(ptos));
		Setast();
	}

	//fcao q identifica cada uma das fases e seus elementos
	//verifica tb a pontuacao
	//e, se o jogador passou de fase ou nao
	private void Compara() {

		while (fase <= 13) {
			if (fase == 1) {
				Clique();
				if (((c1 == "C") && (c2 == "X")) || ((c1 == "X") && (c2 == "C"))) {
					fase = 2;
					AumentaPontos();
					figfase = Fase2.getIcon();
					FundoCamuflado.setIcon(figfase);
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 2) {
				Clique();
				if (((c1 == "V") && (c2 == "F")) || ((c1 == "F") && (c2 == "V"))) {
					fase = 3;
					AumentaPontos();
					figfase = Fase3.getIcon();
					FundoCamuflado.setIcon(figfase);
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 3) {
				Clique();
				if (((c1 == "H") && (c2 == "Y")) || ((c1 == "Y") && (c2 == "H"))) {
					fase = 4;
					AumentaPontos();
					figfase = Fase4.getIcon();
					FundoCamuflado.setIcon(figfase);
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 4) {
				Clique();
				if (((c1 == "J") && (c2 == "A")) || ((c1 == "A") && (c2 == "J"))) {
					fase = 5;
					AumentaPontos();
					figfase = Fase5.getIcon();
					FundoCamuflado.setIcon(figfase);
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 5) {
				Clique();
				if (((c1 == "L") && (c2 == "D")) || ((c1 == "D") && (c2 == "L"))) {
					fase = 6;
					AumentaPontos();
					figfase = Fase6.getIcon();
					FundoCamuflado.setIcon(figfase);
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 6) {
				Clique();
				if (((c1 == "G") && (c2 == "O")) || ((c1 == "O") && (c2 == "G"))) {
					fase = 7;
					AumentaPontos();
					figfase = Fase7.getIcon();
					FundoCamuflado.setIcon(figfase);
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 7) {
				Clique();
				if (((c1 == "K") && (c2 == "R")) || ((c1 == "R") && (c2 == "K"))) {
					fase = 8;
					AumentaPontos();
					figfase = Fase8.getIcon();
					FundoCamuflado.setIcon(figfase);
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 8) {
				Clique();
				if (((c1 == "N") && (c2 == "U")) || ((c1 == "U") && (c2 == "N"))) {
					fase = 9;
					AumentaPontos();
					Setast();
					figfase = Fase9.getIcon();
					FundoCamuflado.setIcon(figfase);
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 9) {
				Clique();
				if (((c1 == "Q") && (c2 == "W")) || ((c1 == "W") && (c2 == "Q"))) {
					fase = 10;
					AumentaPontos();
					Setast();
					figfase = Fase10.getIcon();
					FundoCamuflado.setIcon(figfase);
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 10) {
				Clique();
				if (((c1 == "T") && (c2 == "Z")) || ((c1 == "Z") && (c2 == "T"))) {
					fase = 11;
					AumentaPontos();
					figfase = Fase11.getIcon();
					FundoCamuflado.setIcon(figfase);
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 11) {
				Clique();
				if (((c1 == "S") && (c2 == "E")) || ((c1 == "E") && (c2 == "S"))) {
					fase = 12;
					AumentaPontos();
					figfase = Fase12.getIcon();
					FundoCamuflado.setIcon(figfase);
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 12) {
				Clique();
				if (((c1 == "B") && (c2 == "P")) || ((c1 == "P") && (c2 == "B"))) {
					fase = 13;
					AumentaPontos();
					figfase = Fase13.getIcon();
					FundoCamuflado.setIcon(figfase);
					break;
				} else {
					ChamaErro();
					break;
				}
			}

			if (fase == 13) {
				Clique();
				if (((c1 == "I") && (c2 == "M")) || ((c1 == "M") && (c2 == "I"))) {
					fase = 1;
					AumentaPontos();
					Acerto ac = new Acerto();
					ac.Pontuacao.setText(String.valueOf(ptos));
					ac.FlagJogo = 1;
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
		new Contagem().show();
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JButton Ajuda;
    private javax.swing.JLabel B;
    private javax.swing.JLabel C;
    private javax.swing.JLabel Clique1;
    private javax.swing.JLabel Clique2;
    private javax.swing.JLabel D;
    private javax.swing.JLabel E;
    private javax.swing.JLabel F;
    private javax.swing.JLabel Fase10;
    private javax.swing.JLabel Fase11;
    private javax.swing.JLabel Fase12;
    private javax.swing.JLabel Fase13;
    private javax.swing.JLabel Fase2;
    private javax.swing.JLabel Fase3;
    private javax.swing.JLabel Fase4;
    private javax.swing.JLabel Fase5;
    private javax.swing.JLabel Fase6;
    private javax.swing.JLabel Fase7;
    private javax.swing.JLabel Fase8;
    private javax.swing.JLabel Fase9;
    private javax.swing.JLabel FundoCamuflado;
    private javax.swing.JLabel G;
    private javax.swing.JLabel H;
    private javax.swing.JLabel I;
    private javax.swing.JLabel J;
    private javax.swing.JLabel K;
    private javax.swing.JLabel L;
    private javax.swing.JLabel M;
    private javax.swing.JLabel N;
    private javax.swing.JLabel O;
    private javax.swing.JLabel P;
    private javax.swing.JPanel PainelFundo;
    private javax.swing.JPanel PainelLetras;
    private javax.swing.JLabel Q;
    private javax.swing.JLabel R;
    private javax.swing.JLabel S;
    private javax.swing.JLabel T;
    private javax.swing.JLabel U;
    private javax.swing.JLabel V;
    private javax.swing.JLabel W;
    private javax.swing.JLabel X;
    private javax.swing.JLabel Y;
    private javax.swing.JLabel Z;
    // End of variables declaration//GEN-END:variables
}
