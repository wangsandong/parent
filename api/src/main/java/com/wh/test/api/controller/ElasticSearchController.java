package com.wh.test.api.controller;

import com.wh.test.data.repository.ElasticSearchRepository;
import com.wh.test.domain.entity.ElasticSearchEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author wh
 * @Date 2019/7/1 18:13
 */
@RestController
@RequestMapping("/elasticSearch")
public class ElasticSearchController {
    @Autowired
    ElasticsearchTemplate elasticsearchTemplate;
    @Autowired
    ElasticSearchRepository elasticSearchMapper;

    @PostMapping(value = "/createIndex")
    public void testCreateIndex() {
        boolean a = elasticsearchTemplate.createIndex(ElasticSearchEntity.class);
        boolean b = elasticsearchTemplate.putMapping(ElasticSearchEntity.class);
        Map mapping = elasticsearchTemplate.getMapping(ElasticSearchEntity.class);
        System.out.println(a);
        System.out.println(b);
    }

    @PostMapping(value = "/save")
    public void save() {
        ElasticSearchEntity entity=new ElasticSearchEntity();
        entity.setContent("sdfasdasf");
        entity.setTitle("whtestTitle");
        elasticSearchMapper.index(entity);
    }

    @PostMapping(value = "/get")
    public Iterable<ElasticSearchEntity> get() {
        ElasticSearchEntity entity=new ElasticSearchEntity();
        entity.setContent("sdfasdasf");
        entity.setTitle("whtestTitle");
        return elasticSearchMapper.findAll();
    }
}
