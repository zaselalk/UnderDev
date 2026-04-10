package com.zasela.api.services;

import com.zasela.api.dto.CreateUserRequest;
import com.zasela.api.entities.User;
import com.zasela.api.repositories.UserRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(@Valid CreateUserRequest request) {
        User userEntity = new User();
        userEntity.setFullName(request.getFullName());
        userEntity.setEmail(request.getEmail());
        userEntity.setPassword(request.getPassword());
        userEntity.setUsername(request.getUsername());
        userEntity.setRole("user");
        return userRepository.save(userEntity);
    }

    public User getUserById(Long id) {
        return userRepository.getOne(id);
    }


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}
