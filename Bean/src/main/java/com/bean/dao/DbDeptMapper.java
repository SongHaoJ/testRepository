package com.bean.dao;

import com.bean.model.DbDept;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbDeptMapper {
    DbDept selectByCriteria(DbDept DbDept);

    void deleteByPrimaryKey(String DID);

    void deleteByCriteria(DbDept DbDept);

    int insertByCriteria(DbDept DbDept);

    int updateByCriteria(DbDept DbDept);

    DbDept selectByPrimaryKey(String did);

    List<DbDept> selectAll();
}