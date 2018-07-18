package com.bean.dao;

import com.bean.model.DbReturnInstorage;
import java.math.BigDecimal;

public interface DbReturnInstorageMapper {
    int deleteByPrimaryKey(BigDecimal sequenceid);

    int insert(DbReturnInstorage record);

    int insertSelective(DbReturnInstorage record);

    DbReturnInstorage selectByPrimaryKey(BigDecimal sequenceid);

    int updateByPrimaryKeySelective(DbReturnInstorage record);

    int updateByPrimaryKeyWithBLOBs(DbReturnInstorage record);

    int updateByPrimaryKey(DbReturnInstorage record);
}