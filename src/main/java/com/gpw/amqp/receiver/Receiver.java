package com.gpw.amqp.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消息接收者
 * @Author: Gpw
 * @Date: 2019/5/31
 * @Description: com.gpw.amqp.receiver
 * @Version: 1.0
 */
@Component
public class Receiver {
    /**
     * 接收消息的方法。采用消息队列监听机制
     * @param msg
     */
    @RabbitListener(queues="hello-queue")
    public void process(String msg){
        System.out.println("receiver: "+msg);
    }
}
