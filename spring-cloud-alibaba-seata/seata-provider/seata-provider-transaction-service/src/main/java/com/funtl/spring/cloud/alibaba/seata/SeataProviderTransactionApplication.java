package com.funtl.spring.cloud.alibaba.seata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SeataProviderTransactionApplication {
    public static void main(String[] args) {
        SpringApplication.run(SeataProviderTransactionApplication.class, args);
    }
}
