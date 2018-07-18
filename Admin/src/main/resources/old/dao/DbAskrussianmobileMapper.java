package com.bean.dao;

import com.bean.model.DbAskrussianmobile;

public interface DbAskrussianmobileMapper {
    int deleteByPrimaryKey(String orderid);

    int insert(DbAskrussianmobile record);

    int insertSelective(DbAskrussianmobile record);

    DbAskrussianmobile selectByPrimaryKey(String orderid);

    int updateByPrimaryKeySelective(DbAskrussianmobile record);

    int updateByPrimaryKeyWithBLOBs(DbAskrussianmobile record);

    int updateByPrimaryKey(DbAskrussianmobile record);
}