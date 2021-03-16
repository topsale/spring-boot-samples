package com.funtl.spring.hello.moudule.observer.demo2;

import java.lang.reflect.Method;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.observer.demo2
 * @ClassName: Event
 * @Author: Administrator
 * Date: 2020/1/1 0001 19:04
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 事件对象  一个中间对象，保存了事件源，事件的通知对象和方法，以及触发类型，触发时间
 *  *   这里面用到链式的写法
 */
public class Event {
    //事件源，谁触发的
    private Object source;
    //触发类型的标记
    private String trigger;
    //通知的目标对象
    private Object  target;
    //通知的目标的方法
    private Method callback;

    //触发时间
    private long time;

    public Event(Object target, Method method) {
        this.target = target;
        this.callback = method;
    }

    public Object getSource() {
        return source;
    }

    public Event setSource(Object source) {
        this.source = source;
        return this;
    }

    public String getTrigger() {
        return trigger;
    }

    public Event setTrigger(String trigger) {
        this.trigger = trigger;
        return  this;
    }

    public Object getTarget() {
        return target;
    }

    public Event setTarget(Object target) {
        this.target = target;
        return  this;
    }

    public Method getCallback() {
        return callback;
    }

    public void setCallback(Method callback) {
        this.callback = callback;
    }

    public long getTime() {
        return time;
    }

    public Event setTime(long time) {
        this.time = time;
        return this;
    }

    @Override
    public String toString() {
        return "Event{" +
                "source=" + source +
                ", trigger='" + trigger + '\'' +
                ", target=" + target +
                ", callback=" + callback +
                ", time=" + time +
                '}';
    }
}
