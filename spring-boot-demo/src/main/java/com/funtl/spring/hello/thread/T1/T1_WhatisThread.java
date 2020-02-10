package com.funtl.spring.hello.thread.T1;

import java.util.concurrent.*;

/**
 * @PackgeName: com.funtl.spring.hello.thread.T1
 * @ClassName: T1
 * @Author: Administrator
 * Date: 2020/1/4 0004 19:39
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:
 */
public class T1_WhatisThread {
    private static class Mythread extends Thread {
        public void run() {
            System.out.println("hello myThread");
        }
    }

    static class MyRun implements Runnable {
        @Override
        public void run() {
            System.out.println("hello my run");
        }
    }

    static class MyCall implements Callable<String> {

        @Override
        public String call() throws Exception {
            System.out.println("hello MyCall");
            return "success";
        }
    }


    public static void main(String[] args) {
        new Mythread().start();
        new Thread(new MyRun()).start();
        new Thread(() -> {
            System.out.println("hello lambda");
        }).start();
        Thread t = new Thread(new FutureTask<String>(new MyCall()));
        t.start();

        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(() -> {
            System.out.println("hello Threadpool");
        });
        service.shutdown();
    }
}
