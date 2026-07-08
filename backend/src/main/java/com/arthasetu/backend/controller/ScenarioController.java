package com.arthasetu.backend.controller;

import com.arthasetu.backend.dto.ScenarioRequest;
import com.arthasetu.backend.dto.ScenarioResponse;
import com.arthasetu.backend.service.ScenarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/scenario")
@RequiredArgsConstructor
public class ScenarioController {

    private final ScenarioService service;

    @PostMapping
    public ScenarioResponse predict(

            @RequestBody ScenarioRequest request) {

        return service.predict(request);

    }

}