package com.funtl.spring.hello.service.impl;

import com.funtl.spring.hello.mapper.TbUserMapper;
import com.funtl.spring.hello.service.TbUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TbUserServiceImpl implements TbUserService {

    @Resource
    private TbUserMapper tbUserMapper;

}
