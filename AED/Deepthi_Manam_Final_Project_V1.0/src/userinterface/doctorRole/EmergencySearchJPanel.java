/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.doctorRole;

import business.HealthCareSystem;
import business.enterprise.Enterprise;
import business.enterprise.HospitalEnterprise;
import business.organization.Organization;
import business.patient.Patient;
import business.useraccount.UserAccount;
import business.validation.ValidationUtil;
import business.workqueue.EmergencyRequest;
import java.awt.CardLayout;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Deepthi
 */
public class EmergencySearchJPanel extends javax.swing.JPanel {
    private HealthCareSystem system;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Organization organization;
    private UserAccount userAccount;
    private File image;
    /**
     * Creates new form EmergencySearchJPanel
     */
    public EmergencySearchJPanel(HealthCareSystem system,JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount userAccount) {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        firstNameJTextField = new javax.swing.JTextField();
        lastNameJTextField = new javax.swing.JTextField();
        ssnJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        doctorJTextField = new javax.swing.JTextField();
        hospitalJTextField = new javax.swing.JTextField();
        iAgreeJCheckBox = new javax.swing.JCheckBox();
        dobJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        submitJButton = new javax.swing.JButton();
        uploadJButton = new javax.swing.JButton();
        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel8 = new javax.swing.JLabel();
        fileInfoJLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pathJLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("First Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Last Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("SSN:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Date Of Birth:");

        firstNameJTextField.setBackground(new java.awt.Color(200, 225, 251));
        firstNameJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lastNameJTextField.setBackground(new java.awt.Color(200, 225, 251));
        lastNameJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        ssnJTextField.setBackground(new java.awt.Color(200, 225, 251));
        ssnJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Doctor Name:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Hospital Name:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Evidence Documents:");
        jLabel7.setToolTipText("");

        doctorJTextField.setBackground(new java.awt.Color(200, 225, 251));
        doctorJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        hospitalJTextField.setBackground(new java.awt.Color(200, 225, 251));
        hospitalJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        iAgreeJCheckBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        iAgreeJCheckBox.setText(" I AGREE");

        dobJTextField.setBackground(new java.awt.Color(200, 225, 251));
        dobJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        backJButton.setBackground(new java.awt.Color(137, 185, 239));
        backJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        submitJButton.setBackground(new java.awt.Color(137, 185, 239));
        submitJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        uploadJButton.setBackground(new java.awt.Color(137, 185, 239));
        uploadJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        uploadJButton.setText("Browse");
        uploadJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadJButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setText("Emergency Search Of Patient");

        jTextArea2.setBackground(new java.awt.Color(200, 225, 251));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("HealthCare Network System reserves the right, in its sole discretion, to  terminate your access to Health network system and to its service. HealthCare Network System also reserves the right to indict according to the criminal law, if found misuse of evidence. You agree that the hospital will be completely liable to the evidence provided. ");
        jTextArea2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/doctorRole/Emergency.jpg"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("* Evidence documents-Image of the patient ,Scanned copy of ssn or Consent letter from the patient.");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Last 4 Digits");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("(MM/DD/YYYY)");

        pathJLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        pathJLabel.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(68, 68, 68))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(68, 68, 68))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(69, 69, 69))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)))
                                .addGap(68, 68, 68)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(hospitalJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doctorJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dobJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ssnJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(uploadJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fileInfoJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iAgreeJCheckBox)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(pathJLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addComponent(jLabel8)))
                .addContainerGap(763, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(firstNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lastNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ssnJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(dobJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doctorJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(hospitalJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uploadJButton))
                        .addGap(4, 4, 4)
                        .addComponent(pathJLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(iAgreeJCheckBox)
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fileInfoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backJButton)
                            .addComponent(submitJButton))))
                .addGap(32, 32, 32)
                .addComponent(jLabel10)
                .addContainerGap(557, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void uploadJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadJButtonActionPerformed
        // TODO add your handling code here:
         int o = jFileChooser1.showOpenDialog(this);
        if(o== JFileChooser.APPROVE_OPTION){
            image = jFileChooser1.getSelectedFile();
        }
       pathJLabel.setText("Uploaded " + image.getAbsolutePath());
    }//GEN-LAST:event_uploadJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        // TODO add your handling code here:
        
        String firstName = firstNameJTextField.getText();
        String lastName = lastNameJTextField.getText();
        String ssn = ssnJTextField.getText();
        String dobString = dobJTextField.getText();
        String hospital = hospitalJTextField.getText();
        String doctor = doctorJTextField.getText();
        boolean iAgree = iAgreeJCheckBox.isSelected();
        if(firstName.isEmpty() || lastName.isEmpty() || ssn.isEmpty() || dobString.isEmpty() || hospital.isEmpty() || doctor.isEmpty()  ){
            JOptionPane.showMessageDialog(null, "Enter values");
            return;
        }
        if(!iAgree ){
             JOptionPane.showMessageDialog(null, "Select I Agree to confirm.");
            return;
        }
        if(image == null ){
             JOptionPane.showMessageDialog(null, "Please provide the evidence.");
            return;
        }
        if(!ValidationUtil.isValidSSN(ssn)){
            JOptionPane.showMessageDialog(null, "Enter last 4 digits of SSN.");
            return;
        }  
        if(!ValidationUtil.isValidDate(dobString)){
            JOptionPane.showMessageDialog(null, "Enter valid date in MM/DD/YYYY format.");
            return;
        }
        //Add the patient , if he is not in the hospital
        String uniqueCode = ValidationUtil.generateUniqueCode1(firstName, lastName, ssn, dobString);
        boolean patientNotPresent = true;
        Patient patient = null;
        for(Patient p : ((HospitalEnterprise)enterprise).getPatientDirectory().getPatientsList()){
            String tempUniqueCode = ValidationUtil.generateUniqueCode(p.getFirstName(), p.getLastName(), p.getSsn(), p.getDateOfBirth());
            if(tempUniqueCode.equals(uniqueCode)){
                patientNotPresent = false;
               patient = p;
            }
        }
        if(patientNotPresent){
           patient = ((HospitalEnterprise)enterprise).getPatientDirectory().AddPatient();
           patient.setFirstName(firstName);
           patient.setLastName(lastName);
           patient.setSsn(ssn);
           patient.setDateOfBirth(ValidationUtil.parseDate(dobString));
        }
            
        
        //Create an emergency request and assign it to sysadmin
        EmergencyRequest er = new EmergencyRequest();
        er.setFirstName(firstName);
        er.setLastName(lastName);
        er.setSsn(ssn);
        er.setDob(ValidationUtil.parseDate(dobString));
        er.setHospitalName(hospital);
        er.setSender(userAccount);
        er.setMessage("Emergency Request");
        er.setImage(image);
        er.setStatus("Pending");
        er.setUniqueCode(uniqueCode);
        er.setPatientOfHospital(patient);
        system.getWorkQueue().getWorkRequestList().add(er);
        userAccount.getWorkQueue().getWorkRequestList().add(er);
        JOptionPane.showMessageDialog(null, "Successfully submitted the request");
        
        clearFields();
       
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void clearFields(){
        firstNameJTextField.setText("");
        lastNameJTextField.setText("");
        ssnJTextField.setText("");
        dobJTextField.setText("");
        hospitalJTextField.setText("");
        doctorJTextField.setText("");
         fileInfoJLabel.setText("");
        
    }
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField dobJTextField;
    private javax.swing.JTextField doctorJTextField;
    private javax.swing.JLabel fileInfoJLabel;
    private javax.swing.JTextField firstNameJTextField;
    private javax.swing.JTextField hospitalJTextField;
    private javax.swing.JCheckBox iAgreeJCheckBox;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField lastNameJTextField;
    private javax.swing.JLabel pathJLabel;
    private javax.swing.JTextField ssnJTextField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JButton uploadJButton;
    // End of variables declaration//GEN-END:variables
}