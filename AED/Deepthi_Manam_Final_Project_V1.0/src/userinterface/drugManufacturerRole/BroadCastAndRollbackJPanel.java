/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.drugManufacturerRole;

import business.HealthCareSystem;
import business.drug.Drug;
import business.enterprise.DrugCompanyEnterprise;
import business.enterprise.Enterprise;
import business.enterprise.PharmacyEnterprise;
import business.organization.InventoryManagement;
import business.organization.Organization;
import business.useraccount.UserAccount;
import business.workqueue.RollbackWorkRequest;
import java.awt.CardLayout;
import java.awt.Font;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Deepthi
 */
public class BroadCastAndRollbackJPanel extends javax.swing.JPanel {
    
    private HealthCareSystem system;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Organization organization;
    private UserAccount userAccount;
    /**
     * Creates new form BroadCastAndRollbackJPanel
     */
    public BroadCastAndRollbackJPanel(HealthCareSystem system,JPanel userProcessContainer,Enterprise enterprise,Organization organization,UserAccount userAccount) {
        initComponents();
          this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = organization;
        this.userAccount = userAccount;
        this.system = system;
        populateDrugComboBox();
    }

    private void populateDrugComboBox(){
        drugJComboBox.removeAllItems();
        for(Drug drug : ((DrugCompanyEnterprise)enterprise).getDrugCatalogue().getDrugsList()){
            drugJComboBox.addItem(drug);
        }
    }
    private void populateTable(Drug drug){
        
        DefaultTableModel model = (DefaultTableModel)adverseEventJTable.getModel();
        model.setRowCount(0);
        adverseEventJTable.getTableHeader().setFont(new Font( "Tahoma" , Font.PLAIN, 18 ));

        int count = 0;
        for(String adverseEvent : drug.getAdverseEffectsList()){
            Object[] row = new Object[2];
            row[0] = count;
            row[1] = adverseEvent;
            model.addRow(row);
            count++;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        drugJComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adverseEventJTable = new javax.swing.JTable();
        broadCastNewsJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        rollbackJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("BROADCAST THE NEWS AND ROLLBACK THE DRUG");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Select the drug to view the adverse effects:");

        drugJComboBox.setBackground(new java.awt.Color(189, 220, 250));
        drugJComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        drugJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        drugJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugJComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("List of adverse effects of drug :");

        adverseEventJTable.setBackground(new java.awt.Color(189, 220, 250));
        adverseEventJTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adverseEventJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S No", "Adverse Event"
            }
        ));
        jScrollPane1.setViewportView(adverseEventJTable);

        broadCastNewsJButton.setBackground(new java.awt.Color(137, 185, 239));
        broadCastNewsJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        broadCastNewsJButton.setText("BroadCast News ");
        broadCastNewsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                broadCastNewsJButtonActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(137, 185, 239));
        backJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        rollbackJButton.setBackground(new java.awt.Color(137, 185, 239));
        rollbackJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rollbackJButton.setText("Rollback Drug");
        rollbackJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollbackJButtonActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/drugManufacturerRole/broadcast.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(drugJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(broadCastNewsJButton)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(rollbackJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(400, 400, 400)
                                .addComponent(jLabel4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jLabel1)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(drugJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rollbackJButton)
                            .addComponent(broadCastNewsJButton))
                        .addGap(130, 130, 130)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void drugJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugJComboBoxActionPerformed
        // TODO add your handling code here:
        Drug drug = (Drug)drugJComboBox.getSelectedItem();
        if(drug != null){
            populateTable(drug);
        }
    }//GEN-LAST:event_drugJComboBoxActionPerformed

    private void broadCastNewsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_broadCastNewsJButtonActionPerformed
        // TODO add your handling code here:
        Drug drug = (Drug)drugJComboBox.getSelectedItem();
        if(drug != null){            
        system.setNews(system.getNews() + " \n" + "Do not use " + drug.getDrugName());    
        JOptionPane.showMessageDialog(null, "Successfully broadcasted the news");

        
        }
        
        
        
    }//GEN-LAST:event_broadCastNewsJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void rollbackJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollbackJButtonActionPerformed
        // TODO add your handling code here:
        Drug drug = (Drug)drugJComboBox.getSelectedItem();
        if (drug != null) {
            for (PharmacyEnterprise pharmacyEnterprise : system.getAllPharmacies()) {
                for (Organization organization : pharmacyEnterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof InventoryManagement) {
                        //create a rollback request and put int inventoryManagement organization of pharmacy
                        RollbackWorkRequest rwr = new RollbackWorkRequest();
                        rwr.setRequestId(new Random().nextInt(100));
                        rwr.setDrug(drug);
                        rwr.setSender(userAccount);
                        rwr.setSenderEnterprise(enterprise.getName());
                        rwr.setMessage("Rollback the drug to us");
                        rwr.setStatus("Pending");
                        
                        organization.getWorkQueue().getWorkRequestList().add(rwr);
                    }
                }
            }
            //change the remApproved to false
            drug.setIsRemApproved(false);
        }
                JOptionPane.showMessageDialog(null, "RollBack request sent.");

    }//GEN-LAST:event_rollbackJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable adverseEventJTable;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton broadCastNewsJButton;
    private javax.swing.JComboBox drugJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton rollbackJButton;
    // End of variables declaration//GEN-END:variables
}