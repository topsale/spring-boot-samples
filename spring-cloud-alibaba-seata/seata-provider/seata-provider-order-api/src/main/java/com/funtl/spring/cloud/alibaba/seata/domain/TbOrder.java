package com.funtl.spring.cloud.alibaba.seata.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "tb_order")
public class TbOrder implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "user_id")
    private Long userId;

    private static final long serialVersionUID = 1L;
}