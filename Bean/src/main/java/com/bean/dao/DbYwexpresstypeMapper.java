package com.bean.dao;

import com.bean.model.DbYwexpresstype;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DbYwexpresstypeMapper {
    DbYwexpresstype selectByCriteria(DbYwexpresstype DbYwexpresstype);

    void deleteByPrimaryKey(String SID);

    void deleteByCriteria(DbYwexpresstype DbYwexpresstype);

    int insertByCriteria(DbYwexpresstype DbYwexpresstype);

    int updateByCriteria(DbYwexpresstype DbYwexpresstype);

    DbYwexpresstype selectByPrimaryKey(String sid);

    List<DbYwexpresstype> selectAll();
}