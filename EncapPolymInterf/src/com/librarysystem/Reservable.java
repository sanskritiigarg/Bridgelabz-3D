package com.librarysystem;


public interface Reservable {
    void reserveItem(String borrowerId);
    boolean checkAvailability();
    String getBorrowerInfo();
}
