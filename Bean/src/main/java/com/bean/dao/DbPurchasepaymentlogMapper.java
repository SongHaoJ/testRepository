package com.bean.dao;

import com.bean.model.DbPurchasepaymentlog;

public interface DbPurchasepaymentlogMapper {
    int insert(DbPurchasepaymentlog record);

    int insertSelective(DbPurchasepaymentlog record);
}