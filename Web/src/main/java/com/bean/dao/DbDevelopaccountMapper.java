package com.bean.dao;

import com.bean.model.DbDevelopaccount;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbDevelopaccountMapper {
    DbDevelopaccount selectByCriteria(DbDevelopaccount DbDevelopaccount);

    void deleteByPrimaryKey(String ID);

    void deleteByCriteria(DbDevelopaccount DbDevelopaccount);

    int insertByCriteria(DbDevelopaccount DbDevelopaccount);

    int updateByCriteria(DbDevelopaccount DbDevelopaccount);

    DbDevelopaccount selectByPrimaryKey(Long id);

    List<DbDevelopaccount> selectAll();
}