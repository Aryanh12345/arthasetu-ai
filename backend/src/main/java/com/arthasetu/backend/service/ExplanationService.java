package com.arthasetu.backend.service;

import com.arthasetu.backend.dto.ExplanationResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExplanationService {

    public ExplanationResponse explain() {

        return ExplanationResponse.builder()
                .trustScore(797)
                .confidence("HIGH")

                .topFactors(List.of(
                        "Strong savings behaviour",
                        "Regular utility payments",
                        "Consistent mobile recharges"
                ))

                .improvements(List.of(
                        "Create an emergency fund",
                        "Start monthly SIP investments",
                        "Reduce unnecessary spending"
                ))

                .financialHealth("GOOD")
                .build();
    }
}