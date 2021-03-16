package com.funtl.spring.hello.moudule.adapter;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.adapter
 * @ClassName: LoginForTelphoneAdapter
 * @Author: Administrator
 * Date: 2020/1/1 0001 18:46
 * project name: spring-boot-alibaba-samples
 * @Version: 通过电话号码和动态密码登录，只需要重写对应的方法接口
 * @Description: 只需要用电话号码登录
 */
public class LoginForTelphoneAdapter extends SiginForThirdAdapter {
    public ResultMsg loginForTelphone(String telphone, String code) {
        System.out.println("通过电话号码登录");
        ResultMsg msg = new ResultMsg("200","qq登录成功",new Object());
        System.out.println("登录的结果为"+msg.getMsg());
        return msg;
    }
}
