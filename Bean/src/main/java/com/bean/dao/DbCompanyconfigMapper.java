package com.bean.dao;

import com.bean.model.DbCompanyconfig;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbCompanyconfigMapper {
    DbCompanyconfig selectByCriteria(DbCompanyconfig DbCompanyconfig);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbCompanyconfig DbCompanyconfig);

    int insertByCriteria(DbCompanyconfig DbCompanyconfig);

    int updateByCriteria(DbCompanyconfig DbCompanyconfig);

    DbCompanyconfig selectByPrimaryKey(String sequenceid);

    List<DbCompanyconfig> selectAll();
}