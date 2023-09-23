/*
Krasso, R., (2021). CIS 530 Sever-Side Development. Bellevue University, all
rights reserved. 
Additional modifications by Nguyen, L.(2023) 
*/
package com.bookclub.web;

import com.bookclub.model.Book;
import com.bookclub.service.impl.MemBookDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
//This line declares a class named "HomeController".
public class HomeController
{
 // This method handles GET requests to the root URL ("/").
 @RequestMapping(method = RequestMethod.GET)
 public String showHome(Model model)
 {
     // Creates an instance of MemBookDao to access books.
     MemBookDao bookDao = new MemBookDao();
     
     // Retrieves a list of books from the bookDao.
     List<Book> books = bookDao.list();

     // Iterates through the list of books and prints their string representations.
     for (Book book : books) {
         System.out.println(book.toString());
     }

     // Adds the list of books to the model attribute for use in the view.
     model.addAttribute("books", books);

     // Returns the name of the view template to be rendered ("index").
     return "index";
 }

 // This method handles GET requests to URLs like "/{id}" where id is a variable.
 @RequestMapping(method = RequestMethod.GET, value = "/{id}")
 public String getMonthlyBook(@PathVariable("id") String id, Model model) {
     // Extracts the 'id' variable from the URL path.
     String isbn = id;
     System.out.println(id);

     // Creates an instance of MemBookDao to access books.
     MemBookDao bookDao = new MemBookDao();

     // Finds a book by ISBN using the 'find' method of bookDao.
     Book book = bookDao.find(isbn);

     // Prints the string representation of the found book.
     System.out.println(book.toString());

     // Adds the found book to the model attribute for use in the view.
     model.addAttribute("book", book);

     // Returns the name of the view template to be rendered ("monthly-books/view").
     return "monthly-books/view";
 }

 // This method handles GET requests to the "/about" URL path.
 @RequestMapping(method = RequestMethod.GET, path = "/about")
 public String showAboutUs(Model model)
 {
     // Returns the name of the view template to be rendered ("about").
     return "about";
 }

 // This method handles GET requests to the "/contact" URL path.
 @RequestMapping(method = RequestMethod.GET, path = "/contact")
 public String showContactUs(Model model)
 {
     // Returns the name of the view template to be rendered ("contact").
     return "contact";}}
