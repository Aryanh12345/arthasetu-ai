package com.arthasetu.backend.service;

import com.arthasetu.backend.dto.FinancialGoalResponse;
import com.arthasetu.backend.entity.FinancialGoal;
import com.arthasetu.backend.entity.User;
import com.arthasetu.backend.repository.FinancialGoalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FinancialGoalService {

    private final FinancialGoalRepository repository;

    public FinancialGoal save(FinancialGoal goal) {

        return repository.save(goal);

    }

    public List<FinancialGoalResponse> getGoals(User user) {

        return repository.findByUser(user)
                .stream()
                .map(goal -> {

                    double progress = 0;

                    if (goal.getTargetAmount() != null
                            && goal.getTargetAmount() > 0) {

                        progress =
                                (goal.getCurrentAmount()
                                        / goal.getTargetAmount()) * 100;
                    }

                    return FinancialGoalResponse.builder()
                            .goalName(goal.getGoalName())
                            .targetAmount(goal.getTargetAmount())
                            .currentAmount(goal.getCurrentAmount())
                            .progress(progress)
                            .targetTrustScore(
                                    goal.getTargetTrustScore()
                            )
                            .build();

                })
                .toList();

    }

}