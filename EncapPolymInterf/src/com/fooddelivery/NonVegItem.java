package com.fooddelivery;

public class NonVegItem extends FoodItem implements Discountable {
    private double packagingCharge = 2.50;
    private double discountPercentage = 0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double basePrice = (getPrice() * getQuantity()) + packagingCharge;
        double discountAmount = basePrice * (discountPercentage / 100);
        return basePrice - discountAmount;
    }

    @Override
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            this.discountPercentage = percentage;
        }
    }

    @Override
    public String getDiscountDetails() {
        return String.format("%.2f%% discount applied.", discountPercentage);
    }
}