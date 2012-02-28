package GUI;

import ConfigFases.FaseControladorBase;
import ConfigFases.FaseCorObjeto;
import ConfigFases.FaseCorObjetoControlador;

public class CorObjeto extends TelaJogo {

//	Icon comp = null, a = null, b = null;

	private FaseCorObjetoControlador controlaFase;

	public CorObjeto() {
		controlaFase = new FaseCorObjetoControlador(this,
				new FaseCorObjeto("SAPATO", 			"sapato", 		FaseCorObjeto.COLOR.Red), 		// fase  1
				new FaseCorObjeto("ARANHA", 			"aranha1", 		FaseCorObjeto.COLOR.Black), 	// fase  2
				new FaseCorObjeto("CARRO", 				"carro24", 		FaseCorObjeto.COLOR.Red), 		// fase  3
				new FaseCorObjeto("BANANA", 			"banana", 		FaseCorObjeto.COLOR.Yellow), 	// fase  4
				new FaseCorObjeto(" ET", 				"et", 			FaseCorObjeto.COLOR.Green), 	// fase  5
				new FaseCorObjeto("TOMATE", 			"tomate1", 		FaseCorObjeto.COLOR.Red), 		// fase  6
				new FaseCorObjeto("TREVO", 				"trevo", 		FaseCorObjeto.COLOR.Green), 	// fase  7
				new FaseCorObjeto("BOLSA", 				"bolsa4", 		FaseCorObjeto.COLOR.Blue), 		// fase  8
				new FaseCorObjeto("BULE", 				"bule1", 		FaseCorObjeto.COLOR.Yellow), 	// fase  9
				new FaseCorObjeto("Cavalo-Marinho", 	"cavalomar", 	FaseCorObjeto.COLOR.Green), 	// fase 10
				new FaseCorObjeto("GOLFINHO", 			"golfinho1", 	FaseCorObjeto.COLOR.Blue), 		// fase 11
				new FaseCorObjeto("COPO", 				"copo", 		FaseCorObjeto.COLOR.Green), 	// fase 12
				new FaseCorObjeto("GRAVATA", 			"gravata", 		FaseCorObjeto.COLOR.Blue), 		// fase 13
				new FaseCorObjeto("TELEFONE", 			"telefone5", 	FaseCorObjeto.COLOR.Green), 	// fase 14
				new FaseCorObjeto("BOMBA", 				"bomba", 		FaseCorObjeto.COLOR.Black), 	// fase 15
				new FaseCorObjeto("MAÇÃ", 				"maca", 		FaseCorObjeto.COLOR.Red), 		// fase 16
				new FaseCorObjeto("PEIXE", 				"peixe", 		FaseCorObjeto.COLOR.Yellow), 	// fase 17
				new FaseCorObjeto("CAMISETA", 			"regata", 		FaseCorObjeto.COLOR.Yellow), 	// fase 18
				new FaseCorObjeto("MOCHILA", 			"mochila1", 	FaseCorObjeto.COLOR.Green), 	// fase 19
				new FaseCorObjeto("GUITARRA", 			"guitarra", 	FaseCorObjeto.COLOR.Blue), 		// fase 20
				new FaseCorObjeto("PIMENTA", 			"pimenta", 		FaseCorObjeto.COLOR.Red), 		// fase 21
				new FaseCorObjeto("TELEFONE", 			"telefone6", 	FaseCorObjeto.COLOR.Yellow), 	// fase 22
				new FaseCorObjeto("PATO", 				"pato2", 		FaseCorObjeto.COLOR.Yellow), 	// fase 23
				new FaseCorObjeto("LIMÃO", 				"limao", 		FaseCorObjeto.COLOR.Green), 	// fase 24
				new FaseCorObjeto("MALA", 				"mala", 		FaseCorObjeto.COLOR.Blue), 		// fase 25
				new FaseCorObjeto("LÁPIS", 				"lapis", 		FaseCorObjeto.COLOR.Blue), 		// fase 26
				new FaseCorObjeto("PÁSSARO", 			"passaro6", 	FaseCorObjeto.COLOR.Green), 	// fase 27
				new FaseCorObjeto("PANELA", 			"panela3", 		FaseCorObjeto.COLOR.Yellow), 	// fase 28
				new FaseCorObjeto("LUVAS", 				"luva1", 		FaseCorObjeto.COLOR.Red), 		// fase 29
				new FaseCorObjeto("BOLSA", 				"bolsa", 		FaseCorObjeto.COLOR.Black), 	// fase 30
				new FaseCorObjeto("MELÃO", 				"melao", 		FaseCorObjeto.COLOR.Yellow), 	// fase 31
				new FaseCorObjeto("AVIÃO", 				"aviao1", 		FaseCorObjeto.COLOR.Yellow), 	// fase 32
				new FaseCorObjeto("ALMOFADA", 			"almofada", 	FaseCorObjeto.COLOR.Red), 		// fase 33
				new FaseCorObjeto("TELEFONE", 			"telefone3", 	FaseCorObjeto.COLOR.Black), 	// fase 34
				new FaseCorObjeto("RAIO", 				"raio", 		FaseCorObjeto.COLOR.Yellow), 	// fase 35
				new FaseCorObjeto("SAIA", 				"saia", 		FaseCorObjeto.COLOR.Red), 		// fase 36
				new FaseCorObjeto("SAPATO", 			"sapato6", 		FaseCorObjeto.COLOR.Black), 	// fase 37
				new FaseCorObjeto("TUBARÃO", 			"tubarao", 		FaseCorObjeto.COLOR.Blue), 		// fase 38
				new FaseCorObjeto("PLANTA", 			"planta", 		FaseCorObjeto.COLOR.Green), 	// fase 39
				new FaseCorObjeto("SOL", 				"sol", 			FaseCorObjeto.COLOR.Yellow), 	// fase 40
				new FaseCorObjeto("TELEFONE", 			"telefone", 	FaseCorObjeto.COLOR.Blue), 		// fase 41
				new FaseCorObjeto("SINO", 				"sino", 		FaseCorObjeto.COLOR.Yellow), 	// fase 42
				new FaseCorObjeto("PANELA", 			"panela2", 		FaseCorObjeto.COLOR.Red) 		// fase 43
				
				);

		initComponents();
//		try {
//			URL som = new URL((getClass().getResource("/sons/mortalkombat.mid")).toString());
//			Musica = java.applet.Applet.newAudioClip(som);
//			Musica.loop();
//		} catch (MalformedURLException erro) {
//			System.out.println("Caminho do áudio não especificado! " + erro);
//		}
	}
	
	@Override
	protected String GetAudioName() {
		return "mortalkombat";
	}

    private void initComponents() {//GEN-BEGIN:initComponents
//        Objeto = new javax.swing.JLabel();
        NomeObjeto = new javax.swing.JLabel();
//        Preto = new javax.swing.JLabel();
//        Amarelo = new javax.swing.JLabel();
//        Azul = new javax.swing.JLabel();
//        Vermelho = new javax.swing.JLabel();
//        Verde = new javax.swing.JLabel();
        Ajuda = new javax.swing.JButton();
//        Clique = new javax.swing.JLabel();
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
//        Fase24 = new javax.swing.JLabel();
//        Fase25 = new javax.swing.JLabel();
//        Fase26 = new javax.swing.JLabel();
//        Fase27 = new javax.swing.JLabel();
//        Fase28 = new javax.swing.JLabel();
//        Fase29 = new javax.swing.JLabel();
//        Fase30 = new javax.swing.JLabel();
//        Fase31 = new javax.swing.JLabel();
//        Fase32 = new javax.swing.JLabel();
//        Fase33 = new javax.swing.JLabel();
//        Fase34 = new javax.swing.JLabel();
//        Fase35 = new javax.swing.JLabel();
//        Fase36 = new javax.swing.JLabel();
//        Fase37 = new javax.swing.JLabel();
//        Fase38 = new javax.swing.JLabel();
//        Fase39 = new javax.swing.JLabel();
//        Fase40 = new javax.swing.JLabel();
//        Fase41 = new javax.swing.JLabel();
//        Fase42 = new javax.swing.JLabel();
//        Fase43 = new javax.swing.JLabel();

        setTitle("Identifique as Cores");
//        Objeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/sapato.jpg")));
//        Objeto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
//        add(Objeto);
//        Objeto.setBounds(260, 120, 160, 160);

        NomeObjeto.setBackground(new java.awt.Color(255, 255, 255));
        NomeObjeto.setFont(new java.awt.Font("Comic Sans MS", 1, 40));
        NomeObjeto.setForeground(new java.awt.Color(255, 0, 0));
//        NomeObjeto.setText("SAPATO");
        NomeObjeto.setOpaque(true);
        add(NomeObjeto);
        NomeObjeto.setBounds(470, 200, 300, 50);

//        Preto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/preto.jpg")));
//        Preto.setToolTipText("PRETO");
//        Preto.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                PretoMouseClicked(evt);
//            }
//        });
//
//        add(Preto);
//        Preto.setBounds(60, 340, 130, 130);
//
//        Amarelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/amarelo.jpg")));
//        Amarelo.setToolTipText("AMARELO");
//        Amarelo.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                AmareloMouseClicked(evt);
//            }
//        });
//
//        add(Amarelo);
//        Amarelo.setBounds(200, 340, 130, 130);
//
//        Azul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/azul.jpg")));
//        Azul.setToolTipText("AZUL");
//        Azul.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                AzulMouseClicked(evt);
//            }
//        });
//
//        add(Azul);
//        Azul.setBounds(340, 340, 130, 130);
//
//        Vermelho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vermelho.jpg")));
//        Vermelho.setToolTipText("VERMELHO");
//        Vermelho.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                VermelhoMouseClicked(evt);
//            }
//        });
//
//        add(Vermelho);
//        Vermelho.setBounds(480, 340, 130, 130);
//
//        Verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/verde.jpg")));
//        Verde.setToolTipText("VERDE");
//        Verde.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                VerdeMouseClicked(evt);
//            }
//        });
//
//        add(Verde);
//        Verde.setBounds(620, 340, 130, 130);

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
        Ajuda.setBounds(22, 516, 230, 50);

//        Clique.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Clique);
//        Clique.setBounds(90, 350, 15, 15);
//
//        Fase2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/aranha1.jpg")));
//        Fase2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase2);
//        Fase2.setBounds(110, 350, 10, 10);
//
//        Fase3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/carro24.jpg")));
//        Fase3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase3);
//        Fase3.setBounds(120, 350, 10, 10);
//
//        Fase4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/banana.jpg")));
//        Fase4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase4);
//        Fase4.setBounds(130, 350, 10, 10);
//
//        Fase5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/et.jpg")));
//        Fase5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase5);
//        Fase5.setBounds(140, 350, 10, 10);
//
//        Fase6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/tomate1.jpg")));
//        Fase6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase6);
//        Fase6.setBounds(150, 350, 10, 10);
//
//        Fase7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/trevo.gif")));
//        Fase7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase7);
//        Fase7.setBounds(160, 350, 10, 10);
//
//        Fase8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/bolsa4.jpg")));
//        Fase8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase8);
//        Fase8.setBounds(170, 350, 10, 10);
//
//        Fase9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/bule1.jpg")));
//        Fase9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase9);
//        Fase9.setBounds(110, 360, 10, 10);
//
//        Fase10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/cavalomar.jpg")));
//        Fase10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase10);
//        Fase10.setBounds(120, 360, 10, 10);
//
//        Fase11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/golfinho1.jpg")));
//        Fase11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase11);
//        Fase11.setBounds(130, 360, 10, 10);
//
//        Fase12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/copo.gif")));
//        Fase12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase12);
//        Fase12.setBounds(140, 360, 10, 10);
//
//        Fase13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/gravata.jpg")));
//        Fase13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase13);
//        Fase13.setBounds(150, 360, 10, 10);
//
//        Fase14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/telefone5.jpg")));
//        Fase14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase14);
//        Fase14.setBounds(160, 360, 10, 10);
//
//        Fase15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/bomba.jpg")));
//        Fase15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase15);
//        Fase15.setBounds(170, 360, 10, 10);
//
//        Fase16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/maca.jpg")));
//        Fase16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase16);
//        Fase16.setBounds(110, 370, 10, 10);
//
//        Fase17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/peixe.gif")));
//        Fase17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase17);
//        Fase17.setBounds(120, 370, 10, 10);
//
//        Fase18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/regata.jpg")));
//        Fase18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase18);
//        Fase18.setBounds(130, 370, 10, 10);
//
//        Fase19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/mochila1.jpg")));
//        Fase19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase19);
//        Fase19.setBounds(140, 370, 10, 10);
//
//        Fase20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/guitarra.jpg")));
//        Fase20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase20);
//        Fase20.setBounds(150, 370, 10, 10);
//
//        Fase21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/pimenta.jpg")));
//        Fase21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase21);
//        Fase21.setBounds(160, 370, 10, 10);
//
//        Fase22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/telefone6.jpg")));
//        Fase22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase22);
//        Fase22.setBounds(170, 370, 10, 10);
//
//        Fase23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/pato2.jpg")));
//        Fase23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase23);
//        Fase23.setBounds(110, 380, 10, 10);
//
//        Fase24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/limao.jpg")));
//        Fase24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase24);
//        Fase24.setBounds(120, 380, 10, 10);
//
//        Fase25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/mala.jpg")));
//        Fase25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase25);
//        Fase25.setBounds(130, 380, 10, 10);
//
//        Fase26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/lapis.jpg")));
//        Fase26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase26);
//        Fase26.setBounds(140, 380, 10, 10);
//
//        Fase27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/passaro6.jpg")));
//        Fase27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase27);
//        Fase27.setBounds(150, 380, 10, 10);
//
//        Fase28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/panela3.jpg")));
//        Fase28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase28);
//        Fase28.setBounds(160, 380, 10, 10);
//
//        Fase29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/luva1.jpg")));
//        Fase29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase29);
//        Fase29.setBounds(170, 380, 10, 10);
//
//        Fase30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/bolsa.jpg")));
//        Fase30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase30);
//        Fase30.setBounds(110, 390, 10, 10);
//
//        Fase31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/melao.jpg")));
//        Fase31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase31);
//        Fase31.setBounds(120, 390, 10, 10);
//
//        Fase32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/aviao1.jpg")));
//        Fase32.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase32);
//        Fase32.setBounds(130, 390, 10, 10);
//
//        Fase33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/almofada.jpg")));
//        Fase33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase33);
//        Fase33.setBounds(140, 390, 10, 10);
//
//        Fase34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/telefone3.jpg")));
//        Fase34.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase34);
//        Fase34.setBounds(150, 390, 10, 10);
//
//        Fase35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/raio.jpg")));
//        Fase35.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase35);
//        Fase35.setBounds(160, 390, 10, 10);
//
//        Fase36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/saia.jpg")));
//        Fase36.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase36);
//        Fase36.setBounds(170, 390, 10, 10);
//
//        Fase37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/sapato6.jpg")));
//        Fase37.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase37);
//        Fase37.setBounds(110, 400, 10, 10);
//
//        Fase38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/tubarao.gif")));
//        Fase38.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase38);
//        Fase38.setBounds(120, 400, 10, 10);
//
//        Fase39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/planta.jpg")));
//        Fase39.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase39);
//        Fase39.setBounds(130, 400, 10, 10);
//
//        Fase40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/sol.jpg")));
//        Fase40.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase40);
//        Fase40.setBounds(140, 400, 10, 10);
//
//        Fase41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/telefone.jpg")));
//        Fase41.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase41);
//        Fase41.setBounds(150, 400, 10, 10);
//
//        Fase42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/sino.jpg")));
//        Fase42.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase42);
//        Fase42.setBounds(160, 400, 10, 10);
//
//        Fase43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coresobjeto/panela2.jpg")));
//        Fase43.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
//        add(Fase43);
//        Fase43.setBounds(170, 400, 10, 10);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800, 600);
    }//GEN-END:initComponents

    private void AjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjudaMouseClicked
//		Musica.stop();
//		Ajuda a = new Ajuda();
//		texto = "- Em cada fase aparecerá um desenho.\n\n- Observe o tom predominante da cor deste desenho.\n\n- Em seguida clique em cima da cor correta, logo abaixo da figura";
//		a.textoajuda.setText(texto);
//		a.aj = 4;
//		a.setVisible(true);
//		this.setVisible(false);

		AbrirAjuda("- Em cada fase aparecerá um desenho.\n\n- Observe o tom predominante da cor deste desenho.\n\n- Em seguida clique em cima da cor correta, logo abaixo da figura");
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

//    private void PretoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PretoMouseClicked
//		comp = Preto.getIcon();
//		Clique.setIcon(comp);
//		Compara();
//    }//GEN-LAST:event_PretoMouseClicked
//
//    private void AmareloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AmareloMouseClicked
//		comp = Amarelo.getIcon();
//		Clique.setIcon(comp);
//		Compara();
//    }//GEN-LAST:event_AmareloMouseClicked
//
//    private void AzulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AzulMouseClicked
//		comp = Azul.getIcon();
//		Clique.setIcon(comp);
//		Compara();
//    }//GEN-LAST:event_AzulMouseClicked
//
//    private void VermelhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VermelhoMouseClicked
//		comp = Vermelho.getIcon();
//		Clique.setIcon(comp);
//		Compara();
//    }//GEN-LAST:event_VermelhoMouseClicked
//
//    private void VerdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerdeMouseClicked
//		comp = Verde.getIcon();
//		Clique.setIcon(comp);
//		Compara();
//    }//GEN-LAST:event_VerdeMouseClicked
//
//	private void AumentaPontos() {
//		ptos = ptos + 1000;
//		Pontos.setText(String.valueOf(ptos));
//	}
//
	public void SetNomeObjeto(String sName){
		NomeObjeto.setText(sName);
	}
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
//			er.FlagJogo = 4;
////			Musica.stop();
//			er.setVisible(true);
//			this.setVisible(false);
//		}
//	}
//
//	private void Compara() {
//		while (fase <= 43) {
//			a = Clique.getIcon();
//			if (fase == 1) {
//				b = Vermelho.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 2;
//					figfase = Fase2.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("ARANHA");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//			if (fase == 2) {
//				b = Preto.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 3;
//					figfase = Fase3.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("CARRO");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 3) {
//				b = Vermelho.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 4;
//					figfase = Fase4.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("BANANA");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 4) {
//				b = Amarelo.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 5;
//					figfase = Fase5.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText(" ET");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 5) {
//				b = Verde.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 6;
//					figfase = Fase6.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("TOMATE");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 6) {
//				b = Vermelho.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 7;
//					figfase = Fase7.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("TREVO");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 7) {
//				b = Verde.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 8;
//					figfase = Fase8.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("BOLSA");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 8) {
//				b = Azul.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 9;
//					figfase = Fase9.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("BULE");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 9) {
//				b = Amarelo.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 10;
//					figfase = Fase10.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("Cavalo-Marinho");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 10) {
//				b = Verde.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 11;
//					figfase = Fase11.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("GOLFINHO");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 11) {
//				b = Azul.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 12;
//					figfase = Fase12.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("COPO");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 12) {
//				b = Verde.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 13;
//					figfase = Fase13.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("GRAVATA");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 13) {
//				b = Azul.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 14;
//					figfase = Fase14.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("TELEFONE");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 14) {
//				b = Verde.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 15;
//					figfase = Fase15.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("BOMBA");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 15) {
//				b = Preto.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 16;
//					figfase = Fase16.getIcon();
//					Objeto.setIcon(figfase);
//					Objeto.setText("MAÇÃ");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 16) {
//				b = Vermelho.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 17;
//					figfase = Fase17.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("PEIXE");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 17) {
//				b = Amarelo.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 18;
//					figfase = Fase18.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("CAMISETA");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 18) {
//				b = Amarelo.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 19;
//					figfase = Fase19.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("MOCHILA");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 19) {
//				b = Verde.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 20;
//					figfase = Fase20.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("GUITARRA");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 20) {
//				b = Azul.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 21;
//					figfase = Fase21.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("PIMENTA");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 21) {
//				b = Vermelho.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 22;
//					figfase = Fase22.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("TELEFONE");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 22) {
//				b = Amarelo.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 23;
//					figfase = Fase23.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("PATO");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 23) {
//				b = Amarelo.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 24;
//					figfase = Fase24.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("LIMÃO");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 24) {
//				b = Verde.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 25;
//					figfase = Fase25.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("MALA");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 25) {
//				b = Azul.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 26;
//					figfase = Fase26.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("LÁPIS");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 26) {
//				b = Azul.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 27;
//					figfase = Fase27.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("PÁSSARO");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 27) {
//				b = Verde.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 28;
//					figfase = Fase28.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("PANELA");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 28) {
//				b = Amarelo.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 29;
//					figfase = Fase29.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("LUVAS");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 29) {
//				b = Vermelho.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 30;
//					figfase = Fase30.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("BOLSA");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 30) {
//				b = Preto.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 31;
//					figfase = Fase31.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("MELÃO");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 31) {
//				b = Amarelo.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 32;
//					figfase = Fase32.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("AVIÃO");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 32) {
//				b = Amarelo.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 33;
//					figfase = Fase33.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("ALMOFADA");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 33) {
//				b = Vermelho.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 34;
//					figfase = Fase34.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("TELEFONE");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 34) {
//				b = Preto.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 35;
//					figfase = Fase35.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("RAIO");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 35) {
//				b = Amarelo.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 36;
//					figfase = Fase36.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("SAIA");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 36) {
//				b = Vermelho.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 37;
//					figfase = Fase37.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("SAPATO");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 37) {
//				b = Preto.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 38;
//					figfase = Fase38.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("TUBARÃO");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 38) {
//				b = Azul.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 39;
//					figfase = Fase39.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("PLANTA");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 39) {
//				b = Verde.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 40;
//					figfase = Fase40.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("SOL");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 40) {
//				b = Amarelo.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 41;
//					figfase = Fase41.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("TELEFONE");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 41) {
//				b = Azul.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 42;
//					figfase = Fase42.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("SINO");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 42) {
//				b = Amarelo.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 43;
//					figfase = Fase43.getIcon();
//					Objeto.setIcon(figfase);
//					NomeObjeto.setText("PANELA");
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//			if (fase == 43) {
//				b = Vermelho.getIcon();
//				if (a == b) {
//					AumentaPontos();
//					fase = 1;
//					Acerto ac = new Acerto();
//					ac.Pontuacao.setText(String.valueOf(ptos));
//					ac.FlagJogo = 4;
////					Musica.stop();
//					ac.setVisible(true);
//					this.setVisible(false);
//					break;
//				} else {
//					ChamaErro();
//					break;
//				}
//			}
//
//		}
//
//	}
//
//	public static void main(String args[]) {
//		new CorObjeto().show();
//	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ajuda;
//    private javax.swing.JLabel Amarelo;
//    private javax.swing.JLabel Azul;
//    private javax.swing.JLabel Clique;
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
//    private javax.swing.JLabel Fase24;
//    private javax.swing.JLabel Fase25;
//    private javax.swing.JLabel Fase26;
//    private javax.swing.JLabel Fase27;
//    private javax.swing.JLabel Fase28;
//    private javax.swing.JLabel Fase29;
//    private javax.swing.JLabel Fase3;
//    private javax.swing.JLabel Fase30;
//    private javax.swing.JLabel Fase31;
//    private javax.swing.JLabel Fase32;
//    private javax.swing.JLabel Fase33;
//    private javax.swing.JLabel Fase34;
//    private javax.swing.JLabel Fase35;
//    private javax.swing.JLabel Fase36;
//    private javax.swing.JLabel Fase37;
//    private javax.swing.JLabel Fase38;
//    private javax.swing.JLabel Fase39;
//    private javax.swing.JLabel Fase4;
//    private javax.swing.JLabel Fase40;
//    private javax.swing.JLabel Fase41;
//    private javax.swing.JLabel Fase42;
//    private javax.swing.JLabel Fase43;
//    private javax.swing.JLabel Fase5;
//    private javax.swing.JLabel Fase6;
//    private javax.swing.JLabel Fase7;
//    private javax.swing.JLabel Fase8;
//    private javax.swing.JLabel Fase9;
    private javax.swing.JLabel NomeObjeto;
//    private javax.swing.JLabel Objeto;
//    private javax.swing.JLabel Preto;
//    private javax.swing.JLabel Verde;
//    private javax.swing.JLabel Vermelho;
    // End of variables declaration//GEN-END:variables

	@Override
	protected FaseControladorBase GetControladorFase() {
		return controlaFase;
	}
}
