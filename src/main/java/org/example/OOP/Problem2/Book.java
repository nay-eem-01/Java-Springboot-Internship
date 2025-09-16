package org.example.OOP.Problem2;

import java.util.*;

public class Book {
    private Long id;
    private String bookName;
    private String ISBN;

    public Book(Long id, String bookName, String ISBN) {
        this.id = id;
        this.bookName = bookName;
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return ISBN.equals(book.getISBN());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ISBN);
    }

    public static void main(String[] args) {

        Book book1 = new Book(1L,"A","123");
        Book book2 = new Book(2L,"B","456");
        Book book3 = new Book(3L,"C","789");
        Book book4 = new Book(1L,"A","123");

        HashSet<Book> hashSet = new HashSet<>();
        hashSet.add(book1);
        hashSet.add(book2);
        hashSet.add(book3);
        hashSet.add(book4);

        List<Book> bookList = new ArrayList<>();

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);

        System.out.println("Book set size: " + hashSet.size());
        System.out.println("Book List size: " + bookList.size());

    }

}
