package com.funtl.spring.hello.moudule.adapter;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.adapter
 * @ClassName: AdapterTest
 * @Author: Administrator
 * Date: 2020/1/1 0001 18:47
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:
 */
public class AdapterTest {
    public static void main(String[] args) {
        //需要适配的类，要把  ISiginSerevice 变成 ISiginForWebChat
        ISiginSerevice siginSerevice  = new SiginService();
        ISiginForWebChat siginForThreadService  = new ObjectSiginForWebChatAdapter(siginSerevice);

        //对象适配器 ，传的是一个适配的类，通过组合的方式
        ResultMsg resultMsg =   siginForThreadService.loginForWechat("1231321ffasfasffad");
        System.out.println(resultMsg.getMsg());

        //类适配器，通过继承实现的
        ResultMsg msg =  new ClassSiginForWebChatAdapter().loginForWechat("1231321ffasfasffad");
        System.out.println(msg.getMsg());

        //接口适配器 ，主要实现了一个抽象的适配器
        //但是接口中有太多方法，我们要使用时必须实现接口并实现其中的所有方法，可以使用抽象类来实现接口
        //并不对方法进行实现（仅置空），然后我们再继承这个抽象类来通过重写想用的方法的方式来实现。这个抽象类就是适配器
        ISiginForThirdService siginForWebChat = new LoginForTelphoneAdapter();
        ResultMsg telPoneMsg =  siginForWebChat.loginForTelphone("13588304966","1234");
        System.out.println(telPoneMsg.getMsg());
    }
}
