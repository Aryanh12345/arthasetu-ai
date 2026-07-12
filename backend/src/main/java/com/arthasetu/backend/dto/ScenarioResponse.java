package com.arthasetu.backend.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ScenarioResponse {

    private Integer predictedTrustScore;

    private String financialHealth;

    private RecommendationResponse recommendation;

    private InvestmentRecommendationResponse investmentRecommendation;

    private ActionPlanResponse actionPlan;

}