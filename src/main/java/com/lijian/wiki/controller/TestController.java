package com.lijian.wiki.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan("com.lijian")
@RestController
public class TestController {

    @RequestMapping("hello")
    public String hello(){
        return "helloworld";
    }
}
