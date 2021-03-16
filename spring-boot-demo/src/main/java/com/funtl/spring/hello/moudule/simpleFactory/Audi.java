package com.funtl.spring.hello.moudule.simpleFactory;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.Factory
 * @ClassName: Audi
 * @Author: Administrator
 * Date: 2020/1/1 0001 16:24
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:
 */
public class Audi implements Car {
    @Override
    public String getName() {
        return "audi";
    }
}
