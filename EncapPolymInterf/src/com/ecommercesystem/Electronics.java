package com.ecommercesystem;

public class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        return getPrice() * GST_RATE_ELECTRONICS;
    }

    @Override
    public String getTaxDetails() {
        return "GST at 18%";
    }
}