package com.shyk.pcitc.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")   //@RestController 的意思就是 Controller 里面的方法都以 json 格式输出，不用再写什么 jackjson 配置的了!
    public String index() {
        return "Hello World";
    }
}
