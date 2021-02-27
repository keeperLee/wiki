package com.lijian.wiki.controller;

import com.lijian.wiki.domain.Demo;
import com.lijian.wiki.domain.Ebook;
import com.lijian.wiki.service.DemoService;
import com.lijian.wiki.service.EbookService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public List<Ebook> selectDemo(){
        return ebookService.list();
    };
}

