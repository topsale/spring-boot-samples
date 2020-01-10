package com.funtl.spring.hello.moudule.strategy.demo2;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.strategy
 * @ClassName: Test
 * @Author: Administrator
 * Date: 2020/1/1 0001 15:25
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:
 */
public class Test {
    /**
     * 抽象策略角色（Strategy）：这是一个抽象类或者接口，将算法的行为进行封装，所有的策略类都要实现该接口
     * 具体策略角色（ConcreteStrategy）：封装了具体的算法和行为
     * 环境角色（Context）：持有一个抽象策略的引用，并提供统一调用的入口
     * @param args
     */
    public static void main(String[] args) {
        Context context = new Context(new OptionAdd());
        double result = context.executeStrategy(1,3);
        System.out.println("add:" + result);
        context.setCalculator(new OptionSubstract());
        result = context.executeStrategy(1,3);
        System.out.println("substract:" + result);
        context.setCalculator(new OptionMultiply());
        result = context.executeStrategy(1,3);
        System.out.println("multiply:" + result);
        context.setCalculator(new OptionDivide());
        result = context.executeStrategy(1,3);
        System.out.println("divide:" + result);
    }
}
