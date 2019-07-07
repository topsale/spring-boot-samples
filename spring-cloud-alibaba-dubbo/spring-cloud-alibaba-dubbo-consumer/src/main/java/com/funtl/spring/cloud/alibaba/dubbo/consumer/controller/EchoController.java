package com.funtl.spring.cloud.alibaba.dubbo.consumer.controller;

import com.funtl.spring.cloud.alibaba.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class EchoController {

    @Reference(version = "1.0.0")
    private EchoService echoService;

    @Value("${user.name}")
    private String username;

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return echoService.echo(string) + " " + username;
    }
}
