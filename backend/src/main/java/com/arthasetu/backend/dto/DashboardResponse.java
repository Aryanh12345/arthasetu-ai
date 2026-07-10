package com.arthasetu.backend.dto;

import com.arthasetu.backend.entity.User;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DashboardResponse {

    private User user;

    private Integer trustScore;

    private String financialHealth;

    private RecommendationResponse recommendation;

    private ActionPlanResponse actionPlan;

}