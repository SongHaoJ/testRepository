package com.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task {

    @Scheduled(cron = "0 0 0/3 * * ?")
    public void orderOne(){

    }


}
