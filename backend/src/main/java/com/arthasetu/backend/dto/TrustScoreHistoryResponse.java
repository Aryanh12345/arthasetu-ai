package com.arthasetu.backend.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TrustScoreHistoryResponse {

    private String label;

    private Integer score;

}