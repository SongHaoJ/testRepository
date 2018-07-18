package com.bean.dao;

import com.bean.model.DbPrinteubTemp;

public interface DbPrinteubTempMapper {
    int deleteByPrimaryKey(String sequenceuid);

    int insert(DbPrinteubTemp record);

    int insertSelective(DbPrinteubTemp record);

    DbPrinteubTemp selectByPrimaryKey(String sequenceuid);

    int updateByPrimaryKeySelective(DbPrinteubTemp record);

    int updateByPrimaryKeyWithBLOBs(DbPrinteubTemp record);

    int updateByPrimaryKey(DbPrinteubTemp record);
}