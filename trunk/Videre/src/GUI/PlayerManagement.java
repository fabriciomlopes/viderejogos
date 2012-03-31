/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PlayerManagement.java
 *
 * Created on Mar 26, 2012, 9:36:36 PM
 */

package GUI;

import Analise.PlayerManager;
import charts.Chart;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author diogo
 */
public class PlayerManagement extends javax.swing.JFrame {

	// <editor-fold defaultstate="collapsed" desc="Singleton">
	private static PlayerManagement instance;

	public static PlayerManagement GetInsance() {
		if (instance == null) {
			instance = new PlayerManagement();
		}
		return instance;
	}
	// </editor-fold>


    /** Creates new form PlayerManagement */
    public PlayerManagement() {
        initComponents();
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreatePlayer = new javax.swing.JButton();
        btnSwitchPlayer = new javax.swing.JButton();
        btnStatistics = new javax.swing.JButton();
        btnStatistics1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        btnCreatePlayer.setFont(new java.awt.Font("Comic Sans MS", 0, 24));
        btnCreatePlayer.setText("Criar Jogador");
        btnCreatePlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePlayerActionPerformed(evt);
            }
        });

        btnSwitchPlayer.setFont(new java.awt.Font("Comic Sans MS", 0, 24));
        btnSwitchPlayer.setText("Trocar Jogador");
        btnSwitchPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSwitchPlayerActionPerformed(evt);
            }
        });

        btnStatistics.setFont(new java.awt.Font("Comic Sans MS", 0, 24));
        btnStatistics.setText("Estatísticas");
        btnStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatisticsActionPerformed(evt);
            }
        });

        btnStatistics1.setFont(new java.awt.Font("Comic Sans MS", 0, 24));
        btnStatistics1.setText("Voltar");
        btnStatistics1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatistics1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSwitchPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreatePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnStatistics1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnSwitchPlayer)
                .addGap(18, 18, 18)
                .addComponent(btnCreatePlayer)
                .addGap(18, 18, 18)
                .addComponent(btnStatistics)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnStatistics1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void btnSwitchPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSwitchPlayerActionPerformed
		// TODO add your handling code here:
		SwitchPlayer();
	}//GEN-LAST:event_btnSwitchPlayerActionPerformed

	private void btnStatistics1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatistics1ActionPerformed
		// TODO add your handling code here:
		CloseUI();
	}//GEN-LAST:event_btnStatistics1ActionPerformed

	private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
		// TODO add your handling code here:
		CloseUI();
	}//GEN-LAST:event_formWindowClosed

	private void btnCreatePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePlayerActionPerformed
		// TODO add your handling code here:
		CreatePlayer();
	}//GEN-LAST:event_btnCreatePlayerActionPerformed

	private void btnStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatisticsActionPerformed
		// TODO add your handling code here:
		OpenStatisticsMenu();
	}//GEN-LAST:event_btnStatisticsActionPerformed

    /**
    * @param args the command line arguments
    */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PlayerManagement().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreatePlayer;
    private javax.swing.JButton btnStatistics;
    private javax.swing.JButton btnStatistics1;
    private javax.swing.JButton btnSwitchPlayer;
    // End of variables declaration//GEN-END:variables


	public void OpenMenu(){
		TelaPadrao currentScreen = TelaPadrao.GetCurrentScreen();
		setLocationRelativeTo(currentScreen);
		currentScreen.setVisible(false);
		this.setVisible(true);
	}

	public void SwitchPlayer(){
		PlayerChange.GetInsance().OpenMenu(this);
	}
	
	public static boolean CreatePlayer(){
		String sName = "Jogador";
		
		while (true) {
			sName = JOptionPane.showInputDialog(GetInsance(), "Registrar jogador com nome:", sName);

			if (sName == null){
				break;
			}
			else {
				sName = sName.replaceAll(PlayerManager.INVALID_CHARS, "");
				// added the name?
				if (PlayerManager.GetInstance().AddPlayerName(sName)){
					// yes, then show sucess
					JOptionPane.showMessageDialog(GetInsance(),
							"Jogador \"" + sName + "\" registrado com sucesso!",
							"Sucesso", JOptionPane.INFORMATION_MESSAGE
							);
					return true;
				}
				else {
					// no, then show error.
					JOptionPane.showMessageDialog(GetInsance(),
							"Jogador com o nome \"" + sName + "\" já existe!\nFavor, escolha um nome diferente.",
							"Erro", JOptionPane.ERROR_MESSAGE
							);
				}
			}
		}
		return false;
	}

	public void OpenStatisticsMenu(){
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		dataset.addValue(5000, "Jogo1", "293-09-99");
		dataset.addValue(2000, "Jogo1", "294-09-99");
		dataset.addValue(1000, "Jogo1", "295-09-99");
		dataset.addValue(2000, "Jogo1", "296-09-99");

		dataset.addValue(2000, "Jogo2", "293-09-99");
		dataset.addValue(2500, "Jogo2", "294-09-99");
		dataset.addValue(3000, "Jogo2", "295-09-99");
		dataset.addValue(4000, "Jogo2", "296-09-99");


		Chart.LineChart(dataset, "Resultados", "X", "Y", true, 0, 0);
	}

	public void CloseUI(){
		TelaPadrao currentScreen = TelaPadrao.GetCurrentScreen();
		
		currentScreen.setVisible(true);
		this.setVisible(false);
	}


//	public static void main(String[] args) {
//		// test regex
//
//		//String regex = "[\\]\\[!\"#$%&'()*+,./:;<=>?@\\^_`{|}~-]";
//		String regex = ".*[\\/\\\\\\]\\[0-9!\"#$%&'()*+,./:;<=>?@\\^_`{|}~-].*";
//
//
//		System.out.println("Diogo Mats2umoto".matches(regex));
//		System.out.println("Matsumoto".matches(regex));
//		System.out.println("Diogo\\Matsumoto".matches(regex));
//		System.out.println("松本秀樹".matches(regex));
//		System.out.println("98/*D1i\\4o;/;g^o Ma)(&-ts+um!@#o'~to'''".replaceAll(PlayerManager.INVALID_CHARS, ""));
//		System.out.println("98/*D1i\\4o;/;g^o Ma)(&-ts+um!@#o'~to''ção é'".replaceAll(PlayerManager.INVALID_CHARS, ""));
//
//	}

}
