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
/*
从数据库读取的解答对象
 */
public class SrcAnswer {
    private String title;//问题
    private String options;//选项
    private String solution;//答案
}
