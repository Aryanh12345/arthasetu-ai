package com.arthasetu.backend.service;

import com.arthasetu.backend.dto.ActionPlanResponse;
import com.arthasetu.backend.dto.InvestmentRecommendationResponse;
import com.arthasetu.backend.dto.RecommendationResponse;
import com.arthasetu.backend.dto.ScenarioRequest;
import com.arthasetu.backend.dto.ScenarioResponse;
import com.arthasetu.backend.entity.FinancialBehaviour;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScenarioService {

    private final TrustScoreService trustScoreService;

    private final AIRecommendationService recommendationService;

    private final InvestmentRecommendationService investmentRecommendationService;

    private final ActionPlanService actionPlanService;

    public ScenarioResponse predict(ScenarioRequest request) {

        FinancialBehaviour behaviour = FinancialBehaviour.builder()
                .rechargeFrequency(request.getRechargeFrequency())
                .utilityPaymentScore(request.getUtilityPaymentScore())
                .ecommerceActivity(request.getEcommerceActivity())
                .savingsScore(request.getSavingsScore())
                .incomeStability(request.getIncomeStability())
                .build();

        Integer trustScore = trustScoreService.calculate(behaviour);

        String financialHealth =
                trustScoreService.getFinancialHealth(trustScore);

        RecommendationResponse recommendation =
                recommendationService.generate(trustScore);

        InvestmentRecommendationResponse investmentRecommendation =
                investmentRecommendationService.generate(trustScore);

        ActionPlanResponse actionPlan =
                actionPlanService.generate(trustScore);

        return ScenarioResponse.builder()
                .predictedTrustScore(trustScore)
                .financialHealth(financialHealth)
                .recommendation(recommendation)
                .investmentRecommendation(investmentRecommendation)
                .actionPlan(actionPlan)
                .build();

    }

}