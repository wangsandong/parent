package com.wh.test.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.wh.test.domain.base.BaseEntity;
import lombok.Data;

/**
 * @Author wh
 * @Date 2019/6/21 15:36
 */
@Data
@TableName(value = "users")
public class UserRole extends BaseEntity {
    private String username;
    private String password;
}
