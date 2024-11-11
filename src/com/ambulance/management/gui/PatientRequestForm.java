/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ambulance.management.gui;


import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class PatientRequestForm extends javax.swing.JFrame {
     private int currentPatientId;
     private Connection connection = null;

    /**
     * Creates new form PatientRequestForm
     */
    public PatientRequestForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patientRequestPanel = new javax.swing.JPanel();
        txtPatientName = new javax.swing.JTextField();
        btnRegisterPatient = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        cbPatientAmbulanceType = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtContactInfo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableAvailableAmbulance = new javax.swing.JTable();
        cbPatientGender = new javax.swing.JComboBox<>();
        cbPatientNearestLandmark = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnBookAmbulance = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegisterPatient.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegisterPatient.setText("Find  Ambulance");
        btnRegisterPatient.setActionCommand("btnRegisterPatient");
        btnRegisterPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterPatientActionPerformed(evt);
            }
        });

        cbPatientAmbulanceType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basic Life Support (BLS)", "Advanced Life Support (ALS)", "Patient Transport Vehicle (PTV)", "Neonatal Ambulance", "Air Ambulance" }));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Patient Name");

        jLabel2.setText("Age");

        jLabel5.setText("Location ");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 3, 24)); // NOI18N
        jLabel6.setText("Patient Registration & Assignment");

        jLabel7.setText("Condition Discription: ");

        jLabel8.setText("Gender");

        jLabel9.setText("Contact Info");

        txtContactInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactInfoActionPerformed(evt);
            }
        });

        jLabel10.setText("Type Of Ambulance");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel11.setText("Address :");

        tableAvailableAmbulance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ambulance ID", "Registration Number", "Driver Name", "Type Of Ambulance", "Status", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableAvailableAmbulance);

        cbPatientGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        cbPatientNearestLandmark.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Central Hospital", "North Wing Health Center", "East District Hospital", "West Side Clinic", "South Regional Hospital" }));
        cbPatientNearestLandmark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPatientNearestLandmarkActionPerformed(evt);
            }
        });

        jLabel3.setText("Available Ambulance");

        btnBookAmbulance.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBookAmbulance.setText("Book");
        btnBookAmbulance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAmbulanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout patientRequestPanelLayout = new javax.swing.GroupLayout(patientRequestPanel);
        patientRequestPanel.setLayout(patientRequestPanelLayout);
        patientRequestPanelLayout.setHorizontalGroup(
            patientRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientRequestPanelLayout.createSequentialGroup()
                .addGroup(patientRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patientRequestPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbPatientGender, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(patientRequestPanelLayout.createSequentialGroup()
                        .addGroup(patientRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(patientRequestPanelLayout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(patientRequestPanelLayout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientRequestPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(patientRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientRequestPanelLayout.createSequentialGroup()
                        .addGroup(patientRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(patientRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(patientRequestPanelLayout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addGroup(patientRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(patientRequestPanelLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(patientRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(patientRequestPanelLayout.createSequentialGroup()
                                .addGroup(patientRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addGroup(patientRequestPanelLayout.createSequentialGroup()
                                        .addComponent(cbPatientNearestLandmark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtContactInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbPatientAmbulanceType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(patientRequestPanelLayout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGap(52, 52, 52)
                                        .addComponent(btnRegisterPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(114, 114, 114))
                            .addGroup(patientRequestPanelLayout.createSequentialGroup()
                                .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(patientRequestPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(678, 678, 678))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientRequestPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())))
            .addGroup(patientRequestPanelLayout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(btnBookAmbulance, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        patientRequestPanelLayout.setVerticalGroup(
            patientRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientRequestPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(patientRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patientRequestPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(patientRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPatientGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(patientRequestPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(patientRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(18, 18, 18)
                .addGroup(patientRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(patientRequestPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(patientRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtContactInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPatientNearestLandmark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(patientRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patientRequestPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(patientRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(patientRequestPanelLayout.createSequentialGroup()
                                .addGroup(patientRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(cbPatientAmbulanceType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addComponent(jLabel11))
                            .addGroup(patientRequestPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(patientRequestPanelLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btnRegisterPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnBookAmbulance, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(patientRequestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(patientRequestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterPatientActionPerformed
        // TODO add your handling code here:
        savePatientData();
        populateAvailableAmbulancesTable();
    
    // Register patient in the database
   // Implement this method to save patient data
    
    // Confirm registratio
    }//GEN-LAST:event_btnRegisterPatientActionPerformed

    private void cbPatientNearestLandmarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPatientNearestLandmarkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPatientNearestLandmarkActionPerformed

    private void btnBookAmbulanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAmbulanceActionPerformed
      // Step 1: Get patient ID using contact information (assuming contactInfo is an integer)
   String contactInfo = txtContactInfo.getText();  // Assuming this is where the contact info is coming from

    // Step 1: Get patient ID using contact information (contact info is a String)
    int patientId = getPatientIdByContact(contactInfo);

    if (patientId == -1) {
        JOptionPane.showMessageDialog(this, "Patient not found with the provided contact info.");
        return;  // Exit the method if the patient is not found
    }

    // Step 2: Retrieve the selected ambulance ID from the JTable
    int selectedRow = tableAvailableAmbulance.getSelectedRow();  // Assuming ambulanceTable is your JTable
    if (selectedRow != -1) {
        String selectedAmbulanceId = (String) tableAvailableAmbulance.getValueAt(selectedRow, 0);  // Column 0 holds Ambulance ID

        if (selectedAmbulanceId != null && !selectedAmbulanceId.isEmpty()) {
            // Step 3: Call the method to assign the ambulance to the patient
            assignAmbulanceToPatient(patientId, selectedAmbulanceId);
        } else {
            JOptionPane.showMessageDialog(this, "No ambulance selected.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select an ambulance.");
    }
       // TODO add your handling code here:
    }//GEN-LAST:event_btnBookAmbulanceActionPerformed

    private void txtContactInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactInfoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PatientRequestForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientRequestForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientRequestForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientRequestForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientRequestForm().setVisible(true);
            }
        });
        
    }
    
    private void savePatientData() {
       
    // Database connection details
    String url = "jdbc:mysql://localhost:3306/AmbulanceManagementSystem";
    String username = "root";
    String password = "mysql";

    // Get patient data from form fields
    String name = txtPatientName.getText();
    int age = Integer.parseInt(jTextField1.getText()); // assuming age is in jTextField1
    String gender = cbPatientGender.getSelectedItem().toString();
    String contactInfo = txtContactInfo.getText();
    String typeOfAmbulance = cbPatientAmbulanceType.getSelectedItem().toString();
    String address = jTextArea1.getText();
    String nearest_landmark = cbPatientNearestLandmark.getSelectedItem().toString();
    String conditionDescription = jTextArea2.getText();

    // SQL insert query
    String query = "INSERT INTO Patient (name, age, gender, contact_info, type_of_ambulance, address, nearest_landmark, condition_description) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    try (Connection conn = DriverManager.getConnection(url, username, password);
         PreparedStatement stmt = conn.prepareStatement(query)) {

        // Set parameters for the query
        stmt.setString(1, name);
        stmt.setInt(2, age);
        stmt.setString(3, gender);
        stmt.setString(4, contactInfo);
        stmt.setString(5, typeOfAmbulance);
        stmt.setString(6, address);
        stmt.setString(7, nearest_landmark);
        stmt.setString(8, conditionDescription);

        // Execute the update
        stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "Patient registered successfully!");


// After patient registration, you can store their ID:
        currentPatientId = getPatientIdByContact(contactInfo);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error registering patient: " + e.getMessage());
    }
    
}
   private int getPatientIdByContact(String contactInfo) {
  
    int patientId = -1;  // Default value if patient not found

    String url = "jdbc:mysql://localhost:3306/AmbulanceManagementSystem";
    String username = "root";
    String password = "mysql";
    String query = "SELECT patient_id FROM Patient WHERE contact_info = ?";

    try (Connection conn = DriverManager.getConnection(url, username, password);
         PreparedStatement stmt = conn.prepareStatement(query)) {
        stmt.setString(1, contactInfo);  // Set the contact info parameter

        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            patientId = rs.getInt("patient_id");  // Fetch the patient_id as an integer
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error retrieving patient ID: " + e.getMessage());
    }

    return patientId;  // Return the patient ID or -1 if not found
}


    private void populateAvailableAmbulancesTable() {
    DefaultTableModel model = (DefaultTableModel) tableAvailableAmbulance.getModel();
    model.setRowCount(0); // Clear existing rows
      String url = "jdbc:mysql://localhost:3306/AmbulanceManagementSystem";
    String username = "root";
    String password = "mysql";
    
    // SQL query to select ambulances based on patient preferences
    String query = "SELECT ambulance_id, registration_number, driver_name, type, status, location " +
                   "FROM Ambulance WHERE status = 'Available' AND location = ? AND type = ?";
    String patientLocation = cbPatientNearestLandmark.getSelectedItem().toString();
    String patientAmbulanceType= cbPatientAmbulanceType.getSelectedItem().toString();
    
    // Assuming we have patient’s location and type from registration
    try (Connection conn = DriverManager.getConnection(url, username, password);
         PreparedStatement stmt = conn.prepareStatement(query)) {
        stmt.setString(1, patientLocation);
        stmt.setString(2, patientAmbulanceType);

        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("ambulance_id"),
                rs.getString("registration_number"),
                rs.getString("driver_name"),
                rs.getString("type"),
                rs.getString("status"),
                rs.getString("location")
            });
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error loading ambulances: " + e.getMessage());
    }
    
}
    public void assignAmbulanceToPatient(String contactInfo, String ambulanceId) {
        int patientId = getPatientIdByContact(contactInfo);
        
        if (patientId == -1) {
            System.out.println("Patient not found.");
            return;
        }
        
        try {
            String assignQuery = "INSERT INTO AmbulanceAssignment (patient_id, ambulance_id, status) VALUES (?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(assignQuery);
            stmt.setInt(1, patientId);  // Use the retrieved patient ID
            stmt.setString(2, ambulanceId);  // Use selected ambulance ID
            stmt.setString(3, "Assigned");  // Default status to "Assigned"
            stmt.executeUpdate();
            
            // Update the ambulance status to "Assigned"
            String updateAmbulanceQuery = "UPDATE Ambulance SET status = 'Assigned' WHERE ambulance_id = ?";
            PreparedStatement updateStmt = connection.prepareStatement(updateAmbulanceQuery);
            updateStmt.setString(1, ambulanceId);
            updateStmt.executeUpdate();
            
            System.out.println("Ambulance successfully assigned to patient.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to close the database connection
    public void closeDBConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Database connection closed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookAmbulance;
    private javax.swing.JButton btnRegisterPatient;
    private javax.swing.JComboBox<String> cbPatientAmbulanceType;
    private javax.swing.JComboBox<String> cbPatientGender;
    private javax.swing.JComboBox<String> cbPatientNearestLandmark;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel patientRequestPanel;
    private javax.swing.JTable tableAvailableAmbulance;
    private javax.swing.JTextField txtContactInfo;
    private javax.swing.JTextField txtPatientName;
    // End of variables declaration//GEN-END:variables

    private void bookAmbulanceForPatient() {
        
    // Get the selected row from the available ambulances table
    int selectedRow = tableAvailableAmbulance.getSelectedRow();
    
    if (selectedRow == -1) {
        // If no row is selected, show a message
        JOptionPane.showMessageDialog(this, "Please select an ambulance from the table.");
        return;
    }

    // Get the ambulance ID from the selected row
    String ambulanceId = tableAvailableAmbulance.getValueAt(selectedRow, 0).toString();

    // Assuming you already have the patient details, for example:
    String patientName = txtPatientName.getText();  // Get patient name from the text field

    // SQL query to assign the selected ambulance to the patient
    String updateAmbulanceQuery = "UPDATE Ambulance SET status = 'Assigned' WHERE ambulance_id = ?";
    String insertAssignmentQuery = "INSERT INTO PatientAssignments (patient_name, ambulance_id) VALUES (?, ?)";

    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AmbulanceManagementSystem", "root", "mysql");
         PreparedStatement updateStmt = conn.prepareStatement(updateAmbulanceQuery);
         PreparedStatement insertStmt = conn.prepareStatement(insertAssignmentQuery)) {

        // Update the ambulance status to 'Assigned'
        updateStmt.setString(1, ambulanceId);
        updateStmt.executeUpdate();

        // Insert the assignment of the ambulance to the patient
        insertStmt.setString(1, patientName);
        insertStmt.setString(2, ambulanceId);
        insertStmt.executeUpdate();

        // Show success message
        JOptionPane.showMessageDialog(this, "Ambulance booked successfully for " + patientName);

        // After booking, refresh the table of available ambulances
        populateAssignedAmbulancesTable(patientName); // Update table with new assignment
        populateAvailableAmbulancesTable(); // Refresh the available ambulances table to reflect the status change

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error booking ambulance: " + e.getMessage());
    }
}

    private void populateAssignedAmbulancesTable(String patientName) {
        // Method to populate the assigned ambulances table for the patient

//    DefaultTableModel model = new DefaultTableModel();
//    model.addColumn("Ambulance ID");
//    model.addColumn("Registration No.");
//    model.addColumn("Type");
//    model.addColumn("Location");
//    model.addColumn("Status");
//
//    // Query to fetch ambulances assigned to the patient
//    String query = "SELECT a.ambulance_id, a.registration_number, a.type, a.location, a.status " +
//                   "FROM Ambulance a " +
//                   "JOIN PatientAssignments p ON a.ambulance_id = p.ambulance_id " +
//                   "WHERE p.patient_name = ?";  // Filter by patient name
//
//    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AmbulanceManagementSystem", "root", "mysql");
//         PreparedStatement stmt = conn.prepareStatement(query)) {
//
//        stmt.setString(1, patientName);  // Set patient name parameter
//
//        try (ResultSet rs = stmt.executeQuery()) {
//            // Loop through the result set and add rows to the table model
//            while (rs.next()) {
//                model.addRow(new Object[]{
//                    rs.getString("ambulance_id"),
//                    rs.getString("registration_number"),
//                    rs.getString("type"),
//                    rs.getString("location"),
//                    rs.getString("status")
//                });
//            }
//        }
//    } catch (SQLException e) {
//        JOptionPane.showMessageDialog(this, "Error fetching assigned ambulances: " + e.getMessage());
//    }
//
//    // Set the model to the table
//    assignedAmbulancesTable.setModel(model);
}
    private void assignAmbulanceToPatient(int patientId, String ambulanceId) {
    String url = "jdbc:mysql://localhost:3306/AmbulanceManagementSystem";
    String username = "root";
    String password = "mysql";
    
    // SQL query to insert a new record into the AmbulanceAssignment table
    String query = "INSERT INTO AmbulanceAssignment (patient_id, ambulance_id, assignment_date) VALUES (?, ?, NOW())";
    String updateAmbulanceStatusQuery = "UPDATE Ambulance SET status = 'Assigned' WHERE ambulance_id = ?";
    
    try (Connection conn = DriverManager.getConnection(url, username, password)) {
        // Insert the assignment into AmbulanceAssignment table
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, patientId);  // Set the patient ID
            stmt.setString(2, ambulanceId);  // Set the ambulance ID
            stmt.executeUpdate();  // Execute the insertion
        }

        // Update the status of the ambulance to 'Assigned'
        try (PreparedStatement stmt = conn.prepareStatement(updateAmbulanceStatusQuery)) {
            stmt.setString(1, ambulanceId);  // Set the ambulance ID
            stmt.executeUpdate();  // Execute the update
        }
        
        // Fetch the patient details
        String patientDetailsQuery = "SELECT name, contact_info, type_of_ambulance, address, nearest_landmark FROM Patient WHERE patient_id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(patientDetailsQuery)) {
            stmt.setInt(1, patientId);  // Set the patient ID
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String patientName = rs.getString("name");
                String contactInfo = rs.getString("contact_info");
                String ambulanceType = rs.getString("type_of_ambulance");
                String address = rs.getString("address");
                String nearestLandmark = rs.getString("nearest_landmark");

                // Fetch ambulance details
                String ambulanceDetailsQuery = "SELECT registration_number, driver_name, location FROM Ambulance WHERE ambulance_id = ?";
                try (PreparedStatement stmt2 = conn.prepareStatement(ambulanceDetailsQuery)) {
                    stmt2.setString(1, ambulanceId);
                    ResultSet rs2 = stmt2.executeQuery();
                    if (rs2.next()) {
                        String regNumber = rs2.getString("registration_number");
                        String driverName = rs2.getString("driver_name");
                        String location = rs2.getString("location");

                        // Create the confirmation message
                        String message = "Ambulance Assignment Confirmation:\n\n" +
                                         "Patient Details:\n" +
                                         "Name: " + patientName + "\n" +
                                         "Contact Info: " + contactInfo + "\n" +
                                         "Address: " + address + "\n" +
                                         "Nearest Landmark: " + nearestLandmark + "\n" +
                                         "Ambulance Type: " + ambulanceType + "\n\n" +
                                         "Assigned Ambulance Details:\n" +
                                         "Ambulance ID: " + ambulanceId + "\n" +
                                         "Registration Number: " + regNumber + "\n" +
                                         "Driver Name: " + driverName + "\n" +
                                         "Location: " + location + "\n\n" +
                                         "The ambulance has been successfully assigned to the patient.";

                        // Display the confirmation message
                        JOptionPane.showMessageDialog(this, message);
                    }
                }
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error assigning ambulance: " + e.getMessage());
    }
}

 }


