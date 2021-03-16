package com.funtl.spring.hello.moudule.decorator;

/**
 * 在spring中的引用： Spring 的 ApplicationContext 中配置所有的 DataSource。
 * 这些 DataSource 可能是各种不同类型的， 比如不同的数据库： Oracle、 SQL Server、 MySQL 等， 也可能是不同的数据源：
 * 比如Apache 提 供 的 org.apache.commons.dbcp.BasicDataSource 、
 * Spring 提 供 的org.springframework.jndi.JndiObjectFactoryBean 等。
 * 然后 SessionFactory 根据客户的每次请求， 将 DataSource 属性设置成不同的数据源， 以到达切换数据源的目的。
 */
public class SiginTest {

    /**
     * 装饰者测试
     * 在装饰模式中的角色有：
     *
     * 抽象构件(Component)角色：给出一个抽象接口，以规范准备接收附加责任的对象。
     *
     * 具体构件(ConcreteComponent)角色：定义一个将要接收附加责任的类。
     *
     * 装饰(Decorator)角色：持有一个构件(Component)对象的实例，并定义一个与抽象构件接口一致的接口。
     *
     * 具体装饰(ConcreteDecorator)角色：负责给构件对象“贴上”附加的责任。
     * @param args
     */
    public static void main(String[] args) {

        ISiginSerevice siginSerevice = new SiginService();

        ISiginSerevice  siginForThirdService = new SiginForThirdService(siginSerevice);

        siginForThirdService.login("sunkang","4324");
    }
}
