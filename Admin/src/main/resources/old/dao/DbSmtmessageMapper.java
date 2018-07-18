package com.bean.dao;

import com.bean.model.DbSmtmessage;

public interface DbSmtmessageMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbSmtmessage record);

    int insertSelective(DbSmtmessage record);

    DbSmtmessage selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbSmtmessage record);

    int updateByPrimaryKeyWithBLOBs(DbSmtmessage record);

    int updateByPrimaryKey(DbSmtmessage record);
}