package com.booking.app.repository;

import com.booking.app.entity.User;
import org.springframework.stereotype.Repository;


public interface UserRepository {
    User register(User user);
    User login(String userName, String password);
}
