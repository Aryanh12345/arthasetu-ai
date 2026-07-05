package com.arthasetu.backend.repository;

import com.arthasetu.backend.entity.RiskAssessment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiskAssessmentRepository
        extends JpaRepository<RiskAssessment, Long> {
}