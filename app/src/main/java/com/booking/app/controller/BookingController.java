package com.booking.app.controller;

import ch.qos.logback.core.status.StatusUtil;
import com.booking.app.entity.User;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

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
