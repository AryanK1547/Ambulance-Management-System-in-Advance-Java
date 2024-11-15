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

        PatientSignInPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnJumpLogin = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtSignInUsername = new javax.swing.JTextField();
        txtSignInPassword = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        cbPatientGender = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtSignInAge = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtSignInDesp = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cbPatientNearestLandmark = new javax.swing.JComboBox<>();
        txtContactInfo = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        cbPatientAmbulanceType = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtSignInAddress = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel12.setText("Already have an account ?");

        btnJumpLogin.setBackground(new java.awt.Color(0, 204, 51));
        btnJumpLogin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnJumpLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnJumpLogin.setText("Log-In");
        btnJumpLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJumpLoginActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel13.setText("Sign-In");

        lblUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUsername.setText("Set Username");

        txtSignInUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtSignInPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPassword.setText("Set Password");

        btnSignUp.setBackground(new java.awt.Color(0, 153, 153));
        btnSignUp.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("Sign-Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Patient Name");

        txtPatientName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cbPatientGender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbPatientGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Gender");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Age");

        txtSignInAge.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtSignInDesp.setColumns(20);
        txtSignInDesp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSignInDesp.setRows(5);
        jScrollPane4.setViewportView(txtSignInDesp);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Condition Discription: ");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Location ");

        cbPatientNearestLandmark.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbPatientNearestLandmark.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Central Hospital", "North Wing Health Center", "East District Hospital", "West Side Clinic", "South Regional Hospital" }));
        cbPatientNearestLandmark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPatientNearestLandmarkActionPerformed(evt);
            }
        });

        txtContactInfo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtContactInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactInfoActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Contact Info");

        cbPatientAmbulanceType.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbPatientAmbulanceType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basic Life Support (BLS)", "Advanced Life Support (ALS)", "Patient Transport Vehicle (PTV)", "Neonatal Ambulance", "Air Ambulance" }));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("Type Of Ambulance");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Address :");

        txtSignInAddress.setColumns(20);
        txtSignInAddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSignInAddress.setRows(5);
        jScrollPane5.setViewportView(txtSignInAddress);

        javax.swing.GroupLayout PatientSignInPanelLayout = new javax.swing.GroupLayout(PatientSignInPanel);
        PatientSignInPanel.setLayout(PatientSignInPanelLayout);
        PatientSignInPanelLayout.setHorizontalGroup(
            PatientSignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PatientSignInPanelLayout.createSequentialGroup()
                .addGroup(PatientSignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PatientSignInPanelLayout.createSequentialGroup()
                        .addGap(411, 411, 411)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(448, 448, 448))
                    .addGroup(PatientSignInPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PatientSignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(PatientSignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PatientSignInPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane5)
                                .addGap(24, 24, 24)
                                .addGroup(PatientSignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PatientSignInPanelLayout.createSequentialGroup()
                                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSignInPassword))
                                    .addGroup(PatientSignInPanelLayout.createSequentialGroup()
                                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSignInUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(5, 5, 5))
                            .addGroup(PatientSignInPanelLayout.createSequentialGroup()
                                .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbPatientGender, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSignInAge, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jLabel19)
                                .addGap(36, 36, 36)
                                .addComponent(txtContactInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE))
                            .addGroup(PatientSignInPanelLayout.createSequentialGroup()
                                .addComponent(cbPatientNearestLandmark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jLabel20)
                                .addGap(45, 45, 45)
                                .addComponent(cbPatientAmbulanceType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(88, 88, 88))
            .addGroup(PatientSignInPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PatientSignInPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PatientSignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PatientSignInPanelLayout.createSequentialGroup()
                        .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(550, 550, 550))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PatientSignInPanelLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(535, 535, 535))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PatientSignInPanelLayout.createSequentialGroup()
                        .addComponent(btnJumpLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(582, 582, 582))))
        );
        PatientSignInPanelLayout.setVerticalGroup(
            PatientSignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PatientSignInPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(PatientSignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PatientSignInPanelLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PatientSignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PatientSignInPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(PatientSignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PatientSignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel16)
                                        .addComponent(txtSignInAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbPatientGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PatientSignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel15)
                                        .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PatientSignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel19)
                                        .addComponent(txtContactInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(PatientSignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbPatientNearestLandmark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel20)
                                    .addComponent(cbPatientAmbulanceType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PatientSignInPanelLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel17)))
                        .addGroup(PatientSignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PatientSignInPanelLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel21)
                                .addGap(30, 30, 30)
                                .addComponent(lblPassword))
                            .addGroup(PatientSignInPanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(PatientSignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblUsername)
                                    .addComponent(txtSignInUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(txtSignInPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(btnSignUp)
                .addGap(48, 48, 48)
                .addComponent(jLabel12)
                .addGap(72, 72, 72)
                .addComponent(btnJumpLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PatientSignInPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PatientSignInPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJumpLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJumpLoginActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnJumpLoginActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        savePatientData();
        MainDashboardForm mdb=new MainDashboardForm();
        mdb.setVisible(true);
        
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void cbPatientNearestLandmarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPatientNearestLandmarkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPatientNearestLandmarkActionPerformed

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
    int age = Integer.parseInt(txtSignInAge.getText()); // assuming age is in jTextField1
    String gender = cbPatientGender.getSelectedItem().toString();
    String contactInfo = txtContactInfo.getText();
    String typeOfAmbulance = cbPatientAmbulanceType.getSelectedItem().toString();
    String address = txtSignInAddress.getText();
    String nearest_landmark = cbPatientNearestLandmark.getSelectedItem().toString();
    String conditionDescription = txtSignInDesp.getText();
        String patientUsername = txtSignInUsername.getText();

            String patientPassword = txtSignInPassword.getText();

    

    // SQL insert query
    String query = "INSERT INTO Patient (username,password,name, age, gender, contact_info, type_of_ambulance, address, nearest_landmark, condition_description) VALUES (?,?,?, ?, ?, ?, ?, ?, ?, ?)";

    try (Connection conn = DriverManager.getConnection(url, username, password);
         PreparedStatement stmt = conn.prepareStatement(query)) {

        // Set parameters for the query
        stmt.setString(1, patientUsername);
        stmt.setString(2, patientPassword);
        stmt.setString(3, name);
        stmt.setInt(4, age);
        stmt.setString(5, gender);
        stmt.setString(6, contactInfo);
        stmt.setString(7, typeOfAmbulance);
        stmt.setString(8, address);
        stmt.setString(9, nearest_landmark);
        stmt.setString(10, conditionDescription);

        // Execute the update
        stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "Patient registered successfully!");
        this.dispose();


// After patient registration, you can store their ID:
        int currentPatientId = PatientSession.getInstance().getPatientId();
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

//
//    private void populateAvailableAmbulancesTable() {
//    DefaultTableModel model = (DefaultTableModel) tableAvailableAmbulance.getModel();
//    model.setRowCount(0); // Clear existing rows
//      String url = "jdbc:mysql://localhost:3306/AmbulanceManagementSystem";
//    String username = "root";
//    String password = "mysql";
//    
//    // SQL query to select ambulances based on patient preferences
//    String query = "SELECT ambulance_id, registration_number, driver_name, type, status, location " +
//                   "FROM Ambulance WHERE status = 'Available' AND location = ? AND type = ?";
//    String patientLocation = cbPatientNearestLandmark.getSelectedItem().toString();
//    String patientAmbulanceType= cbPatientAmbulanceType.getSelectedItem().toString();
//    
//    // Assuming we have patient’s location and type from registration
//    try (Connection conn = DriverManager.getConnection(url, username, password);
//         PreparedStatement stmt = conn.prepareStatement(query)) {
//        stmt.setString(1, patientLocation);
//        stmt.setString(2, patientAmbulanceType);
//
//        ResultSet rs = stmt.executeQuery();
//        while (rs.next()) {
//            model.addRow(new Object[]{
//                rs.getString("ambulance_id"),
//                rs.getString("registration_number"),
//                rs.getString("driver_name"),
//                rs.getString("type"),
//                rs.getString("status"),
//                rs.getString("location")
//            });
//        }
//    } catch (SQLException e) {
//        JOptionPane.showMessageDialog(null, "Error loading ambulances: " + e.getMessage());
//    }
//    
//}
//    public void assignAmbulanceToPatient(String contactInfo, String ambulanceId) {
//        int patientId = getPatientIdByContact(contactInfo);
//        
//        if (patientId == -1) {
//            System.out.println("Patient not found.");
//            return;
//        }
//        
//        try {
//            String assignQuery = "INSERT INTO AmbulanceAssignment (patient_id, ambulance_id, status) VALUES (?, ?, ?)";
//            PreparedStatement stmt = connection.prepareStatement(assignQuery);
//            stmt.setInt(1, patientId);  // Use the retrieved patient ID
//            stmt.setString(2, ambulanceId);  // Use selected ambulance ID
//            stmt.setString(3, "Assigned");  // Default status to "Assigned"
//            stmt.executeUpdate();
//            
//            // Update the ambulance status to "Assigned"
//            String updateAmbulanceQuery = "UPDATE Ambulance SET status = 'Assigned' WHERE ambulance_id = ?";
//            PreparedStatement updateStmt = connection.prepareStatement(updateAmbulanceQuery);
//            updateStmt.setString(1, ambulanceId);
//            updateStmt.executeUpdate();
//            
//            System.out.println("Ambulance successfully assigned to patient.");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Method to close the database connection
//    public void closeDBConnection() {
//        try {
//            if (connection != null && !connection.isClosed()) {
//                connection.close();
//                System.out.println("Database connection closed.");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PatientSignInPanel;
    private javax.swing.JButton btnJumpLogin;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JComboBox<String> cbPatientAmbulanceType;
    private javax.swing.JComboBox<String> cbPatientGender;
    private javax.swing.JComboBox<String> cbPatientNearestLandmark;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtContactInfo;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextArea txtSignInAddress;
    private javax.swing.JTextField txtSignInAge;
    private javax.swing.JTextArea txtSignInDesp;
    private javax.swing.JPasswordField txtSignInPassword;
    private javax.swing.JTextField txtSignInUsername;
    // End of variables declaration//GEN-END:variables

//    private void bookAmbulanceForPatient() {
//        
//    // Get the selected row from the available ambulances table
//    int selectedRow = tableAvailableAmbulance.getSelectedRow();
//    
//    if (selectedRow == -1) {
//        // If no row is selected, show a message
//        JOptionPane.showMessageDialog(this, "Please select an ambulance from the table.");
//        return;
//    }
//
//    // Get the ambulance ID from the selected row
//    String ambulanceId = tableAvailableAmbulance.getValueAt(selectedRow, 0).toString();
//
//    // Assuming you already have the patient details, for example:
//    String patientName = txtPatientName.getText();  // Get patient name from the text field
//
//    // SQL query to assign the selected ambulance to the patient
//    String updateAmbulanceQuery = "UPDATE Ambulance SET status = 'Assigned' WHERE ambulance_id = ?";
//    String insertAssignmentQuery = "INSERT INTO PatientAssignments (patient_name, ambulance_id) VALUES (?, ?)";
//
//    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AmbulanceManagementSystem", "root", "mysql");
//         PreparedStatement updateStmt = conn.prepareStatement(updateAmbulanceQuery);
//         PreparedStatement insertStmt = conn.prepareStatement(insertAssignmentQuery)) {
//
//        // Update the ambulance status to 'Assigned'
//        updateStmt.setString(1, ambulanceId);
//        updateStmt.executeUpdate();
//
//        // Insert the assignment of the ambulance to the patient
//        insertStmt.setString(1, patientName);
//        insertStmt.setString(2, ambulanceId);
//        insertStmt.executeUpdate();
//
//        // Show success message
//        JOptionPane.showMessageDialog(this, "Ambulance booked successfully for " + patientName);
//
//        // After booking, refresh the table of available ambulances
//        populateAssignedAmbulancesTable(patientName); // Update table with new assignment
//        populateAvailableAmbulancesTable(); // Refresh the available ambulances table to reflect the status change
//
//    } catch (SQLException e) {
//        JOptionPane.showMessageDialog(this, "Error booking ambulance: " + e.getMessage());
//    }
//}

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


