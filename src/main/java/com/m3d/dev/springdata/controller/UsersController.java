package com.m3d.dev.springdata.controller;

import java.util.List;

import com.m3d.dev.springdata.entities.Users;
import com.m3d.dev.springdata.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users/")
public class UsersController {

    @Autowired
    private UserRepository userRepository;
    
    @GetMapping
    public List<Users> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{name}")
    public Users getUser(@PathVariable final String name) {
        return userRepository.findByName(name);
    }

    @PostMapping
    public Users createUser(@RequestBody final Users users){
        return userRepository.save(users);
    }
}