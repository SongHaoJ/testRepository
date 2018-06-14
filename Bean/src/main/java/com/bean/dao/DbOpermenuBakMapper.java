package com.bean.dao;

import com.bean.model.DbOpermenuBak;

public interface DbOpermenuBakMapper {
    int insert(DbOpermenuBak record);

    int insertSelective(DbOpermenuBak record);
}