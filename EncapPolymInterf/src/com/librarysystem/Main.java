package com.librarysystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"));
        items.add(new Magazine("M002", "National Geographic", "Various"));
        items.add(new DVD("D003", "Inception", "Christopher Nolan"));

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            
            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                System.out.println("Availability: " + (reservableItem.checkAvailability() ? "Available" : "Reserved"));
            }
            System.out.println("------------------------------------");
        }
        
        Reservable bookToReserve = (Reservable) items.get(0);
        bookToReserve.reserveItem("USER-123");
        System.out.println("\nAfter reservation attempt:");
        System.out.println("Status of '" + ((LibraryItem)bookToReserve).getTitle() + "': " + bookToReserve.getBorrowerInfo());
    }
}