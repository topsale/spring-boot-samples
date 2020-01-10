package com.funtl.spring.hello.moudule.singleton;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.singleton
 * @ClassName: LazyTwo
 * @Author: Administrator
 * Date: 2020/1/1 0001 16:54
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 基于加锁的线程安全的懒汉式单例
 */
public class LazyTwo {
    private LazyTwo(){}

    private static LazyTwo lazy = null;
    //加锁 来保证多线程的情况下也是一个单例
    public static synchronized LazyTwo getInstance(){
        if(lazy == null){
            lazy = new LazyTwo();
        }
        return lazy;
    }
}
