package com.funtl.spring.hello.moudule.strategy.demo2;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.strategy
 * @ClassName: Context
 * @Author: Administrator
 * Date: 2020/1/1 0001 15:25
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:
 */
//定义计算
    //环境角色
public class Context {
    private Calculator calculator;
    public Context(Calculator calculator) {
        this.calculator = calculator;
    }
    public double executeStrategy(int num1, int num2){
        return calculator.calculate(num1, num2);
    }
    public Calculator getCalculator() {
        return calculator;
    }
    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }
}
