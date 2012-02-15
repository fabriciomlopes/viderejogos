/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

import GUI.Sombras;
import GUI.TelaJogo;
import javax.swing.JLabel;

/**
 * Created on : Feb 1, 2012, 8:03:26 PM
 * @author diogo
 * contem fases
 */
public class FaseSombraControlador extends FaseControladorBase {

	protected FaseSombra[] fases;
	protected Sombras telaSombra;
	
	public FaseSombraControlador(Sombras tela, FaseSombra ... fases) {
		this.fases = fases;
		this.telaSombra = tela;
		
		for (int indice = 0; indice < fases.length; indice++) {
			FaseSombra faseSombra = fases[indice];

			
			//System.out.println("setando indice fase : " + indice + " para " + faseSombra.imagem);
			
			faseSombra.InitComponents(
					tela,
					new java.awt.event.MouseAdapter() {

						@Override
						public void mouseClicked(java.awt.event.MouseEvent evt) {
							onClickIcone(evt);
						}
					});
					
			
		}

	}


	
	
	public void onClickIcone(java.awt.event.MouseEvent evt) {
		Object obj = evt.getSource();

		if (obj instanceof JLabel) {
			JLabel icone = (JLabel) obj;
			Comparar(icone.getName());
			//System.out.println("Deu certo." + icone.getName());
		}
		else {
			System.out.println("Nao deu certo.");
		}
	}

	

	public void Comparar(String imagemClicada) {
		
		if (ClicouCerto(imagemClicada)) {
			OnPlayerRight();
		}
		else {
			OnPlayerMistake();
		}

	}

	public boolean ClicouCerto(String imagemClicada){
		//System.out.println("imagem clicada: " + imagemClicada + ", comparando: " + fases[GetCurrentScene()].GetName());
		return imagemClicada.equals(fases[GetCurrentScene()].GetName());
		
		//return true; // testes
	}
	
	/**
	 * Seta o cenario com a nova fase.
	 *
	 * @param iCenario comeca por 0
	 */
	@Override
	public void SetCenario(int iCenario){

		if (iCenario < 0 || iCenario >= fases.length) {
			System.err.println("fase " + iCenario + " indisponivel");
			return ;
		}

		telaSombra.SetSombraAtual(fases[iCenario].getIconSombra());

		super.SetCenario(iCenario);
	}


//	@Override
//	public void OnPlayerRight() {
//		throw new UnsupportedOperationException("Not supported yet.");
//	}

	@Override
	public int GetMaxLevel() {
		return fases.length;
	}

	@Override
	public TelaJogo GetTela() {
		return telaSombra;
	}

	

	
}
