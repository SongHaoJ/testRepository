package com.bean.dao;

import com.bean.model.DbManufacturelog;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbManufacturelogMapper {
    DbManufacturelog selectByCriteria(DbManufacturelog DbManufacturelog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbManufacturelog DbManufacturelog);

    int insertByCriteria(DbManufacturelog DbManufacturelog);

    int updateByCriteria(DbManufacturelog DbManufacturelog);

    DbManufacturelog selectByPrimaryKey(String sequenceid);

    List<DbManufacturelog> selectAll();
}