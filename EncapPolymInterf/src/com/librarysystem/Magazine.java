package com.librarysystem;


public class Magazine extends LibraryItem implements Reservable {
    private boolean isReserved = false;
    private String borrowerId;
    
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }
    
    @Override
    public void reserveItem(String borrowerId) {
        if (!isReserved) {
            this.borrowerId = borrowerId;
            this.isReserved = true;
            System.out.println("Magazine '" + getTitle() + "' has been reserved by " + borrowerId);
        } else {
            System.out.println("Sorry, this magazine is already reserved.");
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
