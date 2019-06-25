package com.wh.test.domain.base;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * Entity 父类
 * 所有的POJO类属性必须使用包装数据类型，参考自《阿里巴巴Java开发手册》第一、(四)、8
 *
 * @author WeiJia Lai
 */
@Data
public abstract class BaseEntity extends BaseEntityPlus {

    // 创建人
    @TableField(fill = FieldFill.INSERT)
    private Long createdBy;

    // 最后更新操作人
    @TableField(fill = FieldFill.UPDATE)
    private Long lastUpdatedBy;

    // 数据权限_租户
    private Long authorityTenant;

    // 数据权限_角色
    private Long authorityRole;

    // 数据权限_个人
    @TableField(fill = FieldFill.INSERT)
    private Long authorityUser;

    // 数据权限_组织
    @TableField(fill = FieldFill.INSERT)
    private Long authorityOrg;
}