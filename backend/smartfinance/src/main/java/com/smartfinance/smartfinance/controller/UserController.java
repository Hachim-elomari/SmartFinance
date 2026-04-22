package com.smartfinance.smartfinance.controller;

import com.smartfinance.smartfinance.entity.User;
import com.smartfinance.smartfinance.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // GET all users
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // POST create user
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}