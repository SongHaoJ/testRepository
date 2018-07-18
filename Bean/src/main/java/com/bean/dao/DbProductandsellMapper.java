package com.bean.dao;

import com.bean.model.DbProductandsell;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbProductandsellMapper {
    DbProductandsell selectByCriteria(DbProductandsell DbProductandsell);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbProductandsell DbProductandsell);

    int insertByCriteria(DbProductandsell DbProductandsell);

    int updateByCriteria(DbProductandsell DbProductandsell);

    DbProductandsell selectByPrimaryKey(@Param("sequenceid") String sequenceid, @Param("sku") String sku);

    List<DbProductandsell> selectAll();
}