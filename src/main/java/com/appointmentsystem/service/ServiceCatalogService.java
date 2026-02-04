package com.appointmentsystem.service;

import com.appointmentsystem.entity.ServiceEntity;
import com.appointmentsystem.repository.ServiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCatalogService {

    private final ServiceRepository serviceRepository;

    public ServiceCatalogService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    public ServiceEntity create(ServiceEntity service) {
        service.setActive(true);
        return serviceRepository.save(service);
    }

    public List<ServiceEntity> getAllActive() {
        return serviceRepository.findAll();
    }
}
