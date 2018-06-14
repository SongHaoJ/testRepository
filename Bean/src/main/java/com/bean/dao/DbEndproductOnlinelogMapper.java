package com.bean.dao;

import com.bean.model.DbEndproductOnlinelog;

public interface DbEndproductOnlinelogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbEndproductOnlinelog record);

    int insertSelective(DbEndproductOnlinelog record);

    DbEndproductOnlinelog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbEndproductOnlinelog record);

    int updateByPrimaryKeyWithBLOBs(DbEndproductOnlinelog record);

    int updateByPrimaryKey(DbEndproductOnlinelog record);
}