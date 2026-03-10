package com.example.schedule_api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.schedule_api.domain.model.WorkSchedule;

public interface WorkScheduleRepository extends JpaRepository<WorkSchedule, Long> {

  Optional<WorkSchedule> findByDescription(String description);

  Optional<WorkSchedule> findByIdAndIsActive(Long id, Boolean isActive);

  Optional<WorkSchedule> findByWorkDaysPerWeekAndRestDaysPerWeek(Integer workDays, Integer restDays);

  List<WorkSchedule> findByIsActive(boolean isActive);

}
