package com.arthasetu.backend.controller;

import com.arthasetu.backend.dto.ActionPlanResponse;
import com.arthasetu.backend.service.ActionPlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/action-plan")
@RequiredArgsConstructor
public class ActionPlanController {

    private final ActionPlanService service;

    @GetMapping("/{score}")
    public ActionPlanResponse generate(
            @PathVariable Integer score){

        return service.generate(score);

    }

}