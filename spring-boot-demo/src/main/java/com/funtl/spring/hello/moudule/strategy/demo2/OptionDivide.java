package com.funtl.spring.hello.moudule.strategy.demo2;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.strategy
 * @ClassName: OptionDivide
 * @Author: Administrator
 * Date: 2020/1/1 0001 15:24
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:
 */
//除法实现
public class OptionDivide implements Calculator{
    public double calculate(double num1, double num2) {
        return num1 / num2;
    }
}