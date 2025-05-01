package com.liu.knowledgebasex.controller;


import com.liu.knowledgebasex.domain.Ebook;
import com.liu.knowledgebasex.requestObject.EbookReq;
import com.liu.knowledgebasex.resp.CommonResp;
import com.liu.knowledgebasex.resp.EbookResp;
import com.liu.knowledgebasex.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Autowired
    private EbookService ebookService;

    /**
     * list方法第一版
     * @return
     */
//    @GetMapping("/list")
//    public CommonResp list() {
//        CommonResp<List<Ebook>> resp = new CommonResp<>();
//        List<Ebook> list = ebookService.list();
//        resp.setContent(list);
//        return resp;
//    }

    /**
     * list方法第二版，新增参数传递，进行条件查询
     * @return
     */
    @GetMapping("/list")
    public CommonResp list(EbookReq  ebookReq) {
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list = ebookService.list(ebookReq);
        resp.setContent(list);
        return resp;
    }

//    @PostMapping("/save")
//    public CommonResp save(@Valid @RequestBody EbookSaveReq req) {
//        CommonResp resp = new CommonResp<>();
//        ebookService.save(req);
//        return resp;
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public CommonResp delete(@PathVariable Long id) {
//        CommonResp resp = new CommonResp<>();
//        ebookService.delete(id);
//        return resp;
//    }
}
