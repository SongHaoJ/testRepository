package com.bean.dao;

import com.bean.model.StatMoneyDaily;

public interface StatMoneyDailyMapper {
    int insert(StatMoneyDaily record);

    int insertSelective(StatMoneyDaily record);
}