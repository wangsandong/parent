package com.wh.test.api.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wh.test.core.service.HelloService;
import com.wh.test.domain.base.Query;
import com.wh.test.domain.base.R;
import com.wh.test.domain.entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public List<UserRole> hello() {
        return helloService.sayHello();
    }

    @GetMapping("/hello2")
    public List<UserRole> hello2() {
        return helloService.sayHello2();
    }

    @PostMapping("/helloPage")
    public R helloPage(@RequestBody HashMap<String, Object> map) {
        Query query = new Query(map);
        /**
         * 2.分页操作
         */
        Page page = PageHelper.startPage(query.getPageNum(), query.getPageSize());
        List<UserRole> list = helloService.helloPage();
        return R.ok().put("total", page.getTotal()).put("list", list);
    }
}
