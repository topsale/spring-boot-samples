package com.funtl.spring.hello.moudule.strategy.demo1;
//支付方式的一个context
public enum PayType {
    ALI_PAY(new AliPay()),
    WECHAT_PAY(new AliPay()),
    UNION_PAY(new AliPay());

    private Payment payment ;

    PayType(Payment payment) {
        this.payment = payment;
    }

    public Payment get(){
        return  this.payment;
    }
}
