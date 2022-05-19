package com.yaojiaxu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.LinkedList;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
/*
经过处理的解答对象
处理内容:1.将问题和答案中的无用字符过滤掉 2.将选项按照ABCD拆分
 */
public class DestAnswer {
    private String title;//问题
    private LinkedList<String> options;//选项
    private String solution;//答案
}
