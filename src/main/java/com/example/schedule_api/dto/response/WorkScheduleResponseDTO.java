package com.example.schedule_api.dto.response;

public record WorkScheduleResponseDTO (

  String description,

  Integer workDaysPerWeek,

  Integer restDaysPerWeek,

  Boolean isActive

) {};
