package com.example.patient.controller;

import com.example.patient.entity.Patient;
import com.example.patient.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping
    public String addPatient(@RequestBody Patient patient) {
        return patientService.addPatient(patient);
    }

    @GetMapping
    public List<Patient> getPatients() {
        return patientService.getPatients();
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id) {
        return patientService.getPatientById(id);
    }
}