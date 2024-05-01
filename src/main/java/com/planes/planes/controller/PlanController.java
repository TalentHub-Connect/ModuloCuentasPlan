package com.planes.planes.controller;

import com.planes.planes.model.Plan;
import com.planes.planes.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plans")
public class PlanController {

    @Autowired
    private PlanService planService;

    @GetMapping
    public ResponseEntity<List<Plan>> getAllPlans() {
        return ResponseEntity.ok(planService.findAllPlans());
    }

    @PostMapping
    public ResponseEntity<Plan> addPlan(@RequestBody Plan plan) {
        return ResponseEntity.status(201).body(planService.savePlan(plan));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Plan> updatePlan(@PathVariable Long id, @RequestBody Plan planDetails) {
        return ResponseEntity.ok(planService.updatePlan(id, planDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlan(@PathVariable Long id) {
        planService.deletePlan(id);
        return ResponseEntity.ok().build();
    }
}
