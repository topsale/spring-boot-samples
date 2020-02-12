package com.funtl.apache.shardingsphere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(value = "com.funtl.apache.shardingsphere.mapper")
public class ShardingSphereApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShardingSphereApplication.class, args);
    }
}
