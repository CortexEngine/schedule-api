package com.example.schedule_api.exception;

public class ScheduleApiException extends RuntimeException {

    public ScheduleApiException(String message) {

        super(message);

    }

    public ScheduleApiException(String message, Throwable cause) {

        super(message, cause);

    }

}
