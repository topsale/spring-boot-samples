package com.funtl.spring.hello.moudule.proxy.proxyDefine;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.proxy
 * @ClassName: CuTest
 * @Author: Administrator
 * Date: 2020/1/1 0001 17:50
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 自定义的测试方法
 */
public class CuTest {
    /**
     * 主要根据ProxyGenerator类生成传入的接口的字节码，然后根据自定义的类加载器加载字节码得到具体的代理类，通过反射得到代理类的构造方法，最后通过反射构造新对象返回对象
     * @param args
     */
    public static void main(String[] args) {
        CuPerson xiaoming = new CuMan();
        CuPerson  meipo  = new CuMeipo().getInstance(xiaoming);
        meipo.findLove();
    }
}
