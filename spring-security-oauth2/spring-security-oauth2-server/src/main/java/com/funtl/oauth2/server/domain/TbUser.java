package com.funtl.oauth2.server.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "tb_user")
public class TbUser implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 用户名
     */
    @Column(name = "username")
    private String username;

    /**
     * 密码，加密存储
     */
    @Column(name = "`password`")
    private String password;

    /**
     * 注册手机号
     */
    @Column(name = "phone")
    private String phone;

    /**
     * 注册邮箱
     */
    @Column(name = "email")
    private String email;

    @Column(name = "created")
    private Date created;

    @Column(name = "updated")
    private Date updated;

    private static final long serialVersionUID = 1L;
}