package com.hospitalmanagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        
        InPatient inPatient = new InPatient("INP-001", "Alice", 45, 5, 500);
        inPatient.addRecord("Diagnosed with pneumonia.");
        inPatient.addRecord("Prescribed antibiotics.");

        OutPatient outPatient = new OutPatient("OUT-002", "Bob", 30, 75);
        outPatient.addRecord("Routine check-up. All clear.");

        patients.add(inPatient);
        patients.add(outPatient);

        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.printf("Total Bill: $%.2f%n", patient.calculateBill());
            
            if (patient instanceof MedicalRecord) {
                ((MedicalRecord) patient).viewRecords();
            }
            System.out.println("--------------------------------");
        }
    }
}