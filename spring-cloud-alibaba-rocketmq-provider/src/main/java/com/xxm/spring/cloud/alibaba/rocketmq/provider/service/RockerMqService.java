package com.xxm.spring.cloud.alibaba.rocketmq.provider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

@Service
public class RockerMqService {

    @Autowired
    private MessageChannel output;


    public void send(String message){
        output.send(MessageBuilder.withPayload(message).build());
    }
}
