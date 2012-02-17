package GUI;

import ConfigFases.FaseControladorBase;
import ConfigFases.FaseMatriz;
import ConfigFases.FaseMatrizGeometricaControlador;

public class MatrizGeometrica extends TelaJogo {

	// <editor-fold defaultstate="collapsed" desc="Singleton">
	private static Sombras instance;

	public static Sombras GetInsance() {
		InicializarSingleton();
		return instance;
	}

	public static void InicializarSingleton(){
		if (instance == null) {
			instance = new Sombras();
		}
	}
	// </editor-fold>

//    private Icon img=null,id=null, m1,m2,m3,m4,c1,c2,c3,c4,f1,f2,f3,f4;

	private FaseMatrizGeometricaControlador controlaFase = null;
	
    public MatrizGeometrica() {

		controlaFase = new FaseMatrizGeometricaControlador(this,
				//								   FORMS,              COLORS
				new FaseMatriz(new int[]{0,0,2,1}, new int[]{3,2,2,1}), // fase  1
				new FaseMatriz(new int[]{1,1,3,2}, new int[]{1,3,3,2}), // fase  2
				new FaseMatriz(new int[]{2,1,3,0}, new int[]{1,3,0,2}), // fase  3
				new FaseMatriz(new int[]{3,2,0,1}, new int[]{3,3,1,2}), // fase  4
				new FaseMatriz(new int[]{0,3,1,3}, new int[]{0,0,3,2}), // fase  5
				new FaseMatriz(new int[]{1,1,3,0}, new int[]{0,2,3,0}), // fase  6
				new FaseMatriz(new int[]{2,0,1,3}, new int[]{0,0,2,2}), // fase  7
				new FaseMatriz(new int[]{0,0,1,1}, new int[]{0,0,1,1}), // fase  8
				new FaseMatriz(new int[]{0,0,0,2}, new int[]{2,3,1,0}), // fase  9
				new FaseMatriz(new int[]{1,3,2,0}, new int[]{2,3,1,0}), // fase 10
				new FaseMatriz(new int[]{2,2,0,3}, new int[]{2,1,0,0}), // fase 11
				new FaseMatriz(new int[]{3,2,3,0}, new int[]{2,0,0,3}), // fase 12
				new FaseMatriz(new int[]{0,3,1,2}, new int[]{1,2,2,2}), // fase 13
				new FaseMatriz(new int[]{1,0,2,3}, new int[]{3,3,3,3}), // fase 14
				new FaseMatriz(new int[]{2,2,1,1}, new int[]{3,3,1,1}), // fase 15
				new FaseMatriz(new int[]{3,3,0,0}, new int[]{3,0,2,2}), // fase 16
				new FaseMatriz(new int[]{3,3,1,1}, new int[]{2,1,2,3}), // fase 17
				new FaseMatriz(new int[]{0,1,3,2}, new int[]{3,2,0,1}), // fase 18
				new FaseMatriz(new int[]{1,0,2,3}, new int[]{2,2,0,0}), // fase 19
				new FaseMatriz(new int[]{2,0,1,3}, new int[]{1,2,3,0}), // fase 10
				new FaseMatriz(new int[]{1,2,3,0}, new int[]{0,2,3,1}), // fase 21
				new FaseMatriz(new int[]{2,0,2,3}, new int[]{3,3,0,1}), // fase 22
				new FaseMatriz(new int[]{3,2,1,0}, new int[]{1,2,0,3})  // fase 23
				);

        initComponents();
        
//        try{
//            URL som= new URL((getClass().getResource("/sons/mickeydisney.mid")).toString());
//            Musica= java.applet.Applet.newAudioClip(som);
//            Musica.loop();
//        }catch(MalformedURLException erro){
//            System.out.println("Caminho do áudio não especificado! "+erro);
//        }
    }

	@Override
	protected String GetAudioName() {
		return "mickeydisney";
	}
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

//        Figura1 = new javax.swing.JLabel();
//        Figura2 = new javax.swing.JLabel();
//        Figura3 = new javax.swing.JLabel();
//        Figura4 = new javax.swing.JLabel();
//        Clique1 = new javax.swing.JLabel();
//        Clique2 = new javax.swing.JLabel();
//        Clique3 = new javax.swing.JLabel();
//        Clique4 = new javax.swing.JLabel();
		
//        pelipseamarela = new javax.swing.JLabel();
//        pelipseazul = new javax.swing.JLabel();
//        pelipseverde = new javax.swing.JLabel();
//        pelipsevermelha = new javax.swing.JLabel();
//        pestrelavermelha = new javax.swing.JLabel();
//        pestrelaamarela = new javax.swing.JLabel();
//        pestrelaazul = new javax.swing.JLabel();
//        pestrelaverde = new javax.swing.JLabel();
//        phexagonoazul = new javax.swing.JLabel();
//        phexagonoverde = new javax.swing.JLabel();
//        phexagonovermelho = new javax.swing.JLabel();
//        phexagonoamarelo = new javax.swing.JLabel();
//        ptrianguloverde = new javax.swing.JLabel();
//        ptriangulovermelho = new javax.swing.JLabel();
//        ptrianguloamarelo = new javax.swing.JLabel();
//        ptrianguloazul = new javax.swing.JLabel();
        Ajuda = new javax.swing.JButton();
//        elipseamarela = new javax.swing.JLabel();
//        elipseazul = new javax.swing.JLabel();
//        elipseverde = new javax.swing.JLabel();
//        elipsevermelha = new javax.swing.JLabel();
//        estrelaamarela = new javax.swing.JLabel();
//        estrelaazul = new javax.swing.JLabel();
//        estrelaverde = new javax.swing.JLabel();
//        estrelavermelha = new javax.swing.JLabel();
//        hexagonoamarelo = new javax.swing.JLabel();
//        hexagonoazul = new javax.swing.JLabel();
//        hexagonoverde = new javax.swing.JLabel();
//        hexagonovermelho = new javax.swing.JLabel();
//        quadradoamarelo = new javax.swing.JLabel();
//        quadradoazul = new javax.swing.JLabel();
//        quadradoverde = new javax.swing.JLabel();
//        quadradovermelha = new javax.swing.JLabel();
//        trianguloamarelo = new javax.swing.JLabel();
//        trianguloazul = new javax.swing.JLabel();
//        trianguloverde = new javax.swing.JLabel();
//        triangulovermelho = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setTitle("Matriz de Formas Geométricas");
        setLayout(null);

//        Figura1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/elipseamarela.jpg"))); // NOI18N
//        add(Figura1);
//        Figura1.setBounds(60, 170, 75, 80);
//
//        Figura2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/elipseazul.jpg"))); // NOI18N
//        add(Figura2);
//        Figura2.setBounds(160, 170, 75, 80);
//
//        Figura3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/hexagonoazul.jpg"))); // NOI18N
//        add(Figura3);
//        Figura3.setBounds(260, 170, 75, 80);
//
//        Figura4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/estrelaverde.jpg"))); // NOI18N
//        add(Figura4);
//        Figura4.setBounds(360, 170, 75, 80);
//
//        Clique1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
//        add(Clique1);
//        Clique1.setBounds(60, 270, 75, 80);
//
//        Clique2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
//        add(Clique2);
//        Clique2.setBounds(160, 270, 75, 80);
//
//        Clique3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
//        add(Clique3);
//        Clique3.setBounds(260, 270, 75, 80);
//
//        Clique4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
//        add(Clique4);
//        Clique4.setBounds(360, 270, 75, 80);

//        pelipseamarela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/pelipseamarela.jpg"))); // NOI18N
//        pelipseamarela.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                pelipseamarelaMouseClicked(evt);
//            }
//        });
//        add(pelipseamarela);
//        pelipseamarela.setBounds(490, 140, 45, 45);
//
//        pelipseazul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/pelipseazul.jpg"))); // NOI18N
//        pelipseazul.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                pelipseazulMouseClicked(evt);
//            }
//        });
//        add(pelipseazul);
//        pelipseazul.setBounds(550, 140, 45, 45);
//
//        pelipseverde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/pelipseverde.jpg"))); // NOI18N
//        pelipseverde.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                pelipseverdeMouseClicked(evt);
//            }
//        });
//        add(pelipseverde);
//        pelipseverde.setBounds(610, 140, 45, 45);
//
//        pelipsevermelha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/pelipsevermelha.jpg"))); // NOI18N
//        pelipsevermelha.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                pelipsevermelhaMouseClicked(evt);
//            }
//        });
//        add(pelipsevermelha);
//        pelipsevermelha.setBounds(670, 140, 45, 45);
//
//        pestrelavermelha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/pestrelavermelha.jpg"))); // NOI18N
//        pestrelavermelha.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                pestrelavermelhaMouseClicked(evt);
//            }
//        });
//        add(pestrelavermelha);
//        pestrelavermelha.setBounds(490, 210, 45, 45);
//
//        pestrelaamarela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/pestrelaamarela.jpg"))); // NOI18N
//        pestrelaamarela.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                pestrelaamarelaMouseClicked(evt);
//            }
//        });
//        add(pestrelaamarela);
//        pestrelaamarela.setBounds(550, 210, 45, 45);
//
//        pestrelaazul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/pestrelaazul.jpg"))); // NOI18N
//        pestrelaazul.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                pestrelaazulMouseClicked(evt);
//            }
//        });
//        add(pestrelaazul);
//        pestrelaazul.setBounds(610, 210, 45, 45);
//
//        pestrelaverde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/pestrelaverde.jpg"))); // NOI18N
//        pestrelaverde.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                pestrelaverdeMouseClicked(evt);
//            }
//        });
//        add(pestrelaverde);
//        pestrelaverde.setBounds(670, 210, 45, 45);
//
//        phexagonoazul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/phexagonoazul.jpg"))); // NOI18N
//        phexagonoazul.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                phexagonoazulMouseClicked(evt);
//            }
//        });
//        add(phexagonoazul);
//        phexagonoazul.setBounds(490, 280, 45, 45);
//
//        phexagonoverde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/phexagonoverde.jpg"))); // NOI18N
//        phexagonoverde.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                phexagonoverdeMouseClicked(evt);
//            }
//        });
//        add(phexagonoverde);
//        phexagonoverde.setBounds(550, 280, 45, 45);
//
//        phexagonovermelho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/phexagonovermelho.jpg"))); // NOI18N
//        phexagonovermelho.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                phexagonovermelhoMouseClicked(evt);
//            }
//        });
//        add(phexagonovermelho);
//        phexagonovermelho.setBounds(610, 280, 45, 45);
//
//        phexagonoamarelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/phexagonoamarelo.jpg"))); // NOI18N
//        phexagonoamarelo.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                phexagonoamareloMouseClicked(evt);
//            }
//        });
//        add(phexagonoamarelo);
//        phexagonoamarelo.setBounds(670, 280, 45, 45);
//
//        ptrianguloverde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/ptrianguloverde.jpg"))); // NOI18N
//        ptrianguloverde.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                ptrianguloverdeMouseClicked(evt);
//            }
//        });
//        add(ptrianguloverde);
//        ptrianguloverde.setBounds(490, 350, 45, 45);
//
//        ptriangulovermelho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/ptriangulovermelho.jpg"))); // NOI18N
//        ptriangulovermelho.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                ptriangulovermelhoMouseClicked(evt);
//            }
//        });
//        add(ptriangulovermelho);
//        ptriangulovermelho.setBounds(550, 350, 45, 45);
//
//        ptrianguloamarelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/ptrianguloamarelo.jpg"))); // NOI18N
//        ptrianguloamarelo.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                ptrianguloamareloMouseClicked(evt);
//            }
//        });
//        add(ptrianguloamarelo);
//        ptrianguloamarelo.setBounds(610, 350, 45, 45);
//
//        ptrianguloazul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/ptrianguloazul.jpg"))); // NOI18N
//        ptrianguloazul.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                ptrianguloazulMouseClicked(evt);
//            }
//        });
//        add(ptrianguloazul);
//        ptrianguloazul.setBounds(670, 350, 45, 45);

        Ajuda.setBackground(new java.awt.Color(244, 244, 246));
        Ajuda.setFont(new java.awt.Font("Comic Sans MS", 1, 30));
        Ajuda.setForeground(new java.awt.Color(255, 0, 0));
        Ajuda.setText("AJUDA");
        Ajuda.setToolTipText("clique aqui para chamar a ajuda");
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
        Ajuda.setBounds(28, 519, 230, 50);

//        elipseamarela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/elipseamarela.jpg"))); // NOI18N
//        elipseamarela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
//        add(elipseamarela);
//        elipseamarela.setBounds(40, 530, 10, 10);
//
//        elipseazul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/elipseazul.jpg"))); // NOI18N
//        elipseazul.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
//        add(elipseazul);
//        elipseazul.setBounds(40, 530, 10, 10);
//
//        elipseverde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/elipseverde.jpg"))); // NOI18N
//        elipseverde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
//        add(elipseverde);
//        elipseverde.setBounds(40, 530, 10, 10);
//
//        elipsevermelha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/elipsevermelha.jpg"))); // NOI18N
//        elipsevermelha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
//        add(elipsevermelha);
//        elipsevermelha.setBounds(40, 530, 10, 10);
//
//        estrelaamarela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/estrelaamarela.jpg"))); // NOI18N
//        estrelaamarela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
//        add(estrelaamarela);
//        estrelaamarela.setBounds(40, 530, 10, 10);
//
//        estrelaazul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/estrelaazul.jpg"))); // NOI18N
//        estrelaazul.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
//        add(estrelaazul);
//        estrelaazul.setBounds(40, 530, 10, 10);
//
//        estrelaverde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/estrelaverde.jpg"))); // NOI18N
//        estrelaverde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
//        add(estrelaverde);
//        estrelaverde.setBounds(40, 530, 10, 10);
//
//        estrelavermelha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/estrelavermelha.jpg"))); // NOI18N
//        estrelavermelha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
//        add(estrelavermelha);
//        estrelavermelha.setBounds(40, 530, 10, 10);
//
//        hexagonoamarelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/hexagonoamarelo.jpg"))); // NOI18N
//        hexagonoamarelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
//        add(hexagonoamarelo);
//        hexagonoamarelo.setBounds(40, 530, 10, 10);
//
//        hexagonoazul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/hexagonoazul.jpg"))); // NOI18N
//        hexagonoazul.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
//        add(hexagonoazul);
//        hexagonoazul.setBounds(40, 530, 10, 10);
//
//        hexagonoverde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/hexagonoverde.jpg"))); // NOI18N
//        hexagonoverde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
//        add(hexagonoverde);
//        hexagonoverde.setBounds(40, 530, 10, 10);
//
//        hexagonovermelho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/hexagonovermelho.jpg"))); // NOI18N
//        hexagonovermelho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
//        add(hexagonovermelho);
//        hexagonovermelho.setBounds(40, 530, 10, 10);
//
//        quadradoamarelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/quadradoamarelo.jpg"))); // NOI18N
//        quadradoamarelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
//        add(quadradoamarelo);
//        quadradoamarelo.setBounds(40, 530, 10, 10);
//
//        quadradoazul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/quadradoazul.jpg"))); // NOI18N
//        quadradoazul.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
//        add(quadradoazul);
//        quadradoazul.setBounds(40, 530, 10, 10);
//
//        quadradoverde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/quadradoverde.jpg"))); // NOI18N
//        quadradoverde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
//        add(quadradoverde);
//        quadradoverde.setBounds(40, 530, 10, 10);
//
//        quadradovermelha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/quadradovermelho.jpg"))); // NOI18N
//        quadradovermelha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
//        add(quadradovermelha);
//        quadradovermelha.setBounds(40, 530, 10, 10);
//
//        trianguloamarelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/trianguloamarelo.jpg"))); // NOI18N
//        trianguloamarelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
//        add(trianguloamarelo);
//        trianguloamarelo.setBounds(40, 530, 10, 10);
//
//        trianguloazul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/trianguloazul.jpg"))); // NOI18N
//        trianguloazul.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
//        add(trianguloazul);
//        trianguloazul.setBounds(40, 530, 10, 10);
//
//        trianguloverde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/trianguloverde.jpg"))); // NOI18N
//        trianguloverde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
//        add(trianguloverde);
//        trianguloverde.setBounds(40, 530, 10, 10);
//
//        triangulovermelho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/figuras geométricas/triangulovermelho.jpg"))); // NOI18N
//        triangulovermelho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
//        add(triangulovermelho);
//        triangulovermelho.setBounds(40, 530, 10, 10);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        add(jPanel1);
        jPanel1.setBounds(50, 150, 400, 240);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(jPanel2);
        jPanel2.setBounds(470, 120, 260, 310);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800, 600);
    }// </editor-fold>//GEN-END:initComponents

//    private void pelipsevermelhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pelipsevermelhaMouseClicked
//        img=elipsevermelha.getIcon();
//        DistribuiCliques();
//    }//GEN-LAST:event_pelipsevermelhaMouseClicked
    
    private void AjudaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjudaMouseMoved
        Ajuda.setBackground(new java.awt.Color(255,255,102));
    }//GEN-LAST:event_AjudaMouseMoved
    
    private void AjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjudaMouseClicked
//        Musica.stop();
//        texto="-Em cada fase aparecem quatro figuras.\n\n-você dever� repetir a mesma sequência, que est� sendo mostrada.\n\n-Para isso, clique nas figurinhas do lado direito.Preste aten��o na ordem dos cliques. A sequência dever� ser a mesma!";
//        Ajuda a=new Ajuda();
//        a.textoajuda.setText(texto);
//        a.aj=7;
//        a.setVisible(true);
//        this.setVisible(false);
       
        AbrirAjuda("-Em cada fase aparecem quatro figuras.\n"
				+ "\n"
				+ "-Você deverá repetir a mesma sequência, que está sendo mostrada.\n"
				+ "\n"
				+ "-Para isso, clique nas figurinhas do lado direito. "
				+ "Preste atenção na ordem dos cliques. "
				+ "A sequência deverá ser a mesma!\n");
        
    }//GEN-LAST:event_AjudaMouseClicked
    
    private void AjudaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjudaMousePressed
        Ajuda.setBackground(new java.awt.Color(102,204,0));
    }//GEN-LAST:event_AjudaMousePressed
    
    private void AjudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjudaMouseExited
        Ajuda.setBackground(new java.awt.Color(244,244,246));
    }//GEN-LAST:event_AjudaMouseExited
    
//    private void ptrianguloazulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ptrianguloazulMouseClicked
//        img=trianguloazul.getIcon();
//        DistribuiCliques();
//    }//GEN-LAST:event_ptrianguloazulMouseClicked
//    
//    private void ptrianguloamareloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ptrianguloamareloMouseClicked
//        img=trianguloamarelo.getIcon();
//        DistribuiCliques();
//    }//GEN-LAST:event_ptrianguloamareloMouseClicked
//    
//    private void ptriangulovermelhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ptriangulovermelhoMouseClicked
//        img=triangulovermelho.getIcon();
//        DistribuiCliques();
//    }//GEN-LAST:event_ptriangulovermelhoMouseClicked
//    
//    private void ptrianguloverdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ptrianguloverdeMouseClicked
//        img=trianguloverde.getIcon();
//        DistribuiCliques();
//    }//GEN-LAST:event_ptrianguloverdeMouseClicked
//    
//    private void phexagonoamareloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phexagonoamareloMouseClicked
//        img=hexagonoamarelo.getIcon();
//        DistribuiCliques();
//    }//GEN-LAST:event_phexagonoamareloMouseClicked
//    
//    private void phexagonovermelhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phexagonovermelhoMouseClicked
//        img=hexagonovermelho.getIcon();
//        DistribuiCliques();
//    }//GEN-LAST:event_phexagonovermelhoMouseClicked
//    
//    private void phexagonoverdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phexagonoverdeMouseClicked
//        img=hexagonoverde.getIcon();
//        DistribuiCliques();
//    }//GEN-LAST:event_phexagonoverdeMouseClicked
//    
//    private void phexagonoazulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phexagonoazulMouseClicked
//        img=hexagonoazul.getIcon();
//        DistribuiCliques();
//    }//GEN-LAST:event_phexagonoazulMouseClicked
//    
//    private void pestrelaverdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pestrelaverdeMouseClicked
//        img=estrelaverde.getIcon();
//        DistribuiCliques();
//    }//GEN-LAST:event_pestrelaverdeMouseClicked
//    
//    private void pestrelaazulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pestrelaazulMouseClicked
//        img=estrelaazul.getIcon();
//        DistribuiCliques();
//    }//GEN-LAST:event_pestrelaazulMouseClicked
//    
//    private void pestrelaamarelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pestrelaamarelaMouseClicked
//        img=estrelaamarela.getIcon();
//        DistribuiCliques();
//    }//GEN-LAST:event_pestrelaamarelaMouseClicked
//    
//    private void pestrelavermelhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pestrelavermelhaMouseClicked
//        img=estrelavermelha.getIcon();
//        DistribuiCliques();
//    }//GEN-LAST:event_pestrelavermelhaMouseClicked
//        
//    private void pelipseverdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pelipseverdeMouseClicked
//        img=elipseverde.getIcon();
//        DistribuiCliques();
//    }//GEN-LAST:event_pelipseverdeMouseClicked
//    
//    private void pelipseazulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pelipseazulMouseClicked
//        img=elipseazul.getIcon();
//        DistribuiCliques();
//    }//GEN-LAST:event_pelipseazulMouseClicked
//    
//    private void pelipseamarelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pelipseamarelaMouseClicked
//        img=elipseamarela.getIcon();
//        DistribuiCliques();
//    }//GEN-LAST:event_pelipseamarelaMouseClicked
    
        
//    public void DistribuiCliques(){
//        id=Clique1.getIcon();
//        if (id==null)
//            Clique1.setIcon(img);
//        else{
//            id=Clique2.getIcon();
//            if (id==null)
//                Clique2.setIcon(img);
//            else{
//                id=Clique3.getIcon();
//                if (id==null)
//                    Clique3.setIcon(img);
//                else{
//                    id=Clique4.getIcon();
//                    if (id==null){
//                        Clique4.setIcon(img);
//                        Compara();
//                    }
//                }
//            }
//        }
//    }
//
//    public void SetaClique(){
//        Clique1.setIcon(null);
//        Clique2.setIcon(null);
//        Clique3.setIcon(null);
//        Clique4.setIcon(null);
//    }
//
//    private void RecebeFiguraClique(){
//        m1=Figura1.getIcon();
//        m2=Figura2.getIcon();
//        m3=Figura3.getIcon();
//        m4=Figura4.getIcon();
//
//        c1=Clique1.getIcon();
//        c2=Clique2.getIcon();
//        c3=Clique3.getIcon();
//        c4=Clique4.getIcon();
//    }
//
//    private void SetaFiguras(){
//        Figura1.setIcon(f1);
//        Figura2.setIcon(f2);
//        Figura3.setIcon(f3);
//        Figura4.setIcon(f4);
//    }
//
//    private void AumentaPontos(){
//        SetaFiguras();
//        SetaClique();
//        ptos=ptos+1000;
//        Pontos.setText(String.valueOf(ptos));
//    }
//
//    private void ChamaErro(){
//        SetaClique();
//        ptos=ptos-500;
//        if (ptos<0)
//            ptos=0;
//        Pontos.setText(String.valueOf(ptos));
//        vida=vida-1;
//        NumVidas.setText(String.valueOf(vida));
//        if (vida==0){
//            Erro er=new Erro();
//            er.Pontuacao.setText(String.valueOf(ptos));
//            er.FlagJogo=7;
////            Musica.stop();
//            er.setVisible(true);
//            this.setVisible(false);
//        }
//    }
    
//    private void Compara(){
//        RecebeFiguraClique();
//        while (fase<=22){
//            if (fase==1){
//                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
//                    f1=estrelaverde.getIcon();
//                    f2=estrelaamarela.getIcon();
//                    f3=trianguloamarelo.getIcon();
//                    f4=hexagonoazul.getIcon();
//                    AumentaPontos();
//                    fase=2;
//                    break;
//                }
//                else{
//                    ChamaErro();
//                    break;
//                }
//            }
//            
//            if (fase==2){
//                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
//                    f1=hexagonoverde.getIcon();
//                    f2=estrelaamarela.getIcon();
//                    f3=triangulovermelho.getIcon();
//                    f4=elipseazul.getIcon();
//                    AumentaPontos();
//                    fase=3;
//                    break;
//                }
//                else{
//                    ChamaErro();
//                    break;
//                }
//            }
//            
//            if (fase==3){
//                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
//                    f1=trianguloamarelo.getIcon();
//                    f2=hexagonoamarelo.getIcon();
//                    f3=elipseverde.getIcon();
//                    f4=estrelaazul.getIcon();
//                    AumentaPontos();
//                    fase=4;
//                    break;
//                }
//                else{
//                    ChamaErro();
//                    break;
//                }
//            }
//            
//            if (fase==4){
//                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
//                    f1=elipsevermelha.getIcon();
//                    f2=triangulovermelho.getIcon();
//                    f3=estrelaamarela.getIcon();
//                    f4=trianguloazul.getIcon();
//                    AumentaPontos();
//                    fase=5;
//                    break;
//                }
//                else{
//                    ChamaErro();
//                    break;
//                }
//            }
//            
//            if (fase==5){
//                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
//                    f1=estrelavermelha.getIcon();
//                    f2=estrelaazul.getIcon();
//                    f3=trianguloamarelo.getIcon();
//                    f4=elipsevermelha.getIcon();
//                    AumentaPontos();
//                    fase=6;
//                    break;
//                }
//                else{
//                    ChamaErro();
//                    break;
//                }
//            }
//            
//            if (fase==6){
//                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
//                    f1=hexagonovermelho.getIcon();
//                    f2=elipsevermelha.getIcon();
//                    f3=estrelaazul.getIcon();
//                    f4=trianguloazul.getIcon();
//                    AumentaPontos();
//                    fase=7;
//                    break;
//                }
//                else{
//                    ChamaErro();
//                    break;
//                }
//            }
//            
//            if (fase==7){
//                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
//                    f1=triangulovermelho.getIcon();
//                    f2=estrelavermelha.getIcon();
//                    f3=trianguloverde.getIcon();
//                    f4=elipseverde.getIcon();
//                    AumentaPontos();
//                    fase=8;
//                    break;
//                }
//                else{
//                    ChamaErro();
//                    break;
//                }
//            }
//            
//            if (fase==8){
//                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
//                    f1=elipseazul.getIcon();
//                    f2=elipseamarela.getIcon();
//                    f3=elipseverde.getIcon();
//                    f4=hexagonovermelho.getIcon();
//                    AumentaPontos();
//                    fase=9;
//                    break;
//                }
//                else{
//                    ChamaErro();
//                    break;
//                }
//            }
//            
//            if (fase==9){
//                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
//                    f1=estrelaazul.getIcon();
//                    f2=trianguloamarelo.getIcon();
//                    f3=hexagonoverde.getIcon();
//                    f4=elipsevermelha.getIcon();
//                    AumentaPontos();
//                    fase=10;
//                    break;
//                }
//                else{
//                    ChamaErro();
//                    break;
//                }
//            }
//            
//            if (fase==10){
//                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
//                    f1=hexagonoazul.getIcon();
//                    f2=hexagonoverde.getIcon();
//                    f3=elipsevermelha.getIcon();
//                    f4=triangulovermelho.getIcon();
//                    AumentaPontos();
//                    fase=11;
//                    break;
//                }
//                else{
//                    ChamaErro();
//                    break;
//                }
//            }
//            
//            if (fase==11){
//                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
//                    f1=trianguloazul.getIcon();
//                    f2=hexagonovermelho.getIcon();
//                    f3=triangulovermelho.getIcon();
//                    f4=elipseamarela.getIcon();
//                    AumentaPontos();
//                    fase=12;
//                    break;
//                }
//                else{
//                    ChamaErro();
//                    break;
//                }
//            }
//            
//            if (fase==12){
//                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
//                    f1=elipseverde.getIcon();
//                    f2=trianguloazul.getIcon();
//                    f3=estrelaazul.getIcon();
//                    f4=hexagonoazul.getIcon();
//                    AumentaPontos();
//                    fase=13;
//                    break;
//                }
//                else{
//                    ChamaErro();
//                    break;
//                }
//            }
//            
//            if (fase==13){
//                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
//                    f1=estrelaamarela.getIcon();
//                    f2=elipseamarela.getIcon();
//                    f3=hexagonoamarelo.getIcon();
//                    f4=trianguloamarelo.getIcon();
//                    AumentaPontos();
//                    fase=14;
//                    break;
//                }
//                else{
//                    ChamaErro();
//                    break;
//                }
//            }
//            
//            if (fase==14){
//                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
//                    f1=hexagonoamarelo.getIcon();
//                    f2=hexagonoamarelo.getIcon();
//                    f3=estrelaverde.getIcon();
//                    f4=estrelaverde.getIcon();
//                    AumentaPontos();
//                    fase=15;
//                    break;
//                }
//                else{
//                    ChamaErro();
//                    break;
//                }
//            }
//            
//            if (fase==15){
//                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
//                    f1=trianguloamarelo.getIcon();
//                    f2=triangulovermelho.getIcon();
//                    f3=elipseazul.getIcon();
//                    f4=elipseazul.getIcon();
//                    AumentaPontos();
//                    fase=16;
//                    break;
//                }
//                else{
//                    ChamaErro();
//                    break;
//                }
//            }
//            
//            if (fase==16){
//                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
//                    f1=trianguloazul.getIcon();
//                    f2=trianguloverde.getIcon();
//                    f3=estrelaazul.getIcon();
//                    f4=estrelaamarela.getIcon();
//                    AumentaPontos();
//                    fase=17;
//                    break;
//                }
//                else{
//                    ChamaErro();
//                    break;
//                }
//            }
//            
//            if (fase==17){
//                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
//                    f1=elipseamarela.getIcon();
//                    f2=estrelaazul.getIcon();
//                    f3=triangulovermelho.getIcon();
//                    f4=hexagonoverde.getIcon();
//                    AumentaPontos();
//                    fase=18;
//                    break;
//                }
//                else{
//                    ChamaErro();
//                    break;
//                }
//            }
//            
//            if (fase==18){
//                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
//                    f1=estrelaazul.getIcon();
//                    f2=elipseazul.getIcon();
//                    f3=hexagonovermelho.getIcon();
//                    f4=triangulovermelho.getIcon();
//                    AumentaPontos();
//                    fase=19;
//                    break;
//                }
//                else{
//                    ChamaErro();
//                    break;
//                }
//            }
//            
//            if (fase==19){
//                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
//                    f1=hexagonoverde.getIcon();
//                    f2=elipseazul.getIcon();
//                    f3=estrelaamarela.getIcon();
//                    f4=triangulovermelho.getIcon();
//                    AumentaPontos();
//                    fase=20;
//                    break;
//                }
//                else{
//                    ChamaErro();
//                    break;
//                }
//            }
//            
//            if (fase==20){
//                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
//                    f1=estrelavermelha.getIcon();
//                    f2=hexagonoazul.getIcon();
//                    f3=trianguloamarelo.getIcon();
//                    f4=elipseverde.getIcon();
//                    AumentaPontos();
//                    fase=21;
//                    break;
//                }
//                else{
//                    ChamaErro();
//                    break;
//                }
//            }
//            
//            if (fase==21){
//                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
//                    f1=hexagonoamarelo.getIcon();
//                    f2=elipseamarela.getIcon();
//                    f3=hexagonovermelho.getIcon();
//                    f4=trianguloverde.getIcon();
//                    AumentaPontos();
//                    fase=22;
//                    break;
//                }
//                else{
//                    ChamaErro();
//                    break;
//                }
//            }
//            
//            if (fase==22){
//                if ((m1.toString().equals(c1.toString()))&&(m2.toString().equals(c2.toString()))&&(m3.toString().equals(c3.toString()))&&(m4.toString().equals(c4.toString()))){
//                    f1=trianguloverde.getIcon();
//                    f2=hexagonoazul.getIcon();
//                    f3=estrelavermelha.getIcon();
//                    f4=elipseamarela.getIcon();
//                    AumentaPontos();
//                    Acerto ac=new Acerto();
//                    ac.Pontuacao.setText(String.valueOf(ptos));
//                    ac.FlagJogo=7;
////                    Musica.stop();
//                    ac.setVisible(true);
//                    this.setVisible(false);
//                    break;
//                }
//                else{
//                    ChamaErro();
//                    break;
//                }
//            }
//        }
//    }
    
    public static void main(String args[]) {
        new MatrizGeometrica().show();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ajuda;
//    private javax.swing.JLabel Clique1;
//    private javax.swing.JLabel Clique2;
//    private javax.swing.JLabel Clique3;
//    private javax.swing.JLabel Clique4;
//    private javax.swing.JLabel Figura1;
//    private javax.swing.JLabel Figura2;
//    private javax.swing.JLabel Figura3;
//    private javax.swing.JLabel Figura4;
//    private javax.swing.JLabel elipseamarela;
//    private javax.swing.JLabel elipseazul;
//    private javax.swing.JLabel elipseverde;
//    private javax.swing.JLabel elipsevermelha;
//    private javax.swing.JLabel estrelaamarela;
//    private javax.swing.JLabel estrelaazul;
//    private javax.swing.JLabel estrelaverde;
//    private javax.swing.JLabel estrelavermelha;
//    private javax.swing.JLabel hexagonoamarelo;
//    private javax.swing.JLabel hexagonoazul;
//    private javax.swing.JLabel hexagonoverde;
//    private javax.swing.JLabel hexagonovermelho;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
//    private javax.swing.JLabel pelipseamarela;
//    private javax.swing.JLabel pelipseazul;
//    private javax.swing.JLabel pelipseverde;
//    private javax.swing.JLabel pelipsevermelha;
//    private javax.swing.JLabel pestrelaamarela;
//    private javax.swing.JLabel pestrelaazul;
//    private javax.swing.JLabel pestrelaverde;
//    private javax.swing.JLabel pestrelavermelha;
//    private javax.swing.JLabel phexagonoamarelo;
//    private javax.swing.JLabel phexagonoazul;
//    private javax.swing.JLabel phexagonoverde;
//    private javax.swing.JLabel phexagonovermelho;
//    private javax.swing.JLabel ptrianguloamarelo;
//    private javax.swing.JLabel ptrianguloazul;
//    private javax.swing.JLabel ptrianguloverde;
//    private javax.swing.JLabel ptriangulovermelho;
//    private javax.swing.JLabel quadradoamarelo;
//    private javax.swing.JLabel quadradoazul;
//    private javax.swing.JLabel quadradoverde;
//    private javax.swing.JLabel quadradovermelha;
//    private javax.swing.JLabel trianguloamarelo;
//    private javax.swing.JLabel trianguloazul;
//    private javax.swing.JLabel trianguloverde;
//    private javax.swing.JLabel triangulovermelho;
    // End of variables declaration//GEN-END:variables

	@Override
	protected FaseControladorBase GetControladorFase() {
		return controlaFase;
	}
}
