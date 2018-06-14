package com.bean.dao;

import com.bean.model.DbQtwarehouses;

public interface DbQtwarehousesMapper {
    int deleteByPrimaryKey(String warehouseid);

    int insert(DbQtwarehouses record);

    int insertSelective(DbQtwarehouses record);

    DbQtwarehouses selectByPrimaryKey(String warehouseid);

    int updateByPrimaryKeySelective(DbQtwarehouses record);

    int updateByPrimaryKey(DbQtwarehouses record);
}