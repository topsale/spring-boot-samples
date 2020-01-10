package com.funtl.spring.hello.moudule.factory;

import com.funtl.spring.hello.moudule.simpleFactory.Audi;
import com.funtl.spring.hello.moudule.simpleFactory.Benz;
import com.funtl.spring.hello.moudule.simpleFactory.Bmw;
import com.funtl.spring.hello.moudule.simpleFactory.Car;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.factory
 * @ClassName: CarFactory
 * @Author: Administrator
 * Date: 2020/1/1 0001 16:36
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 抽象工厂的具体实现
 */
public class CarFactory  extends  AbstractFactory {
    @Override
    public Car getAudiCar() {
        return new Audi();
    }
    @Override
    public Car getBenzCar() {
        return new Benz();
    }
    @Override
    public Car getBmwCar() {
        return new Bmw();
    }
}
