package com.bean.dao;

import com.bean.model.DbQtwmsservicetype;

public interface DbQtwmsservicetypeMapper {
    int deleteByPrimaryKey(String serviceid);

    int insert(DbQtwmsservicetype record);

    int insertSelective(DbQtwmsservicetype record);

    DbQtwmsservicetype selectByPrimaryKey(String serviceid);

    int updateByPrimaryKeySelective(DbQtwmsservicetype record);

    int updateByPrimaryKey(DbQtwmsservicetype record);
}