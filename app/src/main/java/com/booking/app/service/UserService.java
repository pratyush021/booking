package com.booking.app.service;

import com.booking.app.entity.User;
import com.booking.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User register(User user) {
        return userRepository.register(user);
    }

    public User login(String username, String password) {
        if(username != null && password != null) {
            return userRepository.login(username, password);
        } else {
            return null;
        }
    }


}
