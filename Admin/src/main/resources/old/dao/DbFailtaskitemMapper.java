package com.bean.dao;

import com.bean.model.DbFailtaskitem;

public interface DbFailtaskitemMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbFailtaskitem record);

    int insertSelective(DbFailtaskitem record);

    DbFailtaskitem selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbFailtaskitem record);

    int updateByPrimaryKeyWithBLOBs(DbFailtaskitem record);

    int updateByPrimaryKey(DbFailtaskitem record);
}