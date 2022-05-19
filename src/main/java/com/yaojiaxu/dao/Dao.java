package com.yaojiaxu.dao;

import com.yaojiaxu.pojo.SrcAnswer;
import com.yaojiaxu.pojo.Record;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface Dao {
    void addRecord(Record record);//添加日志记录

    ArrayList<SrcAnswer> search(@Param("title") String query,@Param("start") int start,@Param("end")int end);//搜题

    int getTotal(@Param("title") String query);//获取结果数
}
