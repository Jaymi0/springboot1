package com.ge.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    public String Say(){
        System.out.println("执行controller方法111");
        return "index";

    }

}
