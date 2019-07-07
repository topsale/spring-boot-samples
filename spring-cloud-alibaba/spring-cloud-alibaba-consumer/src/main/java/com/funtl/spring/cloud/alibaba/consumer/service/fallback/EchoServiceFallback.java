package com.funtl.spring.cloud.alibaba.consumer.service.fallback;

import com.funtl.spring.cloud.alibaba.consumer.service.EchoService;
import org.springframework.stereotype.Component;

@Component
public class EchoServiceFallback implements EchoService {
    @Override
    public String echo(String string) {
        return "你的网络有问题";
    }

    @Override
    public String lb() {
        return "请联系管理员";
    }
}
