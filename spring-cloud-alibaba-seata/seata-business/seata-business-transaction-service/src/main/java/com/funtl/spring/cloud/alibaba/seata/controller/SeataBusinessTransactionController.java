package com.funtl.spring.cloud.alibaba.seata.controller;

import com.funtl.spring.cloud.alibaba.seata.domain.TbOrder;
import com.funtl.spring.cloud.alibaba.seata.domain.TbOrderItem;
import com.funtl.spring.cloud.alibaba.seata.service.api.SeataProviderTransactionService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "transaction")
public class SeataBusinessTransactionController {

    @Reference(version = "1.0.0")
    private SeataProviderTransactionService transactionService;

    @GetMapping(value = "create/order")
    public String createOrder() {
        TbOrder order = new TbOrder();
        order.setOrderId(1);
        order.setUserId(1L);

        TbOrderItem orderItem = new TbOrderItem();
        orderItem.setUserId(1L);
        orderItem.setOrderId(1L);
        orderItem.setOrderItemId(1);

        transactionService.createOrder(order, orderItem);
        return "ok";
    }
}
