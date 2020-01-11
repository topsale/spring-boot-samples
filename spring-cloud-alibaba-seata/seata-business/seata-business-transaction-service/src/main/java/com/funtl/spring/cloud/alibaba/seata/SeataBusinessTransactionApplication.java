package com.funtl.spring.cloud.alibaba.seata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SeataBusinessTransactionApplication {
    public static void main(String[] args) {
        SpringApplication.run(SeataBusinessTransactionApplication.class, args);
    }
}
