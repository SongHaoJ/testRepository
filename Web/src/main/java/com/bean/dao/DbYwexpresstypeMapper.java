package com.bean.dao;

import com.bean.model.DbYwexpresstype;
import java.util.List;
import org.springframework.stereotype.Service;

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