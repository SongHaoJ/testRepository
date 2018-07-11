package com.bean.dao;

import com.bean.model.DbCompanytype;
import java.util.List;
import org.springframework.stereotype.Service;

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