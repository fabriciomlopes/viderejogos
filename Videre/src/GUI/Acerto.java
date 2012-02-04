package GUI;

import java.net.*;

public class Acerto extends TelaFim {


	// <editor-fold defaultstate="collapsed" desc="Singleton">
	private static Acerto instance;

	public static Acerto GetInsance() {
		InicializarSingleton();
		return instance;
	}

	public static void InicializarSingleton(){
		if (instance == null) {
			instance = new Acerto();
		}
	}
	// </editor-fold>


	public Acerto() {
		initComponents();

		try {
			URL som = new URL((getClass().getResource("/sons/looneytuney.mid")).toString());
			Musica = java.applet.Applet.newAudioClip(som);
			Musica.loop();
		} catch (MalformedURLException erro) {
			System.out.println("Caminho do áudio não especificado! " + erro);
		}
	}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FiguraZoio = new javax.swing.JLabel();
        FiguraAcerto = new javax.swing.JLabel();

        setTitle("Parabéns! Você passou todas as fases!");
        setLayout(null);

        FiguraZoio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoioalegre.gif"))); // NOI18N
        add(FiguraZoio);
        FiguraZoio.setBounds(130, 60, 300, 440);

        FiguraAcerto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/confete.gif"))); // NOI18N
        add(FiguraAcerto);
        FiguraAcerto.setBounds(30, 40, 730, 470);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800, 600);
    }// </editor-fold>//GEN-END:initComponents

	public static void main(String args[]) {
//        new Acerto().show();
		
		//new Acerto().initComponents();
		Acerto.GetInsance().initComponents();
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FiguraAcerto;
    private javax.swing.JLabel FiguraZoio;
    // End of variables declaration//GEN-END:variables

	public void a(){
		Pontuacao.setText("");
	}
}
