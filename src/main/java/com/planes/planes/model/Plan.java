package com.planes.planes.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "plan")
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String namePlan;
    private String description;
    private String duration;
    private Integer maxNumWorker;
    private String bonuses;
    private String status;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNamePlan() {
        return namePlan;
    }
    public void setNamePlan(String namePlan) {
        this.namePlan = namePlan;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
    public Integer getMaxNumWorker() {
        return maxNumWorker;
    }
    public void setMaxNumWorker(Integer maxNumWorker) {
        this.maxNumWorker = maxNumWorker;
    }
    public String getBonuses() {
        return bonuses;
    }
    public void setBonuses(String bonuses) {
        this.bonuses = bonuses;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
  
    
   
}
