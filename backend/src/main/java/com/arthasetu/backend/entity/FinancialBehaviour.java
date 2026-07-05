package com.arthasetu.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FinancialBehaviour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer rechargeFrequency;

    private Integer utilityPaymentScore;

    private Integer ecommerceActivity;

    private Integer savingsScore;

    @OneToOne
    private User user;
}