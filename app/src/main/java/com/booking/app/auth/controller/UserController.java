package com.booking.app.auth.controller;

import com.booking.app.booking.service.UserService;
import com.booking.app.booking.entity.User;
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


    @PostMapping("/auth/register")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User res = userService.register(user);
        if(res != null) {
            return ResponseEntity.status(201).body(res);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(user);
        }
    }

    @PostMapping("/auth/login")
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
	
	@PostMapping("/auth/refresh") 
	public ResponseEntity<?> refresh(
			@RequestParam(required = true) String token
	) {
		// refresh the session/token ? 

	}


}
