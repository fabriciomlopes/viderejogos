/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

import GUI.Acerto;
import GUI.Erro;
import GUI.TelaFim;
import GUI.TelaJogo;
import classes.UtilidadesVidere;

/**
 * Created on : Feb 1, 2012, 11:16:32 PM
 * @author diogo
 */
public abstract class FaseControladorBase {

	
	// comeca do 0 e incrementa de 1 em 1
	private int iFaseAtual;
	
	// cenario eh a possibilidade de 1 fase;
	protected int iCenarioAtual;
	protected int[] vOrdemCenarios;
	
	// dados sobre o jogador
	protected int iVidas; // quantidade de vidas restantes
	protected int iPontos; // quantidade de pontos feitos
	

	public FaseControladorBase() {
		
	}


	public void Init(){
		iFaseAtual = 0;

		SetPontos(0);
		SetVidas(4);

		// embaralha e seta na primeira fase
		EmbaralhaFases();
		SetCenario(GetCurrentScene());
	}


	/**
	 * retorna a fase atual. comeca com 0.
	 * @return
	 */
	public int GetFaseAtual(){
		return iFaseAtual;
	}

	public void EmbaralhaFases(){
		vOrdemCenarios = UtilidadesVidere.getShuffleIntegers(GetMaxLevel());
	}

	/**
	 * retorna quantidade maxima de levels
	 * @return
	 */
	public abstract int GetMaxLevel();
	public void SetCenario(int iCenario){
		System.out.println(String.format("Fase: %2d, Cena: %2d, Maximo: %2d", iFaseAtual, GetCurrentScene(), GetMaxLevel()));
		iCenarioAtual = iCenario;
	}

	/**
	 * retorna o ID da fase, e nao qual level.
	 * esse ID pode ser aleatorio e nao eh incremental
	 * @return
	 */
	public int GetCurrentScene(){
		return vOrdemCenarios[iFaseAtual];
	}

	public void OnPlayerRight(){
		// System.out.println("Acertou: " + iCenarioAtual + ", vai ate "+ GetMaxLevel());
		SetPontos(iPontos + 500);

		if (iFaseAtual+1 < GetMaxLevel()) {
			iFaseAtual++;
			SetCenario(GetCurrentScene());

		}
		else {
			OnGameComplete();
		}
	}

	public void OnPlayerMistake(){
		SetPontos(iPontos - 250);
		
		if (iVidas -1 <= 0) {
			OnGameOver();
		}
		else {
			SetVidas(iVidas-1);
		}
	}
	

	/**
	 * chamado quando termina o jogo
	 */
	protected void OnGameComplete(){
		TelaFim telaFim = Acerto.GetInsance();

		if (telaFim != null) {
			GetTela().AbrirMenu(telaFim);

			telaFim.SetPontos(iPontos);
		}
	}

	/**
	 * chamado quando acaba todas vidas
	 */
	protected void OnGameOver(){

		TelaFim telaFim = Erro.GetInsance();

		if (telaFim != null) {
			GetTela().AbrirMenu(telaFim);

			telaFim.SetPontos(iPontos);
		}
	}

	/**
	 * Pega a tela de jogo
	 * @return
	 */
	public abstract TelaJogo GetTela();

	
	/**
	 * 
	 * @param iVidas
	 */
	public void SetVidas(int iVidas) {
		this.iVidas = iVidas;

		GetTela().SetVidas(Math.max(0, iVidas));
	}


	/**
	 * 
	 * @param iPontos
	 */
	public void SetPontos(int iPontos) {
		this.iPontos = Math.max(0, iPontos);

		GetTela().SetPontos(this.iPontos);
	}
}
