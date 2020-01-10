package com.funtl.spring.hello.moudule.strategy.demo1;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.strategy
 * @ClassName: StrategyTest
 * @Author: Administrator
 * Date: 2020/1/1 0001 18:11
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 策略模式测试
 */
public class StrategyTest {
    public static void main(String[] args) {
        Order order = new Order("1","order101",43.23);

        //比如选择阿里支付
        PayState payState =  order.pay(PayType.ALI_PAY);
        System.out.println(payState);
    }
}
