/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ConfigFases;

import Analise.GameData;
import Analise.PlayerManager;
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

	// game data, for player. serialized
	protected GameData gameData;
	protected boolean bAddedData; // starts as false. this prevents adding EMPTY datas to save.

	public FaseControladorBase() {
	}


	public void Init(){
		iFaseAtual = 0;
		gameData = new GameData(getClass());
		bAddedData = false;

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
		SetPontos(iPontos + GetRightScore());
		gameData.SetScore(iPontos);
		gameData.IncreaseRightCount();
		
		if (iFaseAtual+1 < GetMaxLevel()) {
			iFaseAtual++;
			SetCenario(GetCurrentScene());

		}
		else {
			OnGameComplete();
		}

		SavePoint();
		
	}

	public void OnPlayerMistake(){
		SetPontos(iPontos - GetMistakeScore());
		//gameData.AddScore(-250);
		gameData.SetScore(iPontos);
		gameData.IncreaseMistakeCount();
		
		if (iVidas -1 <= 0) {
			OnGameOver();
		}
		else {
			SetVidas(iVidas-1);
		}
		SavePoint();
	}
	

	/**
	 * calculates the right score for player.
	 * Called at OnPlayerRight().
	 * @return an integer higher than 0
	 */
	protected int GetRightScore(){
		return 500;
	}

	/**
	 * calculates the amount of score to DECREASE from player.
	 * Note: should always return <b>positive</b> values
	 * @return an integer higher than 0
	 */
	protected int GetMistakeScore(){
		return 250;
	}

	/**
	 * chamado quando termina o jogo
	 */
	protected void OnGameComplete(){
		gameData.SetGameState(GameData.GAME_STATE.Completed);
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
		gameData.SetGameState(GameData.GAME_STATE.GameOver);
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

	/**
	 * Call this method to save current game.
	 */
	protected void SavePoint() {

		if (!bAddedData) {
			PlayerManager.GetInstance().GetCurrentPlayerData().lGameDatas.add(gameData);
			bAddedData = true;
		}
		
		PlayerManager.Save();
	}
}
