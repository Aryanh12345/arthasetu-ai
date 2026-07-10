package com.arthasetu.backend.service;

import com.arthasetu.backend.dto.FinancialBehaviourRequest;
import com.arthasetu.backend.entity.FinancialBehaviour;
import com.arthasetu.backend.entity.User;
import com.arthasetu.backend.repository.FinancialBehaviourRepository;
import com.arthasetu.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FinancialBehaviourService {

    private final FinancialBehaviourRepository behaviourRepository;

    private final UserRepository userRepository;

    public FinancialBehaviour save(FinancialBehaviourRequest request){

        User user = userRepository.findById(request.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        FinancialBehaviour behaviour =
                behaviourRepository.findByUser(user)
                        .orElse(new FinancialBehaviour());

        behaviour.setUser(user);

        behaviour.setRechargeFrequency(request.getRechargeFrequency());

        behaviour.setUtilityPaymentScore(request.getUtilityPaymentScore());

        behaviour.setEcommerceActivity(request.getEcommerceActivity());

        behaviour.setSavingsScore(request.getSavingsScore());

        behaviour.setIncomeStability(request.getIncomeStability());

        return behaviourRepository.save(behaviour);

    }

}