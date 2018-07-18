package com.bean.dao;

import com.bean.model.DbDevelopaccount;
import org.springframework.stereotype.Service;

import java.util.List;

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