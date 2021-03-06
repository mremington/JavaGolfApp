/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golfApp.com;

import java.awt.Graphics;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author mike
 */
public class HSGolfMain extends javax.swing.JFrame {

    private HSGolfSubPanel subPanel;
    private static DisplayInfoPnl displayPanel;
    private static String displayType;

    /**
     * Creates new form HSGolfMain
     */
    public HSGolfMain() {
        initComponents();
        subPanel = new HSGolfSubPanel();
        subPanel.setBounds(0, 150, getWidth(), getHeight());
        subPanel.setVisible(false);
        add(subPanel);

        //displayPanel = new DisplayInfoPnl();
        displayType = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPnl = new javax.swing.JPanel();
        mainTitleLbl = new javax.swing.JLabel();
        schoolMenuBtn = new javax.swing.JRadioButton();
        userMenuBtn = new javax.swing.JRadioButton();
        leagueMenuBtn = new javax.swing.JRadioButton();
        menuLaunchBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPnl.setPreferredSize(new java.awt.Dimension(800, 600));

        mainTitleLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mainTitleLbl.setText("High School Golf Application");

        schoolMenuBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        schoolMenuBtn.setText("School Menu");
        schoolMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolMenuBtnActionPerformed(evt);
            }
        });

        userMenuBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        userMenuBtn.setText(" User Menu");
        userMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userMenuBtnActionPerformed(evt);
            }
        });

        leagueMenuBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        leagueMenuBtn.setText("League Menu");
        leagueMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leagueMenuBtnActionPerformed(evt);
            }
        });

        menuLaunchBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        menuLaunchBtn.setText("Launch Selected Menu");
        menuLaunchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLaunchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPnlLayout = new javax.swing.GroupLayout(mainPnl);
        mainPnl.setLayout(mainPnlLayout);
        mainPnlLayout.setHorizontalGroup(
            mainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPnlLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(schoolMenuBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(userMenuBtn)
                .addGap(65, 65, 65)
                .addComponent(leagueMenuBtn)
                .addGap(73, 73, 73))
            .addGroup(mainPnlLayout.createSequentialGroup()
                .addGroup(mainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPnlLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(mainTitleLbl))
                    .addGroup(mainPnlLayout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(menuLaunchBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPnlLayout.setVerticalGroup(
            mainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPnlLayout.createSequentialGroup()
                .addGroup(mainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainTitleLbl)
                    .addGroup(mainPnlLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(mainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(schoolMenuBtn)
                            .addComponent(userMenuBtn)
                            .addComponent(leagueMenuBtn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuLaunchBtn))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 460, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuLaunchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLaunchBtnActionPerformed
        // TODO add your handling code here:
        if (schoolMenuBtn.isSelected()) {
            subPanel.setSubTitle("School Information Menu");
            subPanel.setVisible(true);
            setDisplayType("school");
        } else if (userMenuBtn.isSelected()) {
            subPanel.setSubTitle("User Information Menu");
            subPanel.setVisible(true);
            setDisplayType("user");
        } else if (leagueMenuBtn.isSelected()) {
            subPanel.setSubTitle("League Information Menu");
            subPanel.setVisible(true);
            setDisplayType("league");
        }
    }//GEN-LAST:event_menuLaunchBtnActionPerformed

    private void schoolMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolMenuBtnActionPerformed
        // TODO add your handling code here:
        userMenuBtn.setSelected(false);
        leagueMenuBtn.setSelected(false);
    }//GEN-LAST:event_schoolMenuBtnActionPerformed

    private void userMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userMenuBtnActionPerformed
        // TODO add your handling code here:
        schoolMenuBtn.setSelected(false);
        leagueMenuBtn.setSelected(false);
    }//GEN-LAST:event_userMenuBtnActionPerformed

    private void leagueMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leagueMenuBtnActionPerformed
        // TODO add your handling code here:
        userMenuBtn.setSelected(false);
        schoolMenuBtn.setSelected(false);
    }//GEN-LAST:event_leagueMenuBtnActionPerformed

    public static void setDisplayType(String s) {
        displayType = s;
    }

    public static String getDisplayType() {
        return displayType;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        if (subPanel.getOperation().equals("read") && getDisplayType().equals("user")) {
            mainPnl.setVisible(false);
            subPanel.setVisible(false);
           

            try {
                displayPanel = new DisplayInfoPnl("users");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HSGolfMain.class.getName()).log(Level.SEVERE, null, ex);
            }
            displayPanel.setBounds(0, 0, getWidth(), getHeight());
            displayPanel.setVisible(true);
            add(displayPanel);
        }
        repaint();
    }

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
            java.util.logging.Logger.getLogger(HSGolfMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HSGolfMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HSGolfMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HSGolfMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HSGolfMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton leagueMenuBtn;
    private javax.swing.JPanel mainPnl;
    private javax.swing.JLabel mainTitleLbl;
    private javax.swing.JButton menuLaunchBtn;
    private javax.swing.JRadioButton schoolMenuBtn;
    private javax.swing.JRadioButton userMenuBtn;
    // End of variables declaration//GEN-END:variables
}
