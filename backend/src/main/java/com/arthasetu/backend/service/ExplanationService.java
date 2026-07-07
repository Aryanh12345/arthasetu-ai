package com.arthasetu.backend.service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ExplanationService {

    public Map<String,Object> explain(
            int savings,
            int utility,
            int recharge,
            int ecommerce,
            int income){

        Map<String,Object> response=new HashMap<>();

        List<String> strengths=new ArrayList<>();
        List<String> improvements=new ArrayList<>();

        if(savings>=80)
            strengths.add("Strong savings behaviour");
        else
            improvements.add("Increase monthly savings");

        if(utility>=80)
            strengths.add("Pays utility bills on time");
        else
            improvements.add("Improve utility payment consistency");

        if(recharge>=80)
            strengths.add("Consistent mobile recharge pattern");
        else
            improvements.add("Maintain recharge consistency");

        if(ecommerce>=80)
            strengths.add("Healthy digital transaction history");
        else
            improvements.add("Increase trusted digital transactions");

        if(income>=80)
            strengths.add("Stable income");
        else
            improvements.add("Improve income stability");

        response.put("strengths",strengths);
        response.put("improvements",improvements);

        return response;
    }

}