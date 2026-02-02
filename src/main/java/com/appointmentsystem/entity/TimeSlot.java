package com.appointmentsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "time_slots")
@Getter
@Setter
public class TimeSlot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private ServiceEntity service;

    private LocalDate slotDate;

    private LocalTime startTime;
    private LocalTime endTime;

    private Integer maxCapacity;

    private boolean active = true;
}
