package com.bean.dao;

import com.bean.model.DbAlifeedbackorder;

public interface DbAlifeedbackorderMapper {
    int deleteByPrimaryKey(String tradeid);

    int insert(DbAlifeedbackorder record);

    int insertSelective(DbAlifeedbackorder record);

    DbAlifeedbackorder selectByPrimaryKey(String tradeid);

    int updateByPrimaryKeySelective(DbAlifeedbackorder record);

    int updateByPrimaryKeyWithBLOBs(DbAlifeedbackorder record);

    int updateByPrimaryKey(DbAlifeedbackorder record);
}