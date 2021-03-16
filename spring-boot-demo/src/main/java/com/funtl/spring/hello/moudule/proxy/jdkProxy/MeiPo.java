package com.funtl.spring.hello.moudule.proxy.jdkProxy;


import com.funtl.spring.hello.moudule.proxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.proxy
 * @ClassName: MeiPo
 * @Author: Administrator
 * Date: 2020/1/1 0001 17:36
 * project name: spring-boot-alibaba-samples
 * @Version: jdk动态代理对象 媒婆
 * @Description:  代理对象  媒婆
 */
public class MeiPo implements InvocationHandler {

    private Person person;

    public Person getInstance(Person person){
        this.person = person;
        Class clazz = person.getClass();
        System.out.println("原有的person的类为："+clazz.getName());
        //基于jdk 中Proxy类用来生成一个新的对象（字节码重组来实现）
        return (Person) Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理类为："+proxy.getClass());
        System.out.println("我是媒婆");
        //这样就会循环触发调用
        //method.invoke(proxy,args);
        method.invoke(person,args);
        System.out.println("正在帮你找");
        return null;
    }
}
