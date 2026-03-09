package com.example.schedule_api.exception.business;

public class InvalidWorkTimeException extends UnprocessableEntityException {

    public InvalidWorkTimeException(String message) {
        super(message);
    }

}
