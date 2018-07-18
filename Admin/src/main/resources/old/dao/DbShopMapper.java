package com.bean.dao;

import com.bean.model.DbShop;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface DbShopMapper {
    int deleteByPrimaryKey(String sid) throws Exception;

    int insert(DbShop record) throws Exception;

    int insertSelective(DbShop record) throws Exception;

    DbShop selectByPrimaryKey(String sid) throws Exception;

    int updateByPrimaryKeySelective(DbShop record) throws Exception;

    List<DbShop> selectShopForOrder(Map<String,Object> paramMap) throws Exception;
}