package com.arthasetu.backend.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActionPlanResponse {

    private Integer currentScore;

    private Integer targetScore;

    private Integer estimatedMonths;

    private List<String> actionItems;

}