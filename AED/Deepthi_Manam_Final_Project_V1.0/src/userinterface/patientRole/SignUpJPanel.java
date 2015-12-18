/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.patientRole;

import business.HealthCareSystem;
import business.person.Person;
import business.role.PatientRole;
import business.validation.ValidationUtil;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Deepthi
 */
public class SignUpJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private HealthCareSystem system;

    /**
     * Creates new form SignUpJPanel
     */
    public SignUpJPanel(JPanel userProcessContainer, HealthCareSystem system ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        firstNameJTextField = new javax.swing.JTextField();
        lastNameJTextField = new javax.swing.JTextField();
        dobJTextField = new javax.swing.JTextField();
        ssnJTextField = new javax.swing.JTextField();
        phoneNumberJTextField = new javax.swing.JTextField();
        emailIdJTextField = new javax.swing.JTextField();
        addressJTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        userNameJTextField = new javax.swing.JTextField();
        signUpButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Patient Sign Up");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Create your account");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/patientRole/signup.jpg"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("First Name:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Last Name:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Date Of Birth:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("SSN");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Phone Number:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Email ID:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Address:");

        firstNameJTextField.setBackground(new java.awt.Color(208, 218, 226));
        firstNameJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lastNameJTextField.setBackground(new java.awt.Color(208, 218, 226));
        lastNameJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        dobJTextField.setBackground(new java.awt.Color(208, 218, 226));
        dobJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        ssnJTextField.setBackground(new java.awt.Color(208, 218, 226));
        ssnJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        phoneNumberJTextField.setBackground(new java.awt.Color(208, 218, 226));
        phoneNumberJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        emailIdJTextField.setBackground(new java.awt.Color(208, 218, 226));
        emailIdJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        addressJTextField.setBackground(new java.awt.Color(208, 218, 226));
        addressJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("User Name:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Password:");

        userNameJTextField.setBackground(new java.awt.Color(208, 218, 226));
        userNameJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        signUpButton.setBackground(new java.awt.Color(137, 185, 239));
        signUpButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signUpButton.setText("Sign Up");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("(MM/DD/YYYY)");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("(Complete 9 Digits)");

        passwordJPasswordField.setBackground(new java.awt.Color(208, 218, 226));
        passwordJPasswordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lastNameJTextField)
                            .addComponent(firstNameJTextField)
                            .addComponent(dobJTextField)
                            .addComponent(ssnJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(userNameJTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(addressJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailIdJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneNumberJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordJPasswordField))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(292, 292, 292))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(492, 492, 492)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(252, 252, 252)
                            .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(firstNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(lastNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(dobJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ssnJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(phoneNumberJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(emailIdJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(addressJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signUpButton)
                .addContainerGap(151, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        // TODO add your handling code here:
        String firstName = firstNameJTextField.getText();
        String lastName = lastNameJTextField.getText();
        String dateOfBirthString = dobJTextField.getText();
        String ssn = ssnJTextField.getText();     
        String email = emailIdJTextField.getText();
        String address = addressJTextField.getText();
        String phoneNumberString = phoneNumberJTextField.getText();
        String userName = userNameJTextField.getText();
        String password = String.valueOf(passwordJPasswordField.getPassword());
        
        if (firstName.isEmpty() || lastName.isEmpty() || ssn.isEmpty() || dateOfBirthString.isEmpty() || address.isEmpty()
                || phoneNumberString.isEmpty() || email.isEmpty() ||userName.isEmpty() || password.isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Enter values");
            return;
        }
        
         if(!ValidationUtil.isValidPhoneNumber(phoneNumberString)){
             JOptionPane.showMessageDialog(null, "Enter valid phone Number");
            return;
        }
        
        if(!ValidationUtil.isValidEmailId(email)){
            JOptionPane.showMessageDialog(null, "Enter Valid EmailId");
            return;
        }
        if(!ValidationUtil.isValidDate(dateOfBirthString)){
            JOptionPane.showMessageDialog(null, "Enter Valid date in MM/dd/yyyy format");
            return;
        }
        if(!ValidationUtil.isCompleteSSN(ssn)){
            JOptionPane.showMessageDialog(null, "Enter complete 9 digits of ssn");
            return;
        }
//        String uniqueCodeOfPatient = ValidationUtil.generateUniqueCode1(firstName, lastName, ssn.substring(5), dateOfBirthString);

        //check whether user account already exists
//        for(Person person : system.getPersonDirectory().getPersonsList()){
//            String tempUniqueCode = ValidationUtil.generateUniqueCode(firstName, lastName, person.getSsn().substring(5), person.getDateOfBirth());
//            if(tempUniqueCode.equals(uniqueCodeOfPatient)){
//                JOptionPane.showMessageDialog(null, "User Account already exists");
//            return;
//            }
//            
//        }
        
        Person p = system.getPersonDirectory().addPerson();
        p.setFirstName(firstName);
        p.setLastName(lastName);
        p.setSsn(ssn);
        p.setDateOfBirth(ValidationUtil.parseDate(dateOfBirthString));
        p.setAddress(address);
        p.setEmailId(email);
        p.setPhoneNumber(ValidationUtil.parsePhoneNumber(phoneNumberString));
        
        system.getUserAccountDirectory().createUserAccount(userName, password, p, new PatientRole());
        JOptionPane.showMessageDialog(null, "Successfully created the account");
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
      
        
    }//GEN-LAST:event_signUpButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressJTextField;
    private javax.swing.JTextField dobJTextField;
    private javax.swing.JTextField emailIdJTextField;
    private javax.swing.JTextField firstNameJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastNameJTextField;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JTextField phoneNumberJTextField;
    private javax.swing.JButton signUpButton;
    private javax.swing.JTextField ssnJTextField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}