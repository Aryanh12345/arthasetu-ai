package com.arthasetu.backend.repository;

import com.arthasetu.backend.entity.FinancialBehaviour;
import com.arthasetu.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FinancialBehaviourRepository extends JpaRepository<FinancialBehaviour, Long> {

    Optional<FinancialBehaviour> findByUser(User user);

}