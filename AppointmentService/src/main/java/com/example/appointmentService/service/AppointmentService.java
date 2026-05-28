package com.example.appointmentService.service;

import com.example.appointmentService.entity.Appointment;
import com.example.appointmentService.repository.AppointmentRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final RestTemplate restTemplate;

    public AppointmentService(AppointmentRepository appointmentRepository, RestTemplate restTemplate) {
        this.appointmentRepository = appointmentRepository;
        this.restTemplate = restTemplate;
    }

    public String bookAppointment(Appointment appointment) {
        try {

            String url = "http://PATIENT-SERVICE/patients/" + appointment.getPatientId();

            Map patient = restTemplate.getForObject(url, Map.class);

            if (patient == null || patient.isEmpty()) {
                return "Patient not found";
            }

            appointment.setStatus("BOOKED");
            appointmentRepository.save(appointment);

            Map<String, Object> bill = new HashMap<>();

            bill.put("appointmentId", appointment.getId());
            bill.put("patientId", appointment.getPatientId());
            bill.put("doctorId", appointment.getDoctorId());
            bill.put("amount", 1500);

            restTemplate.postForObject(
                    "http://BILLING-SERVICE/bills",
                    bill,
                    String.class
            );

            return "Appointment booked successfully and bill generated for patient: " + patient.get("name");

        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    public List<Appointment> getAppointments() {
        return appointmentRepository.findAll();
    }
}