package com.arthasetu.backend.engine;

import com.arthasetu.backend.entity.FinancialBehaviour;
import org.springframework.stereotype.Component;

@Component
public class TrustScoreEngine {

    public int calculate(FinancialBehaviour behaviour) {

        if (behaviour == null) {
            return 0;
        }

        double score =
                behaviour.getSavingsScore() * 3.0 +
                behaviour.getUtilityPaymentScore() * 2.5 +
                behaviour.getRechargeFrequency() * 2.0 +
                behaviour.getEcommerceActivity() * 1.5 +
                behaviour.getIncomeStability() * 1.0;

        int trustScore = (int) Math.round(score);

        return Math.max(0, Math.min(1000, trustScore));
    }

    public String getFinancialHealth(int score) {

        if (score >= 900) {
            return "Excellent";
        }

        if (score >= 750) {
            return "Good";
        }

        if (score >= 600) {
            return "Fair";
        }

        return "Needs Improvement";
    }
}