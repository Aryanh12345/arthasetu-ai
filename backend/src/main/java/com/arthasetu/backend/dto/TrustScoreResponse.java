package com.arthasetu.backend.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TrustScoreResponse {

    private int score;

    private String confidence;

    private String topPositiveFactor;

    private String improvementArea;
}