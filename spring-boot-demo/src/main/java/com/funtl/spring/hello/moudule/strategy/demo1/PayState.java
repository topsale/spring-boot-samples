package com.funtl.spring.hello.moudule.strategy.demo1;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.strategy
 * @ClassName: PayState
 * @Author: Administrator
 * Date: 2020/1/1 0001 18:08
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:  支付后的状态
 */
public class PayState {
    //支付后的状态码
    private int code;
    //支付后的消息提示
    private String msg;
    //代表谁支付的
    private String  uid ;
    //支付的数据大小
    private Object data;

    public PayState(int code, String msg, String uid, Object data) {
        this.code = code;
        this.msg = msg;
        this.uid = uid;
        this.data = data;
    }

    @Override
    public String toString() {
        return "payState{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", uid='" + uid + '\'' +
                ", data=" + data +
                '}';
    }
}
