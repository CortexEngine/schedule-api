package com.example.schedule_api.exception.business;

public class InvalidWorkScheduleException extends UnprocessableEntityException {

    public InvalidWorkScheduleException(String message) {
        super(message);
    }

}
