package com.example.schedule_api.dto.response;

import java.util.List;

public record ScheduleRotationResponseDTO (

  Integer workSchedule,

  Integer workTime,

  List<Integer> dayIndexs,

  List<Boolean> workdays

) {};
