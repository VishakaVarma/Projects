/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LabAssistantRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.RadiologyLabOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RadioLabWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Srikanth Reddy
 */
public class RadioLabAssistantWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RadioLabAssistantWorkAreaJPanel
     */

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private RadiologyLabOrganization radioLabOrganization;
    private Organization organization;
    private Enterprise enterprise;

    public RadioLabAssistantWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.radioLabOrganization = (RadiologyLabOrganization) organization;
        this.organization = organization;
        this.enterprise = enterprise;
        setImage();
    }
    
    public void setImage(){
        jLabel1.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\vish1\\OneDrive\\Documents\\AED_Final_Project\\AED pictures\\analysis.png").getImage().getScaledInstance(600, 500, Image.SCALE_DEFAULT)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sendRequests = new javax.swing.JButton();
        viewRequests = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        sendRequests.setBackground(new java.awt.Color(255, 255, 255));
        sendRequests.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        sendRequests.setText("Send Requests");
        sendRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendRequestsActionPerformed(evt);
            }
        });

        viewRequests.setBackground(new java.awt.Color(255, 255, 255));
        viewRequests.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        viewRequests.setText("View Requests");
        viewRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewRequests, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sendRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(406, 406, 406)
                .addComponent(jLabel1)
                .addContainerGap(721, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewRequests)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sendRequests))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)))
                .addContainerGap(652, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendRequestsActionPerformed
        // TODO add your handling code here:
        RadioSendRequestsLabJPanel sendRequestJPanel = new RadioSendRequestsLabJPanel(userProcessContainer, userAccount, organization,enterprise);
        userProcessContainer.add("radiosendRequestJPanel", sendRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_sendRequestsActionPerformed

    private void viewRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestsActionPerformed
        // TODO add your handling code here:
        RadioViewRequestsLabJPanel viewRequestJPanel = new RadioViewRequestsLabJPanel(userProcessContainer, userAccount, organization, business);
        userProcessContainer.add("radioviewRequestJPanel", viewRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewRequestsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton sendRequests;
    private javax.swing.JButton viewRequests;
    // End of variables declaration//GEN-END:variables
}