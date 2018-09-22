package com.linShen.browser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V1.0
 * @author: lin_shen
 * @date: 2018/5/6
 * @Description: TODO
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
    @GetMapping("/user/hi")
    public String hi(){
        return "hi world";
    }
}
