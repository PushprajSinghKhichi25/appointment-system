package com.appointmentsystem.controller;

import com.appointmentsystem.entity.TimeSlot;
import com.appointmentsystem.service.TimeSlotService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/timeslots")
public class TimeSlotController {

    private final TimeSlotService timeSlotService;

    public TimeSlotController(TimeSlotService timeSlotService) {
        this.timeSlotService = timeSlotService;
    }

    @PostMapping
    public TimeSlot create(@RequestBody TimeSlot slot) {
        return timeSlotService.create(slot);
    }

    @GetMapping
    public List<TimeSlot> getAll() {
        return timeSlotService.getAll();
    }
}
