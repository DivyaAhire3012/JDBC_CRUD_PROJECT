package model;

public class Library {
    public int book_id;
    public String title, author, publisher, genre;
    public int year;
    public boolean available;

    public Library(int book_id, String title, String author, String publisher, int year, String genre, boolean available) {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.genre = genre;
        this.available = available;
    }
}
