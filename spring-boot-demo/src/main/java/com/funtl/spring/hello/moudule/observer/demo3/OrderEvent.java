package com.funtl.spring.hello.moudule.observer.demo3;

import org.springframework.context.ApplicationEvent;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.observer.demo3
 * @ClassName: OrderEvent
 * @Author: Administrator
 * Date: 2020/1/1 0001 19:16
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 定义事件
 */
public class OrderEvent extends ApplicationEvent {
    public OrderEvent(Object source) {
        super(source);
    }
}
