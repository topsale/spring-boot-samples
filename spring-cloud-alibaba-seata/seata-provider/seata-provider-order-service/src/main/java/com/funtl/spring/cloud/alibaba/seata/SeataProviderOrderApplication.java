package com.funtl.spring.cloud.alibaba.seata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@EnableDiscoveryClient
@EnableTransactionManagement
@SpringBootApplication
@MapperScan(basePackages = "com.funtl.spring.cloud.alibaba.seata.mapper")
public class SeataProviderOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SeataProviderOrderApplication.class, args);
    }
}
