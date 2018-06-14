package com.bean.dao;

import com.bean.model.DbShopebaysummary;

public interface DbShopebaysummaryMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbShopebaysummary record);

    int insertSelective(DbShopebaysummary record);

    DbShopebaysummary selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbShopebaysummary record);

    int updateByPrimaryKey(DbShopebaysummary record);
}