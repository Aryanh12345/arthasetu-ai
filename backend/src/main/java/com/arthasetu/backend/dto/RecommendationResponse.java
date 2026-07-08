package com.arthasetu.backend.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RecommendationResponse {

    private Integer trustScore;

    private String riskLevel;

    private List<String> recommendations;

}