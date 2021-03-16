package com.funtl.spring.hello.moudule.Prototype;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.Prototype
 * @ClassName: CloneableTarget
 * @Author: Administrator
 * Date: 2020/1/1 0001 17:15
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 浅度克隆目标的引用对象
 */
public class CloneableTarget {
    public  String cloneName;

    public String cloneClass;

    public CloneableTarget( String cloneName,String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }
}
