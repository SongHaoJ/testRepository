package com.bean.dao;

import com.bean.model.DbPurchasepayment;

public interface DbPurchasepaymentMapper {
    int insert(DbPurchasepayment record);

    int insertSelective(DbPurchasepayment record);
}