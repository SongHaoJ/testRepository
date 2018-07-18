package com.bean.dao;

import com.bean.model.DbShiplocation;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbShiplocationMapper {
    DbShiplocation selectByCriteria(DbShiplocation DbShiplocation);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbShiplocation DbShiplocation);

    int insertByCriteria(DbShiplocation DbShiplocation);

    int updateByCriteria(DbShiplocation DbShiplocation);

    DbShiplocation selectByPrimaryKey(BigDecimal sid);

    List<DbShiplocation> selectAll();
}