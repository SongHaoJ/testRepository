package com.bean.dao;

import com.bean.model.DbShopingtask;
import java.math.BigDecimal;

public interface DbShopingtaskMapper {
    int deleteByPrimaryKey(BigDecimal itemid);

    int insert(DbShopingtask record);

    int insertSelective(DbShopingtask record);

    DbShopingtask selectByPrimaryKey(BigDecimal itemid);

    int updateByPrimaryKeySelective(DbShopingtask record);

    int updateByPrimaryKey(DbShopingtask record);
}