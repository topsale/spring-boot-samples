package com.funtl.spring.hello.moudule.adapter;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.adapter
 * @ClassName: ClassSiginForWebChatAdapter
 * @Author: Administrator
 * Date: 2020/1/1 0001 18:39
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 类适配器   目标接口为ISiginForWebChat，但是适配者的接口为ISiginService
 * 通过把普通登录的接口转换成微信登录的接口
 */
public class ClassSiginForWebChatAdapter  extends  SiginService implements  ISiginForWebChat{
    /**
     * 原理：通过继承来实现适配器功能。
     * 当我们要访问的接口A中没有我们想要的方法 ，
     * 却在另一个接口B中发现了合适的方法，我们又不能改变访问接口A，
     * 在这种情况下，我们可以定义一个适配器p来进行中转，这个适配器p要实现我们访问的接口A，
     * 这样我们就能继续访问当前接口A中的方法（虽然它目前不是我们的菜），
     * 然后再继承接口B的实现类，这样我们可以在适配器P中访问接口B的方法了，
     * 这时我们在适配器P中的接口A方法中直接引用B中的合适方法，这样就完成了一个简单的类适配器。
     * @param openId
     * @return
     */
    @Override
    public ResultMsg loginForWechat(String openId) {
        return login(openId,null);
    }
}
