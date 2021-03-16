package com.funtl.spring.hello.moudule.excuter;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.excuter
 * @ClassName: Boss
 * @Author: Administrator
 * Date: 2020/1/1 0001 18:30
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:
 */
public class Boss {
    public static void main(String[] args) {
        Leader leader  = new Leader();
        //看上去好像是我们的项目经理在干活
        //但实际干活的人是普通员工
        //这就是典型，干活是我的，功劳是你的
        leader.excute("登录");
        leader.excute("加密");
    }
}
