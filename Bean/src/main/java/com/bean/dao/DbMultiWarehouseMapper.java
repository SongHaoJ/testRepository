package com.bean.dao;

import com.bean.model.DbMultiWarehouse;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface DbMultiWarehouseMapper {
    int deleteByPrimaryKey(String sequenceid);

    int insert(DbMultiWarehouse record);

    int insertSelective(DbMultiWarehouse record);

    DbMultiWarehouse selectByPrimaryKey(String sequenceid);

    int updateByPrimaryKeySelective(DbMultiWarehouse record);

    List<String> selectDistinctMainSku();

    List<String> selectByMainSku(Map<String,String> params);

    List<String> selectMoreSkuByProductSku(Map<String,String> params);
}