package com.vehiclerentalsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        
        Car car = new Car("CAR-001", 60.00);
        car.setInsurancePolicy("POL-C-123");
        
        Bike bike = new Bike("BIKE-007", 25.00);
        bike.setInsurancePolicy("POL-B-456");

        Truck truck = new Truck("TRK-003", 150.00);
        truck.setInsurancePolicy("POL-T-789");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);
        
        int rentalDays = 5;

        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            System.out.printf("Total Rental Cost for %d days: $%.2f%n", rentalDays, rentalCost);

            if (vehicle instanceof Insurable) {
                Insurable insurableVehicle = (Insurable) vehicle;
                System.out.println("Insurance Details: " + insurableVehicle.getInsuranceDetails());
            }
            System.out.println("----------------------------------------");
        }
    }
}