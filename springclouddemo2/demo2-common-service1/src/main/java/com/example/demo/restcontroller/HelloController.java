package com.example.demo.restcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZhangGuozhao on 2017/11/6.
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("default")
    public String first(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }


    @RequestMapping("world")
    public String world() {
        return "HelloWorld!";
    }

    @RequestMapping("mate")
    public String mate() {
        return "HelloMate!";
    }
}
