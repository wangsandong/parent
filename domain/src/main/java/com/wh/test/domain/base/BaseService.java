package com.wh.test.domain.base;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * Service接口 父类
 *
 * @author wh
 */
public interface BaseService<T> extends IService<T> {

    /**
     * 自定义集合查询
     */
    List<T> listCustom(Map<String, Object> map);

    /**
     * 自定义批量插入
     */
    void saveBatchCustom(List<T> list);

}
