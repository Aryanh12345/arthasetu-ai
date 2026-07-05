package com.arthasetu.backend.repository;

import com.arthasetu.backend.entity.InvestmentRecommendation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestmentRecommendationRepository
        extends JpaRepository<InvestmentRecommendation, Long> {
}