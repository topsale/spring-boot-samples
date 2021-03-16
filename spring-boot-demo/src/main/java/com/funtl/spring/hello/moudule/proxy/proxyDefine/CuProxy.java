package com.funtl.spring.hello.moudule.proxy.proxyDefine;



import com.funtl.spring.hello.moudule.proxy.proxyDefine.CuClassLoader;
import sun.misc.ProxyGenerator;

import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.proxy
 * @ClassName: CuProxy
 * @Author: Administrator
 * Date: 2020/1/1 0001 17:49
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 自定义的生成代理类的实现
 */
public class CuProxy {
    public static Object newProxyInstance(Class<?>[] interfaces,InvocationHandler h) {
        //1.根据接口生成class文件
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", interfaces);
        try {
            //写入一个文件可以查看生成的源代码
            OutputStream os = Files.newOutputStream(Paths.get("$Proxy0.class"));
            os.write(bytes);
            //2.通过自定义类加载器动态加载代理类
            CuClassLoader loader = new CuClassLoader(bytes);
            Class proxyClazz = loader.loadClass("$Proxy0");
            //3.得到代理类的构造方法
            System.out.println(proxyClazz.getName());
            Constructor construct = proxyClazz.getConstructor(InvocationHandler.class);
            //4.返回代理对象
            return construct.newInstance(h);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
