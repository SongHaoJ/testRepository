package com.bean.dao;

import com.bean.model.DbExpressapiuser;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbExpressapiuserMapper {
    DbExpressapiuser selectByCriteria(DbExpressapiuser DbExpressapiuser);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbExpressapiuser DbExpressapiuser);

    int insertByCriteria(DbExpressapiuser DbExpressapiuser);

    int updateByCriteria(DbExpressapiuser DbExpressapiuser);

    DbExpressapiuser selectByPrimaryKey(BigDecimal id);

    List<DbExpressapiuser> selectAll();
}