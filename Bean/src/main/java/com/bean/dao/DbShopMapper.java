package com.bean.dao;

import com.bean.model.DbShop;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface DbShopMapper {
    int deleteByPrimaryKey(String sid);

    int insert(DbShop record);

    int insertSelective(DbShop record);

    DbShop selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(DbShop record);

    int updateByPrimaryKeyWithBLOBs(DbShop record);

    int updateByPrimaryKey(DbShop record);

    List<DbShop> selectShopForOrder(Map<String,String> paramMap);
}