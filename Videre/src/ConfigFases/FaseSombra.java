/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

import GUI.TelaJogo;
import classes.Recursos;
import java.awt.Rectangle;
import javax.swing.Icon;

/**
 * Created on : Feb 1, 2012, 7:21:31 PM
 * @author diogo
 */
public class FaseSombra {

	public static final String caminhoImg = "sombras/";
	
	protected String imagem;
	protected Rectangle boundsImagem;

	// o numero da fase q pertence. 
	public int indiceFase;
	

	public FaseSombra(String imagem, Rectangle boundsImagem) {
		this.imagem = imagem;
		this.boundsImagem = boundsImagem;
		
	}

	
	public Icon getIconSombra(){
		// cria um icone da Sombra da imagem

		//return new javax.swing.ImageIcon(getClass().getResource(caminhoImg + "s" + imagem + ".gif"));
		return Recursos.GetInsance().getImagem(caminhoImg + "s" + imagem + ".gif");
	}

	public javax.swing.JLabel criarBotao(TelaJogo tela, java.awt.event.MouseAdapter listener){
		// cria um botao clicavel
		javax.swing.JLabel botao = new javax.swing.JLabel();
		
		botao.setIcon(Recursos.GetInsance().getImagem(caminhoImg + imagem + ".jpg"));

		//System.out.println("icon nulo?" + (botao.getIcon() == null));
		botao.addMouseListener(listener);
		//botao.setIcon(new javax.swing.ImageIcon(getClass().getResource(caminhoImg + imagem + ".jpg")));
		
		tela.add(botao);
		
		botao.setBounds(boundsImagem);

		
		return botao;
//		botao.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//
//            }
//        });
	}
/*
	public  static FaseSombra[] fases = new FaseSombra[]{
		new FaseSombra("rinoceronte"	, new Rectangle( 30, 110, 50, 50)),
		new FaseSombra("hipopotamo"		, new Rectangle(110, 140, 50, 50)),
		new FaseSombra("carneiro"		, new Rectangle(180, 100, 50, 50)),
		new FaseSombra("pinguim"		, new Rectangle( 30, 210, 50, 50)),
		new FaseSombra("bebe"			, new Rectangle(150, 220, 50, 50)),
		new FaseSombra("cebola"			, new Rectangle(230, 190, 50, 50)),
		new FaseSombra("fantasma"		, new Rectangle(100, 290, 50, 50)),
		new FaseSombra("cavalo"			, new Rectangle(580, 100, 50, 50)),
		new FaseSombra("burro"			, new Rectangle(640, 250, 50, 50)),
		new FaseSombra("galo"			, new Rectangle(160, 430, 50, 50)),
		new FaseSombra("bode"			, new Rectangle(180, 340, 50, 50)),
		new FaseSombra("pincel"			, new Rectangle(260, 300, 50, 50)),
		new FaseSombra("arvore"			, new Rectangle( 40, 350, 50, 50)),
		new FaseSombra("sacarolhas"		, new Rectangle( 50, 440, 50, 50)),
		new FaseSombra("golfinho"		, new Rectangle(260, 440, 50, 50)),
		new FaseSombra("caracol"		, new Rectangle(390, 440, 50, 50)),
		new FaseSombra("carangueijo"	, new Rectangle(320, 380, 50, 50)),
		new FaseSombra("barata"			, new Rectangle(460, 370, 50, 50)),
		new FaseSombra("tubarao"		, new Rectangle(570, 370, 50, 50)),
		new FaseSombra("abacaxi"		, new Rectangle(650, 450, 50, 50)),
		new FaseSombra("xicara"			, new Rectangle(660, 150, 50, 50)),
		new FaseSombra("camiseta"		, new Rectangle(540, 180, 50, 50)),
		new FaseSombra("macaco"			, new Rectangle(640, 330, 50, 50)),
		new FaseSombra("robo"			, new Rectangle(730,  90, 50, 50)),
		new FaseSombra("passaro"		, new Rectangle(530, 270, 50, 50)),
		new FaseSombra("astronauta"		, new Rectangle(730, 220, 50, 50)),
		new FaseSombra("radio"			, new Rectangle(390, 300, 50, 50)),
		new FaseSombra("bone"			, new Rectangle(730, 350, 50, 50)),
		new FaseSombra("bule"			, new Rectangle(520, 440, 50, 50))
	};
 * 
 */
}
