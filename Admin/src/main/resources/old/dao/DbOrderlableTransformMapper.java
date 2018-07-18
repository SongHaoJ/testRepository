package com.bean.dao;

import com.bean.model.DbOrderlableTransform;

public interface DbOrderlableTransformMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DbOrderlableTransform record);

    int insertSelective(DbOrderlableTransform record);

    DbOrderlableTransform selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DbOrderlableTransform record);

    int updateByPrimaryKeyWithBLOBs(DbOrderlableTransform record);

    int updateByPrimaryKey(DbOrderlableTransform record);
}