package com.lijian.wiki.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@ComponentScan("com.lijian")
@RestController
public class TestController {

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String hello(){
        return "helloworld";
    }

    @RequestMapping(value = "hello-post",method = RequestMethod.POST)
    public String helloPost(){
        return "helloworld-post";
    }

    @RequestMapping(value = "hello-post-param",method = RequestMethod.POST)
    public String helloPostParam(String name){
        return "helloworld-post-param" + name;
    }
}

