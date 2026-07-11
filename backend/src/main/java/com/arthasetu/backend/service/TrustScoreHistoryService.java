package com.arthasetu.backend.service;

import com.arthasetu.backend.entity.TrustScoreHistory;
import com.arthasetu.backend.entity.User;
import com.arthasetu.backend.repository.TrustScoreHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TrustScoreHistoryService {

    private final TrustScoreHistoryRepository repository;

    public void save(User user, Integer score) {

        TrustScoreHistory history = TrustScoreHistory.builder()
                .user(user)
                .trustScore(score)
                .calculatedAt(LocalDateTime.now())
                .build();

        repository.save(history);

    }

    public List<TrustScoreHistory> getHistory(User user) {

        return repository.findByUserOrderByCalculatedAtAsc(user);

    }

}