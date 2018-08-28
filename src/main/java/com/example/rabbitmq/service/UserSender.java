package com.example.rabbitmq.service;

import com.example.rabbitmq.model.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/** @Author: shuyizhi @Date: 2018-08-28 10:39 @Description: */
@Component
public class UserSender {
    @Autowired private AmqpTemplate rabbitTemplate;

    public void send() {
        User user = new User();
        user.setName("hzb");
        user.setPass("123456789");

        System.out.println("user Send: " + user.toString());
        rabbitTemplate.convertAndSend("userQueue", user);
    }
}
