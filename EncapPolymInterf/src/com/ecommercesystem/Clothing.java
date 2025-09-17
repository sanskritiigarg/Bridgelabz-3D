package com.ecommercesystem;

public class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;
    }

    @Override
    public double calculateTax() {
        return getPrice() * GST_RATE_CLOTHING;
    }

    @Override
    public String getTaxDetails() {
        return "GST at 5%";
    }
}
