package com.funtl.spring.hello.moudule.Prototype;

import java.io.Serializable;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.Prototype
 * @ClassName: DeepCloneableTarget
 * @Author: Administrator
 * Date: 2020/1/1 0001 17:20
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 深度拷贝的目标引用对象
 */
public class DeepCloneableTarget implements Serializable,Cloneable {

    private  String cloneName;

    private String cloneClass;


    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
