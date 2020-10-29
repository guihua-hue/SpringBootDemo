package com.shyk.pcitc.demo.controller;

import com.shyk.pcitc.demo.Model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/getUser")
    public User getUser() {
        User user = new User();
        user.setUserName("xiaoming");
        user.setPassWord("1234324242");

        return user;
    }
}
