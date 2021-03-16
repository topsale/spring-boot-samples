package com.funtl.spring.hello.moudule.decorator;

import com.funtl.spring.hello.moudule.adapter.ResultMsg;

/**
 * 抽象构件角色   登录的接口业务
 */
public interface ISiginSerevice {
    ResultMsg login(String username, String password);
}
