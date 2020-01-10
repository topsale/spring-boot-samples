package com.funtl.spring.hello.moudule.factory;

import com.funtl.spring.hello.moudule.simpleFactory.Car;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.factory
 * @ClassName: AbstractFactory
 * @Author: Administrator
 * Date: 2020/1/1 0001 16:35
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 抽象工厂
 */
public abstract  class AbstractFactory {
    /**
     * 得到奥迪的车
     * @return
     */
    public abstract Car getAudiCar();
    /**
     * 得到奔驰的车
     * @return
     */
    public abstract     Car getBenzCar();
    /**
     * 得到宝马的车
     * @return
     */
    public abstract     Car getBmwCar();
}
