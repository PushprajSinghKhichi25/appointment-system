package com.appointmentsystem.controller;

import com.appointmentsystem.entity.ServiceEntity;
import com.appointmentsystem.service.ServiceCatalogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/services")
public class ServiceController {

    private final ServiceCatalogService serviceCatalogService;

    public ServiceController(ServiceCatalogService serviceCatalogService) {
        this.serviceCatalogService = serviceCatalogService;
    }

    @PostMapping
    public ServiceEntity create(@RequestBody ServiceEntity service) {
        return serviceCatalogService.create(service);
    }

    @GetMapping
    public List<ServiceEntity> getAll() {
        return serviceCatalogService.getAllActive();
    }
}
