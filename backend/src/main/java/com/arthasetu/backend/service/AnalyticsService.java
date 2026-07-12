package com.arthasetu.backend.service;

import com.arthasetu.backend.dto.AnalyticsResponse;
import com.arthasetu.backend.entity.FinancialBehaviour;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AnalyticsService {

    private final TrustScoreService trustScoreService;

    private final InvestmentRecommendationService investmentRecommendationService;

    public AnalyticsResponse generate(FinancialBehaviour behaviour) {

        Integer score = trustScoreService.calculate(behaviour);

        String health =
                trustScoreService.getFinancialHealth(score);

        String risk =
                investmentRecommendationService
                        .generate(score)
                        .getRiskProfile();

        Integer progress = Math.min(score / 9, 100);

        return AnalyticsResponse.builder()
                .trustScore(score)
                .financialHealth(health)
                .savings(behaviour.getSavingsScore())
                .utilityPayments(behaviour.getUtilityPaymentScore())
                .ecommerce(behaviour.getEcommerceActivity())
                .incomeStability(behaviour.getIncomeStability())
                .rechargeFrequency(behaviour.getRechargeFrequency())
                .overallProgress(progress)
                .riskProfile(risk)
                .build();

    }

}