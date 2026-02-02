package com.appointmentsystem.repository;

import com.appointmentsystem.entity.Appointment;
import com.appointmentsystem.entity.QueueLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QueueLogRepository extends JpaRepository<QueueLog, Long> {

    List<QueueLog> findByAppointmentOrderByChangedAtDesc(
            Appointment appointment
    );
}
