package com.example.schedule_api.exception.business;

import com.example.schedule_api.exception.ScheduleApiException;

public class UnprocessableEntityException extends ScheduleApiException {

    public UnprocessableEntityException(String message) {

        super(message);
        
    }
}
