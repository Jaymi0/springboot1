package com.ge.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/say")
    public String Say(){
        System.out.println("执行controller方法");
        System.out.println("执行controller方法");
        return "hello";

    }

}
