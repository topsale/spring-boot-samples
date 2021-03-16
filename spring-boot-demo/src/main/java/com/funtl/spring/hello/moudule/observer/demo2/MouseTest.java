package com.funtl.spring.hello.moudule.observer.demo2;

import java.lang.reflect.Method;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.observer.demo2
 * @ClassName: MouseTest
 * @Author: Administrator
 * Date: 2020/1/1 0001 19:07
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 观察者测试    鼠标对象测试
 *  *观察者和被观察者之间没有必然联系
 *  *注册的时候，才产生联系
 *  *解耦
 */
public class MouseTest {
    public static void main(String[] args) throws NoSuchMethodException {
        //事件监听对象
        MouseEventCallback target = new MouseEventCallback();
        //事件监听对象 对应绑定的方法
        Method onClickCallback =target.getClass().getDeclaredMethod("onClick", Event.class);
        Mouse mouse = new Mouse();
        //添加观察者对象，这里这是把通知的目标和方法进行封装到一个中间的事件对象身上
        mouse.addListener(MouseEventType.ON_CLICK,target,onClickCallback);

        //通知观察者对象，在这里是触发事件，利用了反射调用来进行通知
        mouse.trigger(MouseEventType.ON_CLICK);
    }
}
