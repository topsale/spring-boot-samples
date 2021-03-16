package com.funtl.spring.hello.moudule.proxy.staticProxy;

import com.funtl.spring.hello.moudule.proxy.Man;
import com.funtl.spring.hello.moudule.proxy.Person;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.proxy
 * @ClassName: StaticProxy
 * @Author: Administrator
 * Date: 2020/1/1 0001 17:35
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:  静态代理   实现目标对象的代理
 */
public class StaticProxy implements Person {

    private Person person;

    public StaticProxy(Person person) {
        this.person = person;
    }
    public void  findLove(){
        System.out.println("根据你的要求物色");
        this.person.findLove();
        System.out.println("双方父母是不是同意");
    }
    //静态代理测试
    public static void main(String[] args) {
        StaticProxy staticProxy = new StaticProxy(new Man());
        staticProxy.findLove();
    }
}
