package com.wh.test.data.dao;

import com.wh.test.domain.base.BaseDao;
import com.wh.test.domain.entity.UserRoleEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * @Author wh
 * @Date 2019/6/21 15:38
 */
@Mapper
@Repository
public interface UserRoleMapper extends BaseDao<UserRoleEntity> {
    /**
     * 查询所有的用户角色
     * @return
     */
    List<UserRoleEntity> all();
}