package com.funtl.spring.hello.moudule.observer.demo1;

import java.util.Observable;
import java.util.Observer;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.observer
 * @ClassName: MessagePublishObservable
 * @Author: Administrator
 * Date: 2020/1/1 0001 10:26
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:
 */
//发布者
public class MessagePublishObservable extends Observable {
    private Message message;
    public MessagePublishObservable(Message message) {
        this.message = message;
    }
    public void pushMessage(){
        setChanged();
        notifyObservers(message);
    }
    public Message getMessage() {
        return message;
    }
    public void setMessage(Message message) {
        this.message = message;
    }
    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }
    @Override
    public synchronized void deleteObserver(Observer o) {
        super.deleteObserver(o);
    }
    @Override
    public void notifyObservers() {
        super.notifyObservers();
    }
    @Override
    public void notifyObservers(Object arg) {
        super.notifyObservers(arg);
    }
    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }
}
