package com.bean.dao;

import com.bean.model.StatProductShopDaily;

public interface StatProductShopDailyMapper {
    int insert(StatProductShopDaily record);

    int insertSelective(StatProductShopDaily record);
}