package com.booking.app.booking.controller;

import com.booking.app.booking.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookingController {

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("Server is live!");
    }


    @GetMapping("/users/profile")
    public ResponseEntity<User> getUser(String token) {
        return ResponseEntity.ok(new User());
    }


}
