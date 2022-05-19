package com.yaojiaxu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
//用于记录日志
public class Record {
    private String ip;//ip地址
    private String query;//查询内容
    private Date date;//时间
}
