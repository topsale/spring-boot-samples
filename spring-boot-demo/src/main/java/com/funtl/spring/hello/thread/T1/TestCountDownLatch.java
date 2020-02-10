package com.funtl.spring.hello.thread.T1;

import java.util.concurrent.CountDownLatch;

/**
 * @PackgeName: com.funtl.spring.hello.thread.T1
 * @ClassName: TestCountDownLatch
 * @Author: Administrator
 * Date: 2020/1/6 0006 21:51
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:
 */
public class TestCountDownLatch {
    private static void CountDownLatch() {
        Thread[] threads = new Thread[100];
        CountDownLatch countDownLatch = new CountDownLatch(threads.length);

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                int result = 0;
                for (int j = 0; j < 10000; j++) {
                    result += j;
                }
                countDownLatch.countDown();
               System.out.println("count"+countDownLatch.getCount());
            });
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end latch");
    }

    public static void main(String[] args) {
        CountDownLatch();
    }
}
