package com.appointmentsystem.common.entity;

import jakarta.persistence.*;
// automatically creates getcreate, update etc.
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity {
    // When was this record created, When was it last modified.
    // happens automatically
    @CreationTimestamp
    // Ensures creation time is immutable
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
