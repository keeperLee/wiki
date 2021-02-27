package com.lijian.wiki.service;

import com.lijian.wiki.domain.Demo;
import com.lijian.wiki.domain.Ebook;
import com.lijian.wiki.domain.EbookExample;
import com.lijian.wiki.mapper.DemoMapper;
import com.lijian.wiki.mapper.EbookMapper;
import com.lijian.wiki.request.EbookReq;
import com.lijian.wiki.response.EbookResp;
import com.lijian.wiki.util.CopyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%"+req.getName()+"%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        List<EbookResp> respList = new ArrayList<>();

        return CopyUtil.copyList(ebookList,EbookResp.class);
    }
}
