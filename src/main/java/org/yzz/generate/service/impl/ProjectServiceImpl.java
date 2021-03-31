package org.yzz.generate.service.impl;

import org.yzz.generate.service.ProjectService;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class ProjectServiceImpl implements ProjectService {

    private String time = null;


    @Override
    public String doSomething() {
        if(time == null) {
            LocalTime localTime = LocalTime.now();
            time = "Project实例创建时间=" + localTime.get(ChronoField.HOUR_OF_DAY) + ":" + localTime.get(ChronoField.MINUTE_OF_HOUR) + ":" + localTime.get(ChronoField.SECOND_OF_MINUTE);
        }
        return time;
    }
}
