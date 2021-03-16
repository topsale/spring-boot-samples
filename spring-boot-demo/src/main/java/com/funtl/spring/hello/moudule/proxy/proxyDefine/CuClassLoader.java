package com.funtl.spring.hello.moudule.proxy.proxyDefine;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.proxy
 * @ClassName: CuClassLoader
 * @Author: Administrator
 * Date: 2020/1/1 0001 17:50
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 自定义的类加载器
 *  * 要实现  findClass对象  实现自定义类的加载
 *  * 最后通过findclass 的native方法加载返回类
 */
public class CuClassLoader extends ClassLoader {

    private byte[] bytes ;

    public CuClassLoader(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        String className = CuClassLoader.class.getPackage().getName() + "." + name;

        return  defineClass(name,bytes,0,bytes.length);
    }
}
