package tech.ada.marcel.dto;

import tech.ada.marcel.model.User;

public record UserDTO(String name, String email, String password) {
    public User toUser() {
        return new User(name, email, password);
    }
}
