package com.arthasetu.backend.repository;

import com.arthasetu.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
        extends JpaRepository<User, Long> {
}