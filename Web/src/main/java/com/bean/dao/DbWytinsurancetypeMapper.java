package com.bean.dao;

import com.bean.model.DbWytinsurancetype;
import java.util.List;
import org.springframework.stereotype.Service;

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