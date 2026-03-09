package com.example.schedule_api.mapper;

import org.mapstruct.*;

import com.example.schedule_api.domain.model.WorkTime;
import com.example.schedule_api.dto.request.WorkTimeRequestDTO;
import com.example.schedule_api.dto.response.WorkTimeResponseDTO;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface WorkTimeMapper {

  @Mapping(target = "id", ignore = true)
  WorkTime toEntity (WorkTimeRequestDTO dto);

  void updateEntity (@MappingTarget WorkTime workTime, WorkTime dto);

  WorkTimeResponseDTO toResponse(WorkTime workTime);

}
