package com.arthasetu.backend.controller;

import com.arthasetu.backend.dto.FinancialBehaviourRequest;
import com.arthasetu.backend.entity.FinancialBehaviour;
import com.arthasetu.backend.service.FinancialBehaviourService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/financial-behaviour")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
public class FinancialBehaviourController {

    private final FinancialBehaviourService service;

    @PostMapping
    public FinancialBehaviour save(

            @RequestBody FinancialBehaviourRequest request){

        return service.save(request);

    }

}