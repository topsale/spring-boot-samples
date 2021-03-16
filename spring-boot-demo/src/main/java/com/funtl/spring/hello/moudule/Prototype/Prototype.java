package com.funtl.spring.hello.moudule.Prototype;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.Prototype
 * @ClassName: Prototype
 * @Author: Administrator
 * Date: 2020/1/1 0001 17:15
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 克隆对象的浅拷贝
 *  *   1.通过构造方法来实现浅度拷贝
 *  *   2.通过clone()方法来实现浅度拷贝
 */
public class Prototype implements  Cloneable {

    public String name ;

    //拷贝的引用类型的成员变量
    public  CloneableTarget cloneableTarget;

    public Prototype(){

    }
    //1.通过构造方法来实现浅度拷贝
    public Prototype(Prototype prototype) {
        this.name = prototype.name;
        this.cloneableTarget = prototype.cloneableTarget;
    }
    //2.通过clone()方法来实现浅度拷贝
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
