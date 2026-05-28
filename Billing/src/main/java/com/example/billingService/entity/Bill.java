package com.example.billingService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long appointmentId;
    private Long patientId;
    private Long doctorId;
    private double amount;
    private String paymentStatus;

    public Bill() {}

    public Long getId() { return id; }
    public Long getAppointmentId() { return appointmentId; }
    public Long getPatientId() { return patientId; }
    public Long getDoctorId() { return doctorId; }
    public double getAmount() { return amount; }
    public String getPaymentStatus() { return paymentStatus; }

    public void setId(Long id) { this.id = id; }
    public void setAppointmentId(Long appointmentId) { this.appointmentId = appointmentId; }
    public void setPatientId(Long patientId) { this.patientId = patientId; }
    public void setDoctorId(Long doctorId) { this.doctorId = doctorId; }
    public void setAmount(double amount) { this.amount = amount; }
    public void setPaymentStatus(String paymentStatus) { this.paymentStatus = paymentStatus; }
}