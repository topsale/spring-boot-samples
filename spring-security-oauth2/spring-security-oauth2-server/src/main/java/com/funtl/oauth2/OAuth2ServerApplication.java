package com.funtl.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 认证服务器，用于获取 Token
 * <p>
 * Description:
 * </p>
 *
 * @author Lusifer
 * @version v1.0.0
 * @date 2019-04-01 16:06:45
 * @see com.funtl.oauth2
 */
@SpringBootApplication
@MapperScan(basePackages = "com.funtl.oauth2.server.mapper")
public class OAuth2ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2ServerApplication.class, args);
    }

}
