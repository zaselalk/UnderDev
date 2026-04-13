package com.zasela.api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record CreateUserRequest(@NotBlank(message = "full name is required") String fullName,
                                @NotBlank(message = "Username should be provide") String username,
                                @NotBlank(message = "Password should be provided") String password,
                                @NotBlank(message = "Email should not empty") @Email(message = "Email should be valid") String email) {
}
