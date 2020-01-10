package com.funtl.spring.hello.moudule.singleton;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.singleton
 * @ClassName: LazyFour
 * @Author: Administrator
 * Date: 2020/1/1 0001 16:57
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 基于双重检查锁的机制实现的单例模式
 */
public class LazyFour {
    //静态块，公共内存区域
    private static LazyFour lazy = null;

    private LazyFour(){}

    public static LazyFour getInstance(){
        if(lazy == null){
            //存在多个线程，跑进来在这里
            synchronized (LazyFour.class){
                //后面进来的线程需要判断lazy是否已经初始化了，不然的话，会重新创建新的对象
                if(lazy == null){
                    lazy = new LazyFour();
                }
            }
        }
        return lazy;
    }
}
