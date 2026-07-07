package com.arthasetu.backend.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InvestmentRecommendationResponse {

    private String riskProfile;

    private Integer emergencyFund;

    private Integer indexFunds;

    private Integer fixedDeposit;

    private Integer goldETF;

    private Integer skillDevelopment;

    private String reason;
}