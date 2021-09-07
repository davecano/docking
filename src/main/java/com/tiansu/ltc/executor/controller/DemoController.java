package com.tiansu.ltc.executor.controller;

import com.tiansu.ltc.executor.entity.DemoUser;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//文档地址 http://ip+port/doc.html
@RestController
@Slf4j
public class DemoController {

    @PostMapping("/login")
    @ApiOperation(value = "用户登录")
    public String login(@RequestBody DemoUser user){
        log.info("username:"+user.getName()+" password:"+user.getPassword());
        return "username:"+user.getName()+" password:"+user.getPassword();

    }
}
