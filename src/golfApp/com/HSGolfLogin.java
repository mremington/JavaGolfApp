/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golfApp.com;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author michael.remington
 */
public class HSGolfLogin extends javax.swing.JFrame {

    private UserList users;
    private ArrayList<User> userList;

    /**
     * Creates new form HSGolfMain
     */
    public HSGolfLogin() throws FileNotFoundException {
        initComponents();
        users = new UserList();
        userList = users.getUsers();
        loginMessageLbl.setVisible(false);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        mainTitleLbl = new javax.swing.JLabel();
        userNameLbl = new javax.swing.JLabel();
        userNameTxtFld = new javax.swing.JTextField();
        passwordLbl = new javax.swing.JLabel();
        passwordTxtFld = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        loginMessageLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginPanel.setBackground(new java.awt.Color(204, 255, 204));

        mainTitleLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mainTitleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainTitleLbl.setText("High School Golf Scoring System");
        mainTitleLbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        userNameLbl.setBackground(new java.awt.Color(204, 255, 204));
        userNameLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userNameLbl.setText("UserName");

        userNameTxtFld.setBackground(new java.awt.Color(204, 255, 204));

        passwordLbl.setBackground(new java.awt.Color(204, 255, 204));
        passwordLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordLbl.setText("Password");

        passwordTxtFld.setBackground(new java.awt.Color(204, 255, 204));

        loginBtn.setBackground(new java.awt.Color(204, 255, 204));
        loginBtn.setText("Log-In");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        loginMessageLbl.setText("Enter a valid user name and password");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(mainTitleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(loginPanelLayout.createSequentialGroup()
                                        .addComponent(passwordLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(passwordTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(loginPanelLayout.createSequentialGroup()
                                        .addComponent(userNameLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(userNameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(loginPanelLayout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(loginBtn)))
                                .addGap(172, 172, 172))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                                .addComponent(loginMessageLbl)
                                .addGap(134, 134, 134))))))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addComponent(mainTitleLbl)
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLbl)
                    .addComponent(userNameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLbl)
                    .addComponent(passwordTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loginBtn)
                .addGap(18, 18, 18)
                .addComponent(loginMessageLbl)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:

        for(User u: userList){
            if(u.getUserName().equals(userNameTxtFld.getText()) && u.getPassword().equals(passwordTxtFld.getText())){
                loginMessageLbl.setText("welcome " + u.getUserType() + " " + u.getName());
                loginMessageLbl.setVisible(true);
            }else
            loginMessageLbl.setVisible(true);
        }

    }//GEN-LAST:event_loginBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HSGolfLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HSGolfLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HSGolfLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HSGolfLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new HSGolfLogin().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(HSGolfLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        

    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginMessageLbl;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel mainTitleLbl;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JTextField passwordTxtFld;
    private javax.swing.JLabel userNameLbl;
    private javax.swing.JTextField userNameTxtFld;
    // End of variables declaration//GEN-END:variables
}
