package com.yaojiaxu.controller;

import com.yaojiaxu.pojo.DestAnswer;
import com.yaojiaxu.pojo.Record;
import com.yaojiaxu.pojo.SrcAnswer;
import com.yaojiaxu.pojo.Page;
import com.yaojiaxu.service.impl.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private Service service;

    @GetMapping("/search")
    public ModelAndView firstsearch(HttpServletRequest request, String query, int currentPage) throws Exception {
        Page page = service.postQuery(query, currentPage);
        service.addRecord(new Record(request.getRemoteHost(),query,new Date()));
        ArrayList<DestAnswer> destAnswers = page.getDestAnswer();
        ModelAndView mv = new ModelAndView();
        mv.addObject("query", query);//搜索内容
        mv.addObject("answers", destAnswers);//解答对象构成的数组
        mv.addObject("paginationlist", page.getPaginationList());//分页序列
        mv.addObject("total", page.getTotal());//题目总数
        mv.addObject("currentpage", currentPage);//当前页码,起始页码为1

        mv.setViewName("result");
        return mv;
    }

}
