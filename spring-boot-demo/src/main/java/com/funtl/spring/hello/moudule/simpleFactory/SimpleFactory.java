package com.funtl.spring.hello.moudule.simpleFactory;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.Factory
 * @ClassName: SimpleFactory
 * @Author: Administrator
 * Date: 2020/1/1 0001 16:25
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 简单工厂 根据传入不同的参数得到不同对象
 */
public class SimpleFactory {
    public Car getCar(String name){
        if("BMW".equalsIgnoreCase(name)){
            return new Bmw();
        }else if("Benz".equalsIgnoreCase(name)){
            return new Benz();
        }else if("Audi".equalsIgnoreCase(name)){
            return new Audi();
        }else{
            System.out.println("这个产品产不出来");
            return null;
        }
    }
}
