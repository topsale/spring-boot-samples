package com.funtl.spring.hello.moudule.proxy.proxyDefine;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.proxy
 * @ClassName: CuMeipo
 * @Author: Administrator
 * Date: 2020/1/1 0001 17:49
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:
 */
public class CuMeipo implements InvocationHandler {

    private CuPerson person;

    public CuPerson getInstance(CuPerson person){
        this.person = person;
        Class clazz = person.getClass();
        System.out.println("原有的person的类为："+clazz.getName());
        return (CuPerson) CuProxy.newProxyInstance(clazz.getInterfaces(),this);
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
