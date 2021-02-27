package com.lijian.wiki.controller;

import com.lijian.wiki.domain.Demo;
import com.lijian.wiki.domain.Ebook;
import com.lijian.wiki.request.EbookReq;
import com.lijian.wiki.response.CommonResp;
import com.lijian.wiki.response.EbookResp;
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

//    @GetMapping("/list")
//    public CommonResp<List<Ebook>> list(String name){
//        //这里的name是会自动映射的
//        CommonResp<List<Ebook> > commonResp = new CommonResp<>();
//        List<Ebook> ebookList = ebookService.list(name);
//        commonResp.setContent(ebookList);
//        return commonResp;
//    };

    @GetMapping("/list")
    public CommonResp<List<EbookResp>> list(EbookReq req){
        //写成对象形式也能自动映射
        CommonResp<List<EbookResp> > commonResp = new CommonResp<>();
        List<EbookResp> list = ebookService.list(req);
        commonResp.setContent(list);
        return commonResp;
    };
}

