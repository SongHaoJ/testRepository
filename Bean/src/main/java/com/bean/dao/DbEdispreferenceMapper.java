package com.bean.dao;

import com.bean.model.DbEdispreference;

public interface DbEdispreferenceMapper {
    int deleteByPrimaryKey(String consignpreferenceid);

    int insert(DbEdispreference record);

    int insertSelective(DbEdispreference record);

    DbEdispreference selectByPrimaryKey(String consignpreferenceid);

    int updateByPrimaryKeySelective(DbEdispreference record);

    int updateByPrimaryKeyWithBLOBs(DbEdispreference record);

    int updateByPrimaryKey(DbEdispreference record);
}