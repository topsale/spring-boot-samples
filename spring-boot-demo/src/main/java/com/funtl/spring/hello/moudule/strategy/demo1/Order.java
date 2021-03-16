package com.funtl.spring.hello.moudule.strategy.demo1;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.strategy
 * @ClassName: Order
 * @Author: Administrator
 * Date: 2020/1/1 0001 18:10
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 模拟一个订单类
 */
public class Order {
    private String uid;
    private  String oid;
    private  double amount;

    public Order(String uid, String oid, double amount) {
        this.uid = uid;
        this.oid = oid;
        this.amount = amount;
    }
    //为订单支付
    public PayState pay(PayType payType){
        return  payType.get().pay(uid,amount);
    }
}
