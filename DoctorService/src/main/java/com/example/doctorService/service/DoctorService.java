package com.example.doctorService.service;

import com.example.doctorService.entity.Doctor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorService {

    private final List<Doctor> doctors = new ArrayList<>();

    public String addDoctor(Doctor doctor) {
        doctors.add(doctor);
        return "Doctor added successfully";
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }
}