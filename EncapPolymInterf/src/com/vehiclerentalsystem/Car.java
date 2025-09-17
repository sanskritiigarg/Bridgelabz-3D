package com.vehiclerentalsystem;

public class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    
    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.02;
    }

    @Override
    public void setInsurancePolicy(String policyNumber) {
        this.insurancePolicyNumber = policyNumber;
    }
    
    @Override
    public String getInsuranceDetails() {
        return "Policy #" + insurancePolicyNumber + String.format(" | Cost: $%.2f/day", calculateInsurance());
    }
}