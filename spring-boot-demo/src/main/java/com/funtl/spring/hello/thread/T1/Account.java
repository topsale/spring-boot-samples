package com.funtl.spring.hello.thread.T1;

import java.util.concurrent.TimeUnit;

/**
 * @PackgeName: com.funtl.spring.hello.thread.T1
 * @ClassName: Account
 * @Author: Administrator
 * Date: 2020/1/4 0004 20:17
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:
 */
public class Account {
    String name;
    double balance;

    public synchronized void set(String name, double balance) {
        this.name = name;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.balance = balance;
    }

    public synchronized double getBalance(String name) {
        return this.balance;
    }

    public static void main(String[] args) {
        Account a = new Account();
        new Thread(() ->
                a.set("zhangsan", 100.0)).start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a.getBalance("zhangsan"));

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a.getBalance("zhangsan"));
    }
}
