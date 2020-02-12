package com.funtl.apache.shardingsphere.tests;

import com.funtl.apache.shardingsphere.domain.TbOrder;
import com.funtl.apache.shardingsphere.domain.TbOrderItem;
import com.funtl.apache.shardingsphere.mapper.TbOrderItemMapper;
import com.funtl.apache.shardingsphere.mapper.TbOrderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ShardingSphereTests {

    @Resource
    private TbOrderMapper tbOrderMapper;

    @Resource
    private TbOrderItemMapper tbOrderItemMapper;

    @Test
    public void testInsertOrder() {
        TbOrder tbOrder = new TbOrder();
        tbOrder.setOrderId(1L);
        tbOrder.setUserId(1L);

        tbOrderMapper.insert(tbOrder);
    }

    @Test
    public void testInsertOrderItem() {
        TbOrderItem tbOrderItem = new TbOrderItem();
        tbOrderItem.setUserId(2L);
        tbOrderItem.setOrderId(2L);
        tbOrderItem.setOrderItemId(2);

        tbOrderItemMapper.insert(tbOrderItem);
    }

    @Test
    public void testSelectAll() {
        List<TbOrder> tbOrders = tbOrderMapper.selectAll();
        tbOrders.forEach(tbOrder -> {
            System.out.println(tbOrder);
        });

        List<TbOrderItem> tbOrderItems = tbOrderItemMapper.selectAll();
        tbOrderItems.forEach(tbOrderItem -> {
            System.out.println(tbOrderItem);
        });
    }
}
