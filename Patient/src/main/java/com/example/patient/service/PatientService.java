package com.example.patient.service;

import com.example.patient.entity.Patient;
import com.example.patient.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public String addPatient(Patient patient) {
        patientRepository.save(patient);
        return "Patient added successfully";
    }

    public List<Patient> getPatients() {
        return patientRepository.findAll();
    }

    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).orElse(null);
    }
}