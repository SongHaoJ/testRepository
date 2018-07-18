package com.bean.dao;

import com.bean.model.DbBullet;

public interface DbBulletMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbBullet record);

    int insertSelective(DbBullet record);

    DbBullet selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbBullet record);

    int updateByPrimaryKeyWithBLOBs(DbBullet record);

    int updateByPrimaryKey(DbBullet record);
}