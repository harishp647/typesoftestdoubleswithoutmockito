package com.harish.mockito.test_doubles.dummy;

import java.time.LocalDate;

public class DummyBook {

    private String bookId;
    private String title;
    private int price;
    private LocalDate publishedDate;

    public DummyBook(String bookId, String title, int price, LocalDate publishedDate) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.publishedDate = publishedDate;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }
}
