package com.ridehailing;


public class Auto extends Vehicle implements GPS {
    private double meterCharge = 3.0;
    private String currentLocation;
    
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Market";
    }
    
    @Override
    public double calculateFare(double distance) {
        return meterCharge + (distance * getRatePerKm());
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}