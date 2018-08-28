package com.example.rabbitmq.controller;

import com.example.rabbitmq.service.UserSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** @Author: shuyizhi @Date: 2018-08-27 16:51 @Description: */
@RestController
@RequestMapping(value = "/rabbit")
public class RabbitTest {
    // @Autowired private HelloSender1 helloSender1;
    // @Autowired private HelloSender2 helloSender2;
    @Autowired private UserSender userSender;

    // @Autowired private TopicSender topicSender;

    // @Autowired private FanoutSender fanoutSender;

    // @PostMapping(value = "/hello")
    // public void hello() {
    //    helloSender1.send();
    // }
    //
    /// ** 单生产者--多消费者 */
    // @PostMapping(value = "/oneToMany")
    // public void oneToMany() {
    //    for (int i = 0; i < 10; i++) {
    //        helloSender1.sendMsg("hellomsg: " + i + " ");
    //    }
    // }
    //
    /// ** 多生产者--多消费者 */
    // @PostMapping(value = "/manyToMany")
    // public void manyToMany() {
    //    for (int i = 0; i < 10; i++) {
    //        helloSender1.sendMsg("hellomsg" + i);
    //        helloSender2.send("hellomsg" + i);
    //    }
    // }

    /** 实体类传输 */
    @PostMapping(value = "/testUser")
    public void testUser() {
        userSender.send();
    }

    /// ** topic测试:::有点问题，接收端不能按照统一的匹配方式接受 */
    // @PostMapping(value = "/testTopic")
    // public void testTopic() {
    //    topicSender.send();
    // }

    // @PostMapping(value = "/testFanout")
    // public void testFanout() {
    //    fanoutSender.send();
    // }
}
