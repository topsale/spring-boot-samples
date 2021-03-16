package com.funtl.spring.hello.moudule.template;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.template
 * @ClassName: Merber
 * @Author: Administrator
 * Date: 2020/1/1 0001 18:24
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: Merber bean对象
 */
public class Merber {
    private String userName;
    private String password;
    private String nickName;

    private  int age;
    private  String addr;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
