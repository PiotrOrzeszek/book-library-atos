package net.atos.tests;

import net.atos.Book;
import net.atos.Library;
import org.junit.Test;

public class LibraryTest {

        @Test
        public void sampleLibraryTest() {
            net.atos.tests.LibraryTest myUnit = new net.atos.tests.LibraryTest();

            System.out.println("Book Library example implementation for Atos. Library class test starting...");

            System.out.println("Creating library...");
            Library library = new Library("The Library of Congress", "101 Independence Ave SE, Washington, DC 20540" );

            library.showBanner();
            System.out.println("Creating books...");

            Book book1 = new Book("Cay S. Horstmann", "Core Java Volume I – Fundamentals", 2018);
            Book book2 = new Book("Joshua Bloch", "Effective Java", 2017);
            Book book3 = new Book("Herbert Schildt", "Java: A Beginner’s Guide", 2018);

            System.out.println("Adding books to library...");
            library.addBook(book1);
            library.addBook(book2);
            library.addBook(book3);

            System.out.println("Lending books to borrowers...");
            library.lendBook(book1.getId(),"Michael Jackson");
            library.lendBook(book1.getId(),"Brad Pitt");
            library.lendBook(book2.getId(),"Brad Pitt");

            System.out.println("Removing books from library...");
            library.removeBook(book3.getId());

            System.out.println("Listing all books from library...");
            System.out.println(library.getBookshelf());

        }
}
