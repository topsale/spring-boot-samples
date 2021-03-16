package com.funtl.spring.hello.moudule.observer.demo1;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.observer
 * @ClassName: Message
 * @Author: Administrator
 * Date: 2020/1/1 0001 10:26
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:
 */
public class Message {
    private String title;
    private String content;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Message(String title, String content) {
        this.title = title;
        this.content = content;
    }
    @Override
    public String toString() {
        return "Message{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
