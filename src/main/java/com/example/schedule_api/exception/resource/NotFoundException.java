package com.example.schedule_api.exception.resource;

import com.example.schedule_api.exception.ScheduleApiException;

public class NotFoundException extends ScheduleApiException {

    public NotFoundException(String message) {

        super(message);
        
    }
}
