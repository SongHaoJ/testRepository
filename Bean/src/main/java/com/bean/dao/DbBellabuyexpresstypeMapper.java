package com.bean.dao;

import com.bean.model.DbBellabuyexpresstype;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbBellabuyexpresstypeMapper {
    DbBellabuyexpresstype selectByCriteria(DbBellabuyexpresstype DbBellabuyexpresstype);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbBellabuyexpresstype DbBellabuyexpresstype);

    int insertByCriteria(DbBellabuyexpresstype DbBellabuyexpresstype);

    int updateByCriteria(DbBellabuyexpresstype DbBellabuyexpresstype);

    DbBellabuyexpresstype selectByPrimaryKey(String sid);

    List<DbBellabuyexpresstype> selectAll();
}