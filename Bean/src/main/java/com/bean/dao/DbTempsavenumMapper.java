package com.bean.dao;

import com.bean.model.DbTempsavenum;

public interface DbTempsavenumMapper {
    int insert(DbTempsavenum record);

    int insertSelective(DbTempsavenum record);
}