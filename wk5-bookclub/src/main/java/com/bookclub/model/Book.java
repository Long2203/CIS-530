/*
Krasso, R., (2021). CIS 530 Sever-Side Development. Bellevue University, all
rights reserved. 
Additional modifications by Nguyen, L.(2023) 
*/
// This line specifies the package in which this class resides.
package com.bookclub.model;

import java.util.List;

// This line declares the start of a class named "Book".
public class Book
{
    // These lines declare private fields representing attributes of a book.
    private String isbn;
    private String title;
    private String description;
    private int numOfPages;
    private List<String> authors;

    // This line declares a default constructor for the Book class.
    public Book() {}

    // This line declares a constructor that accepts parameters to initialize the fields.
    public Book(String isbn, String title, String description, int numOfPages, List<String> authors) {
        this.isbn = isbn;
        this.title = title;
        this.description = description;
        this.numOfPages = numOfPages;
        this.authors = authors;
    }

    // These lines declare setter and getter methods for the 'isbn' field.
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getIsbn() {
        return isbn;
    }

    // These lines declare setter and getter methods for the 'title' field.
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    // These lines declare setter and getter methods for the 'description' field.
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    // These lines declare setter and getter methods for the 'numOfPages' field.
    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }
    public int getNumOfPages() {
        return numOfPages;
    }

    // These lines declare setter and getter methods for the 'authors' field.
    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
    public List<String> getAuthors() {
        return authors;
    }

    // This method overrides the default toString() method to provide a custom string representation of a Book object.
    @Override
    public String toString() {
        return String.format("Book{isbn=%s, title=%s, description=%s, numOfPages=%s, authors=%s}", isbn, title, description, numOfPages, authors);
    }
}// end book

