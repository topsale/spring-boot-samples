package com.funtl.spring.hello.moudule.adapter;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.adapter
 * @ClassName: SiginService
 * @Author: Administrator
 * Date: 2020/1/1 0001 18:38
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 登录的具体实现
 */
public class SiginService implements ISiginSerevice {
    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password){
        return  new ResultMsg("200","登录成功",new Object());
    }
}
