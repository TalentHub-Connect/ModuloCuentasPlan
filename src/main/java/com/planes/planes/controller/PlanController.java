package com.planes.planes.controller;

import com.planes.planes.model.Plan;
import com.planes.planes.repository.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/planes")
public class PlanController {

    @Autowired
    private PlanRepository planRepository;

    @GetMapping
    public List<Plan> getAllPlans() {
        return planRepository.findAll();
    }

    @PostMapping("/add")
    public Plan addPlan(@RequestBody Plan plan) {
        return planRepository.save(plan);
    }

    @PutMapping("/edit/{id}")
    public Plan updatePlan(@PathVariable Long id, @RequestBody Plan planDetails) {
        Plan plan = planRepository.findById(id).orElseThrow(() -> new RuntimeException("Plan not found"));
        // Set properties from planDetails to plan
        return planRepository.save(plan);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePlan(@PathVariable Long id) {
        planRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}

