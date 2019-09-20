package com.qianfeng.user;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * author:刘强
 * date:2019/9/1820:15
 * description:启动类
 */
@SpringBootApplication
@EnableDubbo
public class UserServiceStartApp {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceStartApp.class,args);
    }
}
