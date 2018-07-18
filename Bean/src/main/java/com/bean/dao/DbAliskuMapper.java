package com.bean.dao;

import com.bean.model.DbAlisku;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbAliskuMapper {
    DbAlisku selectByCriteria(DbAlisku DbAlisku);

    void deleteByPrimaryKey(String SKUID);

    void deleteByCriteria(DbAlisku DbAlisku);

    int insertByCriteria(DbAlisku DbAlisku);

    int updateByCriteria(DbAlisku DbAlisku);

    DbAlisku selectByPrimaryKey(String skuid);

    List<DbAlisku> selectAll();
}