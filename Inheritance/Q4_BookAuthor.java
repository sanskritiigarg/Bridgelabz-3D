class Book {
    String title;
    public Book(String title) { this.title = title; }
}

class Author extends Book {
    String author;
    public Author(String title, String author) {
        super(title);
        this.author = author;
    }
    public void show() {
        System.out.println(title + " written by " + author);
    }
}

public class Q4_BookAuthor {
    public static void main(String[] args) {
        Author a = new Author("Java Programming", "James Gosling");
        a.show();
    }
}
