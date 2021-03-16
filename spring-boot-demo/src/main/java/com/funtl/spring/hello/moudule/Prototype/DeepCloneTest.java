package com.funtl.spring.hello.moudule.Prototype;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.Prototype
 * @ClassName: DeepCloneTest
 * @Author: Administrator
 * Date: 2020/1/1 0001 17:21
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 深度拷贝的测试
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        DeepPrototype p = new DeepPrototype();
        p.name="kang";
        p.deepCloneableTarget = new DeepCloneableTarget("clone","CloneableTarget");
        System.out.println("原有的对象："+p);
        System.out.println("原有的值对象引用："+p.name.hashCode());
        System.out.println("原有的引用类型对象："+p.deepCloneableTarget);

        try {
            //方式一 ：通过重写clone()方法进行浅拷贝
            DeepPrototype clonePrototype = (DeepPrototype) p.clone();
            System.out.println("clone()方法克隆的对象："+clonePrototype);
            System.out.println("clone()方法克隆的值对象引用："+p.name.hashCode());
            System.out.println("clone()方法克隆的引用类型对象："+ clonePrototype.deepCloneableTarget);

            //方式二：  通过对象序列化实现深拷贝
            DeepPrototype  serializableClone= (DeepPrototype) p.deepClone();
            System.out.println("序列化方法克隆的对象："+serializableClone);
            System.out.println("构序列化方法克隆的值对象引用："+serializableClone.name.hashCode());
            System.out.println("序列化方法克隆的引用类型对象："+ serializableClone.deepCloneableTarget);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
