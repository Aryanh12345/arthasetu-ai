package com.arthasetu.backend.service;

import com.arthasetu.backend.dto.ActionPlanResponse;
import com.arthasetu.backend.dto.DashboardResponse;
import com.arthasetu.backend.dto.RecommendationResponse;
import com.arthasetu.backend.dto.TrustScoreHistoryResponse;
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

        // Save Trust Score History
        trustScoreHistoryService.save(user, trustScore);

        // Load Trust Score History
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

        // Action Plan
        ActionPlanResponse actionPlan =
                actionPlanService.generate(trustScore);

        // Build Dashboard Response
        return DashboardResponse.builder()
                .user(user)
                .trustScore(trustScore)
                .financialHealth(financialHealth)
                .recommendation(recommendation)
                .actionPlan(actionPlan)
                .scoreHistory(history)
                .build();
    }

}