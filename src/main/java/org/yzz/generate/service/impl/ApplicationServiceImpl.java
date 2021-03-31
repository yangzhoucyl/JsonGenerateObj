package org.yzz.generate.service.impl;

import org.yzz.generate.service.ApplicationService;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class ApplicationServiceImpl implements ApplicationService {

    private String time = null;

    @Override
    public String doSomething() {
        if(time == null) {
            LocalTime localTime = LocalTime.now();
            time = "Application实例创建时间=" + localTime.get(ChronoField.HOUR_OF_DAY) + ":" + localTime.get(ChronoField.MINUTE_OF_HOUR) + ":" + localTime.get(ChronoField.SECOND_OF_MINUTE);
        }
        return time;
    }
}
