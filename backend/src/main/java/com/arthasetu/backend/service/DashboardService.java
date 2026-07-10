package com.arthasetu.backend.service;

import com.arthasetu.backend.dto.ActionPlanResponse;
import com.arthasetu.backend.dto.DashboardResponse;
import com.arthasetu.backend.dto.RecommendationResponse;
import com.arthasetu.backend.entity.FinancialBehaviour;
import com.arthasetu.backend.entity.User;
import com.arthasetu.backend.repository.FinancialBehaviourRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DashboardService {

    private final UserService userService;

    private final FinancialBehaviourRepository behaviourRepository;

    private final TrustScoreService trustScoreService;

    private final AIRecommendationService recommendationService;

    private final ActionPlanService actionPlanService;

    public DashboardResponse getDashboard(Long userId){

        User user = userService.getUser(userId);

        if(user == null){

            throw new RuntimeException("User not found");

        }

        FinancialBehaviour behaviour =
                behaviourRepository.findByUser(user)
                        .orElseThrow(() ->
                                new RuntimeException("Financial Behaviour not found"));

        Integer trustScore =
                trustScoreService.calculate(behaviour);

        String health =
                trustScoreService.getFinancialHealth(trustScore);

        RecommendationResponse recommendation =
                recommendationService.generate(trustScore);

        ActionPlanResponse actionPlan =
                actionPlanService.generate(trustScore);

        return DashboardResponse.builder()

                .user(user)

                .trustScore(trustScore)

                .financialHealth(health)

                .recommendation(recommendation)

                .actionPlan(actionPlan)

                .build();

    }

}