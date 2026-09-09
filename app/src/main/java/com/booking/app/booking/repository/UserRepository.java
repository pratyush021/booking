package com.booking.app.booking.repository;

import com.booking.app.booking.entity.User;


public interface UserRepository {
    User register(User user);
    User login(String userName, String password);
}
