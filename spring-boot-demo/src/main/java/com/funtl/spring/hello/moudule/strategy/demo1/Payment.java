package com.funtl.spring.hello.moudule.strategy.demo1;
//支付方式的接口
public interface Payment {
    /**
     *
     * @param uid   表示人的uid
     * @param amount  表示支付的金额
     * @return
     */
    PayState pay(String uid, double amount);
}
