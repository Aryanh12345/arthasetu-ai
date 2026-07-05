package com.arthasetu.backend.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExplanationResponse {

    private Integer trustScore;

    private String confidence;

    private List<String> topFactors;

    private List<String> improvements;

    private String financialHealth;
}