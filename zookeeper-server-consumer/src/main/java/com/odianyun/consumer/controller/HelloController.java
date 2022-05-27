package com.odianyun.consumer.controller;

import com.odianyun.consumer.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("consumer")
public class HelloController {

    @Resource
    private HelloService helloService;

    @GetMapping("hello")
    public String hello(){
        String hello = helloService.hello();
        return hello;
    }

}
