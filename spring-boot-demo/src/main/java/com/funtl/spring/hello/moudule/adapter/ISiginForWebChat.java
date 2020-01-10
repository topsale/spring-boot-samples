package com.funtl.spring.hello.moudule.adapter;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.adapter
 * @ClassName: ISiginForWebChat
 * @Author: Administrator
 * Date: 2020/1/1 0001 18:38
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 通过微信接口登录
 */
public interface ISiginForWebChat {
    /**
     * 通过微信登录
     * @param openId
     * @return
     */
    ResultMsg loginForWechat(String openId);
}
