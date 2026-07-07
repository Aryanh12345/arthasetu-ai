package com.arthasetu.backend.controller;

import com.arthasetu.backend.dto.InvestmentRecommendationResponse;
import com.arthasetu.backend.service.InvestmentRecommendationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/recommendation")
@RequiredArgsConstructor
public class InvestmentRecommendationController {

    private final InvestmentRecommendationService service;

    @GetMapping("/{score}")
    public InvestmentRecommendationResponse recommend(
            @PathVariable Integer score){

        return service.recommend(score);

    }

}