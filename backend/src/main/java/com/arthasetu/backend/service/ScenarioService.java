package com.arthasetu.backend.service;

import com.arthasetu.backend.dto.ScenarioRequest;
import com.arthasetu.backend.dto.ScenarioResponse;
import org.springframework.stereotype.Service;

@Service
public class ScenarioService {

    public ScenarioResponse predict(ScenarioRequest request) {

        double score =

                request.getSavingsScore() * 3.0 +

                request.getUtilityPaymentScore() * 2.5 +

                request.getRechargeFrequency() * 2.0 +

                request.getEcommerceActivity() * 1.5 +

                request.getIncomeStability() * 1.0;

        int trustScore = (int) score;

        String health;

        if (trustScore >= 900) {

            health = "Excellent";

        } else if (trustScore >= 750) {

            health = "Good";

        } else if (trustScore >= 600) {

            health = "Fair";

        } else {

            health = "Needs Improvement";

        }

        String suggestion;

        if (trustScore >= 900) {

            suggestion = "Maintain your current financial discipline and continue diversified investments.";

        } else if (trustScore >= 750) {

            suggestion = "Increase your SIP amount and strengthen your emergency fund.";

        } else if (trustScore >= 600) {

            suggestion = "Improve savings consistency and avoid delayed bill payments.";

        } else {

            suggestion = "Focus on regular savings, timely payments and improving income stability.";
        }

        return ScenarioResponse.builder()

                .predictedTrustScore(trustScore)

                .financialHealth(health)

                .suggestion(suggestion)

                .build();

    }

}