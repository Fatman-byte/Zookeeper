package com.qianfeng.user.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * author:刘强
 * date:2019/9/1820:32
 * description:注册中心注册远程过程调用
 */
@Configuration
public class Dubboconfig {
    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig a = new ApplicationConfig();
        a.setName("test");
        return a;
    }
    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("baseservice.qfjava.cn:8601,baseservice.qfjava.cn:8602,baseservice.qfjava.cn:8603");
        registryConfig.setProtocol("zookeeper");
        return registryConfig;
    }

    /**
     * 注册中心
     * @return
     */
    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(12345);
        return protocolConfig;
    }
}
