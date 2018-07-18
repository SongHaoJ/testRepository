package com.bean.dao;

import com.bean.model.DbCompanylog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbCompanylogMapper {
    DbCompanylog selectByCriteria(DbCompanylog DbCompanylog);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbCompanylog DbCompanylog);

    int insertByCriteria(DbCompanylog DbCompanylog);

    int updateByCriteria(DbCompanylog DbCompanylog);

    DbCompanylog selectByPrimaryKey(String sequenceid);

    List<DbCompanylog> selectAll();
}