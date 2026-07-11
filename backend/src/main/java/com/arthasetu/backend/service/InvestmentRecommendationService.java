package com.arthasetu.backend.service;

import com.arthasetu.backend.dto.InvestmentRecommendationResponse;
import org.springframework.stereotype.Service;

@Service
public class InvestmentRecommendationService {

    public InvestmentRecommendationResponse generate(Integer trustScore) {

        if (trustScore >= 850) {

            return InvestmentRecommendationResponse.builder()
                    .riskProfile("Aggressive Growth")
                    .emergencyFund(15)
                    .indexFunds(55)
                    .fixedDeposit(10)
                    .goldETF(10)
                    .skillDevelopment(10)
                    .reason("Strong financial discipline allows higher equity allocation.")
                    .build();

        }

        if (trustScore >= 700) {

            return InvestmentRecommendationResponse.builder()
                    .riskProfile("Balanced")
                    .emergencyFund(20)
                    .indexFunds(40)
                    .fixedDeposit(20)
                    .goldETF(10)
                    .skillDevelopment(10)
                    .reason("Balanced portfolio suitable for moderate risk.")
                    .build();

        }

        return InvestmentRecommendationResponse.builder()
                .riskProfile("Conservative")
                .emergencyFund(35)
                .indexFunds(20)
                .fixedDeposit(30)
                .goldETF(10)
                .skillDevelopment(5)
                .reason("Focus on financial stability before increasing investment risk.")
                .build();

    }

}