package com.soon.effectivejavastudy.chapter1.item03.serialization;

import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable {

    public static String name;
    private String isbn;
    private String title;
    private String author;
    private LocalDate published;
    private transient int numberOfSold;

    public Book(String isbn, String title, String author, LocalDate published) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.published = published;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", published=" + published +
                ", numberOfSold=" + numberOfSold +
                '}';
    }

    public void setNumberOfSold(int numberOfSold) {
        this.numberOfSold = numberOfSold;
    }
}
