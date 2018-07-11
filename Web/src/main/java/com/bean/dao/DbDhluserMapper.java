package com.bean.dao;

import com.bean.model.DbDhluser;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbDhluserMapper {
    DbDhluser selectByCriteria(DbDhluser DbDhluser);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbDhluser DbDhluser);

    int insertByCriteria(DbDhluser DbDhluser);

    int updateByCriteria(DbDhluser DbDhluser);

    DbDhluser selectByPrimaryKey(BigDecimal id);

    List<DbDhluser> selectAll();
}