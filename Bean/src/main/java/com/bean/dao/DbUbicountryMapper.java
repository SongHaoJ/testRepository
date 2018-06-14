package com.bean.dao;

import com.bean.model.DbUbicountry;

public interface DbUbicountryMapper {
    int insert(DbUbicountry record);

    int insertSelective(DbUbicountry record);
}