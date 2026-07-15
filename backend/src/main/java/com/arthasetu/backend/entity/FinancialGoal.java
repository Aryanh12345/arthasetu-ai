package com.arthasetu.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "financial_goals")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FinancialGoal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String goalName;

    private Double targetAmount;

    private Double currentAmount;

    private Integer targetTrustScore;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}