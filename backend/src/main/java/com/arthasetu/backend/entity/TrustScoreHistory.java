package com.arthasetu.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "trust_score_history")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TrustScoreHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer trustScore;

    private LocalDateTime calculatedAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}