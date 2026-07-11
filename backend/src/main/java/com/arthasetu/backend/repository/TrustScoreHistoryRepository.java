package com.arthasetu.backend.repository;

import com.arthasetu.backend.entity.TrustScoreHistory;
import com.arthasetu.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrustScoreHistoryRepository
        extends JpaRepository<TrustScoreHistory, Long> {

    List<TrustScoreHistory> findByUserOrderByCalculatedAtAsc(User user);

}