package com.funtl.spring.hello.moudule.adapter;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.adapter
 * @ClassName: ResultMsg
 * @Author: Administrator
 * Date: 2020/1/1 0001 18:37
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 登录返回的结果的类
 */
public class ResultMsg {
    private  String code;
    private  String msg;
    private  Object data;

    public ResultMsg(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
}
