package com.bean.dao;

import com.bean.model.DbProductlog;
import org.springframework.stereotype.Repository;

@Repository
public interface DbProductlogMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbProductlog record);

    int insertSelective(DbProductlog record);

    DbProductlog selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbProductlog record);

}