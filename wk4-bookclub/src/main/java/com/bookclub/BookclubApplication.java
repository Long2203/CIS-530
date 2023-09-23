/*
Krasso, R., (2021). CIS 530 Sever-Side Development. Bellevue University, all
rights reserved. 
Additional modifications by Nguyen, L.(2023) 
*/
// This line specifies the package in which this class resides.
package com.bookclub;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

// This line declares the start of a class named "BookclubApplication".
public class BookclubApplication {

    // This line declares the main method, the entry point for running the application.
    public static void main(String[] args) {
        // This line calls the SpringApplication class to run the BookclubApplication class with the given arguments.
        SpringApplication.run(BookclubApplication.class, args);
    }

} // end Bookclubapplication