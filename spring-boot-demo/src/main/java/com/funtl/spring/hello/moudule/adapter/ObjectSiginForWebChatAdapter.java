package com.funtl.spring.hello.moudule.adapter;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.adapter
 * @ClassName: ObjectSiginForWebChatAdapter
 * @Author: Administrator
 * Date: 2020/1/1 0001 18:43
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 对象适配器模式 默认通过组合来实现的
 */
public class ObjectSiginForWebChatAdapter implements ISiginForWebChat {
    private ISiginSerevice siginSerevice;

    public ObjectSiginForWebChatAdapter(ISiginSerevice siginSerevice) {
        this.siginSerevice = siginSerevice;
    }
    @Override
    public ResultMsg loginForWechat(String openId) {
        return siginSerevice.login(openId,null);
    }
}
