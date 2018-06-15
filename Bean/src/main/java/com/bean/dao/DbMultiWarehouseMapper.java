package com.bean.dao;

import com.bean.model.DbMultiWarehouse;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DbMultiWarehouseMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbMultiWarehouse record);

    int insertSelective(DbMultiWarehouse record);

    DbMultiWarehouse selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbMultiWarehouse record);

    List<String> selectDistinctMainSku();
}