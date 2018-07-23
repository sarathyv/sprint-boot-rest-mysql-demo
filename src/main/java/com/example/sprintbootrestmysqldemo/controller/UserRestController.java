package com.example.sprintbootrestmysqldemo.controller;

import com.example.sprintbootrestmysqldemo.model.User;
import com.example.sprintbootrestmysqldemo.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class UserRestController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value="/users")
    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping(value="/load")
    public User loadUser(@RequestBody User user) {
        userRepository.save(user);
        return userRepository.findByName(user.getName());
    }
}
