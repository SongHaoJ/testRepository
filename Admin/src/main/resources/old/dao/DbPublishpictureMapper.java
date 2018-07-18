package com.bean.dao;

import com.bean.model.DbPublishpicture;

public interface DbPublishpictureMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbPublishpicture record);

    int insertSelective(DbPublishpicture record);

    DbPublishpicture selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbPublishpicture record);

    int updateByPrimaryKeyWithBLOBs(DbPublishpicture record);

    int updateByPrimaryKey(DbPublishpicture record);
}