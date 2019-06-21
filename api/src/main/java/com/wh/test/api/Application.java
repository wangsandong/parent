package com.wh.test.api;

import com.detectivehlh.test.core.CoreConfiguration;
import com.wh.test.data.DataConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({CoreConfiguration.class, DataConfiguration.class})
/****
 *
 * 功能描述: 
 *
 * @auther: wh
 * 
 * @param null
 * @date: 2019/6/21 16:08
 */

public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}