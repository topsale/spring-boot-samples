package com.funtl.spring.hello.moudule.Prototype;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.Prototype
 * @ClassName: CloneTest
 * @Author: Administrator
 * Date: 2020/1/1 0001 17:16
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 浅度克隆对象的测试
 */
public class CloneTest {
    /**
     * 原型模式就是从一个对象再创建另外一个可定制的对象， 而且不需要知道任何创建的细节。
     * 所谓原型模式， 就是 Java 中的克隆技术， 以某个对象为原型。 复制出新的对象。 显然新的对象具备原型对象的特点， 效率高（避免了重新执行构造过程步骤）
     * @param args
     */
    public static void main(String[] args) {
        Prototype  p = new Prototype();
        p.name="kang";
        p.cloneableTarget = new CloneableTarget("clone","CloneableTarget");
        System.out.println("原有的对象："+p);
        System.out.println("原有的值对象引用："+p.name.hashCode());
        System.out.println("原有的引用类型对象："+p.cloneableTarget);
        try {
            //方式一 ：通过重写clone()方法进行浅拷贝
            Prototype clonePrototype = (Prototype) p.clone();
            System.out.println("重写clone()克隆的对象："+clonePrototype);
            System.out.println("重写clone()克隆的值对象引用："+p.name.hashCode());
            System.out.println("重写clone()克隆的引用类型对象："+ clonePrototype.cloneableTarget);

            //通过修改引用对象String类型的值，发现原有的对象的值没有发生改变，因为String对象是不可变对象，放在常量池中的，无法修改的
            //String 可以比较特殊，可以看做是值传递
            clonePrototype.name ="sun";
            System.out.println("原有对象的name:"+p.name);
            System.out.println("修改过的clone对象的name:"+clonePrototype.name);

            //方式二： 通过拷贝构造方法实现浅拷贝
            Prototype  constructClone=   new Prototype(p);
            System.out.println("构造方法克隆的对象："+constructClone);
            System.out.println("构造方法克隆的值对象引用："+constructClone.name.hashCode());
            System.out.println("构造方法克隆的引用类型对象："+ constructClone.cloneableTarget);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

