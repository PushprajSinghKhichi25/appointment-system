package com.appointmentsystem.service;

import com.appointmentsystem.entity.TimeSlot;
import com.appointmentsystem.repository.TimeSlotRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeSlotService {

    private final TimeSlotRepository timeSlotRepository;

    public TimeSlotService(TimeSlotRepository timeSlotRepository) {
        this.timeSlotRepository = timeSlotRepository;
    }

    public TimeSlot create(TimeSlot slot) {
        slot.setActive(true);
        return timeSlotRepository.save(slot);
    }

    public List<TimeSlot> getAll() {
        return timeSlotRepository.findAll();
    }
}
