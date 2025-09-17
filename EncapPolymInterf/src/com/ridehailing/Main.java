package com.ridehailing;


import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void bookRide(Vehicle vehicle, double distance) {
        System.out.println("Booking a ride...");
        vehicle.getVehicleDetails();
        double fare = vehicle.calculateFare(distance);
        System.out.printf("Calculated fare for a %.1f Km trip: $%.2f%n", distance, fare);
        if (vehicle instanceof GPS) {
            System.out.println("Current Location: " + ((GPS) vehicle).getCurrentLocation());
        }
        System.out.println("==================================");
    }
    
    public static void main(String[] args) {
        List<Vehicle> availableVehicles = new ArrayList<>();
        
        availableVehicles.add(new Car("C-101", "John", 1.5));
        availableVehicles.add(new Bike("B-202", "Mike", 0.8));
        availableVehicles.add(new Auto("A-303", "Raj", 1.2));

        double tripDistance = 10.0;
        
        for (Vehicle vehicle : availableVehicles) {
            bookRide(vehicle, tripDistance);
        }
    }
}