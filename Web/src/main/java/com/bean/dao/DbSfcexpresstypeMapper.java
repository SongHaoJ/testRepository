package com.bean.dao;

import com.bean.model.DbSfcexpresstype;
import java.util.List;
import org.springframework.stereotype.Service;

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