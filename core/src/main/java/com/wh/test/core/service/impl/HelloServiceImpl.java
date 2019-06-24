package com.wh.test.core.service.impl;

import com.wh.test.core.service.HelloService;
import com.wh.test.data.dao.UserRoleMapper;
import com.wh.test.domain.entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wh
 * @Date 2019/6/21 15:29
 */
@Service
public class HelloServiceImpl  implements HelloService {
    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public List<UserRole> sayHello() {
        List<UserRole> data = userRoleMapper.all();
        return data;
    }
}