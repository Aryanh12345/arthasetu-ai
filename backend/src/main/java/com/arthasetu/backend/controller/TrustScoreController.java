package com.arthasetu.backend.controller;

import com.arthasetu.backend.dto.TrustScoreResponse;
import com.arthasetu.backend.service.TrustScoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/trust-score")
@RequiredArgsConstructor
public class TrustScoreController {

    private final TrustScoreService service;

    @GetMapping
    public TrustScoreResponse demo() {

        int score =
                service.calculateScore(
                        90,
                        80,
                        70,
                        60,
                        85
                );

        return TrustScoreResponse.builder()
                .score(score)
                .confidence("HIGH")
                .topPositiveFactor("Savings Behaviour")
                .improvementArea("Investment Activity")
                .build();
    }
}