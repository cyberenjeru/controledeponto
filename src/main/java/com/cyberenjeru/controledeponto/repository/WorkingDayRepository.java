package com.cyberenjeru.controledeponto.repository;

import com.cyberenjeru.controledeponto.model.WorkingDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkingDayRepository extends JpaRepository<WorkingDay, Long> {

}
