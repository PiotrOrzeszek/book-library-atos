package net.atos;

import java.util.UUID;

import static com.sun.javafx.binding.StringFormatter.concat;

public class Book {

    private String title = "";
    private int year = 0;
    private String author = "";
    private UUID id;
    private boolean status = false;
    private String borrowerName = "";

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.id = UUID.randomUUID();

    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public UUID getId() {
        return this.id;
    }

    public String getBorrowerName() {
        return this.borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Book getBook() {
        return this;
    }

    public String toString(){

        String str = "\nRandom UUID String: " + this.id.toString()+"\n"
                     .concat("Author            : " + this.author+"\n")
                     .concat("Title             : " + this.title+"\n")
                     .concat("Year              : " + this.year+"\n")
                     .concat( "------------------------------------------------------------------------------\n");

        return str;
    }


    //listBooks wyświetla listę wszystkich dostępnych w bibliotece książek wraz z informacjami
    // o ilości posiadanych i wypożyczonych egzemplarzy
    //  zwraca egzemplarz książki do biblioteki
    public void listBook() {
        System.out.println("Random UUID String: " + this.id.toString());
        System.out.println("Author            : " + this.author);
        System.out.println("Title             : " + this.title);
        System.out.println("Year              : " + this.year);
        System.out.println("------------------------------------------------------------------------------");
    }



    public static void main(String[] args) {
        // write your code here
        System.out.println("Book Library example implementation for Atos.");

      Book book1 = new Book("Cay S. Horstmann", "Core Java Volume I – Fundamentals", 2018);
      Book book2 = new Book("Joshua Bloch", "Effective Java", 2017);
      Book book3 = new Book("Herbert Schildt", "Java: A Beginner’s Guide", 2018);


      book1.listBook();
      book2.listBook();
      book3.listBook();




    }


}
