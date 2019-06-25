package com.wh.test.domain.base;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

/**
 * Service实现类 父类
 *
 * @author wh
 */
public abstract class BaseServiceImpl2<M extends BaseDao<T>, T> extends ServiceImpl<M, T> implements BaseService<T> {

    /**
     * 日志常量
     */
    protected Logger LOGGER = LoggerFactory.getLogger(getClass());


    @Override
    public List<T> listCustom(Map<String, Object> map) {
        return baseMapper.selectListCustom(map);
    }

    @Override
    @Transactional
    public void saveBatchCustom(List<T> list) {
        baseMapper.insertBatchCustom(list);
    }

}
