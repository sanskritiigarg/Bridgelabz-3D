package com.vehiclerentalsystem;

public interface Insurable {
 double calculateInsurance();
 String getInsuranceDetails();
 void setInsurancePolicy(String policyNumber);
}