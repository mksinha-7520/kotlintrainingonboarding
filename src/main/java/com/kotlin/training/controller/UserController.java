package com.kotlin.training.controller;


import java.util.List;

import com.kotlin.training.enity.User;
import com.kotlin.training.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    UserRepository userRepository;


    @PostMapping("/addUser")
    public User saveUser(
         @RequestBody User user)
    {
        return userRepository.save(user);
    }

    @GetMapping("/getUser")
    public List<User> getUser()
    {
        return userRepository.findAll();
    }
}
