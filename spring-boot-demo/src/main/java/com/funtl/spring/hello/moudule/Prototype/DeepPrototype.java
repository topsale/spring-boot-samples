package com.funtl.spring.hello.moudule.Prototype;

import java.io.*;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.Prototype
 * @ClassName: DeepPrototype
 * @Author: Administrator
 * Date: 2020/1/1 0001 17:20
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 深度拷贝的实现拷贝的两种方式
 */
public class DeepPrototype implements Serializable,Cloneable {

    public String name ;

    public  DeepCloneableTarget deepCloneableTarget;

    public DeepPrototype(){

    }
    //方式1 ：通过重写clone方法来实现深拷贝  （引用对象多，这种方法比较繁琐）
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        try {
            deep = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        DeepPrototype  deepPrototype = (DeepPrototype) deep;
        deepPrototype.deepCloneableTarget = (DeepCloneableTarget) deepPrototype.deepCloneableTarget.clone();
        return deepPrototype;
    }

    //方式2： 通过对象序列化实现深拷贝 （推荐）
    public Object deepClone(){
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return  ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(oos !=null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bos !=null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //输入流关闭省略
        }
        return null;
    }
}
