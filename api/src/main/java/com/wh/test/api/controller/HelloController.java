package com.wh.test.api.controller;

import com.detectivehlh.test.core.service.HelloService;
import com.wh.test.domain.entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public List<UserRole> hello() {
        return helloService.sayHello();
    }
}
