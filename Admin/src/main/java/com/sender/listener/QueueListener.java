package com.sender.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class QueueListener {

    @JmsListener(destination = "publish.que", containerFactory = "jmsListenerContainerQueue")
    @SendTo("out.que")
    public String receive(String text){
        System.out.println("QueueListener: consumer-t 收到一条信息: " + text+"时间："+System.currentTimeMillis()/1000);
        return "consumer-a received : " + text;
    }
}