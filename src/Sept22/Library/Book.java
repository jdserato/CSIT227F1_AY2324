package Sept22.Library;

public class Book {
    String title, author, publisher;
    boolean isAvailable;

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        isAvailable = true;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
    }

    public void  borrow() {
        isAvailable = false;
    }
    public void  returnBook() {
        isAvailable = true;
    }
}
