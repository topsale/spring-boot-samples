package com.funtl.spring.hello.moudule.proxy;

import com.funtl.spring.hello.moudule.proxy.jdkProxy.MeiPo;
import sun.misc.ProxyGenerator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.proxy
 * @ClassName: Test
 * @Author: Administrator
 * Date: 2020/1/1 0001 17:38
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: jdk动态方法测试
 */
public class Test {
    public static void main(String[] args) {

        Person   xiaoming = new Man();

        Person  meipo  = new MeiPo().getInstance(xiaoming);

        meipo.findLove();

        //原理：
        //1、拿到被代理对象的引用，并且获取到它的所有的接口，反射获取 （获取接口）
        //2、JDK Proxy类重新生成一个新的类、同时新的类要实现被代理类所有实现的所有的接口 （实现接口）
        //3、动态生成Java代码，把新加的业务逻辑方法由一定的逻辑代码去调用（在代码中体现）(生成java代码)
        //4、编译新生成的Java代码.class （编译）
        //5、再重新加载到JVM中运行 （加载）

        //这里是接口的代码生成器
        byte[]    data = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
        try {
            //此为jdk 1.7发行的nio的类  作用是把  data 数据写到 文件 $Proxy0.class中
            Files.newOutputStream(Paths.get("$Proxy0.class")).write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
