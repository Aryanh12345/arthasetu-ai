package com.arthasetu.backend.service;

import com.arthasetu.backend.dto.RecommendationResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AIRecommendationService {

    public RecommendationResponse generate(Integer score){

        List<String> list = new ArrayList<>();

        String risk;

        if(score >= 900){

            risk = "Low Risk";

            list.add("Increase equity allocation.");
            list.add("Maintain SIP investments.");
            list.add("Consider international index funds.");
            list.add("Review portfolio every quarter.");

        }

        else if(score >= 750){

            risk = "Balanced";

            list.add("Increase monthly savings.");
            list.add("Invest in index funds.");
            list.add("Build six months emergency fund.");
            list.add("Maintain payment discipline.");

        }

        else{

            risk = "High Risk";

            list.add("Avoid risky investments.");
            list.add("Improve savings consistency.");
            list.add("Reduce unnecessary spending.");
            list.add("Increase income stability.");

        }

        return RecommendationResponse.builder()

                .trustScore(score)
                .riskLevel(risk)
                .recommendations(list)

                .build();

    }

}