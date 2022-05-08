package tech.project.onefeed.controllers;

import org.springframework.web.bind.annotation.*;
import tech.project.onefeed.models.User;
import tech.project.onefeed.models.data.UserRepository;

import java.util.List;

@RestController
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
}

