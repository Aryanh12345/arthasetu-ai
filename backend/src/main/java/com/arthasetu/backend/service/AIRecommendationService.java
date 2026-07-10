package com.arthasetu.backend.service;

import com.arthasetu.backend.dto.RecommendationResponse;
import com.arthasetu.backend.engine.TrustScoreEngine;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AIRecommendationService {

    private final TrustScoreEngine trustScoreEngine;

    public RecommendationResponse generate(Integer score) {

        List<String> recommendations = new ArrayList<>();

        String health = trustScoreEngine.getFinancialHealth(score);

        String riskLevel;

        switch (health) {

            case "Excellent" -> {

                riskLevel = "Low Risk";

                recommendations.add("Continue long-term SIP investments.");
                recommendations.add("Diversify into international index funds.");
                recommendations.add("Review portfolio every quarter.");
                recommendations.add("Increase retirement investments.");
                recommendations.add("Maintain your excellent financial discipline.");
            }

            case "Good" -> {

                riskLevel = "Balanced";

                recommendations.add("Increase monthly savings by 10%.");
                recommendations.add("Build a 6-month emergency fund.");
                recommendations.add("Invest regularly in index funds.");
                recommendations.add("Keep all bill payments on time.");
                recommendations.add("Track monthly expenses.");
            }

            case "Fair" -> {

                riskLevel = "Moderate Risk";

                recommendations.add("Increase savings consistency.");
                recommendations.add("Reduce unnecessary spending.");
                recommendations.add("Avoid missing utility payments.");
                recommendations.add("Start a monthly SIP.");
                recommendations.add("Improve income stability.");
            }

            default -> {

                riskLevel = "High Risk";

                recommendations.add("Focus on emergency savings.");
                recommendations.add("Avoid high-risk investments.");
                recommendations.add("Increase regular income.");
                recommendations.add("Clear outstanding liabilities.");
                recommendations.add("Build financial discipline before investing.");
            }

        }

        return RecommendationResponse.builder()
                .trustScore(score)
                .riskLevel(riskLevel)
                .recommendations(recommendations)
                .build();
    }
}