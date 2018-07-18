package com.bean.dao;

import com.bean.model.StatProductDaily;

public interface StatProductDailyMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(StatProductDaily record);

    int insertSelective(StatProductDaily record);

    StatProductDaily selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(StatProductDaily record);

    int updateByPrimaryKey(StatProductDaily record);
}