package com.funtl.spring.hello.moudule.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.singleton
 * @ClassName: BeanFactory
 * @Author: Administrator
 * Date: 2020/1/1 0001 16:58
 * project name: spring-boot-alibaba-samples
 * @Version: 登记式
 * @Description: 用一个map容器来实现登记式单例
 */
public class BeanFactory {
    private BeanFactory(){ }
    //用ConcurrentHashMap保存bean,保证了线程的安全性
    private  static Map<String,Object> ioc = new ConcurrentHashMap<String, Object>();

    public synchronized   static Object getBean(String className){
        if( !ioc.containsKey(className)){
            Object obj = null;
            try {
                obj = Class.forName(className).newInstance();
                ioc.put(className,obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return obj;
        }else {
            return ioc.get(className);
        }
    }
}
