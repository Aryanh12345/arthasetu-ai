package com.arthasetu.backend.service;

import com.arthasetu.backend.dto.InvestmentRecommendationResponse;
import org.springframework.stereotype.Service;

@Service
public class InvestmentRecommendationService {

    public InvestmentRecommendationResponse recommend(int trustScore){

        if(trustScore >= 850){

            return InvestmentRecommendationResponse.builder()
                    .riskProfile("Aggressive")
                    .emergencyFund(15)
                    .indexFunds(50)
                    .fixedDeposit(10)
                    .goldETF(10)
                    .skillDevelopment(15)
                    .reason("High financial discipline and stable behaviour.")
                    .build();

        }

        if(trustScore >=700){

            return InvestmentRecommendationResponse.builder()
                    .riskProfile("Balanced")
                    .emergencyFund(20)
                    .indexFunds(40)
                    .fixedDeposit(20)
                    .goldETF(10)
                    .skillDevelopment(10)
                    .reason("Moderate financial stability with good saving habits.")
                    .build();

        }

        return InvestmentRecommendationResponse.builder()
                .riskProfile("Conservative")
                .emergencyFund(40)
                .indexFunds(15)
                .fixedDeposit(30)
                .goldETF(10)
                .skillDevelopment(5)
                .reason("Focus on stability before taking higher investment risk.")
                .build();
    }
}