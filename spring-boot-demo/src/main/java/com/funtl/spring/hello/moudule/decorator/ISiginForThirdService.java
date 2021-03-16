package com.funtl.spring.hello.moudule.decorator;

import com.funtl.spring.hello.moudule.adapter.ResultMsg;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.decorator
 * @ClassName: ISiginForThirdService
 * @Author: Administrator
 * Date: 2020/1/1 0001 18:57
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 装饰角色    拓展了发送短信的功能
 */
public interface ISiginForThirdService extends ISiginSerevice {
    /**
     * 原有登录的方法
     * @param username
     * @param password
     * @return
     */
    ResultMsg login(String username, String password);
    /**
     * 发送短信
     * @param msg
     * @return
     */
    ResultMsg sendShortMessage(String msg);
}
