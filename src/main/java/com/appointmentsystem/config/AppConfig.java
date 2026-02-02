package com.appointmentsystem.config;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

import java.util.TimeZone;

// Tells Spring that this class is a source of configuration and should be managed as a Spring bean.
@Configuration
public class AppConfig {
// This annotation marks a method that should run once after the bean is created and initialized by Spring.
    @PostConstruct
//    Declares the method that will run at startup.
    public void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }
}
// this class exists to set global application behavior at startup — specifically, to make your whole app use UTC time
