package com.vehiclerentalsystem;

public class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.50;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05;
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