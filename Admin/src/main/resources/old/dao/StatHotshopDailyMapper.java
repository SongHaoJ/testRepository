package com.bean.dao;

import com.bean.model.StatHotshopDaily;

public interface StatHotshopDailyMapper {
    int insert(StatHotshopDaily record);

    int insertSelective(StatHotshopDaily record);
}