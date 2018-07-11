package com.bean.dao;

import com.bean.model.DbDepartmentapi;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbDepartmentapiMapper {
    DbDepartmentapi selectByCriteria(DbDepartmentapi DbDepartmentapi);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbDepartmentapi DbDepartmentapi);

    int insertByCriteria(DbDepartmentapi DbDepartmentapi);

    int updateByCriteria(DbDepartmentapi DbDepartmentapi);

    DbDepartmentapi selectByPrimaryKey(String sequenceid);

    List<DbDepartmentapi> selectAll();
}