package com.funtl.spring.hello.moudule.observer.demo2;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.observer.demo2
 * @ClassName: Mouse
 * @Author: Administrator
 * Date: 2020/1/1 0001 19:06
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 具体的主题对象，认为是事件对象    鼠标对象，当单击鼠标，就触发单击的时间
 */
public class Mouse extends EventListener {
    public void click(){
        System.out.println("鼠标单击");
        this.trigger(MouseEventType.ON_CLICK);
    }


    public void doubleClick(){
        System.out.println("鼠标双击");
        this.trigger(MouseEventType.ON_DOUBLE_CLICK);
    }

    public void up(){
        System.out.println("鼠标弹起");
        this.trigger(MouseEventType.ON_UP);
    }

    public void down(){
        System.out.println("鼠标按下");
        this.trigger(MouseEventType.ON_DOWN);
    }
}
