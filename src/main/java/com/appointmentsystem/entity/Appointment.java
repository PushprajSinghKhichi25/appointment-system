package com.appointmentsystem.entity;

import com.appointmentsystem.common.entity.BaseEntity;
import com.appointmentsystem.enums.AppointmentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "appointments")
@Getter
@Setter
public class Appointment extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
// for customers-> Many appointments → one customer.
//    customer_id is a foreign key referencing users.id
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;
// staff_id links to users.id. Staff is usually a user with role STAFF.
    @ManyToOne
    @JoinColumn(name = "staff_id")
    private User staff;
// Many appointments can reference the same service
    @ManyToOne
    @JoinColumn(name = "service_id")
    private ServiceEntity service;

    @ManyToOne
    @JoinColumn(name = "time_slot_id")
    private TimeSlot timeSlot;

    @Enumerated(EnumType.STRING)
    private AppointmentStatus status;

    private Integer queuePosition;

    private boolean walkIn;
}
