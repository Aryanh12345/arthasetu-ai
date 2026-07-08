package com.arthasetu.backend.dto;

import lombok.Data;

@Data
public class ScenarioRequest {

    private Integer savingsScore;

    private Integer utilityPaymentScore;

    private Integer rechargeFrequency;

    private Integer ecommerceActivity;

    private Integer incomeStability;

}