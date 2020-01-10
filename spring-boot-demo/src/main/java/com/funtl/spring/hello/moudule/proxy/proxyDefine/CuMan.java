package com.funtl.spring.hello.moudule.proxy.proxyDefine;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.proxy
 * @ClassName: CuMan
 * @Author: Administrator
 * Date: 2020/1/1 0001 17:49
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:  自定义的目标对象
 */
public class CuMan implements CuPerson {
    @Override
    public void findLove() {
        System.out.println("我是一个男人，想找一位女朋友");
    }
}
