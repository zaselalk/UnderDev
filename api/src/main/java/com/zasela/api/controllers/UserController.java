package com.zasela.api.controllers;

import com.zasela.api.dto.CreateUserRequest;
import com.zasela.api.entities.User;
import com.zasela.api.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<User> save(@Valid @RequestBody CreateUserRequest request) {
        return ResponseEntity.ok(userService.createUser(request));
    }

    @DeleteMapping
    public void deleteById(Long id) {
        userService.deleteUserById(id);
    }
}
