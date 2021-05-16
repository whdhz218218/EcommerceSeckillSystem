package com.yitong.seckill_demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.yitong"})
@SpringBootApplication
@MapperScan("com.yitong.seckill_demo1.db.mappers")
public class SeckillDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(SeckillDemo1Application.class, args);
    }

}