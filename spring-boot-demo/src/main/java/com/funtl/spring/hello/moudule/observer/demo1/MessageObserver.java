package com.funtl.spring.hello.moudule.observer.demo1;

import java.util.Observable;
import java.util.Observer;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.observer
 * @ClassName: MessageObserver
 * @Author: Administrator
 * Date: 2020/1/1 0001 10:25
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:
 */
//订阅者
public class MessageObserver implements Observer {
    private String title;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public MessageObserver(String title) {
        this.title = title;
    }
    public void update(Observable o, Object arg) {
        System.out.println("observer :" + title + ",receive a message" + arg.toString());
    }
}
