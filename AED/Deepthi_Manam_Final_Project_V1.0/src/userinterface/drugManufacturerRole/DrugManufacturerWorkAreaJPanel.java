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
import business.organization.Organization;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Deepthi
 */
public class DrugManufacturerWorkAreaJPanel extends javax.swing.JPanel {
    private HealthCareSystem system;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Organization organization;
    private UserAccount userAccount;
    
    /**
     * Creates new form DrugManufacturerWorkAreaJPanel
     */
    public DrugManufacturerWorkAreaJPanel(HealthCareSystem system,JPanel userProcessContainer,Enterprise enterprise,Organization organization,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = organization;
        this.userAccount = userAccount;
        this.system = system;
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
        manageDrugsJButton = new javax.swing.JButton();
        manageAdverseEventJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        managePersonInfoJButton = new javax.swing.JButton();
        resetPasswordJButton = new javax.swing.JButton();
        broadcastJButton = new javax.swing.JButton();
        compareJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Drug Manufacturer Work Area");

        manageDrugsJButton.setBackground(new java.awt.Color(137, 185, 239));
        manageDrugsJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageDrugsJButton.setText("Manage Drugs >>");
        manageDrugsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDrugsJButtonActionPerformed(evt);
            }
        });

        manageAdverseEventJButton.setBackground(new java.awt.Color(137, 185, 239));
        manageAdverseEventJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageAdverseEventJButton.setText("Manage Adverse Events >>");
        manageAdverseEventJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAdverseEventJButtonActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/drugManufacturerRole/drugs.jpg"))); // NOI18N

        managePersonInfoJButton.setBackground(new java.awt.Color(137, 185, 239));
        managePersonInfoJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        managePersonInfoJButton.setText("Manage Personal Info >>");
        managePersonInfoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePersonInfoJButtonActionPerformed(evt);
            }
        });

        resetPasswordJButton.setBackground(new java.awt.Color(137, 185, 239));
        resetPasswordJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resetPasswordJButton.setText("Reset Password >>");
        resetPasswordJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetPasswordJButtonActionPerformed(evt);
            }
        });

        broadcastJButton.setBackground(new java.awt.Color(137, 185, 239));
        broadcastJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        broadcastJButton.setText("BroadCast News And Rollback>>");
        broadcastJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                broadcastJButtonActionPerformed(evt);
            }
        });

        compareJButton.setBackground(new java.awt.Color(137, 185, 239));
        compareJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        compareJButton.setText("Adverse Effects By Drugs ");
        compareJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compareJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(jLabel1)
                .addContainerGap(1162, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(manageDrugsJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(manageAdverseEventJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                        .addComponent(broadcastJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(managePersonInfoJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resetPasswordJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(compareJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(161, 161, 161))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(manageDrugsJButton)
                        .addGap(42, 42, 42)
                        .addComponent(manageAdverseEventJButton)
                        .addGap(58, 58, 58)
                        .addComponent(broadcastJButton)
                        .addGap(57, 57, 57)
                        .addComponent(managePersonInfoJButton)
                        .addGap(57, 57, 57)
                        .addComponent(resetPasswordJButton)
                        .addGap(52, 52, 52)
                        .addComponent(compareJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)))
                .addGap(0, 21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageDrugsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDrugsJButtonActionPerformed
        // TODO add your handling code here:
         ManageDrugsJPanel panel = new ManageDrugsJPanel(userProcessContainer, enterprise, organization, userAccount);
        userProcessContainer.add("ManageDrugsJPanel", panel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageDrugsJButtonActionPerformed

    private void managePersonInfoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePersonInfoJButtonActionPerformed
        // TODO add your handling code here:
         DrugManfPersonalInformationJPanel panel = new DrugManfPersonalInformationJPanel(userProcessContainer, enterprise,  userAccount);
        userProcessContainer.add("DrugManfPersonalInformationJPanel", panel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePersonInfoJButtonActionPerformed

    private void resetPasswordJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetPasswordJButtonActionPerformed
        // TODO add your handling code here:
        
        DrugManufacturerResetPasswordJPanel panel = new DrugManufacturerResetPasswordJPanel(userProcessContainer, enterprise,  userAccount);
        userProcessContainer.add("DrugManufacturerResetPasswordJPanel", panel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_resetPasswordJButtonActionPerformed

    private void broadcastJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_broadcastJButtonActionPerformed
        // TODO add your handling code here:
        BroadCastAndRollbackJPanel panel = new BroadCastAndRollbackJPanel(system,userProcessContainer, enterprise, organization, userAccount);
        userProcessContainer.add("BroadCastAndRollbackJPanel", panel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_broadcastJButtonActionPerformed

    private void manageAdverseEventJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAdverseEventJButtonActionPerformed
        // TODO add your handling code here:
         ManageAdverseEventJPanel panel = new ManageAdverseEventJPanel(userProcessContainer, enterprise, organization, userAccount);
        userProcessContainer.add("ManageAdverseEventJPanel", panel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageAdverseEventJButtonActionPerformed

    private void compareJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compareJButtonActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(Drug drug : ((DrugCompanyEnterprise)enterprise).getDrugCatalogue().getDrugsList()){
             dataset.setValue(drug.getAdverseEffectsList().size(), "Drug ", drug.getDrugName());

        }
        //Create a chart
        JFreeChart chart = ChartFactory.createBarChart("Compare the drug adverse envents", "Drug", "No of adverse events", dataset, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.black);
        ChartFrame frame = new ChartFrame("Compare the drug adverse envents", chart);
        frame.setVisible(true);
        frame.setSize(450, 350);
    }//GEN-LAST:event_compareJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton broadcastJButton;
    private javax.swing.JButton compareJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageAdverseEventJButton;
    private javax.swing.JButton manageDrugsJButton;
    private javax.swing.JButton managePersonInfoJButton;
    private javax.swing.JButton resetPasswordJButton;
    // End of variables declaration//GEN-END:variables
}
