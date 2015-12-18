/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.adminRole;

import business.patient.Patient;
import business.person.Person;
import business.validation.ValidationUtil;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Deepthi
 */
public class ViewEmployeeJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Person person;

    /**
     * Creates new form AddPatientJPanel
     */
    public ViewEmployeeJPanel(JPanel userProcessContainer, Person person) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.person = person;

        populateFields();
    }

    private void populateFields() {
        firstNameJTextField.setText(person.getFirstName());
        lastNameJTextField.setText(person.getLastName());
        ssnJTextField.setText(person.getSsn());
        dateOfBirthJTextField.setText(ValidationUtil.formatDate(person.getDateOfBirth()));
        addressJTextArea.setText(person.getAddress());
        phoneNumberJTextField.setText(String.valueOf(person.getPhoneNumber()));
        emailJTextField.setText(person.getEmailId());
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        firstNameJTextField = new javax.swing.JTextField();
        lastNameJTextField = new javax.swing.JTextField();
        ssnJTextField = new javax.swing.JTextField();
        dateOfBirthJTextField = new javax.swing.JTextField();
        phoneNumberJTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        updateJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        emailJTextField = new javax.swing.JTextField();
        saveJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressJTextArea = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("View Or Update Employee");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("* First Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("* Last Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("* SSN:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("* Date Of Birth:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("* Phone Number:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("* Address:");

        firstNameJTextField.setEditable(false);
        firstNameJTextField.setBackground(new java.awt.Color(204, 224, 253));
        firstNameJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lastNameJTextField.setEditable(false);
        lastNameJTextField.setBackground(new java.awt.Color(204, 224, 253));
        lastNameJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        ssnJTextField.setEditable(false);
        ssnJTextField.setBackground(new java.awt.Color(204, 224, 253));
        ssnJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        dateOfBirthJTextField.setEditable(false);
        dateOfBirthJTextField.setBackground(new java.awt.Color(204, 224, 253));
        dateOfBirthJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        phoneNumberJTextField.setEditable(false);
        phoneNumberJTextField.setBackground(new java.awt.Color(204, 224, 253));
        phoneNumberJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel11.setText("(MM/DD/YYYY)");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Basic Information");

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
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("* Email:");

        emailJTextField.setEditable(false);
        emailJTextField.setBackground(new java.awt.Color(204, 224, 253));
        emailJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        saveJButton.setBackground(new java.awt.Color(137, 185, 239));
        saveJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        saveJButton.setText("Save");
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });

        addressJTextArea.setEditable(false);
        addressJTextArea.setBackground(new java.awt.Color(204, 224, 253));
        addressJTextArea.setColumns(20);
        addressJTextArea.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addressJTextArea.setRows(5);
        jScrollPane1.setViewportView(addressJTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(saveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(updateJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ssnJTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateOfBirthJTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lastNameJTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(firstNameJTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(phoneNumberJTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailJTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)))
                .addContainerGap(600, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(firstNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ssnJTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateOfBirthJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(phoneNumberJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emailJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveJButton)
                    .addComponent(updateJButton)
                    .addComponent(backJButton))
                .addContainerGap(295, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        // TODO add your handling code here:
        firstNameJTextField.setEditable(true);
        lastNameJTextField.setEditable(true);
        ssnJTextField.setEditable(true);
        addressJTextArea.setEditable(true);
        phoneNumberJTextField.setEditable(true);
        dateOfBirthJTextField.setEditable(true);
        emailJTextField.setEditable(true);
    }//GEN-LAST:event_updateJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
        // TODO add your handling code here:
        String firstName = firstNameJTextField.getText();
        String lastName = lastNameJTextField.getText();
        String ssn = ssnJTextField.getText();
        String address = addressJTextArea.getText();
        String phoneNumberString = phoneNumberJTextField.getText();
        String dateString = dateOfBirthJTextField.getText();
        String email = emailJTextField.getText();

        if (firstName.isEmpty() || lastName.isEmpty() || ssn.isEmpty() || address.isEmpty()
                || phoneNumberString.isEmpty() || dateString.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter values");
            return;
        }
        if (!ValidationUtil.isValidPhoneNumber(phoneNumberString)) {
            JOptionPane.showMessageDialog(null, "Enter valid phone Number");
            return;
        }

        if (!ValidationUtil.isValidEmailId(email)) {
            JOptionPane.showMessageDialog(null, "Enter Valid EmailId");
            return;
        }
        if (!ValidationUtil.isValidDate(dateString)) {
            JOptionPane.showMessageDialog(null, "Enter Valid date in MM/dd/yyyy format");
            return;
        }

        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAddress(address);
        person.setSsn(ssn);
        person.setDateOfBirth(ValidationUtil.parseDate(dateString));
        person.setPhoneNumber(ValidationUtil.parsePhoneNumber(phoneNumberString));
        person.setEmailId(email);
        JOptionPane.showMessageDialog(null, "Successfully saved the changes");

    }//GEN-LAST:event_saveJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addressJTextArea;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField dateOfBirthJTextField;
    private javax.swing.JTextField emailJTextField;
    private javax.swing.JTextField firstNameJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameJTextField;
    private javax.swing.JTextField phoneNumberJTextField;
    private javax.swing.JButton saveJButton;
    private javax.swing.JTextField ssnJTextField;
    private javax.swing.JButton updateJButton;
    // End of variables declaration//GEN-END:variables
}
