package com.arthasetu.backend.service;

import com.arthasetu.backend.dto.ActionPlanResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActionPlanService {

    public ActionPlanResponse generate(Integer trustScore){

        List<String> actions = new ArrayList<>();

        actions.add("Increase monthly savings by ₹2,000.");
        actions.add("Increase SIP investment by ₹1,000.");
        actions.add("Maintain timely utility payments.");
        actions.add("Build an emergency fund covering 6 months of expenses.");

        int targetScore = Math.min(900, trustScore + 70);

        int months = trustScore >= 850 ? 3 : 6;

        return ActionPlanResponse.builder()
                .currentScore(trustScore)
                .targetScore(targetScore)
                .estimatedMonths(months)
                .actionItems(actions)
                .build();
    }

}