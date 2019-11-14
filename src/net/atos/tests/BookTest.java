package net.atos.tests;
import net.atos.Book;
import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {

        @Test
        public void getterMethodsTest() {
            BookTest myUnit = new BookTest();

            System.out.println("Book Library example implementation for Atos. Book class test starting...");

            System.out.println("Creating books...");

            Book book1 = new Book("Cay S. Horstmann", "Core Java Volume I – Fundamentals", 2018);
            Book book2 = new Book("Joshua Bloch", "Effective Java", 2017);
            Book book3 = new Book("Herbert Schildt", "Java: A Beginner’s Guide", 2018);

            System.out.println("Listing book records...");

            book1.listBook();
            book2.listBook();
            book3.listBook();

            System.out.println("Testing getter methods...");

            assertEquals(book1.getBorrowerName(), "");
            assertEquals(book1.getAuthor(), "Cay S. Horstmann");
            assertEquals(book1.getTitle(), "Core Java Volume I – Fundamentals");
            assertEquals(book1.getYear(), 2018);
            assertEquals(book1.getStatus(), false);

        }

    @Test
    public void setterMethodsTest() {
        BookTest myUnit = new BookTest();

        System.out.println("Book Library example implementation for Atos. Book class test starting...");

        System.out.println("Creating books...");

        Book book1 = new Book("Cay S. Horstmann", "Core Java Volume I – Fundamentals", 2018);
        Book book2 = new Book("Joshua Bloch", "Effective Java", 2017);
        Book book3 = new Book("Herbert Schildt", "Java: A Beginner’s Guide", 2018);

        System.out.println("Listing book records...");

        book1.listBook();
        book2.listBook();
        book3.listBook();

        System.out.println("Testing setter methods...");

        book1.setStatus(true);
        book1.setBorrowerName("Steve Jobs");
        book1.setYear(2019);
        book1.setTitle("The Memoirs of Sherlock Holmes");
        book1.setAuthor("Arthur Conan Doyle");

        assertEquals(book1.getBorrowerName(), "Steve Jobs");
        assertEquals(book1.getAuthor(), "Arthur Conan Doyle");
        assertEquals(book1.getTitle(), "The Memoirs of Sherlock Holmes");
        assertEquals(book1.getYear(), 2019);
        assertEquals(book1.getStatus(), true);

    }


    }

