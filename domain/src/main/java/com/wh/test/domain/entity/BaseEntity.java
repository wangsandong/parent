package com.wh.test.domain.entity;

import lombok.Data;

/**
 * @Author wh
 * @Date 2019/6/21 15:35
 */
@Data
public abstract class BaseEntity {
    private long createdAt;

    private String createdBy;

    private long updatedAt;

    private String updatedBy;
}
