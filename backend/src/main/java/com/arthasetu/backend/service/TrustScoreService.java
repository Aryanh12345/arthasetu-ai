package com.arthasetu.backend.service;

import com.arthasetu.backend.engine.TrustScoreEngine;
import com.arthasetu.backend.entity.FinancialBehaviour;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TrustScoreService {

    private final TrustScoreEngine trustScoreEngine;

    /**
     * Legacy support for existing controllers.
     */
    public int calculateScore(
            int savings,
            int utility,
            int recharge,
            int ecommerce,
            int incomeStability
    ) {

        FinancialBehaviour behaviour = new FinancialBehaviour();

        behaviour.setSavingsScore(savings);
        behaviour.setUtilityPaymentScore(utility);
        behaviour.setRechargeFrequency(recharge);
        behaviour.setEcommerceActivity(ecommerce);
        behaviour.setIncomeStability(incomeStability);

        return trustScoreEngine.calculate(behaviour);

    }

    /**
     * Main method used by the application.
     */
    public Integer calculate(FinancialBehaviour behaviour) {

        return trustScoreEngine.calculate(behaviour);

    }

    public String getFinancialHealth(Integer score){

        return trustScoreEngine.getFinancialHealth(score);

    }

}