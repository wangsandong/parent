package com.wh.test.domain.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * @Author wh
 * @Date 2019/7/1 16:09
 */
@Document(indexName = "estest", type = "test")
@Data
public class ElasticSearchEntity implements Serializable {
    @Id
    @Field(store = true, index = false, type = FieldType.Integer)
    private Integer id;
    @Field(analyzer = "ik_smart", store = true, searchAnalyzer = "ik_smart", type = FieldType.Text)
    private String title;
    @Field(analyzer = "ik_smart", store = true, searchAnalyzer = "ik_smart", type = FieldType.Text)
    private String content;

    @Override
    public String toString() {
        return "ElasticSearchEntity [id=" + id + ", title=" + title + ", content=" + content + "]";
    }

}
