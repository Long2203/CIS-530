/*
Krasso, R., (2021). CIS 530 Sever-Side Development. Bellevue University, all
rights reserved. 
Additional modifications by Nguyen, L.(2023) 
*/
package com.bookclub.service.impl;

import com.bookclub.model.Book;
import com.bookclub.service.dao.BookDao;

import java.util.ArrayList;
import java.util.List;

//This line declares the start of a class named "MemBookDao" that implements the BookDao interface.
public class MemBookDao implements BookDao {

 // This line declares a private field named 'books' which is a List of Book objects.
 private List<Book> books;

 // This is the constructor for MemBookDao class.
 public MemBookDao() {
     // Initializes 'books' as a new ArrayList of Book objects.
     this.books = new ArrayList<Book>();
     // Adds several Book objects to the list using constructor calls.
     this.books.add(new Book("0345339681", "The Hobbit", "Bilbo Baggins was a hobbit who wanted to be left alone in quiet comfort. But the wizard Gandalf came along with a band of homeless dwarves. Soon Bilbo was drawn into their quest, facing evil orcs, savage wolves, giant spiders, and worse unknown dangers. Finally, it was Bilbo–alone and unaided–who had to confront the great dragon Smaug, the terror of an entire countryside", 322, new ArrayList<>(List.of("J.R.R. Tolkien"))));
     this.books.add(new Book("0261103571", "The Fellowship of the Ring", "The first volume in J.R.R. Tolkien's epic adventure THE LORD OF THE RINGS One Ring to rule them all, One Ring to find them, One Ring to bring them all and in the darkness bind them", 432, new ArrayList<>(List.of("J.R.R. Tolkien"))));
     this.books.add(new Book("1514297272", "The Two Towers", "The second volume in J.R.R. Tolkien's epic adventure THE LORD OF THE RINGS", 448, new ArrayList<>(List.of("J.R.R. Tolkien"))));
     this.books.add(new Book("1514298139", "The Return of the King", "The third volume in J.R.R. Tolkien's epic adventure THE LORD OF THE RINGS", 432, new ArrayList<>(List.of("J.R.R. Tolkien"))));
     this.books.add(new Book("9780593099322", "Dune", "A deluxe hardcover edition of Frank Herbert’s epic masterpiece—a triumph of the imagination and one of the bestselling science fiction novels of all time.", 688, new ArrayList<>(List.of("J.R.R. Tolkien"))));
 }

 // This method is required to be implemented due to the interface implementation.
 @Override
 public List<Book> list() {
     // Returns the list of books.
     return this.books;
 }

 // This method is required to be implemented due to the interface implementation.
 @Override
 public Book find(String key) {
     // Iterates through the list of books.
     for (Book book : this.books) {
         // Checks if the ISBN of the book matches the provided key.
         if (book.getIsbn().equals(key)) {
             // Returns the book if found.
             return book;
         }
     }
     // Returns a default Book object if no match is found.
     return new Book();
 }
}
