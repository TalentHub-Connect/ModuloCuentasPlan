package com.planes.planes.model;

import jakarta.persistence.*;

@Entity
@Table(name = "plan")
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Integer maxNumWorkers;
    private Double price;
    private String duration;
    private Integer company_id;  

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMaxNumWorkers() {
        return maxNumWorkers;
    }

    public void setMaxNumWorkers(Integer maxNumWorkers) {
        this.maxNumWorkers = maxNumWorkers;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getCompanyId() {
        return company_id;
    }

    public void setCompanyId(Integer company_id) {
        this.company_id = company_id;
    }
}
