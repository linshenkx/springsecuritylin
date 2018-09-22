package com.linShen.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V1.0
 * @author: lin_shen
 * @date: 2018/5/6
 * @Description: TODO
 */
@SpringBootApplication
@RestController
public class SpringSecurityDemoApplication {
    public static void main(String[] args){
        SpringApplication.run(SpringSecurityDemoApplication.class,args);
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
    @GetMapping("/user/hi")
    public String hi(){
        return "hi world";
    }
}
