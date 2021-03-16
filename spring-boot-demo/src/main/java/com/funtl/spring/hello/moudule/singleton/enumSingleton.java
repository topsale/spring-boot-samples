package com.funtl.spring.hello.moudule.singleton;
/**
 * @PackgeName: com.funtl.spring.hello.moudule.singleton
 * @ClassName: BeanFactory
 * @Author: Administrator
 * Date: 2020/1/1 0001 16:58
 * project name: spring-boot-alibaba-samples
 * @Version: 枚举式
 * @Description: 基于枚举实现的单例
 * 特定：
 * 自由序列化。
 * 保证只有一个实例。
 * 线程安全
 */
public enum enumSingleton {
    INSTANCE;
    public void otherMethods(){
        System.out.println("Something");
    }
    public static void main(String[] args) {
        //进行单例的调用
        enumSingleton.INSTANCE.otherMethods();
    }
}
