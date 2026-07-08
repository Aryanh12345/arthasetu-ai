package com.arthasetu.backend.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ScenarioResponse {

    private Integer predictedTrustScore;

    private String financialHealth;

    private String suggestion;

}