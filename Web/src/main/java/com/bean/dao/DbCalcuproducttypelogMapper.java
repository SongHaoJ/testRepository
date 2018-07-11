package com.bean.dao;

import com.bean.model.DbCalcuproducttypelog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbCalcuproducttypelogMapper {
    DbCalcuproducttypelog selectByCriteria(DbCalcuproducttypelog DbCalcuproducttypelog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbCalcuproducttypelog DbCalcuproducttypelog);

    int insertByCriteria(DbCalcuproducttypelog DbCalcuproducttypelog);

    int updateByCriteria(DbCalcuproducttypelog DbCalcuproducttypelog);

    DbCalcuproducttypelog selectByPrimaryKey(String sequenceid);

    List<DbCalcuproducttypelog> selectAll();
}