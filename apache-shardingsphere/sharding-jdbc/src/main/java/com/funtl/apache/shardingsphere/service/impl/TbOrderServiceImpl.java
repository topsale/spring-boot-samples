package com.funtl.apache.shardingsphere.service.impl;

import com.funtl.apache.shardingsphere.mapper.TbOrderMapper;
import com.funtl.apache.shardingsphere.service.api.TbOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TbOrderServiceImpl implements TbOrderService {

    @Resource
    private TbOrderMapper tbOrderMapper;

}
