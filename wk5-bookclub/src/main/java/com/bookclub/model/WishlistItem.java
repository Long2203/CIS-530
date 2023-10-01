/*
Krasso, R., (2021). CIS 530 Sever-Side Development. Bellevue University, all
rights reserved. 
Additional modifications by Nguyen, L.(2023) 
*/
package com.bookclub.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "wishlist")
//Declaring a class named WishlistItem
public class WishlistItem
{
	// Identifying this field as the unique identifier
    @Id
    private String id;

    @NotNull
    @NotEmpty(message = "ISBN is a required field.")
    private String isbn;

    @NotNull
    @NotEmpty(message = "Title is a required field.")
    private String title;

    public WishlistItem() {}
 // Constructor taking ISBN and title as parameters
    public WishlistItem(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }
    // Getter for retrieving the id field
    public String getId() {
        return id;
    }
    // Setter for setting the isbn field
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    // Getter for retrieving the isbn field
    public String getIsbn() {
        return isbn;
    }
 // Setter for setting the title field
    public void setTitle(String title) {
        this.title = title;
    }
 // Getter for retrieving the title field
    public String getTitle() {
        return title;
    }
 // Customized string representation of the object
    @Override
    public String toString() {
        return String.format("WishlistItem{id=%s, isbn=%s, title=%s}", id, isbn, title);
    }
}
