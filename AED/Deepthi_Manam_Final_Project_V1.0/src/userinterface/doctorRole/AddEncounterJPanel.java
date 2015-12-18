/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.doctorRole;

import business.HealthCareSystem;
import business.drug.Drug;
import business.email.Email;
import business.enterprise.DrugCompanyEnterprise;
import business.enterprise.Enterprise;
import business.enterprise.PharmacyEnterprise;
import business.organization.InventoryManagement;
import business.organization.Organization;
import business.patient.Patient;
import business.patient.encounter.Encounter;
import business.patient.encounter.Medication;
import business.patient.encounter.VitalSign;
import business.useraccount.UserAccount;
import business.workqueue.PrescriptionRequest;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.Document;
import com.lowagie.text.Font;

import java.awt.CardLayout;

import java.awt.Graphics2D;
import java.awt.Shape;
import java.io.FileOutputStream;
import java.security.Security;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.pharmacistRole.OrderDrugsJPanel;


/**
 *
 * @author Deepthi
 */
public class AddEncounterJPanel extends javax.swing.JPanel {

    private HealthCareSystem system;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Patient patient;
    private ArrayList<Medication> medicinesList;
    private ArrayList<Encounter> completeEncounterList;

    /**
     * Creates new form AddEncounterJPanel
     */
    public AddEncounterJPanel( HealthCareSystem system,JPanel userProcessContainer,Enterprise enterprise,UserAccount userAccount, Patient patient,ArrayList<Encounter> completeEncounterList ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.patient = patient;
        this.system = system;
        this.userAccount = userAccount;
        medicinesList = new ArrayList<Medication>();
        this.completeEncounterList = completeEncounterList;
        this.enterprise = enterprise;

        populateDrugCompanyCombobox();
        populatePharmacyCombobox();
        
     //  medicinesJTable.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 18));

    }

    private void populateDrugCompanyCombobox() {
        drugCompanyJComboBox.removeAllItems();
        for (DrugCompanyEnterprise drugCmpy : system.getAllDrugCompanyEnterprisesInNetwork()) {
            drugCompanyJComboBox.addItem(drugCmpy);
        }
    }
    private void populatePharmacyCombobox() {
        pharmacyJComboBox.removeAllItems();
        for (PharmacyEnterprise pharmacyEnterprise : system.getAllPharmacies()) {
            pharmacyJComboBox.addItem(pharmacyEnterprise);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        respiratoryRateJTextField = new javax.swing.JTextField();
        heartRateJTextField = new javax.swing.JTextField();
        bloodPressureJTextField = new javax.swing.JTextField();
        symptomsJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        weightJTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        drugCompanyJComboBox = new javax.swing.JComboBox();
        addDrugJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        medicinesJTable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        diagonizedDiseaseJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        submitJButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        adviceJTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        orderMedicinesJButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        drugJComboBox = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        dosageJSpinner = new javax.swing.JSpinner();
        pharmacyJComboBox = new javax.swing.JComboBox();
        printJButton = new javax.swing.JButton();
        emailJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Enter Encounter Details");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Symptoms:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Respiratory Rate:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Heart Rate:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Blood Pressure:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Weight(pounds):");

        respiratoryRateJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        heartRateJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        bloodPressureJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        symptomsJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Medication:");

        weightJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Select Drug Company:");

        drugCompanyJComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        drugCompanyJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        drugCompanyJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugCompanyJComboBoxActionPerformed(evt);
            }
        });

        addDrugJButton.setBackground(new java.awt.Color(137, 185, 239));
        addDrugJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addDrugJButton.setText("Add Drug");
        addDrugJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDrugJButtonActionPerformed(evt);
            }
        });

        medicinesJTable.setBackground(new java.awt.Color(221, 222, 223));
        medicinesJTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        medicinesJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug Name", "Drug Company", "Usage Directions", "Ingredients", "Dosage"
            }
        ));
        jScrollPane2.setViewportView(medicinesJTable);
        if (medicinesJTable.getColumnModel().getColumnCount() > 0) {
            medicinesJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Diagonized Problem :");

        diagonizedDiseaseJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        backJButton.setBackground(new java.awt.Color(137, 185, 239));
        backJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backJButton.setText("<<Back");
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

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Advice:");

        adviceJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Preferred Pharmacy :");

        orderMedicinesJButton.setBackground(new java.awt.Color(137, 185, 239));
        orderMedicinesJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orderMedicinesJButton.setText("Order Medication");
        orderMedicinesJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderMedicinesJButtonActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Select Drug :");

        drugJComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        drugJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Dosage :");

        dosageJSpinner.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dosageJSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        pharmacyJComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pharmacyJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        printJButton.setBackground(new java.awt.Color(137, 185, 239));
        printJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        printJButton.setText("Print Medication");
        printJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printJButtonActionPerformed(evt);
            }
        });

        emailJButton.setBackground(new java.awt.Color(137, 185, 239));
        emailJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emailJButton.setText("Email Precautions");
        emailJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(orderMedicinesJButton)
                        .addGap(27, 27, 27)
                        .addComponent(printJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adviceJTextField)
                            .addComponent(diagonizedDiseaseJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(emailJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(33, 33, 33))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(79, 79, 79)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(respiratoryRateJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(symptomsJTextField)))
                        .addComponent(heartRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(35, 35, 35)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bloodPressureJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(weightJTextField))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(drugCompanyJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(drugJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dosageJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(addDrugJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(pharmacyJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel2))
                .addContainerGap(708, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(symptomsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(respiratoryRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heartRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(bloodPressureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(weightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(drugCompanyJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(drugJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(dosageJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDrugJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(pharmacyJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderMedicinesJButton)
                    .addComponent(printJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(diagonizedDiseaseJTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(adviceJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailJButton))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitJButton)
                    .addComponent(backJButton))
                .addContainerGap(206, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        // TODO add your handling code here:
        //Get the data from UI
        String symptoms = symptomsJTextField.getText();
        String heartRateString = heartRateJTextField.getText();
        String respiratoryRateString = respiratoryRateJTextField.getText();
        String bloodPressureString = bloodPressureJTextField.getText();
        String weightString = weightJTextField.getText();
        String diagonizedDisease = diagonizedDiseaseJTextField.getText();
        String advice = adviceJTextField.getText();
        
        if(symptoms.isEmpty() || heartRateString.isEmpty() || respiratoryRateString.isEmpty() || bloodPressureString.isEmpty() || weightString.isEmpty() || diagonizedDisease.isEmpty() || advice.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Enter values");
                    return;

        }
        int heartRate = 0;
        int respiratoryRate = 0;
        float bloodPressure =0;
         float weight;
        try{
              heartRate = Integer.parseInt(heartRateJTextField.getText());
               respiratoryRate = Integer.parseInt(respiratoryRateJTextField.getText());
                bloodPressure = Float.parseFloat(bloodPressureJTextField.getText());
                 weight = Float.parseFloat(weightJTextField.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Enter valid values");
                    return;
        }
        

        //Add the current encounter to  patient of the current hospital.
        Encounter e = patient.getEncounterHistory().addEncounter();
        e.setSymptoms(symptoms);
        e.setDiagonizedDisease(diagonizedDisease);
        e.setAdvice(advice);
        e.setHospitalName(enterprise.getName());
        e.setDoctorName(userAccount.getPerson().getFirstName());
        e.setHospitalLocation(enterprise.getLocation());
        VitalSign vs = e.getVitalSign();
        vs.setHeartRate(heartRate);
        vs.setRespiratoryRate(respiratoryRate);
        vs.setSystolicBloodPressure(bloodPressure);
        vs.setWeight(weight);
        //Set the medicines given by doctor
        e.setMedicationList(medicinesList);
        completeEncounterList.add(e);
       
        
       
        JOptionPane.showMessageDialog(null, "Created Encounter");
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void drugCompanyJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugCompanyJComboBoxActionPerformed
        // TODO add your handling code here:
        drugJComboBox.removeAllItems();
        DrugCompanyEnterprise drugCmpy = (DrugCompanyEnterprise)drugCompanyJComboBox.getSelectedItem();
        if(drugCmpy != null){
          for(Drug drug : drugCmpy.getDrugCatalogue().getDrugsList()){
              if(drug.isIsRemApproved())
              drugJComboBox.addItem(drug);
          }
        }
    }//GEN-LAST:event_drugCompanyJComboBoxActionPerformed

    private void addDrugJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDrugJButtonActionPerformed
     
        DrugCompanyEnterprise drugCompanyEnterprise = (DrugCompanyEnterprise)drugCompanyJComboBox.getSelectedItem();
        Drug drug = (Drug)drugJComboBox.getSelectedItem();
        int dosage = (Integer)dosageJSpinner.getValue();
        
        DefaultTableModel model = (DefaultTableModel)medicinesJTable.getModel();

        Object[] row = new Object[5];
        row[0] = drug;
        row[1] = drugCompanyEnterprise.getName();
        row[2] = drug.getUsageDirections();
        row[3] = drug.getWarnings();
        row[4] = dosage;
        
        model.addRow(row);
        
        //add medicines to medicinelist
        Medication medication = new Medication();
        medication.setDrug(drug);
        medication.setDosage(dosage);
        medicinesList.add(medication);
        
        
        
        
    }//GEN-LAST:event_addDrugJButtonActionPerformed

    private void orderMedicinesJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderMedicinesJButtonActionPerformed
        // TODO add your handling code here:
        int noOfMedicines = medicinesList.size();
        if (noOfMedicines == 0) {
            JOptionPane.showMessageDialog(null, "No medicines prescribed");
            return;
        }

        PrescriptionRequest pr = new PrescriptionRequest();
        pr.setStatus("Pending");
        pr.setPatient(patient);
        pr.setMessage("Prescription Order");
        pr.setSender(userAccount);
        pr.setSenderHospital(enterprise.getName());
        pr.setMedicinesList(medicinesList);
        pr.setSenderHospitalAddress(enterprise.getLocation());

        PharmacyEnterprise pharmacyEnterprise = (PharmacyEnterprise) pharmacyJComboBox.getSelectedItem();
        if (pharmacyEnterprise != null) {
            for (Organization organization : pharmacyEnterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof InventoryManagement) {
                    organization.getWorkQueue().getWorkRequestList().add(pr);
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Successfully submitted the order to pharmacy");


    }//GEN-LAST:event_orderMedicinesJButtonActionPerformed

    private void printJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printJButtonActionPerformed
        // TODO add your handling code here:
        
         Document document = new Document();
            try {
                JOptionPane.showMessageDialog(null, "Prescription printed");
            PdfWriter writer = PdfWriter.getInstance(document, 
                new FileOutputStream("Prescription.pdf"));
            document.open();
            document.addTitle("Medical Prescription");
          //  document.addAuthor(staff.getPerson().getFirstName()+" "+staff.getPerson().getLastName());
            Paragraph p = new Paragraph("Medicines Prescribed");
            
            document.add(p);
            PdfContentByte cb = writer.getDirectContent();
            cb.saveState();
            Graphics2D g2 = cb.createGraphicsShapes(800, 500);
            Shape oldClip = g2.getClip();
            g2.clipRect(0, 0, 800, 500);
            Font font = new Font();
            font.setSize(0.5f);
            
            
            medicinesJTable.print(g2);
            g2.setClip(oldClip);
            g2.dispose();
            cb.restoreState();
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error creating file");
            }

            document.close();
    }//GEN-LAST:event_printJButtonActionPerformed

    private void emailJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailJButtonActionPerformed
        // TODO add your handling code here:
        String mailtoEmail = JOptionPane.showInputDialog("ENTER THE RECEPIENT'S MAIL ID");
        String subject = JOptionPane.showInputDialog("ENTER THE SUBJECT");
       String  message = JOptionPane.showInputDialog("ENTER THE MESSAGE");
        Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());

        try {
            new Email().sendSSLMessage(mailtoEmail, subject, adviceJTextField.getText(), mailtoEmail);
        } catch (Exception ex) {
            Logger.getLogger(OrderDrugsJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Successfully mailed the precautions to patient");
    }//GEN-LAST:event_emailJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDrugJButton;
    private javax.swing.JTextField adviceJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField bloodPressureJTextField;
    private javax.swing.JTextField diagonizedDiseaseJTextField;
    private javax.swing.JSpinner dosageJSpinner;
    private javax.swing.JComboBox drugCompanyJComboBox;
    private javax.swing.JComboBox drugJComboBox;
    private javax.swing.JButton emailJButton;
    private javax.swing.JTextField heartRateJTextField;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable medicinesJTable;
    private javax.swing.JButton orderMedicinesJButton;
    private javax.swing.JComboBox pharmacyJComboBox;
    private javax.swing.JButton printJButton;
    private javax.swing.JTextField respiratoryRateJTextField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField symptomsJTextField;
    private javax.swing.JTextField weightJTextField;
    // End of variables declaration//GEN-END:variables
}
