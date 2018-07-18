package com.bean.dao;

import com.bean.model.Shop;

public interface ShopMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}