package com.appointmentsystem.service;

import com.appointmentsystem.entity.Appointment;
import com.appointmentsystem.enums.AppointmentStatus;
import com.appointmentsystem.repository.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    // create new appointment
    public Appointment create(Appointment appointment) {
        appointment.setStatus(AppointmentStatus.BOOKED);
        // saves to the database using save(). by default -> booked.
        return appointmentRepository.save(appointment);
    }

    // fetch all appointments
    public List<Appointment> getAll() {
        return appointmentRepository.findAll();
    }
}
