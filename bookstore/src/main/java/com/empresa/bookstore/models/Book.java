package com.empresa.bookstore.models;

import java.time.LocalDate;

public class Book{
    private long id;
    private String title, author;
    private LocalDate published_date;
    
    public Book(long id, String title, String author, LocalDate published_date) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.published_date = published_date;
    }

    public Book(Book other){
        this.id = other.id;
        this.title = other.title;
        this.author = other.author;
        this.published_date = other.published_date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublished_date() {
        return published_date;
    }

    public void setPublished_date(LocalDate published_date) {
        this.published_date = published_date;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + author + ", published_date=" + published_date
                + "]";
    }
}
