package com.bean.dao;

import com.bean.model.DbFunctionconfig;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbFunctionconfigMapper {
    DbFunctionconfig selectByCriteria(DbFunctionconfig DbFunctionconfig);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbFunctionconfig DbFunctionconfig);

    int insertByCriteria(DbFunctionconfig DbFunctionconfig);

    int updateByCriteria(DbFunctionconfig DbFunctionconfig);

    DbFunctionconfig selectByPrimaryKey(BigDecimal sid);

    List<DbFunctionconfig> selectAll();
}