package com.yitong.seckill_demo1.mq;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class MQTest {
    @Autowired
    RocketMQService rocketMQService;
    @Test
    public void sendMQTest() throws Exception {
        rocketMQService.sendMessage("test-jiuzhang", "Hello World!" + new Date().toString());
    }
}