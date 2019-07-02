package com.wh.test.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;


/****
 *
 * 功能描述: 
 *
 * @auther: wh
 * 
 * @date: 2019/6/21 16:09
 */
@SpringBootApplication(scanBasePackages = {"com.wh.test"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}