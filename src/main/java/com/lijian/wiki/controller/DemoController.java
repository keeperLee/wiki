package com.lijian.wiki.controller;

import com.lijian.wiki.domain.Demo;
import com.lijian.wiki.service.DemoService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@ComponentScan("com.lijian")
@RestController
public class DemoController {

    @Resource
    private DemoService demoService;

    @GetMapping("/showdemo")
    public List<Demo> selectDemo(){
        return demoService.list();
    };


}

