package com.bean.dao;

import com.bean.model.DbExpresstype;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbExpresstypeMapper {
    DbExpresstype selectByCriteria(DbExpresstype DbExpresstype);

    void deleteByPrimaryKey(String SEQUENCEID);

    void deleteByCriteria(DbExpresstype DbExpresstype);

    int insertByCriteria(DbExpresstype DbExpresstype);

    int updateByCriteria(DbExpresstype DbExpresstype);

    DbExpresstype selectByPrimaryKey(String sequenceid);

    List<DbExpresstype> selectAll();
}