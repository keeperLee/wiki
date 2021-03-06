package com.lijian.wiki.controller;

import com.lijian.wiki.domain.Test;
import com.lijian.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@ComponentScan("com.lijian")
@RestController
public class TestController {

    @Resource
    private TestService testService;

    //如果配置文件有值则取配置文件中的值，没有则取默认值，这里是defaultValue
    @Value("${test.hello:defaultValue}")
    private String testHello;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "helloworld " +testHello;
    }

    @RequestMapping(value = "/hello-post",method = RequestMethod.POST)
    public String helloPost(){
        return "helloworld-post";
    }

    @RequestMapping(value = "/hello-post-param",method = RequestMethod.POST)
    public String helloPostParam(String name){
        return "helloworld-post-param" + name;
    }

    @RequestMapping(value = "/test-list",method = RequestMethod.GET)
    public List<Test> testList(String name){
        return testService.list();
    }
}

