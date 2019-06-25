package com.wh.test.domain.base;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * Dao 父类
 *
 * @author wh
 */
public interface BaseDao<T> extends BaseMapper<T> {

    /**
     * 自定义集合查询
     */
    List<T> selectListCustom(Map<String, Object> map);

    /**
     * 自定义批量插入
     */
    void insertBatchCustom(List<T> list);


}
