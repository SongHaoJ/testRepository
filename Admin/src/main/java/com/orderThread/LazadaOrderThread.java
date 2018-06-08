package com.orderThread;

import com.service.LazadaService;
import org.springframework.beans.factory.annotation.Autowired;


public class LazadaOrderThread implements Runnable{

@Autowired
private LazadaService service;

    @Override
    public void run() {

    }
}
