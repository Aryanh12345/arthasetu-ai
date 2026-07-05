package com.arthasetu.backend.service;

import org.springframework.stereotype.Service;

@Service
public class TrustScoreService {

    public int calculateScore(
            int savings,
            int utility,
            int recharge,
            int ecommerce,
            int incomeStability
    ) {

        double score =
                savings * 3.0 +
                utility * 2.5 +
                recharge * 2.0 +
                ecommerce * 1.5 +
                incomeStability * 1.0;

        return (int)(score * 10);
    }
}