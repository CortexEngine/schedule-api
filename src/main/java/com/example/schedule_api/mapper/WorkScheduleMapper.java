package com.example.schedule_api.mapper;

import org.mapstruct.*;

import com.example.schedule_api.domain.model.WorkSchedule;
import com.example.schedule_api.dto.request.WorkScheduleRequestDTO;
import com.example.schedule_api.dto.response.WorkScheduleResponseDTO;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface WorkScheduleMapper {

  @Mapping(target = "id", ignore = true)
  WorkSchedule toEntity (WorkScheduleRequestDTO dto);

  void updateEntity (@MappingTarget WorkSchedule workSchedule, WorkSchedule dto);

  WorkScheduleResponseDTO toResponse(WorkSchedule workSchedule);
  
}
