/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ambulance.management.gui;


public class PatientSession {
    private static PatientSession instance;
    private int patientId;
    private String username;
    private String name;

    // Private constructor to enforce singleton
    private PatientSession() {}

    // Singleton instance getter
    public static PatientSession getInstance() {
        if (instance == null) {
            instance = new PatientSession();
        }
        return instance;
    }

    // Getters and setters
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method to clear session on logout
    public void clearSession() {
        patientId = 0;
        username = null;
        name = null;
    }
}
