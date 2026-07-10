package com.arthasetu.backend.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FinancialBehaviourRequest {

    private Long userId;

    private Integer rechargeFrequency;

    private Integer utilityPaymentScore;

    private Integer ecommerceActivity;

    private Integer savingsScore;

    private Integer incomeStability;

}