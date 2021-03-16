package com.funtl.spring.hello.moudule.factory;

import com.funtl.spring.hello.moudule.simpleFactory.Audi;
import com.funtl.spring.hello.moudule.simpleFactory.Car;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.factory
 * @ClassName: AudiFactory
 * @Author: Administrator
 * Date: 2020/1/1 0001 16:30
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:
 */
public class AudiFactory implements Factory {
    @Override
    public Car getCar() {
        return new Audi();
    }
}
