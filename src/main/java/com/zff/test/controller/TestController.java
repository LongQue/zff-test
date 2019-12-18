package com.zff.test.controller;

import com.zff.test.entity.UserRequest;
import com.zff.test.util.ValidatorUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhouFufeng
 * @since 2019/12/9
 **/
@RestController
public class TestController {
    
    @GetMapping("/test")
    public String test() {

        return "redis OK";
    }

    @PostMapping("/create")
    public String create(@RequestBody UserRequest request) {
        ValidatorUtil.validate(request, UserRequest.Create.class);
        return "create OK";
    }

    @GetMapping("/login")
    public String login(@RequestBody UserRequest request) {
        ValidatorUtil.validate(request, UserRequest.Login.class);
        return "login OK";
    }
}
