package com.funtl.spring.hello.moudule.singleton;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.singleton
 * @ClassName: Hungry
 * @Author: Administrator
 * Date: 2020/1/1 0001 16:52
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:
 * 它是在类加载的时候就立即初始化，并且创建单例对象
 * 优点：没有加任何的锁、执行效率比较高
 *       在用户体验上来说，比懒汉式更好
 * 缺点：类加载的时候就初始化，不管你用还是不用，我都占着空间
 *       浪费了内存,有可能这个类不使用，但是在类加载的时候就初始化了
 *
 * 绝对线程安全，在线程还没出现以前就是实例化了，不可能存在访问安全问题
 *
 */
public class Hungry {
    private Hungry(){}

    private static final Hungry hungry = new Hungry();

    public static Hungry getInstance(){
        return  hungry;
    }
}
