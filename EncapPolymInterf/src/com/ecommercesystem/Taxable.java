package com.ecommercesystem;

public interface Taxable {
 double GST_RATE_ELECTRONICS = 0.18;
 double GST_RATE_CLOTHING = 0.05;

 double calculateTax();
 String getTaxDetails();
}