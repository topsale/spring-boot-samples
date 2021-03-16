package com.funtl.spring.hello.moudule.factory;

import com.funtl.spring.hello.moudule.simpleFactory.Car;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.factory
 * @ClassName: AbstractFactoryTest
 * @Author: Administrator
 * Date: 2020/1/1 0001 16:36
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:
 */
public class AbstractFactoryTest {
    /**
     * 主要创建一个产品族，不同工厂继承父类的抽象工厂创建不同的产品族
     * @param args
     */
    public static void main(String[] args) {
        //1.先创建具体抽象工厂
        AbstractFactory abstractFactory = new CarFactory();
        //2.根据具体的抽象工厂得到车
        Car audi  = abstractFactory.getAudiCar();
        System.out.println(audi.getName());
    }
}
