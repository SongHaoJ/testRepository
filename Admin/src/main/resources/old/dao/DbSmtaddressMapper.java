package com.bean.dao;

import com.bean.model.DbSmtaddress;

public interface DbSmtaddressMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DbSmtaddress record);

    int insertSelective(DbSmtaddress record);

    DbSmtaddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DbSmtaddress record);

    int updateByPrimaryKeyWithBLOBs(DbSmtaddress record);

    int updateByPrimaryKey(DbSmtaddress record);
}