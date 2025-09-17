package com.librarysystem;

public class Book extends LibraryItem implements Reservable {
    private boolean isReserved = false;
    private String borrowerId;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 21;
    }

    @Override
    public void reserveItem(String borrowerId) {
        if (!isReserved) {
            this.borrowerId = borrowerId;
            this.isReserved = true;
            System.out.println("Book '" + getTitle() + "' has been reserved by " + borrowerId);
        } else {
            System.out.println("Sorry, this book is already reserved.");
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