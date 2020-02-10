package com.funtl.spring.hello.thread.T1;

import java.util.concurrent.TimeUnit;

/**
 * @PackgeName: com.funtl.spring.hello.thread.T1
 * @ClassName: T
 * @Author: Administrator
 * Date: 2020/1/4 0004 20:27
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:
 */
public class T {
    synchronized void m(){
        System.out.println("m start");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m end");
    }

    public static void main(String[] args) {
        new TT().m();
    }
    static class TT extends T{
        synchronized void m(){
            System.out.println("child m start");
            super.m();
            System.out.println("child m end");
        }
    }
}
