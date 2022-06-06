package tech.project.onefeed.controllers;

import org.springframework.web.bind.annotation.*;
import tech.project.onefeed.models.User;
import tech.project.onefeed.models.data.UserRepository;

import java.util.List;

@RestController
@CrossOrigin (origins = "http://localhost:4200")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/index.html")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("/index.html")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
}

