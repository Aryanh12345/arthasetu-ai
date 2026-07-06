package com.arthasetu.backend.service;

import com.arthasetu.backend.entity.User;
import com.arthasetu.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class UserService {

    private final UserRepository repository;

    public User save(User user){

        return repository.save(user);

    }

    public List<User> getAllUsers(){

        return repository.findAll();

    }

    public User getUser(Long id){

        return repository.findById(id).orElse(null);

    }

}