package com.funtl.spring.cloud.alibaba.seata.service.api;

import com.funtl.spring.cloud.alibaba.seata.domain.TbOrder;
import com.funtl.spring.cloud.alibaba.seata.domain.TbOrderItem;

public interface SeataProviderTransactionService {
    void createOrder(TbOrder order, TbOrderItem orderItem);
}
