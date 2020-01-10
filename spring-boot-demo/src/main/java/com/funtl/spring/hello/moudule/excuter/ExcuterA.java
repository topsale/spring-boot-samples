package com.funtl.spring.hello.moudule.excuter;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.excuter
 * @ClassName: ExcuterA
 * @Author: Administrator
 * Date: 2020/1/1 0001 18:29
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 员工A执行某项命令
 */
public class ExcuterA implements  IExcuter{

    @Override
    public void excute(String command) {
        System.out.println("员工A 开始做"+command+"的工作");
    }
}
