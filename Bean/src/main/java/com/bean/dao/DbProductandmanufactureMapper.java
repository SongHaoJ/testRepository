package com.bean.dao;

import com.bean.model.DbProductandmanufacture;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbProductandmanufactureMapper {
    DbProductandmanufacture selectByCriteria(DbProductandmanufacture DbProductandmanufacture);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProductandmanufacture DbProductandmanufacture);

    int insertByCriteria(DbProductandmanufacture DbProductandmanufacture);

    int updateByCriteria(DbProductandmanufacture DbProductandmanufacture);

    DbProductandmanufacture selectByPrimaryKey(String sequenceid);

    List<DbProductandmanufacture> selectAll();
}