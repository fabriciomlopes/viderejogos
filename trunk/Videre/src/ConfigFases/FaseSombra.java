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
public class FaseSombra extends Fase {

	public static final String caminhoImg = "sombras/";
	
	protected Rectangle boundsImagem;
	

	public FaseSombra(String nome, Rectangle boundsImagem) {
		super(nome);
		this.boundsImagem = boundsImagem;		
	}

	public Icon getIconSombra(){
		// cria um icone da Sombra da imagem

		return Recursos.GetInsance().getImagem(caminhoImg + "s" + GetName() + ".gif");
	}

	public void InitComponents(FaseControladorBase controller, java.awt.event.MouseAdapter listener){
		// cria um botao clicavel
		javax.swing.JLabel botao = new javax.swing.JLabel();
		
		botao.setIcon(Recursos.GetInsance().getImagem(caminhoImg + GetName() + ".jpg"));

		botao.addMouseListener(listener);
		
		controller.GetTela().add(botao);
		
		botao.setName(GetName());
		botao.setBounds(boundsImagem);

	}
}
