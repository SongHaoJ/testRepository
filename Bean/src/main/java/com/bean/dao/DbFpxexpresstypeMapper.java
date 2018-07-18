package com.bean.dao;

import com.bean.model.DbFpxexpresstype;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbFpxexpresstypeMapper {
    DbFpxexpresstype selectByCriteria(DbFpxexpresstype DbFpxexpresstype);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbFpxexpresstype DbFpxexpresstype);

    int insertByCriteria(DbFpxexpresstype DbFpxexpresstype);

    int updateByCriteria(DbFpxexpresstype DbFpxexpresstype);

    DbFpxexpresstype selectByPrimaryKey(String sid);

    List<DbFpxexpresstype> selectAll();
}