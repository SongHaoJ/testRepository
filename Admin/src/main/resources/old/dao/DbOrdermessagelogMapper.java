package com.bean.dao;

import com.bean.model.DbOrdermessagelog;

public interface DbOrdermessagelogMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbOrdermessagelog record);

    int insertSelective(DbOrdermessagelog record);

    DbOrdermessagelog selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbOrdermessagelog record);

    int updateByPrimaryKeyWithBLOBs(DbOrdermessagelog record);

    int updateByPrimaryKey(DbOrdermessagelog record);
}