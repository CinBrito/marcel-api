package tech.ada.marcel.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import tech.ada.marcel.model.User;

public record UserDTO(
        @NotBlank(message = "Name is required") String name,
        @Email(message = "Invalid email address") String email,
        @Size(min = 6, message = "Password must be at least 6 characters long") String password,
        @Pattern(regexp = "^[a-zA-Z0-9_]{3,16}$", message = "Username must contain only letters, numbers, and underscores, and be between 3 and 16 characters long") String username) {

    public User toUser() {
        return new User(name, email, password, username);
    }
}
