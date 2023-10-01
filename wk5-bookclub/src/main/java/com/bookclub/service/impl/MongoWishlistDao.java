/*
Krasso, R., (2021). CIS 530 Sever-Side Development. Bellevue University, all
rights reserved. 
Additional modifications by Nguyen, L.(2023) 
*/
package com.bookclub.service.impl;

import com.bookclub.model.WishlistItem;
import com.bookclub.service.dao.WishlistDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
//Defining the class MongoWishlistDao which implements the WishlistDao interface
@Repository("wishlistDao")
public class MongoWishlistDao implements WishlistDao {
	// Automatically injecting a MongoTemplate object
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void add(WishlistItem entity) {
        mongoTemplate.save(entity);// Saving a WishlistItem using the MongoTemplate
    }

    @Override
    public void update(WishlistItem entity) {

    }
 // Method not implemented, leaving it empty
    @Override
    public boolean remove(WishlistItem entity) {
        Query query = new Query();// Creating a query object

        query.addCriteria(Criteria.where("id").is(entity.getId()));

        mongoTemplate.remove(query, WishlistItem.class);

        return true;// Returning a boolean indicating the success of the operation
    }

    @Override
    public List<WishlistItem> list() {
        return mongoTemplate.findAll(WishlistItem.class);// Finding and returning all WishlistItems using the MongoTemplate
    }

    @Override
    public WishlistItem find(String key) {
        return mongoTemplate.findById(key, WishlistItem.class);// Finding and returning a WishlistItem by its id using the MongoTemplate
    }
}