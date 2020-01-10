package com.funtl.spring.hello.moudule.observer.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.observer.demo3
 * @ClassName: OrderService
 * @Author: Administrator
 * Date: 2020/1/1 0001 19:17
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 订单操作，业务伪代码
 */
@Service
public class OrderService {
    // 注入事件发布器
    @Autowired
    private OrderPublish orderPublish;

    /**
     * 电商 - 新订单订单
     */
    public void saveOrder() {

        System.out.println("1、 订单创建成功");

        // 创建事件 ，可以设置参数
        OrderEvent orderEvent = new OrderEvent(123456);

        // 发布事件
        orderPublish.publishEvent(orderEvent);

    }
}
