package com.arthasetu.backend.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AnalyticsResponse {

    private Integer trustScore;

    private String financialHealth;

    private Integer savings;

    private Integer utilityPayments;

    private Integer ecommerce;

    private Integer incomeStability;

    private Integer rechargeFrequency;

    private Integer overallProgress;

    private String riskProfile;

}