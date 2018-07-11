package com.bean.dao;

import com.bean.model.DbProductandmanufacture;
import java.util.List;
import org.springframework.stereotype.Service;

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