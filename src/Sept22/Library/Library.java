package Sept22.Library;

import java.util.ArrayList;
import java.util.Objects;

public class Library {
    ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void displayAllBookTitles() {
        for (Book b : books) {
            System.out.println(b.title);
        }
    }

    public void borrowByTitle(String title) {
        for (Book b : books) {
            if (Objects.equals(b.title, title)) {
                if (b.isAvailable) {
                    b.borrow();
                    System.out.println("Book " + b.title + " has been borrowed.");
                } else {
                    System.out.println("Book " + b.title + " has already been borrowed.");
                }
            }
        }
        System.out.println("Book " + title + " not found");
    }

    public void returnByTitle(String title) {
        for (Book b : books) {
            if (Objects.equals(b.title, title)) {
                if (!b.isAvailable) {
                    b.returnBook();
                    System.out.println("Book " + b.title + " has been returned.");
                } else {
                    System.out.println("Book " + b.title + " has not been borrowed.");
                }
            }
        }
        System.out.println("Book " + title + " not found");
    }
}
