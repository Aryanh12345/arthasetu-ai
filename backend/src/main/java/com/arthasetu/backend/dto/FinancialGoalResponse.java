package com.arthasetu.backend.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FinancialGoalResponse {

    private String goalName;

    private Double targetAmount;

    private Double currentAmount;

    private Double progress;

    private Integer targetTrustScore;

}