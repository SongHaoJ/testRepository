package com.bean.dao;

import com.bean.model.DbBrand;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbBrandMapper {
    DbBrand selectByCriteria(DbBrand DbBrand);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbBrand DbBrand);

    int insertByCriteria(DbBrand DbBrand);

    int updateByCriteria(DbBrand DbBrand);

    DbBrand selectByPrimaryKey(String sequenceid);

    List<DbBrand> selectAll();
}