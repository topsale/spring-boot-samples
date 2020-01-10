package com.funtl.spring.hello.moudule.proxy.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.proxy
 * @ClassName: CgMeiPo
 * @Author: Administrator
 * Date: 2020/1/1 0001 17:44
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: cglib动态代理   媒婆
 *  * 需要实现 MethodInterceptor接口
 */
public class CgMeiPo implements MethodInterceptor {

    public Object getInstance(Class clazz){
        Enhancer enhancer = new Enhancer();
        //cglib 主要根据继承来生成代码的关系
        //设置父类
        enhancer.setSuperclass(clazz);
        //设置回调  就是代理类通过  MethodInterceptor 找到 intercept方法进行回调
        enhancer.setCallback(this);
        //crate 方法
        //第一步、生成源代码
        //第二步、编译成class文件
        //第三步、加载到JVM中，并返回被代理对象
        return  enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("我是媒婆，通过cglib 来实现的");
        //这样就会循环触发调用
        //cglib的代理实际上原有的对象的子类，通过继承来实现，这里默认调用父类的方法,obj 为cglib代理的子类
        //切记不要写成        methodProxy.invoke(obj,args);  这里面就会存在循环调用的问题，这里会调用cglib代理类，然后循环调用
        //调用父类
        methodProxy.invokeSuper(obj,args);
        System.out.println("正在帮你找");
        return null;
    }
}
