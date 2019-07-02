package com.wh.test.core.service;

import com.wh.test.domain.base.BaseService;
import com.wh.test.domain.entity.UserRoleEntity;

import java.util.List;

/**
 * @Author wh
 * @Date 2019/6/21 15:28
 */
public interface HelloService extends BaseService<UserRoleEntity> {
    List<UserRoleEntity> sayHello();
    List<UserRoleEntity> sayHello2();
    List<UserRoleEntity> helloPage();
}
