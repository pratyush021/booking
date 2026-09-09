package com.booking.app.booking.repository.impl;

import com.booking.app.booking.repository.UserRepository;
import com.booking.app.booking.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public User register(User user) {
        return mongoTemplate.save(user, "User");
    }

    @Override
    public User login(String userName, String password) {
        Query query = new Query();
        query.addCriteria(Criteria.where("userName").is(userName));
        query.addCriteria(Criteria.where("password").is(password));
        return mongoTemplate.findOne(query, User.class, "User");
    }
}
