package com.arthasetu.backend.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ScenarioRequest {

    private Integer rechargeFrequency;

    private Integer utilityPaymentScore;

    private Integer ecommerceActivity;

    private Integer savingsScore;

    private Integer incomeStability;

}