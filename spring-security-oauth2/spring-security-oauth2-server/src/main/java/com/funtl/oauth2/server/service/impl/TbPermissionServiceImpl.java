package com.funtl.oauth2.server.service.impl;

import com.funtl.oauth2.server.domain.TbPermission;
import com.funtl.oauth2.server.mapper.TbPermissionMapper;
import com.funtl.oauth2.server.service.TbPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbPermissionServiceImpl implements TbPermissionService {

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> selectByUserId(Long userId) {
        return tbPermissionMapper.selectByUserId(userId);
    }
}
