package com.bean.dao;

import com.bean.model.DbCalcuproducttype;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbCalcuproducttypeMapper {
    DbCalcuproducttype selectByCriteria(DbCalcuproducttype DbCalcuproducttype);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbCalcuproducttype DbCalcuproducttype);

    int insertByCriteria(DbCalcuproducttype DbCalcuproducttype);

    int updateByCriteria(DbCalcuproducttype DbCalcuproducttype);

    DbCalcuproducttype selectByPrimaryKey(String sequenceid);

    List<DbCalcuproducttype> selectAll();
}