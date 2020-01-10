package com.funtl.spring.hello.moudule.adapter;

//第三方登录的接口
public interface ISiginForThirdService {
    /**
     * 通过qq登录
     * @param openId
     * @return
     */
    ResultMsg loginForQQ(String openId);
    /**
     * 通过微信登录
     * @param openId
     * @return
     */
    ResultMsg loginForWechat(String openId);

    /**
     * 通过手机号和验证码登录
     * @param telphone
     * @param code
     * @return
     */
    ResultMsg loginForTelphone(String telphone,String code);
}
