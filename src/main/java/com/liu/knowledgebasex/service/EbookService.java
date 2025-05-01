package com.liu.knowledgebasex.service;


import com.liu.knowledgebasex.domain.Ebook;
import com.liu.knowledgebasex.domain.EbookExample;
import com.liu.knowledgebasex.mapper.EbookMapper;
import com.liu.knowledgebasex.requestObject.EbookReq;
import com.liu.knowledgebasex.resp.EbookResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {

    private static final Logger LOG = LoggerFactory.getLogger(EbookService.class);

    @Autowired
    private EbookMapper ebookMapper;


    public List<EbookResp> list(EbookReq ebookReq) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + ebookReq.getName() + "%");
//        List<Ebook> ebooks = ebookMapper.selectAll();

        List<Ebook> ebooks = ebookMapper.selectByExample(ebookExample);

        List<EbookResp> ebookRespList = new ArrayList<>();
        for (Ebook ebook : ebooks) {
            EbookResp ebookResp = new EbookResp();
            BeanUtils.copyProperties(ebook, ebookResp);
            ebookRespList.add(ebookResp);
        }


        return ebookRespList;
    }

}
