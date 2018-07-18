package com.bean.dao;

import com.bean.model.DbPurchasepaymentdetail;

public interface DbPurchasepaymentdetailMapper {
    int insert(DbPurchasepaymentdetail record);

    int insertSelective(DbPurchasepaymentdetail record);
}