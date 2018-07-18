package com.bean.dao;

import com.bean.model.DbOrderTemp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbOrderTempMapper {
    DbOrderTemp selectByCriteria(DbOrderTemp DbOrderTemp);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbOrderTemp DbOrderTemp);

    int insertByCriteria(DbOrderTemp DbOrderTemp);

    int updateByCriteria(DbOrderTemp DbOrderTemp);

    DbOrderTemp selectByPrimaryKey(String sequenceid);

    List<DbOrderTemp> selectAll();
}