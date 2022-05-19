package com.yaojiaxu.service.impl;
import com.yaojiaxu.dao.Dao;
import com.yaojiaxu.pojo.DestAnswer;
import com.yaojiaxu.pojo.Record;
import com.yaojiaxu.pojo.SrcAnswer;
import com.yaojiaxu.pojo.Page;
import com.yaojiaxu.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

@org.springframework.stereotype.Service
public class Service implements com.yaojiaxu.service.Service {
    @Autowired
    private Dao dao;
    @Override
    /*
    搜题接口
    query-查询的字符串
    currentPage-当前页码数,起始页的值为1
    * */
    public Page postQuery(String query, int currentPage) throws Exception {
        Page page = new Page();
        int pageSize = 10;//每页显示10道题目
        int offset = pageSize * currentPage;
        //将搜索内容截断
        query = query.length()<30?query:query.substring(0, 30);
        ArrayList<SrcAnswer> srcAnswers = dao.search(query,(currentPage-1)*pageSize,offset);//获取解答对象
        ArrayList<DestAnswer> destAnswers=new ArrayList<>();
        for (int i = 0; i < srcAnswers.size(); i++) {
            /*
             构造DestAnswer
             构造方法:1.将SrcAnswer中的问题和答案中的无用字符过滤掉 2.将SrcAnswer中的选项按照ABCD拆分
             */
            SrcAnswer srcAnswer = srcAnswers.get(i);
            String srcTitle=srcAnswer.getTitle();//源问题
            String srcOptions=srcAnswer.getOptions();//源选项
            String srcSolution=srcAnswer.getSolution();//源答案

            String destTitle=Utils.filterWords(srcTitle);//将无用字符过滤掉
            LinkedList<String> destOptions=Utils.splitOptions(srcOptions);//将选项按照ABCD拆分
            String destSolution=Utils.filterWords(srcSolution);//将无用字符过滤掉

            DestAnswer destAnswer =new DestAnswer(destTitle,destOptions,destSolution);
            destAnswers.add(destAnswer);
        }
        int total = dao.getTotal(query);//题目总数
        ArrayList<Integer> paginationList = new ArrayList<>();//分页序列,形如[1,2,3,4,5]

        for (int i = 0; i < (total-1) / pageSize  + 1; i++) {
            /*
        构造分页序列
        假设pageSize = 10
        total∈[1,10],paginationList=[1]
        total∈[11,20],paginationList=[1,2]
        total∈[21,30],paginationList=[1,2,3]
        故有通项公式 max element of paginationList=((total-1) / pageSize) + 1
        */
            paginationList.add(i + 1);
        }
        page.setDestAnswer(destAnswers);
        page.setPaginationList(paginationList);
        page.setTotal(total);
        return page;
    }
    public void addRecord(Record record){
        dao.addRecord(record);
    }
}
