package GUI;

import java.net.*;

public class Erro extends TelaFim {

	// <editor-fold defaultstate="collapsed" desc="Singleton">
	private static Erro instance;

	public static Erro GetInsance() {
		InicializarSingleton();
		return instance;
	}

	public static void InicializarSingleton(){
		if (instance == null) {
			instance = new Erro();
		}
	}
	// </editor-fold>

	public Erro() {
		initComponents();

		//inicia a musica da tela erro
		try {
			URL som = new URL((getClass().getResource("/sons/passoelefantinho.mid")).toString());
			Musica = java.applet.Applet.newAudioClip(som);
			Musica.loop();
		} catch (MalformedURLException erro) {
			System.out.println("Caminho do áudio não especificado! " + erro);
		}
	}

    private void initComponents() {//GEN-BEGIN:initComponents
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Fim do jogo. Tente outra vez!");
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoiotriste.gif")));
        add(jLabel1);
        jLabel1.setBounds(110, 60, 330, 440);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/confetet.gif")));
        add(jLabel2);
        jLabel2.setBounds(30, 50, 740, 490);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800, 600);
    }//GEN-END:initComponents

	public static void main(String args[]) {
		new Erro().show();
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
