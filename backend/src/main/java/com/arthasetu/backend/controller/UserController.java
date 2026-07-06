package com.arthasetu.backend.controller;

import com.arthasetu.backend.entity.User;
import com.arthasetu.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor

public class UserController {

    private final UserService service;

    @PostMapping
    public User save(@RequestBody User user){

        return service.save(user);

    }

    @GetMapping
    public List<User> getUsers(){

        return service.getAllUsers();

    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id){

        return service.getUser(id);

    }

}