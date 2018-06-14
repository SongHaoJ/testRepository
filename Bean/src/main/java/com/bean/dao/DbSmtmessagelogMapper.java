package com.bean.dao;

import com.bean.model.DbSmtmessagelog;

public interface DbSmtmessagelogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbSmtmessagelog record);

    int insertSelective(DbSmtmessagelog record);

    DbSmtmessagelog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbSmtmessagelog record);

    int updateByPrimaryKeyWithBLOBs(DbSmtmessagelog record);

    int updateByPrimaryKey(DbSmtmessagelog record);
}