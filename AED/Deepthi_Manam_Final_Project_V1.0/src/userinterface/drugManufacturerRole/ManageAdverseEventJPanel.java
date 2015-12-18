/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.drugManufacturerRole;

import business.drug.Drug;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.useraccount.UserAccount;
import business.workqueue.AdverseEventRequest;
import business.workqueue.DrugAdverseEventRequest;
import business.workqueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Deepthi
 */
public class ManageAdverseEventJPanel extends javax.swing.JPanel {
  private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Organization organization;
    private UserAccount userAccount;
    /**
     * Creates new form ManageAdverseEventJPanel
     */
    public ManageAdverseEventJPanel(JPanel userProcessContainer,Enterprise enterprise,Organization organization,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = organization;
        this.userAccount = userAccount;
        
        populateTable();
    }
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) adverseEventJTable.getModel();
        model.setRowCount(0);
        adverseEventJTable.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 18));

        for (WorkRequest wr : organization.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof DrugAdverseEventRequest) {
                Object[] row = new Object[6];
                row[0] = wr;
                row[1] = ((DrugAdverseEventRequest) wr).getSenderHospital();
                row[2] = ((DrugAdverseEventRequest) wr).getSender().getPerson().getFirstName();
                row[3] = ((DrugAdverseEventRequest) wr).getDrug();
                row[4] = ((DrugAdverseEventRequest) wr).getAdverseEvent();
                row[5] = ((DrugAdverseEventRequest) wr).getStatus();
                model.addRow(row);

            }
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
        adverseEventJTable = new javax.swing.JTable();
        processAdverseEventJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        adverseEventJTable.setBackground(new java.awt.Color(227, 226, 226));
        adverseEventJTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adverseEventJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request Id", "Enterprise", "Doctor", "Drug", "Adverse Event", "Status"
            }
        ));
        jScrollPane1.setViewportView(adverseEventJTable);

        processAdverseEventJButton.setBackground(new java.awt.Color(137, 185, 239));
        processAdverseEventJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        processAdverseEventJButton.setText("Process Adverse Event");
        processAdverseEventJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processAdverseEventJButtonActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(137, 185, 239));
        backJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Manage Adverse Events");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(314, 314, 314)
                        .addComponent(processAdverseEventJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1492, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(596, 596, 596)
                        .addComponent(jLabel1)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processAdverseEventJButton)
                    .addComponent(backJButton))
                .addContainerGap(388, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void processAdverseEventJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processAdverseEventJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = adverseEventJTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select the adverse event to process it");
            return;
        }
        DrugAdverseEventRequest dwr = (DrugAdverseEventRequest)adverseEventJTable.getValueAt(selectedRow, 0);
        //add the adverse effect to drug
        Drug drug = dwr.getDrug();
        drug.getAdverseEffectsList().add(dwr.getAdverseEvent());
        
        
        //set the particular status to evaluating
        dwr.setStatus("Evaluating");
        JOptionPane.showMessageDialog(null, "Evalution in Process.");
        populateTable();
        
        
        
    }//GEN-LAST:event_processAdverseEventJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
          userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable adverseEventJTable;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processAdverseEventJButton;
    // End of variables declaration//GEN-END:variables
}