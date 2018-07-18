package com.bean.dao;

import com.bean.model.DbStoragetasklog;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface DbStoragetasklogMapper {
    DbStoragetasklog selectByCriteria(DbStoragetasklog DbStoragetasklog);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbStoragetasklog DbStoragetasklog);

    int insertByCriteria(DbStoragetasklog DbStoragetasklog);

    int updateByCriteria(DbStoragetasklog DbStoragetasklog);

    DbStoragetasklog selectByPrimaryKey(BigDecimal id);

    List<DbStoragetasklog> selectAll();
}