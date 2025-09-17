package com.fooddelivery;

public class VegItem extends FoodItem implements Discountable {
    private double discountPercentage = 0;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double basePrice = getPrice() * getQuantity();
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
