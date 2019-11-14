package net.atos;

import net.atos.Book;

import java.util.*;

public class Library {

    private String name = "";
    private String address = "";
    //private static ArrayList<Book> books = new ArrayList<Book>();
    private  Map<UUID, Book> bookshelf = new HashMap<>();

    public Library(String name, String address) {
        this.name = name;
        this.address = address;

    }

    public Map<UUID, Book> getBookshelf() {
        return this.bookshelf;
    }

    public void showBanner() {
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(this.name);
        System.out.println(this.address);
        System.out.println("------------------------------------------------------------------------------");
    }


    // add dodaje książkę do biblioteki
    public  void addBook(Book book) {
        this.bookshelf.put(book.getId(),book);
        System.out.println("Book added to library: "+book.getId()+".");
    }

    // remove usuwa książkę z biblioteki
    public void removeBook(UUID id) {
        if (!(bookshelf.containsKey(id)))
        {
            System.out.println("Action not possible. No book with such ID: " + id + ".");
        }
        else if (!(bookshelf.get(id).getStatus()))
        {
            bookshelf.remove(id);
            System.out.println("Book removed from library: " + id + ".");
        }  else {
            System.out.println("Action not possible. Book was allready lend by borrower: " + bookshelf.get(id).getBorrowerName() + ".");
        }

    }

    //lendBook wypożycza egzemplarz książki z biblioteki
    public  void lendBook(UUID id, String borrowerName) {

          if (!(bookshelf.get(id).getStatus())) {
            bookshelf.get(id).setStatus(true);
            bookshelf.get(id).setBorrowerName(borrowerName);
            System.out.println("Borrower: "+bookshelf.get(id).getBorrowerName()+" lend book id:"+id+".");
        } else {
            System.out.println("Action not possible. Book was allready lend by borrower: "+bookshelf.get(id).getBorrowerName()+".");
        }

    }

    //returnBook zwraca egzemplarz książki do biblioteki
    public  void returnBook(UUID id) {
        bookshelf.get(id).setStatus(true);
        bookshelf.get(id).setBorrowerName("");
        System.out.println("Book returned back to library: "+id+".");
    }


    public static void main(String[] args) {
        // write your code here


        Library library = new Library("The Library of Congress", "101 Independence Ave SE, Washington, DC 20540" );

        library.showBanner();

        Book book1 = new Book("Cay S. Horstmann", "Core Java Volume I – Fundamentals", 2018);
        Book book2 = new Book("Joshua Bloch", "Effective Java", 2017);
        Book book3 = new Book("Herbert Schildt", "Java: A Beginner’s Guide", 2018);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.lendBook(book1.getId(),"Michael Jackson");

        library.lendBook(book1.getId(),"Brad Pitt");

        library.lendBook(book2.getId(),"Brad Pitt");

        library.removeBook(book3.getId());

        System.out.println(library.getBookshelf());




    }

}

//        "Java Concurrency in Practice" "Brian Goetz" 2006
//        "Test Driven: TDD and Acceptance TDD for Java Developers" "Lasse Koskela" 2007
//        "Java Performance: The Definitive Guide" "Scott Oaks" 2014
//        "Clean Code: A Handbook of Agile Software Craftsmanship" "Robert Martin" 2008
//        "Java: A Beginner's Guide, Seventh Edition" "Herbert Schildt" 2017
//        "High-Performance Java Persistence" "Vlad Mihalcea" 2016
//        "Java For Dummies" "Barry A. Burd" 2006
//        "Java Programming 24-Hour Trainer" "Yakov Fain" 2011
//        "Modern Java Recipes: Simple Solutions to Difficult Problems in Java 8 and 9" "Ken Kousen" 2017
//        "Core Java, Volume II--Advanced Features" "Cay S. Horstmann" 2005