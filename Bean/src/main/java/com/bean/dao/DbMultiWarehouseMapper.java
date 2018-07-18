package com.bean.dao;

import com.bean.model.DbMultiWarehouse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbMultiWarehouseMapper {
    DbMultiWarehouse selectByCriteria(DbMultiWarehouse DbMultiWarehouse);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbMultiWarehouse DbMultiWarehouse);

    int insertByCriteria(DbMultiWarehouse DbMultiWarehouse);

    int updateByCriteria(DbMultiWarehouse DbMultiWarehouse);

    DbMultiWarehouse selectByPrimaryKey(String sequenceid);

    List<DbMultiWarehouse> selectAll();
}