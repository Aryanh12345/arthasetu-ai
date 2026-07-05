package com.arthasetu.backend.repository;

import com.arthasetu.backend.entity.FinancialBehaviour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancialBehaviourRepository
        extends JpaRepository<FinancialBehaviour, Long> {
}