package com.funtl.spring.hello.moudule.decorator;

import com.funtl.spring.hello.moudule.adapter.ResultMsg;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.decorator
 * @ClassName: SiginService
 * @Author: Administrator
 * Date: 2020/1/1 0001 18:57
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:  具体构件角色    登录的具体实现
 */
public class SiginService implements ISiginSerevice {
    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username, String password){
        return  new ResultMsg("200","登录成功",new Object());
    }
}
