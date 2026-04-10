package com.zasela.api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class CreateUserRequest {
    @NotBlank(message = "full name is required")
    private String fullName;

    @NotBlank(message = "Username should be provide")
    private String username;

    @NotBlank(message = "Password should be provided")
    private String password;

    @NotBlank(message = "Email should not empty")
    @Email(message = "Email should be valid")
    private String email;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
