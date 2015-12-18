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
import business.validation.ValidationUtil;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Deepthi
 */
public class ViewDrugJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Organization organization;
    private UserAccount userAccount;
    private Drug drug;

    /**
     * Creates new form ViewDrugJPanel
     */
    public ViewDrugJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount userAccount, Drug drug) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = organization;
        this.userAccount = userAccount;
        this.drug = drug;
        populateFields();
    }

    private void populateFields() {
        nameJTextField.setText(drug.getDrugName());
        ingredientsJTextField.setText(drug.getIngredients());
        expiryJTextField.setText(ValidationUtil.formatDate(drug.getExpiryDate()));
        treatmentJTextField.setText(drug.getTreatmentArea());
        warningJTextField.setText(drug.getWarnings());
        usageJTextField.setText(drug.getUsageDirections());
        if (drug.isIsRemApproved()) {
            yesJRadioButton.setSelected(true);
        } else {
            noJRadioButton.setSelected(true);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        ingredientsJTextField = new javax.swing.JTextField();
        expiryJTextField = new javax.swing.JTextField();
        treatmentJTextField = new javax.swing.JTextField();
        warningJTextField = new javax.swing.JTextField();
        usageJTextField = new javax.swing.JTextField();
        yesJRadioButton = new javax.swing.JRadioButton();
        noJRadioButton = new javax.swing.JRadioButton();
        saveJButton = new javax.swing.JButton();
        updateJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("View or Update Drug");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Drug Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Ingredients:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Expiry Date:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Treatment Area:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Warnings:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Usage Directions:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Rem Approved :");

        nameJTextField.setEditable(false);
        nameJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        ingredientsJTextField.setEditable(false);
        ingredientsJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        expiryJTextField.setEditable(false);
        expiryJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        treatmentJTextField.setEditable(false);
        treatmentJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        warningJTextField.setEditable(false);
        warningJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        usageJTextField.setEditable(false);
        usageJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        buttonGroup1.add(yesJRadioButton);
        yesJRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yesJRadioButton.setText("YES");

        buttonGroup1.add(noJRadioButton);
        noJRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        noJRadioButton.setText("NO");

        saveJButton.setBackground(new java.awt.Color(137, 185, 239));
        saveJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        saveJButton.setText("Save");
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });

        updateJButton.setBackground(new java.awt.Color(137, 185, 239));
        updateJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updateJButton.setText("Update");
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
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

        jLabel9.setText("(MM/DD/YYYY)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(saveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(yesJRadioButton)
                                    .addGap(18, 18, 18)
                                    .addComponent(noJRadioButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(166, 166, 166)
                                    .addComponent(updateJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(warningJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(treatmentJTextField)
                                    .addGap(83, 83, 83)))
                            .addComponent(usageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ingredientsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(expiryJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(497, 780, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ingredientsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expiryJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(treatmentJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(warningJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yesJRadioButton)
                            .addComponent(noJRadioButton))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveJButton)
                    .addComponent(updateJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(98, 98, 98))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        // TODO add your handling code here:
        nameJTextField.setEditable(true);
        ingredientsJTextField.setEditable(true);
        expiryJTextField.setEditable(true);
        warningJTextField.setEditable(true);
        treatmentJTextField.setEditable(true);
        usageJTextField.setEditable(true);
        yesJRadioButton.setEnabled(true);
        noJRadioButton.setEnabled(true);
    }//GEN-LAST:event_updateJButtonActionPerformed

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
        // TODO add your handling code here:
        String name = nameJTextField.getText();
        String ingredients = ingredientsJTextField.getText();
        String expiryString = expiryJTextField.getText();
        String warnings = warningJTextField.getText();
        String treatmentArea = treatmentJTextField.getText();
        String usageDirections = usageJTextField.getText();

        if (name.isEmpty() || ingredients.isEmpty() || expiryString.isEmpty() || warnings.isEmpty() || treatmentArea.isEmpty() || usageDirections.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter values");
            return;
        }
        if (!ValidationUtil.isValidDate(expiryString)) {
            JOptionPane.showMessageDialog(null, "Enter valid date in MM/DD/YYYY format");
            return;
        }
        if (yesJRadioButton.isSelected() == false && noJRadioButton.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Please select YES/NO for rem approval");
            return;
        }

        //update the data
        drug.setDrugName(name);
        drug.setIngredients(ingredients);
        drug.setExpiryDate(ValidationUtil.parseDate(expiryString));
        drug.setTreatmentArea(treatmentArea);
        drug.setUsageDirections(usageDirections);
        drug.setWarnings(warnings);

        if (yesJRadioButton.isSelected()) {
            drug.setIsRemApproved(true);

        } else {
            drug.setIsRemApproved(false);

        }
        JOptionPane.showMessageDialog(null, "Successfully saved the results");


    }//GEN-LAST:event_saveJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField expiryJTextField;
    private javax.swing.JTextField ingredientsJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JRadioButton noJRadioButton;
    private javax.swing.JButton saveJButton;
    private javax.swing.JTextField treatmentJTextField;
    private javax.swing.JButton updateJButton;
    private javax.swing.JTextField usageJTextField;
    private javax.swing.JTextField warningJTextField;
    private javax.swing.JRadioButton yesJRadioButton;
    // End of variables declaration//GEN-END:variables
}
