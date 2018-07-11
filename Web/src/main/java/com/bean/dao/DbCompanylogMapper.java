package com.bean.dao;

import com.bean.model.DbCompanylog;
import java.util.List;
import org.springframework.stereotype.Service;

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