package com.funtl.spring.cloud.alibaba.seata.service.impl;

import com.funtl.spring.cloud.alibaba.seata.domain.TbOrder;
import com.funtl.spring.cloud.alibaba.seata.domain.TbOrderItem;
import com.funtl.spring.cloud.alibaba.seata.service.api.SeataProviderTransactionService;
import com.funtl.spring.cloud.alibaba.seata.service.api.TbOrderItemService;
import com.funtl.spring.cloud.alibaba.seata.service.api.TbOrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class SeataProviderTransactionServiceImpl implements SeataProviderTransactionService {

    @Reference(version = "1.0.0")
    private TbOrderService orderService;

    @Reference(version = "1.0.0")
    private TbOrderItemService orderItemService;

    @Override
    @GlobalTransactional
    public void createOrder(TbOrder order, TbOrderItem orderItem) {
        orderService.insert(order);
        orderItemService.insert(orderItem);

        // 抛出异常用以测试分布式事务是否回滚
        if (order.getUserId().equals(1L)) {
            throw new RuntimeException("Exception for seata.");
        }
    }
}
