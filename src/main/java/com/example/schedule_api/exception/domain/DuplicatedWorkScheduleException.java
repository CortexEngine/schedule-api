package com.example.schedule_api.exception.domain;

public class DuplicatedWorkScheduleException extends ConflictException {

    public DuplicatedWorkScheduleException(String message) {
        super(message);
    }

}
