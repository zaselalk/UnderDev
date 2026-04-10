package com.zasela.api.controllers;

import com.zasela.api.entities.User;
import com.zasela.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> findAll() {
        return userService.getAllUsers();
    }

    @GetMapping("/id")
    public User findById(Long id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public User save(@RequestBody User user) {

        return userService.createUser(user);
    }

    @DeleteMapping
    public void deleteById(Long id) {
        userService.deleteUserById(id);
    }
}
