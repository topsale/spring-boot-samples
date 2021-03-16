package com.funtl.spring.hello.moudule.strategy.demo2;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.strategy
 * @ClassName: OptionAdd
 * @Author: Administrator
 * Date: 2020/1/1 0001 15:23
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:
 */
//加法实现
    //具体策略角色
public class OptionAdd implements Calculator {
    @Override
    public double calculate(double num1, double num2) {
        return num1 + num2;
    }
}
