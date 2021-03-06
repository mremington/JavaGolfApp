/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golfApp.com;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author mike
 */
public class DisplayInfoPnl extends javax.swing.JPanel {

    UserList userLst;
    ArrayList<User> userInfo;
    /**
     * Creates new form displayInforPnl
     */
    public DisplayInfoPnl() {
        initComponents();
    }

    public DisplayInfoPnl(String type) throws FileNotFoundException {
        initComponents();
        userLst = new UserList();
        if (type.equals("users")) {
            infoDisplayTitleLbl.setText("User Information Display");
            elementLstLbl.setText("User List");
            elementInfoLbl.setText("User Details");
            loadInfo(type);
        }
    }
    
    public void loadInfo(String type){
        if (type.equals("users")) {
            userInfo = userLst.getUsers();
            String[] names = new String[userInfo.size()];
            for(int i = 0; i<names.length; i++){
                names[i] = userInfo.get(i).getName();
            }
            elementLst.setListData(names);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        elementLst = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        elementTextArea = new javax.swing.JTextArea();
        elementLstLbl = new javax.swing.JLabel();
        elementInfoLbl = new javax.swing.JLabel();
        infoDisplayTitleLbl = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 600));

        elementLst.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        elementLst.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                elementLstValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(elementLst);

        elementTextArea.setColumns(20);
        elementTextArea.setRows(5);
        jScrollPane2.setViewportView(elementTextArea);

        elementLstLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        elementLstLbl.setText("Elements");

        elementInfoLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        elementInfoLbl.setText("Element Information");

        infoDisplayTitleLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        infoDisplayTitleLbl.setText("Information Display");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(elementLstLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(elementInfoLbl)
                .addGap(218, 218, 218))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(infoDisplayTitleLbl)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infoDisplayTitleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementLstLbl)
                    .addComponent(elementInfoLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void elementLstValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_elementLstValueChanged
        for(User u:userInfo){
            if(u.getName().equals(elementLst.getSelectedValue().toString())){
                elementTextArea.setText(u.toString());
            }
        }
        
    }//GEN-LAST:event_elementLstValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel elementInfoLbl;
    private javax.swing.JList elementLst;
    private javax.swing.JLabel elementLstLbl;
    private javax.swing.JTextArea elementTextArea;
    private javax.swing.JLabel infoDisplayTitleLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
