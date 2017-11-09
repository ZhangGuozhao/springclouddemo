package com.example.demo.restcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.security.crypto.keygen.StringKeyGenerator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZhangGuozhao on 2017/11/6.
 */
@RefreshScope
@RestController
@RequestMapping("hello")
public class HelloController {

    @Value("${server.port}")
    private String port;

    @Value("${foo}")
    private String foo;

    @RequestMapping("getFoo")
    public String getFoo() {
        return  foo;
    }

    @RequestMapping("default")
    public String first(@RequestParam String name) {
        return "hi " + name + ",i am from port: " + port;
    }

    @RequestMapping("friend")
    public String friend() {
        return "Hello Friend!";
    }

}
