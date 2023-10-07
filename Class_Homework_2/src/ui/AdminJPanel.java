/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.Admin;
import java.awt.CardLayout;
import javax.swing.JPanel;
import model.UserList;


/**
 *
 * @author Admin
 */
public class AdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminJPanel
     */
    
 private JPanel userProcessContainer;
    private UserList userlist;
    
   
    AdminJPanel(JPanel userProcessContainer, UserList userlist) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userlist=userlist;
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btncreateuser = new javax.swing.JButton();
        btnmanageuser = new javax.swing.JButton();
        lbladmin = new javax.swing.JLabel();

        btncreateuser.setText("Create User");
        btncreateuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateuserActionPerformed(evt);
            }
        });

        btnmanageuser.setText("Manage User");
        btnmanageuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanageuserActionPerformed(evt);
            }
        });

        lbladmin.setText("Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(lbladmin, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btncreateuser, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(btnmanageuser, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbladmin)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncreateuser, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmanageuser, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(290, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btncreateuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateuserActionPerformed
        // TODO add your handling code here:

        
        CreateUserJPanel createuserpanel=new CreateUserJPanel(userProcessContainer,userlist);
        userProcessContainer.add("CreateUserJPanel",createuserpanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btncreateuserActionPerformed

    private void btnmanageuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanageuserActionPerformed
        // TODO add your handling code here:
        
        ManageUserJPanel manageuserpanel=new ManageUserJPanel(userProcessContainer,userlist);
        userProcessContainer.add("ManageAccountsJPanel",manageuserpanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnmanageuserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncreateuser;
    private javax.swing.JButton btnmanageuser;
    private javax.swing.JLabel lbladmin;
    // End of variables declaration//GEN-END:variables
}
