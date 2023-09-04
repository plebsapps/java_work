package ch.plebsapps.objectorientierung;

import java.util.ArrayList;
import java.util.List;

public class AssoziationMitKardinalitäten {
    public static void main(String[] args) {
        // Erstellen einer Bibliothek
        Library library = new Library("Stadtbibliothek");

        // Erstellen von Büchern
        Book book1 = new Book("Java for Beginners");
        Book book2 = new Book("Python Programming");

        // Hinzufügen der Bücher zur Bibliothek
        library.addBook(book1);
        library.addBook(book2);

        // Abrufen der Bücher aus der Bibliothek
        List<Book> libraryBooks = library.getBooks();

        // Ausgabe der Buchtitel
        for (Book book : libraryBooks) {
            System.out.println("Buch in der Bibliothek: " + book.getTitle());
        }
    }
}

// Klasse für ein Buch
class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

// Klasse für eine Bibliothek
class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}
