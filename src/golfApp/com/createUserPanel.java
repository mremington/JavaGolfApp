/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golfApp.com;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author michael.remington
 */
public class createUserPanel extends javax.swing.JPanel {

    private SchoolList schools;
    private ArrayList<School> schoolList;
    /**
     * Creates new form createUserPanel
     */
    public createUserPanel() throws FileNotFoundException {
        initComponents();
        schools = new SchoolList();
        schoolList = schools.getSchools();
        String[] schoolNames = new String[schoolList.size()];
        DefaultComboBoxModel model = new DefaultComboBoxModel(schoolNames);
        schoolComboBx.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLbl = new javax.swing.JLabel();
        firstNameLbl = new javax.swing.JLabel();
        firstNameTxtFld = new javax.swing.JTextField();
        lastNameLbl = new javax.swing.JLabel();
        firstNameTxtFld1 = new javax.swing.JTextField();
        phoneLbl = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        addressLbl = new javax.swing.JLabel();
        addressTxtFld = new javax.swing.JTextField();
        typeComboBx = new javax.swing.JComboBox();
        typeLbl = new javax.swing.JLabel();
        userNameLbl = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        emailLab = new javax.swing.JLabel();
        emailTxtFld = new javax.swing.JTextField();
        schoolLbl = new javax.swing.JLabel();
        schoolComboBx = new javax.swing.JComboBox();
        genderLbl = new javax.swing.JLabel();
        genderComboBx = new javax.swing.JComboBox();
        createUserBtn = new javax.swing.JButton();

        titleLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleLbl.setText("New User Form");

        firstNameLbl.setText("First Name");

        lastNameLbl.setText("Last Name");

        phoneLbl.setText("Phone");

        addressLbl.setText("Address");

        typeComboBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Player", "Coach", "AD", "Guest" }));

        typeLbl.setText("User Type");

        userNameLbl.setText("User Name");

        jLabel1.setText("Password");

        emailLab.setText("Email");

        schoolLbl.setText("School");

        schoolComboBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CCA", "TP", "LCC", "SDA" }));

        genderLbl.setText("Gender");

        genderComboBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        createUserBtn.setText("Create User");
        createUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(typeLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(typeComboBx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(firstNameLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstNameTxtFld))
                    .addComponent(titleLbl)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameLbl)
                            .addComponent(phoneLbl)
                            .addComponent(addressLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressTxtFld)
                            .addComponent(jTextField1)
                            .addComponent(firstNameTxtFld1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userNameLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(emailLab)
                                .addComponent(schoolLbl))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(genderLbl)
                                .addGap(15, 15, 15)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createUserBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField3)
                                .addComponent(emailTxtFld)
                                .addComponent(schoolComboBx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(genderComboBx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLbl)
                    .addComponent(firstNameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLbl)
                    .addComponent(firstNameTxtFld1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLbl)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLbl)
                    .addComponent(addressTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLbl)
                    .addComponent(typeComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLbl)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLab)
                    .addComponent(emailTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(schoolLbl)
                    .addComponent(schoolComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLbl)
                    .addComponent(genderComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(createUserBtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserBtnActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_createUserBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLbl;
    private javax.swing.JTextField addressTxtFld;
    private javax.swing.JButton createUserBtn;
    private javax.swing.JLabel emailLab;
    private javax.swing.JTextField emailTxtFld;
    private javax.swing.JLabel firstNameLbl;
    private javax.swing.JTextField firstNameTxtFld;
    private javax.swing.JTextField firstNameTxtFld1;
    private javax.swing.JComboBox genderComboBx;
    private javax.swing.JLabel genderLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lastNameLbl;
    private javax.swing.JLabel phoneLbl;
    private javax.swing.JComboBox schoolComboBx;
    private javax.swing.JLabel schoolLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JComboBox typeComboBx;
    private javax.swing.JLabel typeLbl;
    private javax.swing.JLabel userNameLbl;
    // End of variables declaration//GEN-END:variables
}
