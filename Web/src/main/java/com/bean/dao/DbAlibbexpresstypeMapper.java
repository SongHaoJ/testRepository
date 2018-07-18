package com.bean.dao;

import com.bean.model.DbAlibbexpresstype;
import java.util.List;
import org.springframework.stereotype.Service;

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