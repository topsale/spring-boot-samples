package com.funtl.spring.hello.moudule.factory;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.factory
 * @ClassName: FactoryTest
 * @Author: Administrator
 * Date: 2020/1/1 0001 16:32
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:
 */
public class FactoryTest {
    /**
     * 通常由应用程序直接使用 new 创建新的对象， 为了将对象的创建和使用相分离， 采用工厂方法模式方法,即应用程序将对象的创建及初始化职责交给工厂对象
     * @param args
     */
    public static void main(String[] args) {
        //1.首先先创建一个奥迪工厂出来
        Factory factory = new AudiFactory();
        //2.然后根据工厂得到奥迪车，具体的造车工厂交给工厂来完成
        System.out.println(factory.getCar().getName());
        factory = new BmwFactory();
        System.out.println(factory.getCar().getName());
    }
}
