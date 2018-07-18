package com.bean.dao;

import com.bean.model.DbEubprovince;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbEubprovinceMapper {
    DbEubprovince selectByCriteria(DbEubprovince DbEubprovince);

    void deleteByPrimaryKey(String PROVINCEID);

    void deleteByCriteria(DbEubprovince DbEubprovince);

    int insertByCriteria(DbEubprovince DbEubprovince);

    int updateByCriteria(DbEubprovince DbEubprovince);

    DbEubprovince selectByPrimaryKey(String provinceid);

    List<DbEubprovince> selectAll();
}