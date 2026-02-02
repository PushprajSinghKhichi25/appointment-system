package com.appointmentsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "queue_logs")
@Getter
@Setter
public class QueueLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "appointment_id")
    private Appointment appointment;

    private Integer oldPosition;
    private Integer newPosition;

    private String reason;

    private LocalDateTime changedAt = LocalDateTime.now();
}
