package com.appointmentsystem.repository;

import com.appointmentsystem.entity.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ServiceRepository extends JpaRepository<ServiceEntity, Long> {
    // Fetch only active services (used for customer view)
    List<ServiceEntity> findByActiveTrue();

    // Optional: admin search / validation
    boolean existsByName(String name);
}
