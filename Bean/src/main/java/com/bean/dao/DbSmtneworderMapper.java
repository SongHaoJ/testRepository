package com.bean.dao;

import com.bean.model.DbSmtneworder;

public interface DbSmtneworderMapper {
    int deleteByPrimaryKey(String orderid);

    int insert(DbSmtneworder record);

    int insertSelective(DbSmtneworder record);

    DbSmtneworder selectByPrimaryKey(String orderid);

    int updateByPrimaryKeySelective(DbSmtneworder record);

    int updateByPrimaryKeyWithBLOBs(DbSmtneworder record);

    int updateByPrimaryKey(DbSmtneworder record);
}