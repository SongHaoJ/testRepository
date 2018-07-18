package com.bean.dao;

import com.bean.model.DbCompany;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbCompanyMapper {
    DbCompany selectByCriteria(DbCompany DbCompany);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbCompany DbCompany);

    int insertByCriteria(DbCompany DbCompany);

    int updateByCriteria(DbCompany DbCompany);

    DbCompany selectByPrimaryKey(String sequenceid);

    List<DbCompany> selectAll();
}