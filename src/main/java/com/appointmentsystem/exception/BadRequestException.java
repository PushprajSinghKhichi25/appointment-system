package com.appointmentsystem.exception;
// reusable class that we call directly call for handling errors in service layer.
// Does not require throws declaration
public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message);
    }
}
