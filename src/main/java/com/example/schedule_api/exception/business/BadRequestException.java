package com.example.schedule_api.exception.business;

import com.example.schedule_api.exception.ScheduleApiException;

public class BadRequestException extends ScheduleApiException {

    public BadRequestException(String message) {

        super(message);

    }
}
