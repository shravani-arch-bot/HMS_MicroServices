package com.example.doctorService.entity;

public class Doctor {

    private Long id;
    private String name;
    private String specialization;
    private double fees;

    public Doctor() {
    }

    public Doctor(Long id, String name, String specialization, double fees) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.fees = fees;
    }

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

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }
}