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
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

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

	private static final boolean BOGUS = true; // ver depois

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
		String sName = "Jogador"; // thistextlokaki

        
		SelectName popupInputName = new SelectName(null, true);
		popupInputName.SetDefaultName(sName);
		popupInputName.setLocationRelativeTo(null);
		popupInputName.setTitle("Novo Jogador"); // thistextlokaki
        while (true) {

            // open popup
            popupInputName.setVisible(true);

            if (popupInputName.getReturnStatus() == SelectName.RET_OK) {
                sName = popupInputName.GetSelectedName();

                sName = sName.replaceAll(PlayerManager.INVALID_CHARS, "");

                // added the name?
				if (PlayerManager.GetInstance().AddPlayerName(sName)){
					// yes, then show sucess
					if (BOGUS) {
						JOptionPane.showMessageDialog(GetInsance(),
								"Jogador \"" + sName + "\" registrado com sucesso!",
								"Sucesso", JOptionPane.INFORMATION_MESSAGE
								); // thistextlokaki
					}
					return true;
				}
				else {
					// no, then show error.
					if (BOGUS) {
						JOptionPane.showMessageDialog(GetInsance(),
								"Jogador com o nome \"" + sName + "\" já existe!\nFavor, escolha um nome diferente.",
								"Erro", JOptionPane.ERROR_MESSAGE
								); // thistextlokaki
					}
				}
            } else {
                return false;
            }
        }
    }


//		while (true) {
//			sName = JOptionPane.showInputDialog(GetInsance(), "Registrar jogador com nome:", sName); // thistextlokaki
//
//			if (sName == null){
//				break;
//			}
//			else {
//				sName = sName.replaceAll(PlayerManager.INVALID_CHARS, "");
//				// added the name?
//				if (PlayerManager.GetInstance().AddPlayerName(sName)){
//					// yes, then show sucess
//					JOptionPane.showMessageDialog(GetInsance(),
//							"Jogador \"" + sName + "\" registrado com sucesso!",
//							"Sucesso", JOptionPane.INFORMATION_MESSAGE
//							); // thistextlokaki
//					return true;
//				}
//				else {
//					// no, then show error.
//					JOptionPane.showMessageDialog(GetInsance(),
//							"Jogador com o nome \"" + sName + "\" já existe!\nFavor, escolha um nome diferente.",
//							"Erro", JOptionPane.ERROR_MESSAGE
//							); // thistextlokaki
//				}
//			}
//		}
//		return false;
//	}

	public void OpenStatisticsMenu(){
		PlayerStatisticsMenu.GetInsance().setVisible(true);
		PlayerStatisticsMenu.GetInsance().setLocationRelativeTo(this);
		PlayerStatisticsMenu.GetInsance().previousMenu = this;
	}

	public void CloseUI(){
		TelaPadrao currentScreen = TelaPadrao.GetCurrentScreen();
		
		currentScreen.setVisible(true);
		this.setVisible(false);
	}


}