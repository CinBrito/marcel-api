package tech.ada.marcel.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.ada.marcel.dto.UserDTO;
import tech.ada.marcel.model.User;
import tech.ada.marcel.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> save(@RequestBody @Valid UserDTO userDTO) {
        return ResponseEntity.ok(userService.save(userDTO.toUser()));
    }
}
