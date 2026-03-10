package com.example.schedule_api.exception.business;

public class InvalidScheduleRotationException extends UnprocessableEntityException {

    public InvalidScheduleRotationException(String message) {
        super(message);
    }

}
