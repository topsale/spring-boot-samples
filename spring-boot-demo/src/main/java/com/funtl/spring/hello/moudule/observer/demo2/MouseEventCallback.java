package com.funtl.spring.hello.moudule.observer.demo2;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.observer.demo2
 * @ClassName: MouseEventCallback
 * @Author: Administrator
 * Date: 2020/1/1 0001 19:07
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 可以认为是观察者，认为是事件监听对象     这里是通过反射调用来通知观察者的
 */
public class MouseEventCallback {
    public void onClick(Event e){
        System.out.println("=======触发鼠标单击事件========\n" + e);
    }
    public void onDoubleClick(Event e){
        System.out.println("=======触发鼠标双击事件========\n" + e);
    }

    public void onUp(Event e){
        System.out.println("=======触发鼠标弹起事件========\n" + e);
    }
    public void onDown(Event e){
        System.out.println("=======触发鼠标按下事件========\n" + e);
    }
    public void onMove(Event e){
        System.out.println("=======触发鼠标移动事件========\n" + e);
    }
}
