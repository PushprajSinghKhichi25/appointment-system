package com.appointmentsystem.controller;

import com.appointmentsystem.common.dto.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/health")
    public ApiResponse<String> health() {
        return new ApiResponse<>(true, "Application running", "OK");
    }
}
