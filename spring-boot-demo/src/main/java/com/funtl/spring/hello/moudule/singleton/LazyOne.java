package com.funtl.spring.hello.moudule.singleton;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.singleton
 * @ClassName: LazyOne
 * @Author: Administrator
 * Date: 2020/1/1 0001 16:53
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 懒汉式单例，但是多线程的情况下不安全
 */
public class LazyOne {
    private LazyOne(){}
    //静态块，公共内存区域
    private static LazyOne lazy = null;

    public static LazyOne getInstance(){
        //调用方法之前，先判断
        //如果没有初始化，将其进行初始化,并且赋值
        //将该实例缓存好
        if(lazy == null){
            //两个线程都会进入这个if里面
            lazy = new LazyOne();
        }
        //如果已经初始化，直接返回之前已经保存好的结果
        return lazy;
    }
}
