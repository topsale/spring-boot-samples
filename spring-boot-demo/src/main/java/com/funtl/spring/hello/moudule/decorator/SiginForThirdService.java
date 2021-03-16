package com.funtl.spring.hello.moudule.decorator;

import com.funtl.spring.hello.moudule.adapter.ResultMsg;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.decorator
 * @ClassName: SiginForThirdService
 * @Author: Administrator
 * Date: 2020/1/1 0001 18:58
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 具体的装饰角色    原有的登录功能增加了发送短信的功能
 */
public class SiginForThirdService implements  ISiginForThirdService {
    private ISiginSerevice  siginSerevice ;
    public SiginForThirdService(ISiginSerevice siginSerevice) {
        this.siginSerevice = siginSerevice;
    }
    @Override
    public ResultMsg login(String username, String password) {
        ResultMsg msg =    siginSerevice.login(username,password);
        //注册成功发送短信的功能
        if(msg.getCode().equals("200")){
            System.out.println("用户登录成功");
            msg = sendShortMessage(username);
        }
        return msg;
    }
    /**
     * 发送短信的功能   这个是装饰器 增加的额外的功能，在登录成功之后发送短信通知
     * @param username
     * @return
     */
    @Override
    public ResultMsg sendShortMessage(String username) {
        System.out.println("恭喜用户："+username+"发送短信成功");
        return new ResultMsg("200","发送短信成功",new Object());
    }
}
