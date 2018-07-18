package com.bean.dao;

import com.bean.model.DbChildsku;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbChildskuMapper {
    DbChildsku selectByCriteria(DbChildsku DbChildsku);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbChildsku DbChildsku);

    int insertByCriteria(DbChildsku DbChildsku);

    int updateByCriteria(DbChildsku DbChildsku);

    DbChildsku selectByPrimaryKey(BigDecimal sid);

    List<DbChildsku> selectAll();
}