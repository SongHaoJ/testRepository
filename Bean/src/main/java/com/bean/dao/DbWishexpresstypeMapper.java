package com.bean.dao;

import com.bean.model.DbWishexpresstype;

public interface DbWishexpresstypeMapper {
    int deleteByPrimaryKey(Short sid);

    int insert(DbWishexpresstype record);

    int insertSelective(DbWishexpresstype record);

    DbWishexpresstype selectByPrimaryKey(Short sid);

    int updateByPrimaryKeySelective(DbWishexpresstype record);

    int updateByPrimaryKeyWithBLOBs(DbWishexpresstype record);

    int updateByPrimaryKey(DbWishexpresstype record);
}