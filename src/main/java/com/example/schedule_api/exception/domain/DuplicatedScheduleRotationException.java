package com.example.schedule_api.exception.domain;

public class DuplicatedScheduleRotationException extends ConflictException {

    public DuplicatedScheduleRotationException(String message) {
        super(message);
    }

}
