package com.bean.dao;

import com.bean.model.StatProductdetilDaily;

public interface StatProductdetilDailyMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(StatProductdetilDaily record);

    int insertSelective(StatProductdetilDaily record);

    StatProductdetilDaily selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(StatProductdetilDaily record);

    int updateByPrimaryKeyWithBLOBs(StatProductdetilDaily record);

    int updateByPrimaryKey(StatProductdetilDaily record);
}