package com.example.schedule_api.exception.domain;

import com.example.schedule_api.exception.ScheduleApiException;

public class ConflictException extends ScheduleApiException {

    public ConflictException(String message) {

        super(message);
        
    }
}
