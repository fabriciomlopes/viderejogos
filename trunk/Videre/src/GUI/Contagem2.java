package GUI;

import ConfigFases.FaseControladorBase;
import ConfigFases.FaseEsconderFiguras;
import ConfigFases.FaseEsconderFigurasControlador;
import java.awt.Point;

public class Contagem2 extends TelaJogo {

//	private int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
//	private Icon muda = null, des = null, fundo = null;

	private FaseEsconderFigurasControlador controladorFase;

	public Contagem2() {

		controladorFase = new FaseEsconderFigurasControlador(this,
				new FaseEsconderFiguras("PRATO", 		"bacia", 		new Point( 50, 130), new Point(240, 190), new Point( 90, 360), new Point(430, 240) ),
				new FaseEsconderFiguras("Balão", 		"balao", 		new Point(200, 110), new Point(220, 190), new Point(250, 310), new Point(240, 410) ),
				new FaseEsconderFiguras("Boné", 		"bone", 		new Point(170, 330), new Point(270, 230), new Point( 30, 210), new Point(450, 310) ),
				new FaseEsconderFiguras("Boneca", 		"boneca", 		new Point(110, 250), new Point(360, 240), new Point(290, 110), new Point(230, 340) ),
				new FaseEsconderFiguras("Boneco de Neve", "boneconeve", new Point(120, 390), new Point(260, 170), new Point(260, 330), new Point(450, 380) ),
				new FaseEsconderFiguras("Cenoura", 		"cenoura", 		new Point(130, 160), new Point(470, 410), new Point(110, 290), new Point(280, 290) ),
				new FaseEsconderFiguras("Chave", 		"chave", 		new Point( 30, 270), new Point(110, 390), new Point(480, 110), new Point(410, 330) ),
				new FaseEsconderFiguras("Chuva", 		"chuva", 		new Point( 60, 240), new Point(150, 400), new Point(390, 390), new Point(270, 170) ),
				new FaseEsconderFiguras("Garfo", 		"garfo", 		new Point( 40, 410), new Point(330, 220), new Point(460, 360), new Point(190, 150) ),
				new FaseEsconderFiguras("Garrafa", 		"garrafa", 		new Point(270, 390), new Point(130, 230), new Point(250, 130), new Point(410, 310) ),
				new FaseEsconderFiguras("Girafa", 		"girafa", 		new Point(160, 410), new Point(190, 270), new Point(370, 110), new Point(270, 220) ),
				new FaseEsconderFiguras("Ímã", 			"ima", 			new Point(170, 140), new Point(170, 410), new Point(400, 380), new Point(410, 120) ),
				new FaseEsconderFiguras("Panela", 		"panela", 		new Point(120, 220), new Point(400, 410), new Point(310, 280), new Point(420, 140) ),
				new FaseEsconderFiguras("Papai Noel", 	"papainoel", 	new Point(310, 300), new Point(420, 270), new Point(100, 150), new Point(450, 380) ),
				new FaseEsconderFiguras("Peteca", 		"peteca", 		new Point(230, 410), new Point(150, 220), new Point(290, 190), new Point(450, 220) ),
				new FaseEsconderFiguras("Pipoca", 		"pipoca", 		new Point( 80, 200), new Point(410, 210), new Point(210, 380), new Point(460, 330) ),
				new FaseEsconderFiguras("Porco", 		"porco", 		new Point(140, 220), new Point(300, 170), new Point(330, 280), new Point(200, 400) ),
				new FaseEsconderFiguras("Porta", 		"porta", 		new Point( 30, 260), new Point(250, 170), new Point(280, 410), new Point(480, 280) ),
				new FaseEsconderFiguras("Prego", 		"prego", 		new Point(100, 130), new Point(480, 110), new Point(250, 210), new Point(460, 400) ),
				new FaseEsconderFiguras("Tartaruga", 	"tartaruga", 	new Point( 90, 340), new Point(410, 230), new Point(250, 250), new Point(360, 340) ),
				new FaseEsconderFiguras("Tatu", 		"tatu", 		new Point( 90, 330), new Point(440, 260), new Point(190, 240), new Point(280, 240) ),
				new FaseEsconderFiguras("Urso", 		"urso", 		new Point(170, 370), new Point(320, 150), new Point(420, 350), new Point(120, 220) ),
				new FaseEsconderFiguras("Zebra", 		"zebra", 		new Point(110, 380), new Point( 30, 180), new Point(410, 350), new Point(350, 130) )

				);

		initComponents();

//		try {
//			URL som = new URL((getClass().getResource("/sons/balaomagico.mid")).toString());
//			Musica = java.applet.Applet.newAudioClip(som);
//			Musica.loop();
//		} catch (MalformedURLException erro) {
//			System.out.println("Caminho do áudio não especificado! " + erro);
//		}
	}

	@Override
	protected String GetAudioName() {
		return "balaomagico";
	}

    private void initComponents() {//GEN-BEGIN:initComponents
//        Objeto1 = new javax.swing.JLabel();
//        Objeto3 = new javax.swing.JLabel();
//        Objeto2 = new javax.swing.JLabel();
//        Objeto4 = new javax.swing.JLabel();
//        FundoMesclado = new javax.swing.JLabel();
        Ajuda = new javax.swing.JButton();
//        Fase2 = new javax.swing.JLabel();
//        Fase3 = new javax.swing.JLabel();
//        Fase4 = new javax.swing.JLabel();
//        Fase5 = new javax.swing.JLabel();
//        Fase6 = new javax.swing.JLabel();
//        Fase7 = new javax.swing.JLabel();
//        Fase8 = new javax.swing.JLabel();
//        Fase9 = new javax.swing.JLabel();
//        Fase10 = new javax.swing.JLabel();
//        Fase11 = new javax.swing.JLabel();
//        Fase12 = new javax.swing.JLabel();
//        Fase13 = new javax.swing.JLabel();
//        Fase14 = new javax.swing.JLabel();
//        Fase15 = new javax.swing.JLabel();
//        Fase16 = new javax.swing.JLabel();
//        Fase17 = new javax.swing.JLabel();
//        Fase18 = new javax.swing.JLabel();
//        Fase19 = new javax.swing.JLabel();
//        Fase20 = new javax.swing.JLabel();
//        Fase21 = new javax.swing.JLabel();
//        Fase22 = new javax.swing.JLabel();
//        Fase23 = new javax.swing.JLabel();
//        Outra = new javax.swing.JLabel();
//        FigFase2 = new javax.swing.JLabel();
//        FigFase3 = new javax.swing.JLabel();
//        FigFase4 = new javax.swing.JLabel();
//        FigFase5 = new javax.swing.JLabel();
//        FigFase6 = new javax.swing.JLabel();
//        FigFase7 = new javax.swing.JLabel();
//        FigFase8 = new javax.swing.JLabel();
//        FigFase9 = new javax.swing.JLabel();
//        FigFase10 = new javax.swing.JLabel();
//        FigFase11 = new javax.swing.JLabel();
//        FigFase12 = new javax.swing.JLabel();
//        FigFase13 = new javax.swing.JLabel();
//        FigFase14 = new javax.swing.JLabel();
//        FigFase15 = new javax.swing.JLabel();
//        FigFase16 = new javax.swing.JLabel();
//        FigFase17 = new javax.swing.JLabel();
//        FigFase18 = new javax.swing.JLabel();
//        FigFase19 = new javax.swing.JLabel();
//        FigFase20 = new javax.swing.JLabel();
//        FigFase21 = new javax.swing.JLabel();
//        FigFase22 = new javax.swing.JLabel();
//        FigFase23 = new javax.swing.JLabel();
        Ache = new javax.swing.JLabel();
        NomeFigura = new javax.swing.JLabel();
        Painel = new javax.swing.JPanel();
        Painel1 = new javax.swing.JPanel();

        setTitle("Esconde-Esconde");
//        Objeto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/bacia.gif")));
//        Objeto1.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                Objeto1MouseClicked(evt);
//            }
//        });
//
//        add(Objeto1);
//        Objeto1.setBounds(50, 130, 50, 50);
//
//        Objeto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/bacia.gif")));
//        Objeto3.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                Objeto3MouseClicked(evt);
//            }
//        });
//
//        add(Objeto3);
//        Objeto3.setBounds(240, 190, 50, 50);
//
//        Objeto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/bacia.gif")));
//        Objeto2.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                Objeto2MouseClicked(evt);
//            }
//        });
//
//        add(Objeto2);
//        Objeto2.setBounds(90, 360, 50, 50);
//
//        Objeto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/bacia.gif")));
//        Objeto4.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                Objeto4MouseClicked(evt);
//            }
//        });
//
//        add(Objeto4);
//        Objeto4.setBounds(430, 240, 50, 50);
//
//        FundoMesclado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/fbacia.jpg")));
//        FundoMesclado.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                FundoMescladoMouseClicked(evt);
//            }
//        });
//
//        add(FundoMesclado);
//        FundoMesclado.setBounds(30, 110, 500, 350);

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
        Ajuda.setBounds(22, 516, 230, 50);

//        Fase2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/fbalao.jpg")));
//        Fase2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase2);
//        Fase2.setBounds(30, 520, 15, 15);
//
//        Fase3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/fbone.jpg")));
//        Fase3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase3);
//        Fase3.setBounds(30, 520, 15, 15);
//
//        Fase4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/fboneca.gif")));
//        Fase4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase4);
//        Fase4.setBounds(30, 520, 15, 15);
//
//        Fase5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/fboneconeve.jpg")));
//        Fase5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase5);
//        Fase5.setBounds(30, 520, 15, 15);
//
//        Fase6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/fcenoura.jpg")));
//        Fase6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase6);
//        Fase6.setBounds(30, 520, 15, 15);
//
//        Fase7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/fchave.jpg")));
//        Fase7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase7);
//        Fase7.setBounds(30, 520, 15, 15);
//
//        Fase8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/fchuva.jpg")));
//        Fase8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase8);
//        Fase8.setBounds(30, 520, 15, 15);
//
//        Fase9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/fgarfo.jpg")));
//        Fase9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase9);
//        Fase9.setBounds(30, 520, 15, 15);
//
//        Fase10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/fgarrafa.jpg")));
//        Fase10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase10);
//        Fase10.setBounds(30, 520, 15, 15);
//
//        Fase11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/fgirafa.jpg")));
//        Fase11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase11);
//        Fase11.setBounds(30, 520, 15, 15);
//
//        Fase12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/fima.jpg")));
//        Fase12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase12);
//        Fase12.setBounds(30, 520, 15, 15);
//
//        Fase13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/fpanela.jpg")));
//        Fase13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase13);
//        Fase13.setBounds(30, 520, 15, 15);
//
//        Fase14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/fpapainoel.gif")));
//        Fase14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase14);
//        Fase14.setBounds(30, 520, 15, 15);
//
//        Fase15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/fpeteca.jpg")));
//        Fase15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase15);
//        Fase15.setBounds(30, 520, 15, 15);
//
//        Fase16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/fpipoca.jpg")));
//        Fase16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase16);
//        Fase16.setBounds(30, 520, 15, 15);
//
//        Fase17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/fporco2.jpg")));
//        Fase17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase17);
//        Fase17.setBounds(30, 520, 15, 15);
//
//        Fase18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/fporta.jpg")));
//        Fase18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase18);
//        Fase18.setBounds(30, 520, 15, 15);
//
//        Fase19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/fprego.jpg")));
//        Fase19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase19);
//        Fase19.setBounds(30, 520, 15, 15);
//
//        Fase20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/ftartaruga.jpg")));
//        Fase20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase20);
//        Fase20.setBounds(30, 520, 15, 15);
//
//        Fase21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/ftatu.jpg")));
//        Fase21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase21);
//        Fase21.setBounds(30, 520, 15, 15);
//
//        Fase22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/furso.gif")));
//        Fase22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase22);
//        Fase22.setBounds(30, 520, 15, 15);
//
//        Fase23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/fzebra1.gif")));
//        Fase23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase23);
//        Fase23.setBounds(30, 520, 15, 15);
//
//        Outra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/clique.jpg")));
//        Outra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Outra);
//        Outra.setBounds(30, 520, 15, 15);
//
//        FigFase2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/balao.gif")));
//        FigFase2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(FigFase2);
//        FigFase2.setBounds(30, 540, 15, 15);
//
//        FigFase3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/bone.gif")));
//        FigFase3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(FigFase3);
//        FigFase3.setBounds(30, 540, 15, 15);
//
//        FigFase4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/boneca.gif")));
//        FigFase4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(FigFase4);
//        FigFase4.setBounds(30, 540, 15, 15);
//
//        FigFase5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/boneconeve.gif")));
//        FigFase5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(FigFase5);
//        FigFase5.setBounds(30, 540, 15, 15);
//
//        FigFase6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/cenoura.gif")));
//        FigFase6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(FigFase6);
//        FigFase6.setBounds(30, 540, 15, 15);
//
//        FigFase7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/chave.gif")));
//        FigFase7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(FigFase7);
//        FigFase7.setBounds(30, 540, 15, 15);
//
//        FigFase8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/chuva.gif")));
//        FigFase8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(FigFase8);
//        FigFase8.setBounds(30, 540, 15, 15);
//
//        FigFase9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/garfo.gif")));
//        FigFase9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(FigFase9);
//        FigFase9.setBounds(30, 540, 15, 15);
//
//        FigFase10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/garrafa.gif")));
//        FigFase10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(FigFase10);
//        FigFase10.setBounds(30, 540, 15, 15);
//
//        FigFase11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/girafa.gif")));
//        FigFase11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(FigFase11);
//        FigFase11.setBounds(30, 540, 15, 15);
//
//        FigFase12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/ima.gif")));
//        FigFase12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(FigFase12);
//        FigFase12.setBounds(30, 540, 15, 15);
//
//        FigFase13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/panela.gif")));
//        FigFase13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(FigFase13);
//        FigFase13.setBounds(30, 540, 15, 15);
//
//        FigFase14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/papainoel.gif")));
//        FigFase14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(FigFase14);
//        FigFase14.setBounds(30, 540, 15, 15);
//
//        FigFase15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/peteca.gif")));
//        FigFase15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(FigFase15);
//        FigFase15.setBounds(30, 540, 15, 15);
//
//        FigFase16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/pipoca.gif")));
//        FigFase16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(FigFase16);
//        FigFase16.setBounds(30, 540, 15, 15);
//
//        FigFase17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/porco.gif")));
//        FigFase17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(FigFase17);
//        FigFase17.setBounds(30, 540, 15, 15);
//
//        FigFase18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/porta.gif")));
//        FigFase18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(FigFase18);
//        FigFase18.setBounds(30, 540, 15, 15);
//
//        FigFase19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/prego.gif")));
//        FigFase19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(FigFase19);
//        FigFase19.setBounds(30, 540, 15, 15);
//
//        FigFase20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/tartaruga.gif")));
//        FigFase20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(FigFase20);
//        FigFase20.setBounds(30, 540, 15, 15);
//
//        FigFase21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/tatu.gif")));
//        FigFase21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(FigFase21);
//        FigFase21.setBounds(30, 540, 15, 15);
//
//        FigFase22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/urso.gif")));
//        FigFase22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(FigFase22);
//        FigFase22.setBounds(30, 540, 15, 15);
//
//        FigFase23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esconder/zebra.gif")));
//        FigFase23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(FigFase23);
//        FigFase23.setBounds(30, 540, 15, 15);

        Ache.setFont(new java.awt.Font("Comic Sans MS", 1, 23));
        Ache.setForeground(new java.awt.Color(0, 0, 255));
        Ache.setText("Ache...");
        add(Ache);
        Ache.setBounds(570, 250, 110, 40);

        NomeFigura.setFont(new java.awt.Font("Comic Sans MS", 1, 33));
        NomeFigura.setForeground(new java.awt.Color(0, 0, 255));
        NomeFigura.setText("PRATO");
        add(NomeFigura);
        NomeFigura.setBounds(550, 280, 220, 60);

        Painel.setLayout(null);

        Painel.setBackground(new java.awt.Color(233, 232, 232));
        Painel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        add(Painel);
        Painel.setBounds(540, 250, 230, 100);

        Painel1.setBackground(new java.awt.Color(255, 255, 255));
        Painel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.cyan, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.cyan));
        add(Painel1);
        Painel1.setBounds(20, 80, 760, 400);

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
//		texto = "-A cada fase, você deverá achar quatro figuras. Clique em cima delas com o mouse.\n\n- O nome das figuras que você deve achar aparece escrito ao lado direito da imagem.\n\n- Cuidado! Ao clicar em cima do fundo, fora das figuras que você precisa encontrar, os pontos diminuem e você perde uma vida!.";
//		Ajuda a = new Ajuda();
//		a.textoajuda.setText(texto);
//		a.aj = 3;
//		a.setVisible(true);
//		this.setVisible(false);

		AbrirAjuda("-A cada fase, você deverá achar quatro figuras. Clique em cima delas com o mouse.\n\n- O nome das figuras que você deve achar aparece escrito ao lado direito da imagem.\n\n- Cuidado! Ao clicar em cima do fundo, fora das figuras que você precisa encontrar, os pontos diminuem e você perde uma vida!.");
    }//GEN-LAST:event_AjudaMouseClicked

//    private void Objeto2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Objeto2MouseClicked
//		muda = Outra.getIcon();
//		Objeto2.setIcon(muda);
//		c2 = 1;
//		QuatroCliques();
//    }//GEN-LAST:event_Objeto2MouseClicked
//
//    private void Objeto3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Objeto3MouseClicked
//		muda = Outra.getIcon();
//		Objeto3.setIcon(muda);
//		c3 = 1;
//		QuatroCliques();
//    }//GEN-LAST:event_Objeto3MouseClicked
//
//    private void Objeto4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Objeto4MouseClicked
//		muda = Outra.getIcon();
//		Objeto4.setIcon(muda);
//		c4 = 1;
//		QuatroCliques();
//    }//GEN-LAST:event_Objeto4MouseClicked
//
//    private void Objeto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Objeto1MouseClicked
//		muda = Outra.getIcon();
//		Objeto1.setIcon(muda);
//		c1 = 1;
//		QuatroCliques();
//    }//GEN-LAST:event_Objeto1MouseClicked
//
//	private void SetaObejtos() {
//		Objeto1.setIcon(des);
//		Objeto2.setIcon(des);
//		Objeto3.setIcon(des);
//		Objeto4.setIcon(des);
//	}
//
//	private void ZeraC() {
//		c1 = 0;
//		c2 = 0;
//		c3 = 0;
//		c4 = 0;
//	}
//
//    private void FundoMescladoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FundoMescladoMouseClicked
//		ptos = ptos - 500;
//		if (ptos < 0) {
//			ptos = 0;
//		}
//		Pontos.setText(String.valueOf(ptos));
//		vida = vida - 1;
//		NumVidas.setText(String.valueOf(vida));
//		if (vida == 0) {
//			Erro er = new Erro();
//			er.Pontuacao.setText(String.valueOf(ptos));
//			er.FlagJogo = 3;
////			Musica.stop();
//			er.setVisible(true);
//			this.setVisible(false);
//		}
//    }//GEN-LAST:event_FundoMescladoMouseClicked
//
//	private void QuatroCliques() {
//		if ((c1 == 1) && (c2 == 1) && (c3 == 1) && (c4 == 1)) {
//			ptos = ptos + 1000;
//			Pontos.setText(String.valueOf(ptos));
//			ZeraC();
//			Compara();
//		}
//	}

	/**
	 * set object name
	 * @param sName
	 */
	public void SeObjectName(String sName){
		NomeFigura.setText(sName);
	}

//	public void Compara() {
//		while (fase <= 23) {
//			if (fase == 1) {
//				fase = 2;
//				NomeFigura.setText("Balão");
//				fundo = Fase2.getIcon();
//				FundoMesclado.setIcon(fundo);
//				des = FigFase2.getIcon();
//				SetaObejtos();
//				Objeto1.setLocation(200, 110);
//				Objeto2.setLocation(220, 190);
//				Objeto3.setLocation(250, 310);
//				Objeto4.setLocation(240, 410);
//				break;
//			}
//
//			if (fase == 2) {
//				fase = 3;
//				NomeFigura.setText("Boné");
//				fundo = Fase3.getIcon();
//				FundoMesclado.setIcon(fundo);
//				des = FigFase3.getIcon();
//				SetaObejtos();
//				Objeto1.setLocation(170, 330);
//				Objeto2.setLocation(270, 230);
//				Objeto3.setLocation(30, 210);
//				Objeto4.setLocation(450, 310);
//				break;
//			}
//
//			if (fase == 3) {
//				fase = 4;
//				NomeFigura.setText("Boneca");
//				fundo = Fase4.getIcon();
//				FundoMesclado.setIcon(fundo);
//				des = FigFase4.getIcon();
//				SetaObejtos();
//				Objeto1.setLocation(110, 250);
//				Objeto2.setLocation(360, 240);
//				Objeto3.setLocation(290, 110);
//				Objeto4.setLocation(230, 340);
//				break;
//			}
//
//			if (fase == 4) {
//				fase = 5;
//				NomeFigura.setText("Boneco de Neve");
//				fundo = Fase5.getIcon();
//				FundoMesclado.setIcon(fundo);
//				des = FigFase5.getIcon();
//				SetaObejtos();
//				Objeto1.setLocation(120, 390);
//				Objeto2.setLocation(260, 170);
//				Objeto3.setLocation(260, 330);
//				Objeto4.setLocation(450, 380);
//				break;
//			}
//
//			if (fase == 5) {
//				fase = 6;
//				NomeFigura.setText("Cenoura");
//				fundo = Fase6.getIcon();
//				FundoMesclado.setIcon(fundo);
//				des = FigFase6.getIcon();
//				SetaObejtos();
//				Objeto1.setLocation(130, 160);
//				Objeto2.setLocation(470, 410);
//				Objeto3.setLocation(110, 290);
//				Objeto4.setLocation(280, 290);
//				break;
//			}
//
//			if (fase == 6) {
//				fase = 7;
//				NomeFigura.setText("Chave");
//				fundo = Fase7.getIcon();
//				FundoMesclado.setIcon(fundo);
//				des = FigFase7.getIcon();
//				SetaObejtos();
//				Objeto1.setLocation(30, 270);
//				Objeto2.setLocation(110, 390);
//				Objeto3.setLocation(480, 110);
//				Objeto4.setLocation(410, 330);
//				break;
//			}
//
//			if (fase == 7) {
//				fase = 8;
//				NomeFigura.setText("Chuva");
//				fundo = Fase8.getIcon();
//				FundoMesclado.setIcon(fundo);
//				des = FigFase8.getIcon();
//				SetaObejtos();
//				Objeto1.setLocation(60, 240);
//				Objeto2.setLocation(150, 400);
//				Objeto3.setLocation(390, 390);
//				Objeto4.setLocation(270, 170);
//				break;
//			}
//
//			if (fase == 8) {
//				fase = 9;
//				NomeFigura.setText("Garfo");
//				fundo = Fase9.getIcon();
//				FundoMesclado.setIcon(fundo);
//				des = FigFase9.getIcon();
//				SetaObejtos();
//				Objeto1.setLocation(40, 410);
//				Objeto2.setLocation(330, 220);
//				Objeto3.setLocation(460, 360);
//				Objeto4.setLocation(190, 150);
//				break;
//			}
//
//			if (fase == 9) {
//				fase = 10;
//				NomeFigura.setText("Garrafa");
//				fundo = Fase10.getIcon();
//				FundoMesclado.setIcon(fundo);
//				des = FigFase10.getIcon();
//				SetaObejtos();
//				Objeto1.setLocation(270, 390);
//				Objeto2.setLocation(130, 230);
//				Objeto3.setLocation(250, 130);
//				Objeto4.setLocation(410, 310);
//				break;
//			}
//
//			if (fase == 10) {
//				fase = 11;
//				NomeFigura.setText("Girafa");
//				fundo = Fase11.getIcon();
//				FundoMesclado.setIcon(fundo);
//				des = FigFase11.getIcon();
//				SetaObejtos();
//				Objeto1.setLocation(160, 410);
//				Objeto2.setLocation(190, 270);
//				Objeto3.setLocation(370, 110);
//				Objeto4.setLocation(270, 220);
//				break;
//			}
//
//			if (fase == 11) {
//				fase = 12;
//				NomeFigura.setText("Ímã");
//				fundo = Fase12.getIcon();
//				FundoMesclado.setIcon(fundo);
//				des = FigFase12.getIcon();
//				SetaObejtos();
//				Objeto1.setLocation(170, 140);
//				Objeto2.setLocation(170, 410);
//				Objeto3.setLocation(400, 380);
//				Objeto4.setLocation(410, 120);
//				break;
//			}
//
//			if (fase == 12) {
//				fase = 13;
//				NomeFigura.setText("Panela");
//				fundo = Fase13.getIcon();
//				FundoMesclado.setIcon(fundo);
//				des = FigFase13.getIcon();
//				SetaObejtos();
//				Objeto1.setLocation(120, 220);
//				Objeto2.setLocation(400, 410);
//				Objeto3.setLocation(310, 280);
//				Objeto4.setLocation(420, 140);
//				break;
//			}
//
//			if (fase == 13) {
//				fase = 14;
//				NomeFigura.setText("Papai Noel");
//				fundo = Fase14.getIcon();
//				FundoMesclado.setIcon(fundo);
//				des = FigFase14.getIcon();
//				SetaObejtos();
//				Objeto1.setLocation(310, 300);
//				Objeto2.setLocation(420, 270);
//				Objeto3.setLocation(100, 150);
//				Objeto4.setLocation(450, 380);
//				break;
//			}
//
//			if (fase == 14) {
//				fase = 15;
//				NomeFigura.setText("Peteca");
//				fundo = Fase15.getIcon();
//				FundoMesclado.setIcon(fundo);
//				des = FigFase15.getIcon();
//				SetaObejtos();
//				Objeto1.setLocation(230, 410);
//				Objeto2.setLocation(150, 220);
//				Objeto3.setLocation(290, 190);
//				Objeto4.setLocation(450, 220);
//				break;
//			}
//
//			if (fase == 15) {
//				fase = 16;
//				NomeFigura.setText("Pipoca");
//				fundo = Fase16.getIcon();
//				FundoMesclado.setIcon(fundo);
//				des = FigFase16.getIcon();
//				SetaObejtos();
//				Objeto1.setLocation(80, 200);
//				Objeto2.setLocation(410, 210);
//				Objeto3.setLocation(210, 380);
//				Objeto4.setLocation(460, 330);
//				break;
//			}
//
//			if (fase == 16) {
//				fase = 17;
//				NomeFigura.setText("Porco");
//				fundo = Fase17.getIcon();
//				FundoMesclado.setIcon(fundo);
//				des = FigFase17.getIcon();
//				SetaObejtos();
//				Objeto1.setLocation(140, 220);
//				Objeto2.setLocation(300, 170);
//				Objeto3.setLocation(330, 280);
//				Objeto4.setLocation(200, 400);
//				break;
//			}
//
//			if (fase == 17) {
//				fase = 18;
//				NomeFigura.setText("Porta");
//				fundo = Fase18.getIcon();
//				FundoMesclado.setIcon(fundo);
//				des = FigFase18.getIcon();
//				SetaObejtos();
//				Objeto1.setLocation(30, 260);
//				Objeto2.setLocation(250, 170);
//				Objeto3.setLocation(280, 410);
//				Objeto4.setLocation(480, 280);
//				break;
//			}
//
//			if (fase == 18) {
//				fase = 19;
//				NomeFigura.setText("Prego");
//				fundo = Fase19.getIcon();
//				FundoMesclado.setIcon(fundo);
//				des = FigFase19.getIcon();
//				SetaObejtos();
//				Objeto1.setLocation(100, 130);
//				Objeto2.setLocation(480, 110);
//				Objeto3.setLocation(250, 210);
//				Objeto4.setLocation(460, 400);
//				break;
//			}
//
//			if (fase == 19) {
//				fase = 20;
//				NomeFigura.setText("Tartaruga");
//				fundo = Fase20.getIcon();
//				FundoMesclado.setIcon(fundo);
//				des = FigFase20.getIcon();
//				SetaObejtos();
//				Objeto1.setLocation(90, 340);
//				Objeto2.setLocation(410, 230);
//				Objeto3.setLocation(250, 250);
//				Objeto4.setLocation(360, 340);
//				break;
//			}
//
//			if (fase == 20) {
//				fase = 21;
//				NomeFigura.setText("Tatu");
//				fundo = Fase21.getIcon();
//				FundoMesclado.setIcon(fundo);
//				des = FigFase21.getIcon();
//				SetaObejtos();
//				Objeto1.setLocation(90, 330);
//				Objeto2.setLocation(440, 260);
//				Objeto3.setLocation(190, 240);
//				Objeto4.setLocation(280, 240);
//				break;
//			}
//
//			if (fase == 21) {
//				fase = 22;
//				NomeFigura.setText("Urso");
//				fundo = Fase22.getIcon();
//				FundoMesclado.setIcon(fundo);
//				des = FigFase22.getIcon();
//				SetaObejtos();
//				Objeto1.setLocation(170, 370);
//				Objeto2.setLocation(320, 150);
//				Objeto3.setLocation(420, 350);
//				Objeto4.setLocation(120, 220);
//				break;
//			}
//
//			if (fase == 22) {
//				fase = 23;
//				NomeFigura.setText("Zebra");
//				fundo = Fase23.getIcon();
//				FundoMesclado.setIcon(fundo);
//				des = FigFase23.getIcon();
//				SetaObejtos();
//				Objeto1.setLocation(110, 380);
//				Objeto2.setLocation(30, 180);
//				Objeto3.setLocation(410, 350);
//				Objeto4.setLocation(350, 130);
//				break;
//			}
//
//			if (fase == 23) {
//				fase = 1;
//				Acerto ac = new Acerto();
//				ac.Pontuacao.setText(String.valueOf(ptos));
//				ac.FlagJogo = 3;
////				Musica.stop();
//				ac.setVisible(true);
//				this.setVisible(false);
//				break;
//			}
//
//		}
//	}
//
//	public static void main(String args[]) {
//		new Contagem2().show();
//	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ache;
    private javax.swing.JButton Ajuda;
//    private javax.swing.JLabel Fase10;
//    private javax.swing.JLabel Fase11;
//    private javax.swing.JLabel Fase12;
//    private javax.swing.JLabel Fase13;
//    private javax.swing.JLabel Fase14;
//    private javax.swing.JLabel Fase15;
//    private javax.swing.JLabel Fase16;
//    private javax.swing.JLabel Fase17;
//    private javax.swing.JLabel Fase18;
//    private javax.swing.JLabel Fase19;
//    private javax.swing.JLabel Fase2;
//    private javax.swing.JLabel Fase20;
//    private javax.swing.JLabel Fase21;
//    private javax.swing.JLabel Fase22;
//    private javax.swing.JLabel Fase23;
//    private javax.swing.JLabel Fase3;
//    private javax.swing.JLabel Fase4;
//    private javax.swing.JLabel Fase5;
//    private javax.swing.JLabel Fase6;
//    private javax.swing.JLabel Fase7;
//    private javax.swing.JLabel Fase8;
//    private javax.swing.JLabel Fase9;
//    private javax.swing.JLabel FigFase10;
//    private javax.swing.JLabel FigFase11;
//    private javax.swing.JLabel FigFase12;
//    private javax.swing.JLabel FigFase13;
//    private javax.swing.JLabel FigFase14;
//    private javax.swing.JLabel FigFase15;
//    private javax.swing.JLabel FigFase16;
//    private javax.swing.JLabel FigFase17;
//    private javax.swing.JLabel FigFase18;
//    private javax.swing.JLabel FigFase19;
//    private javax.swing.JLabel FigFase2;
//    private javax.swing.JLabel FigFase20;
//    private javax.swing.JLabel FigFase21;
//    private javax.swing.JLabel FigFase22;
//    private javax.swing.JLabel FigFase23;
//    private javax.swing.JLabel FigFase3;
//    private javax.swing.JLabel FigFase4;
//    private javax.swing.JLabel FigFase5;
//    private javax.swing.JLabel FigFase6;
//    private javax.swing.JLabel FigFase7;
//    private javax.swing.JLabel FigFase8;
//    private javax.swing.JLabel FigFase9;
//    private javax.swing.JLabel FundoMesclado;
    private javax.swing.JLabel NomeFigura;
//    private javax.swing.JLabel Objeto1;
//    private javax.swing.JLabel Objeto2;
//    private javax.swing.JLabel Objeto3;
//    private javax.swing.JLabel Objeto4;
//    private javax.swing.JLabel Outra;
    private javax.swing.JPanel Painel;
    private javax.swing.JPanel Painel1;
    // End of variables declaration//GEN-END:variables

	@Override
	protected FaseControladorBase GetControladorFase() {
		return controladorFase;
	}
}
