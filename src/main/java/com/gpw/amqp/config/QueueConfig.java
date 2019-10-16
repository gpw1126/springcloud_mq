package com.gpw.amqp.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 创建消息队列
 * @Author: Gpw
 * @Date: 2019/5/31
 * @Description: com.gpw.amqp.config
 * @Version: 1.0
 */
@Configuration
public class QueueConfig {

    @Bean
    public Queue createQueue(){
        return new Queue("hello-queue");
    }
}
