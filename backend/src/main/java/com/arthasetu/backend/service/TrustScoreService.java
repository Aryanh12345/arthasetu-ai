package com.arthasetu.backend.service;

import com.arthasetu.backend.entity.FinancialBehaviour;
import org.springframework.stereotype.Service;

@Service
public class TrustScoreService {

    // Temporary method used by the existing controller
    public int calculateScore(
            int savings,
            int utility,
            int recharge,
            int ecommerce,
            int incomeStability
    ) {

        double score =
                savings * 3.0 +
                utility * 2.5 +
                recharge * 2.0 +
                ecommerce * 1.5 +
                incomeStability * 1.0;

        return (int) (score * 10);
    }

    // New method for the database-driven version
    public Integer calculate(FinancialBehaviour behaviour) {

        return calculateScore(
                behaviour.getSavingsScore(),
                behaviour.getUtilityPaymentScore(),
                behaviour.getRechargeFrequency(),
                behaviour.getEcommerceActivity(),
                behaviour.getIncomeStability()
        );
    }
}