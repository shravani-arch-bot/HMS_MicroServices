package com.example.appointmentService.controller;

import com.example.appointmentService.entity.Appointment;
import com.example.appointmentService.service.AppointmentService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @GetMapping("/")
    public String home() {

        return "Appointment Service Running";
    }

    @PostMapping
    public String bookAppointment(@RequestBody Appointment appointment) {

        return appointmentService.bookAppointment(appointment);
    }

    @GetMapping
    public List<Appointment> getAppointments() {

        return appointmentService.getAppointments();
    }
}