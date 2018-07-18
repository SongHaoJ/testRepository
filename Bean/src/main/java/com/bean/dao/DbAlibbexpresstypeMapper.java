package com.bean.dao;

import com.bean.model.DbAlibbexpresstype;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbAlibbexpresstypeMapper {
    DbAlibbexpresstype selectByCriteria(DbAlibbexpresstype DbAlibbexpresstype);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbAlibbexpresstype DbAlibbexpresstype);

    int insertByCriteria(DbAlibbexpresstype DbAlibbexpresstype);

    int updateByCriteria(DbAlibbexpresstype DbAlibbexpresstype);

    DbAlibbexpresstype selectByPrimaryKey(String sid);

    List<DbAlibbexpresstype> selectAll();
}