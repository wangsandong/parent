package com.wh.test.data.repository;

import com.wh.test.domain.entity.ElasticSearchEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wh
 * @Date 2019/7/1 16:08
 */
public interface ElasticSearchRepository extends ElasticsearchRepository<ElasticSearchEntity, Integer> {
    //根据标题查询
    List<ElasticSearchEntity> findByTitle(String condition);

    //根据标题查询(含分页)
    Page<ElasticSearchEntity> findByTitle(String condition, Pageable pageable);
}