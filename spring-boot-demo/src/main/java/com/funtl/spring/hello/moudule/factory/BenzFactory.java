package com.funtl.spring.hello.moudule.factory;

import com.funtl.spring.hello.moudule.simpleFactory.Benz;
import com.funtl.spring.hello.moudule.simpleFactory.Car;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.factory
 * @ClassName: BenzFactory
 * @Author: Administrator
 * Date: 2020/1/1 0001 16:32
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:
 */
public class BenzFactory implements Factory {
    @Override
    public Car getCar() {
        return new Benz();
    }
}
