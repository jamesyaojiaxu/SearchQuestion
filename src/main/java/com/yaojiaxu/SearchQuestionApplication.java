package com.yaojiaxu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.yaojiaxu.dao")
@SpringBootApplication
public class SearchQuestionApplication {
    public static void main(String[] args) {
        SpringApplication.run(SearchQuestionApplication.class, args);
    }
}
