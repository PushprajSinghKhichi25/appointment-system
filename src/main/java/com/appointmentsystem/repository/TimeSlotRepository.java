package com.appointmentsystem.repository;

import com.appointmentsystem.entity.ServiceEntity;
import com.appointmentsystem.entity.TimeSlot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TimeSlotRepository extends JpaRepository<TimeSlot, Long> {
    List<TimeSlot> findByServiceAndSlotDateAndActiveTrue(
            ServiceEntity service, LocalDate slotDate
    );
}
