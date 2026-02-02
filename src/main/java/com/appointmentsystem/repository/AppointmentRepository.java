package com.appointmentsystem.repository;

import com.appointmentsystem.entity.Appointment;
import com.appointmentsystem.entity.TimeSlot;
import com.appointmentsystem.entity.User;
import com.appointmentsystem.enums.AppointmentStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    // Customer: view own appointments
    List<Appointment> findByCustomer(User customer);

    // Staff: view appointments by status
    List<Appointment> findByStaffAndStatusOrderByQueuePosition(
            User staff, AppointmentStatus status
    );

    // Queue count per slot
    long countByTimeSlotAndStatus(
            TimeSlot timeSlot, AppointmentStatus status
    );
}
