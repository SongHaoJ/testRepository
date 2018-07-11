package com.bean.dao;

import com.bean.model.DbCoeexpresstype;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface DbCoeexpresstypeMapper {
    DbCoeexpresstype selectByCriteria(DbCoeexpresstype DbCoeexpresstype);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbCoeexpresstype DbCoeexpresstype);

    int insertByCriteria(DbCoeexpresstype DbCoeexpresstype);

    int updateByCriteria(DbCoeexpresstype DbCoeexpresstype);

    DbCoeexpresstype selectByPrimaryKey(String sid);

    List<DbCoeexpresstype> selectAll();
}