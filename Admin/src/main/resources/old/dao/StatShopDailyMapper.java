package com.bean.dao;

import com.bean.model.StatShopDaily;

public interface StatShopDailyMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(StatShopDaily record);

    int insertSelective(StatShopDaily record);

    StatShopDaily selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(StatShopDaily record);

    int updateByPrimaryKey(StatShopDaily record);
}