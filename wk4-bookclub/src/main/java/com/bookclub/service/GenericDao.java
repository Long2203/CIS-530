/*
Krasso, R., (2021). CIS 530 Sever-Side Development. Bellevue University, all
rights reserved. 
Additional modifications by Nguyen, L.(2023) 
*/
// create table service
package com.bookclub.service;

import java.util.List;

public interface GenericDao<E, K> {
    List<E> list(); // Return a list of objects of type E.
    E find(K key); // Return an object of type E by type K value.
}
