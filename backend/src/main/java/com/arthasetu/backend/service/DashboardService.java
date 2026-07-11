package com.arthasetu.backend.service;

import com.arthasetu.backend.dto.*;
import com.arthasetu.backend.entity.FinancialBehaviour;
import com.arthasetu.backend.entity.User;
import com.arthasetu.backend.repository.FinancialBehaviourRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DashboardService {

    private final UserService userService;

    private final FinancialBehaviourRepository behaviourRepository;

    private final TrustScoreService trustScoreService;

    private final AIRecommendationService recommendationService;

    private final InvestmentRecommendationService investmentRecommendationService;

    private final ActionPlanService actionPlanService;

    private final TrustScoreHistoryService trustScoreHistoryService;

    public DashboardResponse getDashboard(Long userId) {

        User user = userService.getUser(userId);

        if (user == null) {
            throw new RuntimeException("User not found");
        }

        FinancialBehaviour behaviour = behaviourRepository
                .findByUser(user)
                .orElseThrow(() ->
                        new RuntimeException("Financial Behaviour not found"));

        // Calculate Trust Score
        Integer trustScore = trustScoreService.calculate(behaviour);

        // Save History
        trustScoreHistoryService.save(user, trustScore);

        // Load History
        List<TrustScoreHistoryResponse> history =
                trustScoreHistoryService
                        .getHistory(user)
                        .stream()
                        .map(item ->
                                TrustScoreHistoryResponse.builder()
                                        .label(item.getCalculatedAt().toLocalDate().toString())
                                        .score(item.getTrustScore())
                                        .build()
                        )
                        .toList();

        // Financial Health
        String financialHealth =
                trustScoreService.getFinancialHealth(trustScore);

        // AI Recommendation
        RecommendationResponse recommendation =
                recommendationService.generate(trustScore);

        // Investment Recommendation
        InvestmentRecommendationResponse investmentRecommendation =
                investmentRecommendationService.generate(trustScore);

        // Action Plan
        ActionPlanResponse actionPlan =
                actionPlanService.generate(trustScore);

        return DashboardResponse.builder()
                .user(user)
                .trustScore(trustScore)
                .financialHealth(financialHealth)
                .recommendation(recommendation)
                .investmentRecommendation(investmentRecommendation)
                .actionPlan(actionPlan)
                .scoreHistory(history)
                .build();

    }

}