class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookInfo() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    private String format;

    public EBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    public void displayEBookInfo() {
        System.out.println("--- EBook Details ---");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
        System.out.println("Format: " + format);
    }
}

public class BookLibrary {
    public static void main(String[] args) {
        Book book = new Book("978-0321765723", "The C++ Programming Language", "Bjarne Stroustrup");
        System.out.println("--- Book Details ---");
        book.displayBookInfo();
        book.setAuthor("B. Stroustrup");
        System.out.println("Updated Author: " + book.getAuthor());
        System.out.println();

        EBook ebook = new EBook("978-0134685991", "Effective Java", "Joshua Bloch", "PDF");
        ebook.displayEBookInfo();
    }
}
