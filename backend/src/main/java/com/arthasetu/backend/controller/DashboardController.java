package com.arthasetu.backend.controller;

import com.arthasetu.backend.dto.DashboardResponse;
import com.arthasetu.backend.service.DashboardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dashboard")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
public class DashboardController {

    private final DashboardService dashboardService;

    @GetMapping("/{userId}")
    public DashboardResponse getDashboard(
            @PathVariable Long userId){

        return dashboardService.getDashboard(userId);

    }

}