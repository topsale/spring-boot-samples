package com.funtl.spring.boot.service.impl;

import com.funtl.spring.boot.mapper.TbUserMapper;
import com.funtl.spring.boot.service.TbUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TbUserServiceImpl implements TbUserService {

    @Resource
    private TbUserMapper tbUserMapper;

}
