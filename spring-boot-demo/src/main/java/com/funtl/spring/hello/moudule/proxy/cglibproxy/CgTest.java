package com.funtl.spring.hello.moudule.proxy.cglibproxy;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.proxy
 * @ClassName: CgTest
 * @Author: Administrator
 * Date: 2020/1/1 0001 17:44
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:
 */
public class CgTest {
    public static void main(String[] args) {
        CgMan xiaoming = new CgMan();
        CgMan  cgmeipo  = (CgMan) new CgMeiPo().getInstance(xiaoming.getClass());
        cgmeipo.findLove();
    }
}
