package com.bean.dao;

import com.bean.model.DbMuliproduct;

public interface DbMuliproductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DbMuliproduct record);

    int insertSelective(DbMuliproduct record);

    DbMuliproduct selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DbMuliproduct record);

    int updateByPrimaryKey(DbMuliproduct record);
}