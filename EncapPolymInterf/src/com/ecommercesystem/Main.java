package com.ecommercesystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void printFinalPrice(List<Product> products) {
        for (Product product : products) {
            double price = product.getPrice();
            double discount = product.calculateDiscount();
            double tax = 0.0;

            System.out.println("Product: " + product.getName());
            System.out.printf("Original Price: $%.2f%n", price);
            System.out.printf("Discount: -$%.2f%n", discount);

            if (product instanceof Taxable) {
                Taxable taxableProduct = (Taxable) product;
                tax = taxableProduct.calculateTax();
                System.out.printf("Tax (%s): +$%.2f%n", taxableProduct.getTaxDetails(), tax);
            } else {
                 System.out.println("Tax: $0.00 (Not Applicable)");
            }
            
            double finalPrice = price - discount + tax;
            System.out.printf("Final Price: $%.2f%n", finalPrice);
            System.out.println("-------------------------");
        }
    }

    public static void main(String[] args) {
        List<Product> shoppingCart = new ArrayList<>();
        
        shoppingCart.add(new Electronics(1, "Smartphone", 1000.00));
        shoppingCart.add(new Clothing(2, "T-Shirt", 25.00));
        shoppingCart.add(new Groceries(3, "Apples", 5.00));

        printFinalPrice(shoppingCart);
    }
}