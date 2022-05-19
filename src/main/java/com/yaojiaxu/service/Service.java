package com.yaojiaxu.service;

import com.yaojiaxu.pojo.Page;

public interface Service {
    public Page postQuery(String query, int currentPage) throws Exception;
}
