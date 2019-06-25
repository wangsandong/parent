package com.wh.test.domain.base;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 查询参数
 *
 * @author wh
 */
@Data
public class Query extends LinkedHashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    // 当前页码
    private Integer pageNum = 1;

    // 每页条数
    private Integer pageSize = 10;

    public Query(Map<String, Object> params) {
        this.putAll(params);

        // 分页参数
        if (null != params.get("pageNum")) {
            this.pageNum = Integer.parseInt(params.get("pageNum").toString());
            this.put("pageNum", pageNum);
        }
        if (null != params.get("pageSize")) {
            this.pageSize = Integer.parseInt(params.get("pageSize").toString());
            this.put("pageSize", pageSize);
        }

        // 防止SQL注入（因为sidx、order是通过拼接SQL实现排序的，会有SQL注入风险）
        String sidx = (String) params.get("sidx");
        String order = (String) params.get("order");
        if (StringUtils.isNotBlank(sidx)) {
            this.put("sidx", sqlInject(sidx));
        }
        if (StringUtils.isNotBlank(order)) {
            this.put("order", sqlInject(order));
        }

    }

    public String sqlInject(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        // 去掉'|"|;|\字符
        str = StringUtils.replace(str, "'", "");
        str = StringUtils.replace(str, "\"", "");
        str = StringUtils.replace(str, ";", "");
        str = StringUtils.replace(str, "\\", "");

        // 转换成小写
        str = str.toLowerCase();

        // 非法字符
        String[] keywords = {"master", "truncate", "insert", "select", "delete", "update", "declare", "alert", "drop"};

        // 判断是否包含非法字符
        for (String keyword : keywords) {
            if (str.indexOf(keyword) != -1) {
                throw new RuntimeException("包含非法字符");
            }
        }

        return str;
    }
}
