package com.arthasetu.backend.controller;

import com.arthasetu.backend.dto.InvestmentRecommendationResponse;
import com.arthasetu.backend.service.InvestmentRecommendationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/investment")
@RequiredArgsConstructor
public class InvestmentRecommendationController {

    private final InvestmentRecommendationService service;

    @GetMapping("/{trustScore}")
    public InvestmentRecommendationResponse getRecommendation(
            @PathVariable Integer trustScore) {

        return service.generate(trustScore);

    }

}