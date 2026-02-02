package com.appointmentsystem.entity;

import com.appointmentsystem.common.entity.BaseEntity;
import com.appointmentsystem.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;

//    Tells JPA how to store the Role enum.
    @Enumerated(EnumType.STRING)
    private Role role;

    private String phone;

//    Indicates whether the user account is active.
    private boolean active = true;
}