/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golfApp.com;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author michael.remington
 */
public class NoWidgetTestFrame extends JFrame {

    private JPanel mainPnl;
    private JLabel mainTitleLbl;
    private JLabel newTitleLbl;
    private JTextField newTitleTxt;
    private JButton updateBtn;
    private GridLayout componentGrid;
    private BorderLayout borderLayout;
    private FlowLayout flowLayout;

    public NoWidgetTestFrame() {

        super("Test Frame - No Netbeans Widget");

        setSize(800, 600);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();

    }

    public void initComponents() {
        mainPnl = new JPanel();
        
        //componentGrid = new GridLayout(4,1,5,5);//3 by 1 grid with gaps of 5 pixels
        //mainPnl.setLayout(componentGrid);
        
        //borderLayout = new BorderLayout(5,5); //gaps of 5 pixels
        //mainPnl.setLayout(borderLayout);
        
        //flowLayout = new FlowLayout();
        //mainPnl.setLayout(flowLayout);
        
        mainPnl.setLayout(null);
        
        mainTitleLbl = new JLabel();
        newTitleLbl = new JLabel();
        newTitleTxt = new JTextField();
        updateBtn = new JButton();
        
        
        mainTitleLbl.setFont(new java.awt.Font("Tahoma", 1, 36));
        mainTitleLbl.setText("Main Test Panel");
        mainTitleLbl.setBounds(250, 0, 300, 100);

       
        
        newTitleLbl.setText("New Title");
        newTitleLbl.setLocation(200,200);
        newTitleLbl.setBounds(200, 200, 100, 30);

        
        
        newTitleTxt.setLocation(newTitleLbl.getX()+10, newTitleLbl.getY());
        newTitleTxt.setBounds(275, 200, 300, 30);
      

        
        updateBtn.setText("Update Title");
        updateBtn.setBounds(300, 300, 200, 30);
        updateBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        
        mainPnl.add(mainTitleLbl);
        mainPnl.add(newTitleLbl);
        mainPnl.add(newTitleTxt);
       mainPnl.add(updateBtn);
        
//        mainPnl.add(mainTitleLbl, BorderLayout.NORTH);
//        mainPnl.add(newTitleLbl, BorderLayout.WEST);
//       mainPnl.add(newTitleTxt, BorderLayout.CENTER);
//       mainPnl.add(updateBtn, BorderLayout.SOUTH);
//       
        add(mainPnl);
    }
    private void updateBtnActionPerformed(ActionEvent evt) {                                          
        // TODO add your handling code here:
       String newTitle = "";
       newTitle = newTitleTxt.getText();
       mainTitleLbl.setText(newTitle);
    }       

    public static void main(String args[]) {
        NoWidgetTestFrame run = new NoWidgetTestFrame();
        run.setVisible(true);
    }
}
