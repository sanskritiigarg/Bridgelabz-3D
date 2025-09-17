package com.librarysystem;


public class DVD extends LibraryItem implements Reservable {
    private boolean isReserved = false;
    private String borrowerId;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 10;
    }
    
    @Override
    public void reserveItem(String borrowerId) {
        if (!isReserved) {
            this.borrowerId = borrowerId;
            this.isReserved = true;
            System.out.println("DVD '" + getTitle() + "' has been reserved by " + borrowerId);
        } else {
            System.out.println("Sorry, this DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
    
    @Override
    public String getBorrowerInfo() {
        return isReserved ? "Reserved by: " + borrowerId : "Available";
    }
}