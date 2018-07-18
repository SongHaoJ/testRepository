package com.bean.dao;

import com.bean.model.DbCompanytype;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbCompanytypeMapper {
    DbCompanytype selectByCriteria(DbCompanytype DbCompanytype);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbCompanytype DbCompanytype);

    int insertByCriteria(DbCompanytype DbCompanytype);

    int updateByCriteria(DbCompanytype DbCompanytype);

    DbCompanytype selectByPrimaryKey(String sid);

    List<DbCompanytype> selectAll();
}