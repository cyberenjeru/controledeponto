package com.cyberenjeru.controledeponto.controller;

import com.cyberenjeru.controledeponto.model.WorkingDay;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workingDay")
public class WorkingDayController {

    @PostMapping
    public WorkingDay createWorkingDay(){
        return null;
    }
}
