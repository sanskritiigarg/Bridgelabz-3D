package com.hospitalmanagement;


import java.util.ArrayList;
import java.util.List;

public class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double ratePerDay;
    private List<String> medicalHistory;

    public InPatient(String patientId, String name, int age, int daysAdmitted, double ratePerDay) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.ratePerDay = ratePerDay;
        this.medicalHistory = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * ratePerDay;
    }

    @Override
    public void addRecord(String record) {
        this.medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + getPatientId() + ":");
        for (String record : medicalHistory) {
            System.out.println("- " + record);
        }
    }
}