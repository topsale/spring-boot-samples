package com.funtl.spring.hello.moudule.observer.demo3;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.observer.demo3
 * @ClassName: SmsListener
 * @Author: Administrator
 * Date: 2020/1/1 0001 19:18
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 监听器 ,有事件发布后，才会执行
 */
@Component
public class SmsListener implements ApplicationListener<OrderEvent> {
    @Override
    public void onApplicationEvent(OrderEvent event) {

        // 获取事件中的参数。
        System.out.println("event.getSource的值是："+event.getSource());

        // 2---短信通知
        System.out.println("2、 调用短信发送的接口 -> 恭喜喜提羽绒被子");
    }
}
