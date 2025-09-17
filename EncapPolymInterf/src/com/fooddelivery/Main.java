package com.fooddelivery;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void processOrder(List<FoodItem> order) {
        double grandTotal = 0;
        for (FoodItem item : order) {
            item.getItemDetails();
            if (item instanceof Discountable) {
                System.out.println("Discount Info: " + ((Discountable) item).getDiscountDetails());
            }
            double itemTotal = item.calculateTotalPrice();
            System.out.printf("Item Total Price: $%.2f%n", itemTotal);
            grandTotal += itemTotal;
            System.out.println("................................");
        }
        System.out.printf("GRAND TOTAL FOR THE ORDER: $%.2f%n", grandTotal);
    }

    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        
        VegItem salad = new VegItem("Caesar Salad", 8.00, 2);
        salad.applyDiscount(10);
        
        NonVegItem chickenWings = new NonVegItem("BBQ Chicken Wings", 12.50, 1);
        
        order.add(salad);
        order.add(chickenWings);
        
        processOrder(order);
    }
}