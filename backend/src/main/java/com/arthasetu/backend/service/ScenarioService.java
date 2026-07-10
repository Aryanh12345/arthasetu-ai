package com.arthasetu.backend.service;

import com.arthasetu.backend.dto.ScenarioRequest;
import com.arthasetu.backend.dto.ScenarioResponse;
import com.arthasetu.backend.engine.TrustScoreEngine;
import com.arthasetu.backend.entity.FinancialBehaviour;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScenarioService {

    private final TrustScoreEngine trustScoreEngine;

    public ScenarioResponse predict(ScenarioRequest request) {

        FinancialBehaviour behaviour = new FinancialBehaviour();

        behaviour.setSavingsScore(request.getSavingsScore());
        behaviour.setUtilityPaymentScore(request.getUtilityPaymentScore());
        behaviour.setRechargeFrequency(request.getRechargeFrequency());
        behaviour.setEcommerceActivity(request.getEcommerceActivity());
        behaviour.setIncomeStability(request.getIncomeStability());

        int trustScore = trustScoreEngine.calculate(behaviour);

        String health = trustScoreEngine.getFinancialHealth(trustScore);

        String suggestion;

        switch (health) {

            case "Excellent" ->
                    suggestion = "Excellent financial discipline. Continue diversified investments.";

            case "Good" ->
                    suggestion = "Increase SIP investments and maintain consistent savings.";

            case "Fair" ->
                    suggestion = "Improve monthly savings and avoid delayed bill payments.";

            default ->
                    suggestion = "Focus on income stability, regular savings and financial discipline.";

        }

        return ScenarioResponse.builder()
                .predictedTrustScore(trustScore)
                .financialHealth(health)
                .suggestion(suggestion)
                .build();
    }
}