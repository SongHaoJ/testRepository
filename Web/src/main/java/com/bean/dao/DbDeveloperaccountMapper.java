package com.bean.dao;

import com.bean.model.DbDeveloperaccount;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbDeveloperaccountMapper {
    DbDeveloperaccount selectByCriteria(DbDeveloperaccount DbDeveloperaccount);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbDeveloperaccount DbDeveloperaccount);

    int insertByCriteria(DbDeveloperaccount DbDeveloperaccount);

    int updateByCriteria(DbDeveloperaccount DbDeveloperaccount);

    DbDeveloperaccount selectByPrimaryKey(Short id);

    List<DbDeveloperaccount> selectAll();
}