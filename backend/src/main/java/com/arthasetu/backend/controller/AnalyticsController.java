package com.arthasetu.backend.controller;

import com.arthasetu.backend.dto.AnalyticsResponse;
import com.arthasetu.backend.entity.FinancialBehaviour;
import com.arthasetu.backend.entity.User;
import com.arthasetu.backend.repository.FinancialBehaviourRepository;
import com.arthasetu.backend.service.AnalyticsService;
import com.arthasetu.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/analytics")
@RequiredArgsConstructor
public class AnalyticsController {

    private final AnalyticsService analyticsService;

    private final UserService userService;

    private final FinancialBehaviourRepository behaviourRepository;

    @GetMapping("/{userId}")
    public AnalyticsResponse getAnalytics(
            @PathVariable Long userId) {

        User user = userService.getUser(userId);

        FinancialBehaviour behaviour =
                behaviourRepository
                        .findByUser(user)
                        .orElseThrow(() ->
                                new RuntimeException("Financial Behaviour not found"));

        return analyticsService.generate(behaviour);

    }

}