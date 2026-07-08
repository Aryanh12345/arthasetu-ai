package com.arthasetu.backend.controller;

import com.arthasetu.backend.dto.RecommendationResponse;
import com.arthasetu.backend.service.AIRecommendationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ai-recommendation")
@RequiredArgsConstructor
public class AIRecommendationController {

    private final AIRecommendationService service;

    @GetMapping("/{score}")
    public RecommendationResponse generate(

            @PathVariable Integer score){

        return service.generate(score);

    }

}