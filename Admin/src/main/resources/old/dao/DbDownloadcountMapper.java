package com.bean.dao;

import com.bean.model.DbDownloadcount;

public interface DbDownloadcountMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbDownloadcount record);

    int insertSelective(DbDownloadcount record);

    DbDownloadcount selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbDownloadcount record);

    int updateByPrimaryKey(DbDownloadcount record);
}