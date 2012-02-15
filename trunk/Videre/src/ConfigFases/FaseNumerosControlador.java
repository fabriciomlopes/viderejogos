/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ConfigFases;

import GUI.Numeros;
import GUI.TelaJogo;
import java.awt.Point;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.swing.JLabel;

/**
 * Created on : Feb 9, 2012, 8:21:16 PM
 * @author diogo
 */
public class FaseNumerosControlador extends FaseControladorBase {

	protected FaseNumeros[] fases;
	protected Numeros telaNumeros;

	// estagio atual. se estiver no 0, a imagem clicada vai no FiguraBasica.
	private int iEstagio = 0;

	/// game logic data.
	private String[] vClickedImages; // the name of clicked objects.

	/// game config data.
	// makes the game a little more dinamic by changing the position of containers
	private static final Point[][] vViewsPosition = new Point[][]{
		// sequence: Number, Figure, Object
		new Point[]{new Point(190, 300), new Point(340, 300), new Point(490, 300)}, //  1
		new Point[]{new Point(490, 300), new Point(340, 300), new Point(190, 300)}, //  2
		new Point[]{new Point(490, 270), new Point(340, 350), new Point(190, 270)}, //  3
		new Point[]{new Point(190, 270), new Point(340, 350), new Point(490, 270)}, //  4
		new Point[]{new Point(190, 330), new Point(340, 250), new Point(490, 330)}, //  5
		new Point[]{new Point(490, 330), new Point(340, 250), new Point(190, 330)}, //  6
		new Point[]{new Point(190, 260), new Point(340, 350), new Point(490, 350)}, //  7
		new Point[]{new Point(190, 350), new Point(340, 350), new Point(490, 260)}, //  8
		new Point[]{new Point(290, 230), new Point(440, 230), new Point(440, 380)}, //  9
		new Point[]{new Point(440, 230), new Point(290, 230), new Point(290, 380)}, // 10
	};

	public FaseNumerosControlador(Numeros tela, int iQuantidadeFases) {

		this.telaNumeros = tela;
		fases = new FaseNumeros[iQuantidadeFases];

		vClickedImages = new String[2]; // currently only have 2: figures and objects

		for (int indice = 0; indice < iQuantidadeFases; indice++) {
			FaseNumeros faseNumero = new FaseNumeros(String.valueOf(indice + 1));
			fases[indice] = faseNumero;

			faseNumero.InitComponents(tela, new java.awt.event.MouseAdapter() {

				@Override
				public void mouseClicked(java.awt.event.MouseEvent evt) {
					onClickIcone(evt);
				}
			});
		}
		
			
	}

	/**
	 * called when clicked any of 10 option
	 * @param evt
	 */
	public void onClickIcone(java.awt.event.MouseEvent evt) {
		Object obj = evt.getSource();

		if (obj instanceof JLabel) {
			JLabel icone = (JLabel) obj;
//			Comparar(icone.getName());

			if (iEstagio == 0) {
				iEstagio++;
				vClickedImages[0] = icone.getName();
				telaNumeros.SetFigureIcon(FaseNumeros.getImage(icone.getName() + FaseNumeros.BIG_IMAGE_SUFIX));
			} else if (iEstagio == 1) {
				iEstagio++;
				vClickedImages[1] = icone.getName();
				telaNumeros.SetObjectIcon(FaseNumeros.getImage(icone.getName() + FaseNumeros.BIG_IMAGE_SUFIX));
				Comparar();
			}

			//System.out.println("Deu certo." + icone.getName());
		} else {
			//System.out.println("Nao deu certo.");
		}
	}

	/**
	 * Cancels the current selection.
	 */
	public void onClickFigura(java.awt.event.MouseEvent evt){
		iEstagio = 0;
		telaNumeros.SetFigureIcon(null);
	}

	@Override
	public void Init() {
		super.Init();

		// seta o botao pra cancelar o atual caso o jogador erre
		telaNumeros.SetFigureListener(new java.awt.event.MouseAdapter() {

				@Override
				public void mouseClicked(java.awt.event.MouseEvent evt) {
					onClickFigura(evt);
				}
			}
		);
	}



	@Override
	public void EmbaralhaFases() {
		super.EmbaralhaFases();

		// seta posicao dos figura basica primeiro
		for (int iCenario = 0; iCenario < vOrdemCenarios.length; iCenario++) {
			fases[iCenario].setFigurePosition(vOrdemCenarios[iCenario]);
		}

		// embaralha denovo
		super.EmbaralhaFases();

		// seta posicao dos objetos
		for (int iCenario = 0; iCenario < vOrdemCenarios.length; iCenario++) {
			fases[iCenario].setObjectPosition(vOrdemCenarios[iCenario]);
		}

	}

	@Override
	public void SetCenario(int iCenario) {
		super.SetCenario(iCenario);

		telaNumeros.SetNumberIcon(FaseNumeros.getImage(String.valueOf(GetFaseAtual() + 1) + FaseNumeros.NUMBER_NAME));

		telaNumeros.ClearViews();

		Point[] viewPositions = vViewsPosition[GetCurrentScene()];
		telaNumeros.SetViewsPositions(viewPositions[0], viewPositions[1], viewPositions[2]);
		
		iEstagio = 0;
	}

	@Override
	public int GetMaxLevel() {
		return fases.length;
	}

	@Override
	public TelaJogo GetTela() {
		return telaNumeros;
	}

	private void Comparar() {

		if (IsRightSequence()) {
			OnPlayerRight();
		} else {
			OnPlayerMistake();
		}

		iEstagio = 0;
		telaNumeros.ClearViews();

	}

	/**
	 * return true when the set Figure icon is a Figure and the Object icon is a Object
	 *
	 * @return true if player clicked the right sequence of images
	 */
	protected boolean IsRightSequence() {

		AtomicInteger iNumber = new AtomicInteger(0);
		AtomicReference<String> sType = new AtomicReference<String>("");

		SetIdAndType(vClickedImages[0], iNumber, sType);

		int iLevel = (GetFaseAtual() + 1);

		//System.out.println("Compare: " + iNumber.get() + " == " + iLevel + " and '" + sType.get() + "' contains '" + FaseNumeros.FIGURE_NAME + "'? ");
		// is the first click fine?
		if (iNumber.get() == iLevel && sType.get().contains(FaseNumeros.FIGURE_NAME)) {

			// yes, then check second
			SetIdAndType(vClickedImages[1], iNumber, sType);

			return iNumber.get() == iLevel && sType.get().contains(FaseNumeros.OBJECT_NAME);
		}

		return false;
	}

	/**
	 * the expected name is something like: "10_type".
	 * so i split using underline, this way i can get the clicked icon number and type.
	 * in the example above, number = "10", type = "_type";
	 * @param sName preferably something that comes from vClickedImages
	 * @param iNumber
	 * @param sType
	 */
	private void SetIdAndType(String sName, AtomicInteger iNumber, AtomicReference<String> sType) {

		String[] vSplit = sName.split("_");

		int iParsed = 0;
		String sValue = "";
		
		try {
			iParsed = Integer.parseInt(vSplit[0]);
			sValue = vSplit[1];
		} catch (Exception e) {
		} finally {
			iNumber.set(iParsed);
			sType.set("_" + sValue);
		}

	}
}
