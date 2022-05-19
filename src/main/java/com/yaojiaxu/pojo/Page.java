package com.yaojiaxu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
//一页数据包含的信息
public class Page {
    ArrayList<DestAnswer> DestAnswer;//一页题目
    ArrayList<Integer> paginationList;//分页序列,形如[1,2,3,4,5]
    int total;//结果条数
}
