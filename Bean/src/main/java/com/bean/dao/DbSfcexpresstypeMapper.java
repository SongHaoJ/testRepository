package com.bean.dao;

import com.bean.model.DbSfcexpresstype;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbSfcexpresstypeMapper {
    DbSfcexpresstype selectByCriteria(DbSfcexpresstype DbSfcexpresstype);

    void deleteByPrimaryKey(String CODE);

    void deleteByCriteria(DbSfcexpresstype DbSfcexpresstype);

    int insertByCriteria(DbSfcexpresstype DbSfcexpresstype);

    int updateByCriteria(DbSfcexpresstype DbSfcexpresstype);

    DbSfcexpresstype selectByPrimaryKey(String code);

    List<DbSfcexpresstype> selectAll();
}