package com.bean.dao;

import com.bean.model.DbEbayinquiry;

public interface DbEbayinquiryMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbEbayinquiry record);

    int insertSelective(DbEbayinquiry record);

    DbEbayinquiry selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbEbayinquiry record);

    int updateByPrimaryKeyWithBLOBs(DbEbayinquiry record);

    int updateByPrimaryKey(DbEbayinquiry record);
}