package com.cyberenjeru.controledeponto.controller;

import com.cyberenjeru.controledeponto.model.WorkingDay;
import com.cyberenjeru.controledeponto.service.WorkingDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workingDay")
public class WorkingDayController {
    @Autowired
    WorkingDayService workingDayService;
    @PostMapping
    public WorkingDay createWorkingDay(@RequestBody WorkingDay){
        return workingDayService.saveWorkingDay(WorkingDay);
    }
}
