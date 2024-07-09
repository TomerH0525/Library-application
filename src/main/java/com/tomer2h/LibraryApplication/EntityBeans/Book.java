package com.tomer2h.LibraryApplication.EntityBeans;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.Objects;

@Entity
public class Book {
    @Id
    //isbn can be 10 or 13 numbers only.
    private String bookISBN;
    @ManyToOne
    private Author bookAuthor;
    private int numOfPages;
    private String bookLanguage;
    private String bookPublishDate;
    private int bookQuantity;
    private int timeToRemindInDays;




    public Book(String bookISBN, Author bookAuthor, int numOfPages) {
        this.bookISBN = bookISBN;
        this.bookAuthor = bookAuthor;
        this.numOfPages = numOfPages;
    }

    public Book() {
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    public Author getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(Author bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getBookLanguage() {
        return bookLanguage;
    }

    public void setBookLanguage(String bookLanguage) {
        this.bookLanguage = bookLanguage;
    }

    public String getBookPublishDate() {
        return bookPublishDate;
    }

    public void setBookPublishDate(String bookPublishDate) {
        this.bookPublishDate = bookPublishDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getBookISBN(), book.getBookISBN());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getBookISBN());
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookISBN='" + bookISBN + '\'' +
                ", bookAuthor=" + bookAuthor.getAuthorName() +
                ", numOfPages=" + numOfPages +
                ", bookLanguage='" + bookLanguage + '\'' +
                ", bookPublishDate='" + bookPublishDate + '\'' +
                '}';
    }
}
