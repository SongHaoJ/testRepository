package com.bean.dao;

import com.bean.model.DbManufacture;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbManufactureMapper {
    DbManufacture selectByCriteria(DbManufacture DbManufacture);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbManufacture DbManufacture);

    int insertByCriteria(DbManufacture DbManufacture);

    int updateByCriteria(DbManufacture DbManufacture);

    DbManufacture selectByPrimaryKey(String sequenceid);

    List<DbManufacture> selectAll();
}