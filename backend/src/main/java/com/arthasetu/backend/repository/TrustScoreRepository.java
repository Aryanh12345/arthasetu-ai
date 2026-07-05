package com.arthasetu.backend.repository;

import com.arthasetu.backend.entity.TrustScore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrustScoreRepository
        extends JpaRepository<TrustScore, Long> {
}