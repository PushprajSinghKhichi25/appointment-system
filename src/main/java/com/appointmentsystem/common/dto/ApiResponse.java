package com.appointmentsystem.common.dto;
// dto- data transfer object(Used to send data between backend and client)
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// generates constructor automatically
@AllArgsConstructor
// ApiResponse<T> is a generic class. T means the response can carry any type of data
// This makes the response reusable for all APIs.
public class ApiResponse<T> {
    private boolean success;
    private String message;
    private T data;
}
// this class is reusable. generic DTO used to standardize API responses by wrapping success status, message. eg.
//return new ApiResponse<>(true, "Service created", service);


