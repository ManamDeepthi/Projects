/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.patientRole;

import business.HealthCareSystem;
import business.drug.Drug;
import business.enterprise.DrugCompanyEnterprise;
import business.enterprise.HospitalEnterprise;
import business.organization.DoctorOrganization;
import business.organization.Organization;
import business.patient.Patient;
import business.patient.adverseevents.AdverseEvent;
import business.person.Person;
import business.useraccount.UserAccount;
import business.validation.ValidationUtil;
import business.workqueue.AdverseEventRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Deepthi
 */
public class AdverseEventJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;     
    private HealthCareSystem system;
    private UserAccount userAccount;
    /**
     * Creates new form AdverseEventJPanel
     */
    public AdverseEventJPanel(JPanel userProcessContainer,HealthCareSystem system,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        populateHospitalComboBox();
        populateDrugManufacturersComboBox();
        
    }
    private void populateHospitalComboBox(){
        hospitalJComboBox.removeAllItems();
        ArrayList<HospitalEnterprise> hospitalsList = system.getAllHospitals();
        for(HospitalEnterprise hospital : hospitalsList){
            hospitalJComboBox.addItem(hospital);
        }
    }
    
   
    
    private void populateDrugManufacturersComboBox(){
        drugManfJComboBox.removeAllItems();
        ArrayList<DrugCompanyEnterprise> drugCmpyList = system.getAllDrugCompanyEnterprisesInNetwork();
        for(DrugCompanyEnterprise drugCmpy : drugCmpyList){
            drugManfJComboBox.addItem(drugCmpy);
        }
    }
    
    private void populateDrugComboBox(DrugCompanyEnterprise drugCompanyEnterprise){
        drugJComboBox.removeAllItems();
        for(Drug drug : drugCompanyEnterprise.getDrugCatalogue().getDrugsList()){
            if(drug.isIsRemApproved()){
            drugJComboBox.addItem(drug);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hospitalJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        drugManfJComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        drugJComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        adverseEffectJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        reportJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Report An Adverse Event To Doctor");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Report to a doctor in hospital :");

        hospitalJComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hospitalJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Select the Drug Manufacturer:");

        drugManfJComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        drugManfJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        drugManfJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugManfJComboBoxActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Select the drug :");

        drugJComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        drugJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Adverse Effect:");

        adverseEffectJTextField.setBackground(new java.awt.Color(204, 224, 253));
        adverseEffectJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        backJButton.setBackground(new java.awt.Color(137, 185, 239));
        backJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        reportJButton.setBackground(new java.awt.Color(137, 185, 239));
        reportJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        reportJButton.setText("Report ");
        reportJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(527, 527, 527)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hospitalJComboBox, 0, 264, Short.MAX_VALUE)
                            .addComponent(drugManfJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(drugJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adverseEffectJTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(reportJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(478, 660, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(hospitalJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(drugManfJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(drugJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adverseEffectJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backJButton)
                            .addComponent(reportJButton))
                        .addGap(246, 246, 246))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void drugManfJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugManfJComboBoxActionPerformed
        // TODO add your handling code here:
        DrugCompanyEnterprise drugCompanyEnterprise = (DrugCompanyEnterprise)drugManfJComboBox.getSelectedItem();
        if(drugCompanyEnterprise != null){
            populateDrugComboBox(drugCompanyEnterprise);
        }
    }//GEN-LAST:event_drugManfJComboBoxActionPerformed

    private void reportJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportJButtonActionPerformed
        // TODO add your handling code here:
        HospitalEnterprise  hospital = (HospitalEnterprise)hospitalJComboBox.getSelectedItem();
        DrugCompanyEnterprise drugCmpy = (DrugCompanyEnterprise)drugManfJComboBox.getSelectedItem();
        Drug drug = (Drug)drugJComboBox.getSelectedItem();
        String adverseEffect = adverseEffectJTextField.getText();
        if(hospital == null || drugCmpy == null || drug ==  null || adverseEffect.isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter values");
            return;
        }
        //Work request is sent to the doctors
        for(Organization organization : hospital.getOrganizationDirectory().getOrganizationList()){
            if(organization instanceof DoctorOrganization){
                AdverseEventRequest aer = new AdverseEventRequest();
                aer.setSender(userAccount);
                aer.setDrugCompanyEnterprise(drugCmpy);
                aer.setDrug(drug);
                aer.setAdverseEvent(adverseEffect);
                aer.setAdverseEventId(new Random().nextInt(100) );
                aer.setStatus("Pending");
                organization.getWorkQueue().getWorkRequestList().add(aer);
            }
        }
        
        //add the adverse event to the patient of the corresponding hospital
         Person person = userAccount.getPerson();
                String uniqueCode = ValidationUtil.generateUniqueCode(person.getFirstName(), person.getLastName(), (person.getSsn()).substring(5), person.getDateOfBirth());
        for(Patient patient : hospital.getPatientDirectory().getPatientsList()){
            String uniqueCodeTemp = ValidationUtil.generateUniqueCode(patient.getFirstName(), patient.getLastName(), patient.getSsn(), patient.getDateOfBirth());
            if(uniqueCode.equals(uniqueCodeTemp)){
                AdverseEvent ae = new AdverseEvent();
                ae.setDrug(drug);
                ae.setAdverseEvent(adverseEffect);
                patient.getAdverseEventHistory().getAdverseEventList().add(ae);
            }
        }
        
        JOptionPane.showMessageDialog(null, "Successfully submitted the report.");
    }//GEN-LAST:event_reportJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adverseEffectJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox drugJComboBox;
    private javax.swing.JComboBox drugManfJComboBox;
    private javax.swing.JComboBox hospitalJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton reportJButton;
    // End of variables declaration//GEN-END:variables
}
