package com.funtl.spring.hello.moudule.singleton;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.singleton
 * @ClassName: LazyThree
 * @Author: Administrator
 * Date: 2020/1/1 0001 16:54
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:
 * 基于内部类方式实现的单例模式
 *  特点：在外部类被调用的时候内部类才会被加载
 *       内部类一定是要在方法调用之前初始化
 *       巧妙地避免了线程安全问题
 *  这种形式兼顾饿汉式的内存浪费，也兼顾synchronized性能问题
 *  完美地屏蔽了这两个缺点
 *  史上最牛的单例模式的实现方式
 */
public class LazyThree {
    private  boolean  initailzed = false;
    //1.构造方法私有
    private LazyThree(){
        //可以优化点   就是反射进行反射得到单例对象,第一次得到设置标记，后面得到则报错
        synchronized (LazyThree.class){
            if(!initailzed){
                initailzed = !initailzed;
            }else {
                throw new RuntimeException("单例已被侵犯");
            }
        }
    }
    //2.构造内部类持有单例对象
    //内部类默认是不加载的，只有访问到内部类的属性或者方法的时候才加载内部类
    private  static final class LazyHolder{
        private  static  final  LazyThree lazy = new LazyThree();
    }
    //3.公共的全局的方法的访问点
    //static 是为了使单例的空间共享
    //final 保证这个方法不会被重写，重载
    public  LazyThree getInstance(){
        return  LazyHolder.lazy;
    }
}
