package com.funtl.spring.hello.moudule.template;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.template
 * @ClassName: TemplateTest
 * @Author: Administrator
 * Date: 2020/1/1 0001 18:25
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: 模板方法测试
 */
public class TemplateTest {
    public static void main(String[] args) {
        MerberDao merberDao   = new MerberDao();
        merberDao.query();
    }
}
