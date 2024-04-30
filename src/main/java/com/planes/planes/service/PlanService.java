package com.planes.planes.service;


import com.planes.planes.model.Plan;
import com.planes.planes.repository.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanService {

    @Autowired
    private PlanRepository planRepository;

    public List<Plan> findAllPlans() {
        return planRepository.findAll();
    }

    public Plan savePlan(Plan plan) {
        return planRepository.save(plan);
    }

    public Plan updatePlan(Long id, Plan newPlan) {
        return planRepository.findById(id)
            .map(plan -> {
                plan.setNamePlan(newPlan.getNamePlan());
                plan.setDescription(newPlan.getDescription());
                plan.setDuration(newPlan.getDuration());
                plan.setMaxNumWorker(newPlan.getMaxNumWorker());
                plan.setBonuses(newPlan.getBonuses());
                plan.setStatus(newPlan.getStatus());
                return planRepository.save(plan);
            })
            .orElseGet(() -> {
                newPlan.setId(id);
                return planRepository.save(newPlan);
            });
    }

    public void deletePlan(Long id) {
        planRepository.deleteById(id);
    }

    public Optional<Plan> findById(Long id) {
        return planRepository.findById(id);
    }
}
