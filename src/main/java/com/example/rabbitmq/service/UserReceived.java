package com.example.rabbitmq.service;

import com.example.rabbitmq.model.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/** @Author: shuyizhi @Date: 2018-08-28 10:52 @Description: */
@Component
@RabbitListener(queues = "userQueue")
public class UserReceived {
    @RabbitHandler
    public void process(User user) {
        System.out.println("user received: " + user.toString());
    }
}
