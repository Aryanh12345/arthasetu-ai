package com.arthasetu.backend.controller;

import com.arthasetu.backend.service.ExplanationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/explanation")
@RequiredArgsConstructor
public class ExplanationController {

    private final ExplanationService service;

    @GetMapping
    public Map<String,Object> explain(){

        return service.explain(
                90,
                85,
                75,
                60,
                80
        );

    }

}