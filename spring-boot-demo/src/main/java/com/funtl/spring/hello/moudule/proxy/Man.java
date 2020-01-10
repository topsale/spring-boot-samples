package com.funtl.spring.hello.moudule.proxy;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.proxy
 * @ClassName: Man
 * @Author: Administrator
 * Date: 2020/1/1 0001 17:35
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 目标对象
 */
public class Man implements Person {
    //找对象
    @Override
    public void findLove() {
        System.out.println("我是一个男人，想找一位女朋友");
    }
}
