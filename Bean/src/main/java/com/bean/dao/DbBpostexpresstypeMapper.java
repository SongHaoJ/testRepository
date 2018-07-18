package com.bean.dao;

import com.bean.model.DbBpostexpresstype;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbBpostexpresstypeMapper {
    DbBpostexpresstype selectByCriteria(DbBpostexpresstype DbBpostexpresstype);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbBpostexpresstype DbBpostexpresstype);

    int insertByCriteria(DbBpostexpresstype DbBpostexpresstype);

    int updateByCriteria(DbBpostexpresstype DbBpostexpresstype);

    DbBpostexpresstype selectByPrimaryKey(String sid);

    List<DbBpostexpresstype> selectAll();
}