package com.booking.app.controller;

import com.booking.app.entity.User;
import com.booking.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/users/register")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User res = userService.register(user);
        if(res != null) {
            return ResponseEntity.status(201).body(res);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(user);
        }
    }

    @PostMapping("/users/login")
    public ResponseEntity<String> login(
            @RequestParam(required = true) String email,
            @RequestParam(required = true) String password
    ) {
        User res = userService.login(email, password);
        if(res != null) {
            return ResponseEntity.ok("Login Successful!!");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
        }
    }

}
