package com.cyberenjeru.controledeponto.service;

import com.cyberenjeru.controledeponto.model.WorkingDay;
import com.cyberenjeru.controledeponto.repository.WorkingDayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkingDayService {

    WorkingDayRepository workingDayRepository;
    @Autowired
    public WorkingDayService(WorkingDayRepository workingDayRepository){
        this.workingDayRepository = workingDayRepository;
    }
    public WorkingDay saveWorkingDay(WorkingDay workingDay){
        return workingDayRepository.save(workingDay);
    }
}
