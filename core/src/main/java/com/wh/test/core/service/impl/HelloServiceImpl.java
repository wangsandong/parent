package com.wh.test.core.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wh.test.core.service.HelloService;
import com.wh.test.data.dao.UserRoleMapper;
import com.wh.test.domain.base.BaseServiceImpl2;
import com.wh.test.domain.entity.UserRoleEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wh
 * @Date 2019/6/21 15:29
 */
@Service
public class HelloServiceImpl extends BaseServiceImpl2<UserRoleMapper, UserRoleEntity> implements HelloService {
//    @Autowired
//    private UserRoleMapper userRoleMapper;

    @Override
    public List<UserRoleEntity> sayHello() {
        List<UserRoleEntity> data =baseMapper.all();
        return data;
    }

    @Override
    public List<UserRoleEntity> sayHello2() {
        return baseMapper.selectList(new QueryWrapper<UserRoleEntity>().eq("id",4));
    }

    @Override
    public List<UserRoleEntity> helloPage() {
        return baseMapper.selectList(new QueryWrapper<>());
    }
}