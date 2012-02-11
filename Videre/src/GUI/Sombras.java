package GUI;

import ConfigFases.*;
import java.awt.Rectangle;
import javax.swing.*;

public class Sombras extends TelaJogo {

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

	//private Icon img = null, s = null;

	private FaseSombraControlador controlaFase = null;

	public Sombras() {

		controlaFase = new FaseSombraControlador(
				this,
				new FaseSombra("rinoceronte", new Rectangle(30, 110, 50, 50)),
				new FaseSombra("hipopotamo", new Rectangle(110, 140, 50, 50)),
				new FaseSombra("carneiro", new Rectangle(180, 100, 50, 50)),
				new FaseSombra("pinguim", new Rectangle(30, 210, 50, 50)),
				new FaseSombra("bebe", new Rectangle(150, 220, 50, 50)),
				new FaseSombra("cebola", new Rectangle(230, 190, 50, 50)),
				new FaseSombra("fantasma", new Rectangle(100, 290, 50, 50)),
				new FaseSombra("cavalo", new Rectangle(580, 100, 50, 50)),
				new FaseSombra("burro", new Rectangle(640, 250, 50, 50)),
				new FaseSombra("galo", new Rectangle(160, 430, 50, 50)),
				new FaseSombra("bode", new Rectangle(180, 340, 50, 50)),
				new FaseSombra("pincel", new Rectangle(260, 300, 50, 50)),
				new FaseSombra("arvore", new Rectangle(40, 350, 50, 50)),
				new FaseSombra("sacarolhas", new Rectangle(50, 440, 50, 50)),
				new FaseSombra("golfinho", new Rectangle(260, 440, 50, 50)),
				new FaseSombra("caracol", new Rectangle(390, 440, 50, 50)),
				new FaseSombra("carangueijo", new Rectangle(320, 380, 50, 50)),
				new FaseSombra("barata", new Rectangle(460, 370, 50, 50)),
				new FaseSombra("tubarao", new Rectangle(570, 370, 50, 50)),
				new FaseSombra("abacaxi", new Rectangle(650, 450, 50, 50)),
				new FaseSombra("xicara", new Rectangle(660, 150, 50, 50)),
				new FaseSombra("camiseta", new Rectangle(540, 180, 50, 50)),
				new FaseSombra("macaco", new Rectangle(640, 330, 50, 50)),
				new FaseSombra("robo", new Rectangle(730, 90, 50, 50)),
				new FaseSombra("passaro", new Rectangle(530, 270, 50, 50)),
				new FaseSombra("astronauta", new Rectangle(730, 220, 50, 50)),
				new FaseSombra("radio", new Rectangle(390, 300, 50, 50)),
				new FaseSombra("bone", new Rectangle(730, 350, 50, 50)),
				new FaseSombra("bule", new Rectangle(520, 440, 50, 50))
				);

		initComponents();

		
//		try {
//			URL som = new URL((getClass().getResource("/sons/zipza.mid")).toString());
//			Musica = java.applet.Applet.newAudioClip(som);
//			Musica.loop();
//		} catch (MalformedURLException erro) {
//			System.out.println("Caminho do áudio não especificado! " + erro);
//		}
//		classes.UtilidadesVidere.TocarMusicaMIDI("zipza");
	}

	@Override
	protected String GetAudioName() {
		return "zipza";
	}
    private void initComponents() {                          
//        srinoceronte = new javax.swing.JLabel();
//        shipopotamo = new javax.swing.JLabel();
//        scarneiro = new javax.swing.JLabel();
//        spinguim = new javax.swing.JLabel();
//        sbebe = new javax.swing.JLabel();
//        scebola = new javax.swing.JLabel();
//        sfantasma = new javax.swing.JLabel();
//        scavalo = new javax.swing.JLabel();
//        sburro = new javax.swing.JLabel();
//        sgalo = new javax.swing.JLabel();
//        sbode = new javax.swing.JLabel();
//        spincel = new javax.swing.JLabel();
//        sarvore = new javax.swing.JLabel();
//        ssacarolhas = new javax.swing.JLabel();
//        sgolfinho = new javax.swing.JLabel();
//        scaracol = new javax.swing.JLabel();
//        scarangueijo = new javax.swing.JLabel();
//        sbarata = new javax.swing.JLabel();
//        stubarao = new javax.swing.JLabel();
//        sabacaxi = new javax.swing.JLabel();
//        sxicara = new javax.swing.JLabel();
//        scamiseta = new javax.swing.JLabel();
//        smacaco = new javax.swing.JLabel();
//        srobo = new javax.swing.JLabel();
//        spassaro = new javax.swing.JLabel();
//        sastronauta = new javax.swing.JLabel();
//        sradio = new javax.swing.JLabel();
//        sbone = new javax.swing.JLabel();
//        sbule = new javax.swing.JLabel();
		
        //rinoceronte = new javax.swing.JLabel();
//        hipopotamo = new javax.swing.JLabel();
//        carneiro = new javax.swing.JLabel();
//        pinguim = new javax.swing.JLabel();
//        bebe = new javax.swing.JLabel();
//        cebola = new javax.swing.JLabel();
//        fantasma = new javax.swing.JLabel();
//        cavalo = new javax.swing.JLabel();
//        burro = new javax.swing.JLabel();
//        galo = new javax.swing.JLabel();
//        bode = new javax.swing.JLabel();
//        pincel = new javax.swing.JLabel();
//        arvore = new javax.swing.JLabel();
//        sacarolhas = new javax.swing.JLabel();
//        golfinho = new javax.swing.JLabel();
//        caracol = new javax.swing.JLabel();
//        carangueijo = new javax.swing.JLabel();
//        barata = new javax.swing.JLabel();
//        tubarao = new javax.swing.JLabel();
//        abacaxi = new javax.swing.JLabel();
//        xicara = new javax.swing.JLabel();
//        camiseta = new javax.swing.JLabel();
//        macaco = new javax.swing.JLabel();
//        robo = new javax.swing.JLabel();
//        passaro = new javax.swing.JLabel();
//        astronauta = new javax.swing.JLabel();
//        radio = new javax.swing.JLabel();
//        bone = new javax.swing.JLabel();
//        bule = new javax.swing.JLabel();
        Sombra = new javax.swing.JLabel();
        btnAjuda = new javax.swing.JButton();

        setTitle("Jogo das Sombras!");
//        srinoceronte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/srinoceronte.gif")));
//        srinoceronte.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(srinoceronte);
//        srinoceronte.setBounds(40, 60, 0, 0);
//
//        shipopotamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/shipopotamo.gif")));
//        shipopotamo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(shipopotamo);
//        shipopotamo.setBounds(40, 60, 0, 0);
//
//        scarneiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/scarneiro.gif")));
//        scarneiro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(scarneiro);
//        scarneiro.setBounds(40, 60, 0, 0);
//
//        spinguim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/spinguim3.gif")));
//        spinguim.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(spinguim);
//        spinguim.setBounds(40, 60, 0, 0);
//
//        sbebe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/sbebe.gif")));
//        sbebe.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(sbebe);
//        sbebe.setBounds(40, 60, 0, 0);
//
//        scebola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/scebola.gif")));
//        scebola.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(scebola);
//        scebola.setBounds(40, 60, 0, 0);
//
//        sfantasma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/sfantasma.gif")));
//        sfantasma.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(sfantasma);
//        sfantasma.setBounds(40, 60, 0, 0);
//
//        scavalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/scavalo.gif")));
//        scavalo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(scavalo);
//        scavalo.setBounds(40, 60, 0, 0);
//
//        sburro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/sburro.gif")));
//        sburro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(sburro);
//        sburro.setBounds(40, 60, 0, 0);
//
//        sgalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/sgalo.gif")));
//        sgalo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(sgalo);
//        sgalo.setBounds(40, 60, 0, 0);
//
//        sbode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/sbode.gif")));
//        sbode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(sbode);
//        sbode.setBounds(40, 60, 0, 0);
//
//        spincel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/spincel.gif")));
//        spincel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(spincel);
//        spincel.setBounds(40, 60, 0, 0);
//
//        sarvore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/sarvore.gif")));
//        sarvore.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(sarvore);
//        sarvore.setBounds(40, 60, 0, 0);
//
//        ssacarolhas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/ssacarolhas.gif")));
//        ssacarolhas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(ssacarolhas);
//        ssacarolhas.setBounds(40, 60, 0, 0);
//
//        sgolfinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/sgolfinho2.gif")));
//        sgolfinho.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(sgolfinho);
//        sgolfinho.setBounds(40, 60, 0, 0);
//
//        scaracol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/scaracol.gif")));
//        scaracol.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(scaracol);
//        scaracol.setBounds(40, 60, 0, 0);
//
//        scarangueijo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/scarangueijo.gif")));
//        scarangueijo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(scarangueijo);
//        scarangueijo.setBounds(40, 60, 0, 0);
//
//        sbarata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/sbarata.gif")));
//        sbarata.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(sbarata);
//        sbarata.setBounds(40, 60, 0, 0);
//
//        stubarao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/stubarao1.gif")));
//        stubarao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(stubarao);
//        stubarao.setBounds(40, 60, 0, 0);
//
//        sabacaxi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/sabacaxi.gif")));
//        sabacaxi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(sabacaxi);
//        sabacaxi.setBounds(40, 60, 0, 0);
//
//        sxicara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/sxicara.gif")));
//        sxicara.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(sxicara);
//        sxicara.setBounds(40, 60, 0, 0);
//
//        scamiseta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/scamiseta4.gif")));
//        scamiseta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(scamiseta);
//        scamiseta.setBounds(40, 60, 0, 0);
//
//        smacaco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/smacaco1.gif")));
//        smacaco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(smacaco);
//        smacaco.setBounds(40, 60, 0, 0);
//
//        srobo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/srobo.gif")));
//        srobo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(srobo);
//        srobo.setBounds(40, 60, 0, 0);
//
//        spassaro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/spassaro4.gif")));
//        spassaro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(spassaro);
//        spassaro.setBounds(40, 60, 0, 0);
//
//        sastronauta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/sastronauta.gif")));
//        sastronauta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(sastronauta);
//        sastronauta.setBounds(40, 60, 0, 0);
//
//        sradio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/sradio.gif")));
//        sradio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(sradio);
//        sradio.setBounds(40, 60, 0, 0);
//
//        sbone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/sbone1.gif")));
//        sbone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(sbone);
//        sbone.setBounds(40, 60, 0, 0);
//
//        sbule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/sbule.gif")));
//        sbule.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(sbule);
//        sbule.setBounds(40, 60, 0, 0);
//
//      rinoceronte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/rinoceronte.jpg")));
//      rinoceronte.addMouseListener(new java.awt.event.MouseAdapter() {
//          public void mouseClicked(java.awt.event.MouseEvent evt) {
//              //rinoceronteMouseClicked(evt);
//          }
//      });
//
//      add(rinoceronte);
//      rinoceronte.setBounds(30, 110, 50, 50);
//
//        hipopotamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/hipopotamo.jpg")));
//        hipopotamo.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                hipopotamoMouseClicked(evt);
//            }
//        });
//
//        add(hipopotamo);
//        hipopotamo.setBounds(110, 140, 50, 50);
//
//        carneiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/carneiro.jpg")));
//        carneiro.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                carneiroMouseClicked(evt);
//            }
//        });
//
//        add(carneiro);
//        carneiro.setBounds(180, 100, 50, 50);
//
//        pinguim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/pinguim3.jpg")));
//        pinguim.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                pinguimMouseClicked(evt);
//            }
//        });
//
//        add(pinguim);
//        pinguim.setBounds(30, 210, 50, 50);
//
//        bebe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/bebe.gif")));
//        bebe.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                bebeMouseClicked(evt);
//            }
//        });
//
//        add(bebe);
//        bebe.setBounds(150, 220, 50, 50);
//
//        cebola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/cebola.gif")));
//        cebola.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                cebolaMouseClicked(evt);
//            }
//        });
//
//        add(cebola);
//        cebola.setBounds(230, 190, 50, 50);
//
//        fantasma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/fantasma.gif")));
//        fantasma.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                fantasmaMouseClicked(evt);
//            }
//        });
//
//        add(fantasma);
//        fantasma.setBounds(100, 290, 50, 50);
//
//        cavalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/cavalo.gif")));
//        cavalo.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                cavaloMouseClicked(evt);
//            }
//        });
//
//        add(cavalo);
//        cavalo.setBounds(580, 100, 50, 50);
//
//        burro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/burro.jpg")));
//        burro.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                burroMouseClicked(evt);
//            }
//        });
//
//        add(burro);
//        burro.setBounds(640, 250, 50, 50);
//
//        galo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/galo.jpg")));
//        galo.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                galoMouseClicked(evt);
//            }
//        });
//
//        add(galo);
//        galo.setBounds(160, 430, 50, 50);
//
//        bode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/bode.jpg")));
//        bode.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                bodeMouseClicked(evt);
//            }
//        });
//
//        add(bode);
//        bode.setBounds(180, 340, 50, 50);
//
//        pincel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/pincel.gif")));
//        pincel.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                pincelMouseClicked(evt);
//            }
//        });
//
//        add(pincel);
//        pincel.setBounds(260, 300, 50, 50);
//
//        arvore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/arvore.jpg")));
//        arvore.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                arvoreMouseClicked(evt);
//            }
//        });
//
//        add(arvore);
//        arvore.setBounds(40, 350, 50, 50);
//
//        sacarolhas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/saca rolhas.jpg")));
//        sacarolhas.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                sacarolhasMouseClicked(evt);
//            }
//        });
//
//        add(sacarolhas);
//        sacarolhas.setBounds(50, 440, 50, 50);
//
//        golfinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/golfinho2.jpg")));
//        golfinho.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                golfinhoMouseClicked(evt);
//            }
//        });
//
//        add(golfinho);
//        golfinho.setBounds(260, 440, 50, 50);
//
//        caracol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/caracol.jpg")));
//        caracol.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                caracolMouseClicked(evt);
//            }
//        });
//
//        add(caracol);
//        caracol.setBounds(390, 440, 50, 50);
//
//        carangueijo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/carangueijo.jpg")));
//        carangueijo.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                carangueijoMouseClicked(evt);
//            }
//        });
//
//        add(carangueijo);
//        carangueijo.setBounds(320, 380, 50, 50);
//
//        barata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/barata.gif")));
//        barata.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                barataMouseClicked(evt);
//            }
//        });
//
//        add(barata);
//        barata.setBounds(460, 370, 50, 50);
//
//        tubarao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/tubarao1.gif")));
//        tubarao.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                tubaraoMouseClicked(evt);
//            }
//        });
//
//        add(tubarao);
//        tubarao.setBounds(570, 370, 50, 50);
//
//        abacaxi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/abacaxi.jpg")));
//        abacaxi.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                abacaxiMouseClicked(evt);
//            }
//        });
//
//        add(abacaxi);
//        abacaxi.setBounds(650, 450, 50, 50);
//
//        xicara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/xicara.jpg")));
//        xicara.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                xicaraMouseClicked(evt);
//            }
//        });
//
//        add(xicara);
//        xicara.setBounds(660, 150, 50, 50);
//
//        camiseta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/camiseta4.jpg")));
//        camiseta.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                camisetaMouseClicked(evt);
//            }
//        });
//
//        add(camiseta);
//        camiseta.setBounds(540, 180, 50, 50);
//
//        macaco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/macaco1.jpg")));
//        macaco.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                macacoMouseClicked(evt);
//            }
//        });
//
//        add(macaco);
//        macaco.setBounds(640, 330, 50, 50);
//
//        robo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/robo.jpg")));
//        robo.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                roboMouseClicked(evt);
//            }
//        });
//
//        add(robo);
//        robo.setBounds(730, 90, 50, 50);
//
//        passaro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/passaro4.jpg")));
//        passaro.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                passaroMouseClicked(evt);
//            }
//        });
//
//        add(passaro);
//        passaro.setBounds(530, 270, 50, 50);
//
//        astronauta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/astronauta.jpg")));
//        astronauta.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                astronautaMouseClicked(evt);
//            }
//        });
//
//        add(astronauta);
//        astronauta.setBounds(730, 220, 50, 50);
//
//        radio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/radio.jpg")));
//        radio.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                radioMouseClicked(evt);
//            }
//        });
//
//        add(radio);
//        radio.setBounds(390, 300, 50, 50);
//
//        bone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/bone1.jpg")));
//        bone.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                boneMouseClicked(evt);
//            }
//        });
//
//        add(bone);
//        bone.setBounds(730, 350, 50, 50);
//
//        bule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/bule.jpg")));
//        bule.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                buleMouseClicked(evt);
//            }
//        });
//
//        add(bule);
//        bule.setBounds(520, 440, 50, 50);

        Sombra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sombras/srinoceronte.gif")));
        add(Sombra);
        Sombra.setBounds(310, 90, 200, 200);
		
        btnAjuda.setBackground(new java.awt.Color(244, 244, 246));
        btnAjuda.setFont(new java.awt.Font("Comic Sans MS", 1, 30));
        btnAjuda.setForeground(new java.awt.Color(255, 0, 0));
        btnAjuda.setText("AJUDA");
        btnAjuda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
        btnAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAjudaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAjudaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAjudaMousePressed(evt);
            }
        });
        btnAjuda.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAjudaMouseMoved(evt);
            }
        });
        add(btnAjuda);
        btnAjuda.setBounds(40, 520, 230, 50);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800, 600);
    }// </editor-fold>                        

    private void btnAjudaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjudaMouseMoved
		btnAjuda.setBackground(new java.awt.Color(255, 255, 102));
    }//GEN-LAST:event_btnAjudaMouseMoved

    private void btnAjudaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjudaMousePressed
		btnAjuda.setBackground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_btnAjudaMousePressed

    private void btnAjudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjudaMouseExited
		btnAjuda.setBackground(new java.awt.Color(244, 244, 246));
    }//GEN-LAST:event_btnAjudaMouseExited

    private void btnAjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjudaMouseClicked
//		Musica.stop();
//		String texto = "-Em cada fase irá aparecer a sombra de um objeto.\n\n-Ache o desenho correspondente a sombra. Eles estão todos espalhados. \n\n-Preste atenção para não confundir!";
//		btnAjuda a = new btnAjuda();
//		a.textoajuda.setText(texto);
//		a.aj = 9;
//		a.setVisible(true);
//		this.setVisible(false);

		//AbrirMenu(Ajuda.GetInsance());
		AbrirAjuda("-Em cada fase irá aparecer a sombra de um objeto.\n\n-Ache o desenho correspondente a sombra. Eles estão todos espalhados. \n\n-Preste atenção para não confundir!");
		
    }//GEN-LAST:event_btnAjudaMouseClicked

//    private void buleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buleMouseClicked
//		img = sbule.getIcon();
//		Compara();
//    }//GEN-LAST:event_buleMouseClicked
//
//    private void boneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boneMouseClicked
//		img = sbone.getIcon();
//		Compara();
//    }//GEN-LAST:event_boneMouseClicked
//
//    private void radioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioMouseClicked
//		img = sradio.getIcon();
//		Compara();
//    }//GEN-LAST:event_radioMouseClicked
//
//    private void astronautaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_astronautaMouseClicked
//		img = sastronauta.getIcon();
//		Compara();
//    }//GEN-LAST:event_astronautaMouseClicked
//
//    private void passaroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passaroMouseClicked
//		img = spassaro.getIcon();
//		Compara();
//    }//GEN-LAST:event_passaroMouseClicked
//
//    private void roboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roboMouseClicked
//		img = srobo.getIcon();
//		Compara();
//    }//GEN-LAST:event_roboMouseClicked
//
//    private void macacoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_macacoMouseClicked
//		img = smacaco.getIcon();
//		Compara();
//    }//GEN-LAST:event_macacoMouseClicked
//
//    private void camisetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_camisetaMouseClicked
//		img = scamiseta.getIcon();
//		Compara();
//    }//GEN-LAST:event_camisetaMouseClicked
//
//    private void xicaraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xicaraMouseClicked
//		img = sxicara.getIcon();
//		Compara();
//    }//GEN-LAST:event_xicaraMouseClicked
//
//    private void abacaxiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abacaxiMouseClicked
//		img = sabacaxi.getIcon();
//		Compara();
//    }//GEN-LAST:event_abacaxiMouseClicked
//
//    private void tubaraoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tubaraoMouseClicked
//		img = stubarao.getIcon();
//		Compara();
//    }//GEN-LAST:event_tubaraoMouseClicked
//
//    private void barataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barataMouseClicked
//		img = sbarata.getIcon();
//		Compara();
//    }//GEN-LAST:event_barataMouseClicked
//
//    private void carangueijoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carangueijoMouseClicked
//		img = scarangueijo.getIcon();
//		Compara();
//    }//GEN-LAST:event_carangueijoMouseClicked
//
//    private void caracolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caracolMouseClicked
//		img = scaracol.getIcon();
//		Compara();
//    }//GEN-LAST:event_caracolMouseClicked
//
//    private void golfinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_golfinhoMouseClicked
//		img = sgolfinho.getIcon();
//		Compara();
//    }//GEN-LAST:event_golfinhoMouseClicked
//
//    private void sacarolhasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sacarolhasMouseClicked
//		img = ssacarolhas.getIcon();
//		Compara();
//    }//GEN-LAST:event_sacarolhasMouseClicked
//
//    private void arvoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arvoreMouseClicked
//		img = sarvore.getIcon();
//		Compara();
//    }//GEN-LAST:event_arvoreMouseClicked
//
//    private void pincelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pincelMouseClicked
//		img = spincel.getIcon();
//		Compara();
//    }//GEN-LAST:event_pincelMouseClicked
//
//    private void bodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bodeMouseClicked
//		img = sbode.getIcon();
//		Compara();
//    }//GEN-LAST:event_bodeMouseClicked
//
//    private void galoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_galoMouseClicked
//		img = sgalo.getIcon();
//		Compara();
//    }//GEN-LAST:event_galoMouseClicked
//
//    private void burroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_burroMouseClicked
//		img = sburro.getIcon();
//		Compara();
//    }//GEN-LAST:event_burroMouseClicked
//
//    private void cavaloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cavaloMouseClicked
//		img = scavalo.getIcon();
//		Compara();
//    }//GEN-LAST:event_cavaloMouseClicked
//
//    private void fantasmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fantasmaMouseClicked
//		img = sfantasma.getIcon();
//		Compara();
//    }//GEN-LAST:event_fantasmaMouseClicked
//
//    private void cebolaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cebolaMouseClicked
//		img = scebola.getIcon();
//		Compara();
//    }//GEN-LAST:event_cebolaMouseClicked
//
//    private void bebeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bebeMouseClicked
//		img = sbebe.getIcon();
//		Compara();
//    }//GEN-LAST:event_bebeMouseClicked
//
//    private void pinguimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pinguimMouseClicked
//		img = spinguim.getIcon();
//		Compara();
//    }//GEN-LAST:event_pinguimMouseClicked
//
//    private void carneiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carneiroMouseClicked
//		img = scarneiro.getIcon();
//		Compara();
//    }//GEN-LAST:event_carneiroMouseClicked
//
//    private void hipopotamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hipopotamoMouseClicked
//		img = shipopotamo.getIcon();
//		Compara();
//    }//GEN-LAST:event_hipopotamoMouseClicked
//
//    private void rinoceronteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rinoceronteMouseClicked
//		img = srinoceronte.getIcon();
//		Compara();
//    }//GEN-LAST:event_rinoceronteMouseClicked



//	private void AumentaPontos() {
//		ptos = ptos + 1000;
//		Pontos.setText(String.valueOf(ptos));
//	}
//
//	private void ChamaErro() {
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
//			er.FlagJogo = 9;
//			Musica.stop();
//			er.setVisible(true);
//			this.setVisible(false);
//		}
//	}

	public void SetSombraAtual(Icon icone) {
		Sombra.setIcon(icone);
	}
	
//	private void Compara() {
//		s = Sombra.getIcon();
//		while (fase <= 29) {
//			if (fase == 1) {
//				if (s.toString().equals(img.toString())) {
//					fase = 2;
//					AumentaPontos();
//					s = shipopotamo.getIcon();
//					Sombra.setIcon(s);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 2) {
//				if (s.toString().equals(img.toString())) {
//					fase = 3;
//					AumentaPontos();
//					s = scarneiro.getIcon();
//					Sombra.setIcon(s);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 3) {
//				if (s.toString().equals(img.toString())) {
//					fase = 4;
//					AumentaPontos();
//					s = spinguim.getIcon();
//					Sombra.setIcon(s);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 4) {
//				if (s.toString().equals(img.toString())) {
//					fase = 5;
//					AumentaPontos();
//					s = sbebe.getIcon();
//					Sombra.setIcon(s);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 5) {
//				if (s.toString().equals(img.toString())) {
//					fase = 6;
//					AumentaPontos();
//					s = scebola.getIcon();
//					Sombra.setIcon(s);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 6) {
//				if (s.toString().equals(img.toString())) {
//					fase = 7;
//					AumentaPontos();
//					s = sfantasma.getIcon();
//					Sombra.setIcon(s);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 7) {
//				if (s.toString().equals(img.toString())) {
//					fase = 8;
//					AumentaPontos();
//					s = scavalo.getIcon();
//					Sombra.setIcon(s);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 8) {
//				if (s.toString().equals(img.toString())) {
//					fase = 9;
//					AumentaPontos();
//					s = sburro.getIcon();
//					Sombra.setIcon(s);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 9) {
//				if (s.toString().equals(img.toString())) {
//					fase = 10;
//					AumentaPontos();
//					s = sgalo.getIcon();
//					Sombra.setIcon(s);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 10) {
//				if (s.toString().equals(img.toString())) {
//					fase = 11;
//					AumentaPontos();
//					s = sbode.getIcon();
//					Sombra.setIcon(s);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 11) {
//				if (s.toString().equals(img.toString())) {
//					fase = 12;
//					AumentaPontos();
//					s = spincel.getIcon();
//					Sombra.setIcon(s);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 12) {
//				if (s.toString().equals(img.toString())) {
//					fase = 13;
//					AumentaPontos();
//					s = sarvore.getIcon();
//					Sombra.setIcon(s);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 13) {
//				if (s.toString().equals(img.toString())) {
//					fase = 14;
//					AumentaPontos();
//					s = ssacarolhas.getIcon();
//					Sombra.setIcon(s);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 14) {
//				if (s.toString().equals(img.toString())) {
//					fase = 15;
//					AumentaPontos();
//					s = sgolfinho.getIcon();
//					Sombra.setIcon(s);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 15) {
//				if (s.toString().equals(img.toString())) {
//					fase = 16;
//					AumentaPontos();
//					s = scaracol.getIcon();
//					Sombra.setIcon(s);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 16) {
//				if (s.toString().equals(img.toString())) {
//					fase = 17;
//					AumentaPontos();
//					s = scarangueijo.getIcon();
//					Sombra.setIcon(s);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 17) {
//				if (s.toString().equals(img.toString())) {
//					fase = 18;
//					AumentaPontos();
//					s = sbarata.getIcon();
//					Sombra.setIcon(s);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 18) {
//				if (s.toString().equals(img.toString())) {
//					fase = 19;
//					AumentaPontos();
//					s = stubarao.getIcon();
//					Sombra.setIcon(s);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 19) {
//				if (s.toString().equals(img.toString())) {
//					fase = 20;
//					AumentaPontos();
//					s = sabacaxi.getIcon();
//					Sombra.setIcon(s);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 20) {
//				if (s.toString().equals(img.toString())) {
//					fase = 21;
//					AumentaPontos();
//					s = sxicara.getIcon();
//					Sombra.setIcon(s);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 21) {
//				if (s.toString().equals(img.toString())) {
//					fase = 22;
//					AumentaPontos();
//					s = scamiseta.getIcon();
//					Sombra.setIcon(s);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 22) {
//				if (s.toString().equals(img.toString())) {
//					fase = 23;
//					AumentaPontos();
//					s = smacaco.getIcon();
//					Sombra.setIcon(s);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 23) {
//				if (s.toString().equals(img.toString())) {
//					fase = 24;
//					AumentaPontos();
//					s = srobo.getIcon();
//					Sombra.setIcon(s);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 24) {
//				if (s.toString().equals(img.toString())) {
//					fase = 25;
//					AumentaPontos();
//					s = spassaro.getIcon();
//					Sombra.setIcon(s);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 25) {
//				if (s.toString().equals(img.toString())) {
//					fase = 26;
//					AumentaPontos();
//					s = sastronauta.getIcon();
//					Sombra.setIcon(s);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 26) {
//				if (s.toString().equals(img.toString())) {
//					fase = 27;
//					AumentaPontos();
//					s = sradio.getIcon();
//					Sombra.setIcon(s);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 27) {
//				if (s.toString().equals(img.toString())) {
//					fase = 28;
//					AumentaPontos();
//					s = sbone.getIcon();
//					Sombra.setIcon(s);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 28) {
//				if (s.toString().equals(img.toString())) {
//					fase = 29;
//					AumentaPontos();
//					s = sbule.getIcon();
//					Sombra.setIcon(s);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 29) {
//				if (s.toString().equals(img.toString())) {
//					AumentaPontos();
//					Acerto ac = new Acerto();
//					ac.Pontuacao.setText(String.valueOf(ptos));
//					ac.FlagJogo = 9;
//					Musica.stop();
//					ac.setVisible(true);
//					this.setVisible(false);
//					break;
//
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//
//
//
//
//
//		}
//	}
//
	public static void main(String args[]) {
		new Sombras().show();
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Sombra;
//    private javax.swing.JLabel abacaxi;
//    private javax.swing.JLabel arvore;
//    private javax.swing.JLabel astronauta;
//    private javax.swing.JLabel barata;
//    private javax.swing.JLabel bebe;
//    private javax.swing.JLabel bode;
//    private javax.swing.JLabel bone;
    private javax.swing.JButton btnAjuda;
//    private javax.swing.JLabel bule;
//    private javax.swing.JLabel burro;
//    private javax.swing.JLabel camiseta;
//    private javax.swing.JLabel caracol;
//    private javax.swing.JLabel carangueijo;
//    private javax.swing.JLabel carneiro;
//    private javax.swing.JLabel cavalo;
//    private javax.swing.JLabel cebola;
//    private javax.swing.JLabel fantasma;
//    private javax.swing.JLabel galo;
//    private javax.swing.JLabel golfinho;
//    private javax.swing.JLabel hipopotamo;
//    private javax.swing.JLabel macaco;
//    private javax.swing.JLabel passaro;
//    private javax.swing.JLabel pincel;
//    private javax.swing.JLabel pinguim;
//    private javax.swing.JLabel radio;
//    private javax.swing.JLabel rinoceronte;
//    private javax.swing.JLabel robo;
//    private javax.swing.JLabel sabacaxi;
//    private javax.swing.JLabel sacarolhas;
//    private javax.swing.JLabel sarvore;
//    private javax.swing.JLabel sastronauta;
//    private javax.swing.JLabel sbarata;
//    private javax.swing.JLabel sbebe;
//    private javax.swing.JLabel sbode;
//    private javax.swing.JLabel sbone;
//    private javax.swing.JLabel sbule;
//    private javax.swing.JLabel sburro;
//    private javax.swing.JLabel scamiseta;
//    private javax.swing.JLabel scaracol;
//    private javax.swing.JLabel scarangueijo;
//    private javax.swing.JLabel scarneiro;
//    private javax.swing.JLabel scavalo;
//    private javax.swing.JLabel scebola;
//    private javax.swing.JLabel sfantasma;
//    private javax.swing.JLabel sgalo;
//    private javax.swing.JLabel sgolfinho;
//    private javax.swing.JLabel shipopotamo;
//    private javax.swing.JLabel smacaco;
//    private javax.swing.JLabel spassaro;
//    private javax.swing.JLabel spincel;
//    private javax.swing.JLabel spinguim;
//    private javax.swing.JLabel sradio;
//    private javax.swing.JLabel srinoceronte;
//    private javax.swing.JLabel srobo;
//    private javax.swing.JLabel ssacarolhas;
//    private javax.swing.JLabel stubarao;
//    private javax.swing.JLabel sxicara;
//    private javax.swing.JLabel tubarao;
//    private javax.swing.JLabel xicara;
    // End of variables declaration//GEN-END:variables

	@Override
	protected FaseControladorBase GetControladorFase() {
		return controlaFase;
	}
}
