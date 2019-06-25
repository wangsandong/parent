package com.wh.test.domain.base;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * BaseEntity 父类，参考自《阿里巴巴Java开发手册》第五、(一)、9.【强制】表必备三字段。
 * 所有的POJO类属性必须使用包装数据类型，参考自《阿里巴巴Java开发手册》第一、(四)、8
 *
 * @author WeiJia Lai
 */
@Data
@KeySequence("DXHY_TAX_SEQ_GRASP_DATA")
public abstract class BaseEntityPlus {

    @TableId
    private Long id;

    // 创建日期
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @TableField(fill = FieldFill.INSERT)
    private Date creationDate;

    // 最后更新日期
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @TableField(fill = FieldFill.UPDATE)
    private Date lastUpdateDate;
}