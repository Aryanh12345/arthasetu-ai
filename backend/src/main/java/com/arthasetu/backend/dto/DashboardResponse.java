package com.arthasetu.backend.dto;


import java.util.List;

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

    private List<TrustScoreHistoryResponse> scoreHistory;

}