package com.example.schedule_api.exception.domain;

public class DuplicatedWorkTimeException extends ConflictException {

    public DuplicatedWorkTimeException(String message) {
        super(message);
    }

}
