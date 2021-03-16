package com.funtl.spring.hello.moudule.observer.demo2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.observer.demo2
 * @ClassName: EventListener
 * @Author: Administrator
 * Date: 2020/1/1 0001 19:05
 * project name: spring-boot-alibaba-samples
 * @Version: 抽象的时间源对象，提供公用的事件注册，事件移除，事件触发
 * @Description: 可以认为是一个抽象主题对象， 可以添加和移除观察者，当需要触发的时候，就调用触发方法
 */
public abstract class EventListener {
    //保存事件的容器
    private Map<Enum,Event> eventMap = new HashMap<Enum, Event>();

    //添加监听者对象
    public void  addListener(Enum e , Object target , Method method){
        Event event  =new Event(target,method);
        eventMap.put(e,event);
    }

    //移除监听者对象
    public void  removeListener(Enum e){
        eventMap.remove(e);
    }
    /**
     * 通过事件来触发
     * @param event
     */
    public void trigger(Event event){
        //设置源事件
        event.setSource(this);
        event.setTime(System.currentTimeMillis());
        try {
            event.getCallback().invoke(event.getTarget(),event);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    //通过触发类型来触发对应的观察者
    public  void trigger(Enum e){
        if(!eventMap.keySet().contains(e)){
            return;
        }
        //先从容器中获取事件，并设置触发类型
        trigger( eventMap.get(e).setTrigger(e.toString()));
    }
}
