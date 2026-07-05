package com.arthasetu.backend.controller;

import com.arthasetu.backend.dto.ExplanationResponse;
import com.arthasetu.backend.service.ExplanationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/explain-score")
@RequiredArgsConstructor
public class ExplanationController {

    private final ExplanationService service;

    @GetMapping
    public ExplanationResponse explain() {
        return service.explain();
    }
}