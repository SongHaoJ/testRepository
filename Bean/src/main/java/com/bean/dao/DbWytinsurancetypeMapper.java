package com.bean.dao;

import com.bean.model.DbWytinsurancetype;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbWytinsurancetypeMapper {
    DbWytinsurancetype selectByCriteria(DbWytinsurancetype DbWytinsurancetype);

    void deleteByPrimaryKey(String INSURANCETYPE);

    void deleteByCriteria(DbWytinsurancetype DbWytinsurancetype);

    int insertByCriteria(DbWytinsurancetype DbWytinsurancetype);

    int updateByCriteria(DbWytinsurancetype DbWytinsurancetype);

    DbWytinsurancetype selectByPrimaryKey(String insurancetype);

    List<DbWytinsurancetype> selectAll();
}