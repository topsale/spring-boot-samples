package com.funtl.apache.shardingsphere.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "tb_order_item")
public class TbOrderItem implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "order_item_id")
    private Integer orderItemId;

    private static final long serialVersionUID = 1L;
}