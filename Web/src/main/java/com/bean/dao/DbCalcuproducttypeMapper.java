package com.bean.dao;

import com.bean.model.DbCalcuproducttype;
import java.util.List;
import org.springframework.stereotype.Service;

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