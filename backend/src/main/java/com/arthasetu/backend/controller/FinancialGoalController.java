package com.arthasetu.backend.controller;

import com.arthasetu.backend.dto.FinancialGoalResponse;
import com.arthasetu.backend.entity.FinancialGoal;
import com.arthasetu.backend.entity.User;
import com.arthasetu.backend.service.FinancialGoalService;
import com.arthasetu.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/goals")
@RequiredArgsConstructor
public class FinancialGoalController {

    private final FinancialGoalService service;

    private final UserService userService;

    @PostMapping
    public FinancialGoal save(
            @RequestBody FinancialGoal goal) {

        return service.save(goal);

    }

    @GetMapping("/{userId}")
    public List<FinancialGoalResponse> getGoals(
            @PathVariable Long userId) {

        User user = userService.getUser(userId);

        return service.getGoals(user);

    }

}