package com.bean.dao;

import com.bean.model.DbEbayhighbbe;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbEbayhighbbeMapper {
    DbEbayhighbbe selectByCriteria(DbEbayhighbbe DbEbayhighbbe);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbEbayhighbbe DbEbayhighbbe);

    int insertByCriteria(DbEbayhighbbe DbEbayhighbbe);

    int updateByCriteria(DbEbayhighbbe DbEbayhighbbe);

    DbEbayhighbbe selectByPrimaryKey(BigDecimal sequenceid);

    List<DbEbayhighbbe> selectAll();
}