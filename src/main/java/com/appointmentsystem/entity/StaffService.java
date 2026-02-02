package com.appointmentsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
// Adds a composite unique constraint: A staff member cannot be linked to the same service twice.
@Table(name = "staff_services",
        uniqueConstraints = @UniqueConstraint(
                columnNames = {"staff_id", "service_id"}))
@Getter
@Setter
public class StaffService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    Many StaffService records can point to one staff user.
    @ManyToOne
//    Create (or use) a column named staff_id in this table,
//and use it as a foreign key to another table.
    @JoinColumn(name = "staff_id")
    private User staff;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private ServiceEntity service;
}
// A JOIN connects two tables using a common column.
