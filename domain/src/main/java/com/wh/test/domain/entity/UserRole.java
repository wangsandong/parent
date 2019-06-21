package com.wh.test.domain.entity;

import lombok.Data;

/**
 * @Author wh
 * @Date 2019/6/21 15:36
 */
@Data
public class UserRole extends BaseEntity {
    private int id;
    private String username;
    private String password;
}
